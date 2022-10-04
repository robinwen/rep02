package projectname.vo.mg.fcss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasTwcaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasTwcaExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBasTwcaIdIsNull() {
            addCriterion("BAS_TWCA_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdIsNotNull() {
            addCriterion("BAS_TWCA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdEqualTo(Long value) {
            addCriterion("BAS_TWCA_ID =", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdNotEqualTo(Long value) {
            addCriterion("BAS_TWCA_ID <>", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdGreaterThan(Long value) {
            addCriterion("BAS_TWCA_ID >", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BAS_TWCA_ID >=", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdLessThan(Long value) {
            addCriterion("BAS_TWCA_ID <", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdLessThanOrEqualTo(Long value) {
            addCriterion("BAS_TWCA_ID <=", value, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdIn(List<Long> values) {
            addCriterion("BAS_TWCA_ID in", values, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdNotIn(List<Long> values) {
            addCriterion("BAS_TWCA_ID not in", values, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdBetween(Long value1, Long value2) {
            addCriterion("BAS_TWCA_ID between", value1, value2, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasTwcaIdNotBetween(Long value1, Long value2) {
            addCriterion("BAS_TWCA_ID not between", value1, value2, "basTwcaId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdIsNull() {
            addCriterion("BAS_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdIsNotNull() {
            addCriterion("BAS_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdEqualTo(Long value) {
            addCriterion("BAS_ORG_ID =", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdNotEqualTo(Long value) {
            addCriterion("BAS_ORG_ID <>", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdGreaterThan(Long value) {
            addCriterion("BAS_ORG_ID >", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BAS_ORG_ID >=", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdLessThan(Long value) {
            addCriterion("BAS_ORG_ID <", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("BAS_ORG_ID <=", value, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdIn(List<Long> values) {
            addCriterion("BAS_ORG_ID in", values, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdNotIn(List<Long> values) {
            addCriterion("BAS_ORG_ID not in", values, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdBetween(Long value1, Long value2) {
            addCriterion("BAS_ORG_ID between", value1, value2, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andBasOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("BAS_ORG_ID not between", value1, value2, "basOrgId");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIsNull() {
            addCriterion("TOKEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIsNotNull() {
            addCriterion("TOKEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTokenTypeEqualTo(String value) {
            addCriterion("TOKEN_TYPE =", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotEqualTo(String value) {
            addCriterion("TOKEN_TYPE <>", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeGreaterThan(String value) {
            addCriterion("TOKEN_TYPE >", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN_TYPE >=", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLessThan(String value) {
            addCriterion("TOKEN_TYPE <", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLessThanOrEqualTo(String value) {
            addCriterion("TOKEN_TYPE <=", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLike(String value) {
            addCriterion("TOKEN_TYPE like", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotLike(String value) {
            addCriterion("TOKEN_TYPE not like", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIn(List<String> values) {
            addCriterion("TOKEN_TYPE in", values, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotIn(List<String> values) {
            addCriterion("TOKEN_TYPE not in", values, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeBetween(String value1, String value2) {
            addCriterion("TOKEN_TYPE between", value1, value2, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotBetween(String value1, String value2) {
            addCriterion("TOKEN_TYPE not between", value1, value2, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTwcaNoIsNull() {
            addCriterion("TWCA_NO is null");
            return (Criteria) this;
        }

        public Criteria andTwcaNoIsNotNull() {
            addCriterion("TWCA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTwcaNoEqualTo(String value) {
            addCriterion("TWCA_NO =", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoNotEqualTo(String value) {
            addCriterion("TWCA_NO <>", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoGreaterThan(String value) {
            addCriterion("TWCA_NO >", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoGreaterThanOrEqualTo(String value) {
            addCriterion("TWCA_NO >=", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoLessThan(String value) {
            addCriterion("TWCA_NO <", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoLessThanOrEqualTo(String value) {
            addCriterion("TWCA_NO <=", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoLike(String value) {
            addCriterion("TWCA_NO like", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoNotLike(String value) {
            addCriterion("TWCA_NO not like", value, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoIn(List<String> values) {
            addCriterion("TWCA_NO in", values, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoNotIn(List<String> values) {
            addCriterion("TWCA_NO not in", values, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoBetween(String value1, String value2) {
            addCriterion("TWCA_NO between", value1, value2, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaNoNotBetween(String value1, String value2) {
            addCriterion("TWCA_NO not between", value1, value2, "twcaNo");
            return (Criteria) this;
        }

        public Criteria andTwcaDesIsNull() {
            addCriterion("TWCA_DES is null");
            return (Criteria) this;
        }

        public Criteria andTwcaDesIsNotNull() {
            addCriterion("TWCA_DES is not null");
            return (Criteria) this;
        }

        public Criteria andTwcaDesEqualTo(String value) {
            addCriterion("TWCA_DES =", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesNotEqualTo(String value) {
            addCriterion("TWCA_DES <>", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesGreaterThan(String value) {
            addCriterion("TWCA_DES >", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesGreaterThanOrEqualTo(String value) {
            addCriterion("TWCA_DES >=", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesLessThan(String value) {
            addCriterion("TWCA_DES <", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesLessThanOrEqualTo(String value) {
            addCriterion("TWCA_DES <=", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesLike(String value) {
            addCriterion("TWCA_DES like", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesNotLike(String value) {
            addCriterion("TWCA_DES not like", value, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesIn(List<String> values) {
            addCriterion("TWCA_DES in", values, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesNotIn(List<String> values) {
            addCriterion("TWCA_DES not in", values, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesBetween(String value1, String value2) {
            addCriterion("TWCA_DES between", value1, value2, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andTwcaDesNotBetween(String value1, String value2) {
            addCriterion("TWCA_DES not between", value1, value2, "twcaDes");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("IS_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("IS_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(String value) {
            addCriterion("IS_ENABLED =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(String value) {
            addCriterion("IS_ENABLED <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(String value) {
            addCriterion("IS_ENABLED >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENABLED >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(String value) {
            addCriterion("IS_ENABLED <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(String value) {
            addCriterion("IS_ENABLED <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLike(String value) {
            addCriterion("IS_ENABLED like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotLike(String value) {
            addCriterion("IS_ENABLED not like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<String> values) {
            addCriterion("IS_ENABLED in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<String> values) {
            addCriterion("IS_ENABLED not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(String value1, String value2) {
            addCriterion("IS_ENABLED between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(String value1, String value2) {
            addCriterion("IS_ENABLED not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("UPDATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("UPDATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("UPDATED_AT =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("UPDATED_AT <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("UPDATED_AT >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("UPDATED_AT <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("UPDATED_AT in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("UPDATED_AT not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}