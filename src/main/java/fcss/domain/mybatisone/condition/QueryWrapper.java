package fcss.domain.mybatisone.condition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import fcss.domain.mybatisone.toolkit.Const;

public class QueryWrapper<T> {

    public List<Criterion> criteria; // WHERE條件
    protected List<String> selectCols; // 查詢欄位. 僅用於SELECT語法

    public QueryWrapper() {
        this.criteria = new ArrayList<>();
        this.selectCols = new ArrayList<>();
    }

    public void select(String... columnName) {
        for (String name : columnName) {
            this.selectCols.add(name);
        }
    }

    public void isNull(String column) {
        criteria.add(new Criterion(column + " IS NULL"));
    }

    public void eq(String column, Object value) {
        criteria.add(new Criterion(column + " = ", value));
    }

    public void ne(String column, Object value) {
        criteria.add(new Criterion(column + " != ", value));
    }

    public void gt(String column, Object value) {
        criteria.add(new Criterion(column + " > ", value));
    }

    public void ge(String column, Object value) {
        criteria.add(new Criterion(column + " >= ", value));
    }

    public void lt(String column, Object value) {
        criteria.add(new Criterion(column + " < ", value));
    }

    public void le(String column, Object value) {
        criteria.add(new Criterion(column + " <= ", value));
    }

    public void likeRight(String column, Object value) {
        criteria.add(new Criterion(column + " LIKE ", value + "%"));
    }

    public void in(String column, Object... value) {
        criteria.add(new Criterion(column + " IN ", value));
    }

    public void in(String column, Collection<?> value) {
        criteria.add(new Criterion(column + " IN ", value));
    }

    public void between(String column, Object value, Object secondValue) {
        criteria.add(new Criterion(column + " BETWEEN ", value, secondValue));
    }

    public String selectSegment() {
        if (selectCols == null || selectCols.size() <= 0
                || (selectCols.size() == 1 && "".equals(selectCols.get(0).trim())))
            return "*";
        else
            return String.join(",", selectCols);
        // return selectCols.toArray(String[]::new);
    }

    // get "where" SQL from qw's criteria
    public String[] whereSegment() {
        List<String> rtn = new ArrayList<>();

        int ii = 0;
        for (Criterion criterion : this.criteria) {
            String value = String.format("%s.criteria[%d].value", Const.WRAPPER, ii);
            String valueBind = String.format("#{%s.criteria[%d].value}", Const.WRAPPER, ii);
            String secondValueBind = String.format("#{%s.criteria[%d].secondValue}", Const.WRAPPER, ii);

            if (criterion.noValue) {
                rtn.add(criterion.condition);
            } else if (criterion.singleValue) {
                rtn.add(criterion.condition + valueBind);
            } else if (criterion.betweenValue) {
                rtn.add(criterion.condition + valueBind + " and " + secondValueBind);
            } else if (criterion.listValue) {
                String tt = String.format(
                        "<foreach collection='%s' item='item' open='(' close= ')' separator=','>#{item}</foreach>",
                        value);
                rtn.add(criterion.condition + tt);
            }
            ii++;
        }

        return rtn.stream().toArray(String[]::new);
    }

    protected static class Criterion {
        protected String condition; // 包含 欄位名 與 條件
        protected Object value;
        protected Object secondValue;

        protected boolean noValue; // isNull, isNotNull
        protected boolean singleValue; // eq, ne, gt, ge, lt, le
        protected boolean betweenValue; // between, notBetween
        protected boolean listValue; // in, notIn

        // noValue
        private Criterion(String condition) {
            this.condition = condition;
            this.noValue = true;
        }

        // singleValue or listValue
        private Criterion(String condition, Object value) {
            this.condition = condition;
            this.value = value;
            if (value instanceof Object[]) {
                this.listValue = true;
            } else if (value instanceof Collection<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        // betweenValue
        private Criterion(String condition, Object value, Object secondValue) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }

}
