package projectname.vo.mg.fcss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasOrgExample() {
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

        public Criteria andOrgTypeIsNull() {
            addCriterion("ORG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("ORG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(String value) {
            addCriterion("ORG_TYPE =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(String value) {
            addCriterion("ORG_TYPE <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(String value) {
            addCriterion("ORG_TYPE >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(String value) {
            addCriterion("ORG_TYPE <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLike(String value) {
            addCriterion("ORG_TYPE like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotLike(String value) {
            addCriterion("ORG_TYPE not like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<String> values) {
            addCriterion("ORG_TYPE in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<String> values) {
            addCriterion("ORG_TYPE not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(String value1, String value2) {
            addCriterion("ORG_TYPE between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(String value1, String value2) {
            addCriterion("ORG_TYPE not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeIsNull() {
            addCriterion("PARENT_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeIsNotNull() {
            addCriterion("PARENT_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeEqualTo(String value) {
            addCriterion("PARENT_ORG_CODE =", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeNotEqualTo(String value) {
            addCriterion("PARENT_ORG_CODE <>", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeGreaterThan(String value) {
            addCriterion("PARENT_ORG_CODE >", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ORG_CODE >=", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeLessThan(String value) {
            addCriterion("PARENT_ORG_CODE <", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ORG_CODE <=", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeLike(String value) {
            addCriterion("PARENT_ORG_CODE like", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeNotLike(String value) {
            addCriterion("PARENT_ORG_CODE not like", value, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeIn(List<String> values) {
            addCriterion("PARENT_ORG_CODE in", values, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeNotIn(List<String> values) {
            addCriterion("PARENT_ORG_CODE not in", values, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeBetween(String value1, String value2) {
            addCriterion("PARENT_ORG_CODE between", value1, value2, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_ORG_CODE not between", value1, value2, "parentOrgCode");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoIsNull() {
            addCriterion("ORG_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoIsNotNull() {
            addCriterion("ORG_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoEqualTo(String value) {
            addCriterion("ORG_ID_NO =", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoNotEqualTo(String value) {
            addCriterion("ORG_ID_NO <>", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoGreaterThan(String value) {
            addCriterion("ORG_ID_NO >", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID_NO >=", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoLessThan(String value) {
            addCriterion("ORG_ID_NO <", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID_NO <=", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoLike(String value) {
            addCriterion("ORG_ID_NO like", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoNotLike(String value) {
            addCriterion("ORG_ID_NO not like", value, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoIn(List<String> values) {
            addCriterion("ORG_ID_NO in", values, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoNotIn(List<String> values) {
            addCriterion("ORG_ID_NO not in", values, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoBetween(String value1, String value2) {
            addCriterion("ORG_ID_NO between", value1, value2, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgIdNoNotBetween(String value1, String value2) {
            addCriterion("ORG_ID_NO not between", value1, value2, "orgIdNo");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgSnameIsNull() {
            addCriterion("ORG_SNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgSnameIsNotNull() {
            addCriterion("ORG_SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEqualTo(String value) {
            addCriterion("ORG_SNAME =", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameNotEqualTo(String value) {
            addCriterion("ORG_SNAME <>", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameGreaterThan(String value) {
            addCriterion("ORG_SNAME >", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SNAME >=", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameLessThan(String value) {
            addCriterion("ORG_SNAME <", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameLessThanOrEqualTo(String value) {
            addCriterion("ORG_SNAME <=", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameLike(String value) {
            addCriterion("ORG_SNAME like", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameNotLike(String value) {
            addCriterion("ORG_SNAME not like", value, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameIn(List<String> values) {
            addCriterion("ORG_SNAME in", values, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameNotIn(List<String> values) {
            addCriterion("ORG_SNAME not in", values, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameBetween(String value1, String value2) {
            addCriterion("ORG_SNAME between", value1, value2, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgSnameNotBetween(String value1, String value2) {
            addCriterion("ORG_SNAME not between", value1, value2, "orgSname");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIsNull() {
            addCriterion("ORG_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIsNotNull() {
            addCriterion("ORG_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnEqualTo(String value) {
            addCriterion("ORG_NAME_EN =", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotEqualTo(String value) {
            addCriterion("ORG_NAME_EN <>", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnGreaterThan(String value) {
            addCriterion("ORG_NAME_EN >", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME_EN >=", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLessThan(String value) {
            addCriterion("ORG_NAME_EN <", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME_EN <=", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLike(String value) {
            addCriterion("ORG_NAME_EN like", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotLike(String value) {
            addCriterion("ORG_NAME_EN not like", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIn(List<String> values) {
            addCriterion("ORG_NAME_EN in", values, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotIn(List<String> values) {
            addCriterion("ORG_NAME_EN not in", values, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnBetween(String value1, String value2) {
            addCriterion("ORG_NAME_EN between", value1, value2, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME_EN not between", value1, value2, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnIsNull() {
            addCriterion("ORG_SNAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnIsNotNull() {
            addCriterion("ORG_SNAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnEqualTo(String value) {
            addCriterion("ORG_SNAME_EN =", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnNotEqualTo(String value) {
            addCriterion("ORG_SNAME_EN <>", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnGreaterThan(String value) {
            addCriterion("ORG_SNAME_EN >", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SNAME_EN >=", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnLessThan(String value) {
            addCriterion("ORG_SNAME_EN <", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnLessThanOrEqualTo(String value) {
            addCriterion("ORG_SNAME_EN <=", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnLike(String value) {
            addCriterion("ORG_SNAME_EN like", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnNotLike(String value) {
            addCriterion("ORG_SNAME_EN not like", value, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnIn(List<String> values) {
            addCriterion("ORG_SNAME_EN in", values, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnNotIn(List<String> values) {
            addCriterion("ORG_SNAME_EN not in", values, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnBetween(String value1, String value2) {
            addCriterion("ORG_SNAME_EN between", value1, value2, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andOrgSnameEnNotBetween(String value1, String value2) {
            addCriterion("ORG_SNAME_EN not between", value1, value2, "orgSnameEn");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeIsNull() {
            addCriterion("ORG_BIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeIsNotNull() {
            addCriterion("ORG_BIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeEqualTo(String value) {
            addCriterion("ORG_BIC_CODE =", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeNotEqualTo(String value) {
            addCriterion("ORG_BIC_CODE <>", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeGreaterThan(String value) {
            addCriterion("ORG_BIC_CODE >", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_BIC_CODE >=", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeLessThan(String value) {
            addCriterion("ORG_BIC_CODE <", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_BIC_CODE <=", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeLike(String value) {
            addCriterion("ORG_BIC_CODE like", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeNotLike(String value) {
            addCriterion("ORG_BIC_CODE not like", value, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeIn(List<String> values) {
            addCriterion("ORG_BIC_CODE in", values, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeNotIn(List<String> values) {
            addCriterion("ORG_BIC_CODE not in", values, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeBetween(String value1, String value2) {
            addCriterion("ORG_BIC_CODE between", value1, value2, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgBicCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_BIC_CODE not between", value1, value2, "orgBicCode");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameIsNull() {
            addCriterion("ORG_OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameIsNotNull() {
            addCriterion("ORG_OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameEqualTo(String value) {
            addCriterion("ORG_OWNER_NAME =", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameNotEqualTo(String value) {
            addCriterion("ORG_OWNER_NAME <>", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameGreaterThan(String value) {
            addCriterion("ORG_OWNER_NAME >", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_OWNER_NAME >=", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameLessThan(String value) {
            addCriterion("ORG_OWNER_NAME <", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_OWNER_NAME <=", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameLike(String value) {
            addCriterion("ORG_OWNER_NAME like", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameNotLike(String value) {
            addCriterion("ORG_OWNER_NAME not like", value, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameIn(List<String> values) {
            addCriterion("ORG_OWNER_NAME in", values, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameNotIn(List<String> values) {
            addCriterion("ORG_OWNER_NAME not in", values, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameBetween(String value1, String value2) {
            addCriterion("ORG_OWNER_NAME between", value1, value2, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgOwnerNameNotBetween(String value1, String value2) {
            addCriterion("ORG_OWNER_NAME not between", value1, value2, "orgOwnerName");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalIsNull() {
            addCriterion("ORG_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalIsNotNull() {
            addCriterion("ORG_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalEqualTo(String value) {
            addCriterion("ORG_CAPITAL =", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalNotEqualTo(String value) {
            addCriterion("ORG_CAPITAL <>", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalGreaterThan(String value) {
            addCriterion("ORG_CAPITAL >", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CAPITAL >=", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalLessThan(String value) {
            addCriterion("ORG_CAPITAL <", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalLessThanOrEqualTo(String value) {
            addCriterion("ORG_CAPITAL <=", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalLike(String value) {
            addCriterion("ORG_CAPITAL like", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalNotLike(String value) {
            addCriterion("ORG_CAPITAL not like", value, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalIn(List<String> values) {
            addCriterion("ORG_CAPITAL in", values, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalNotIn(List<String> values) {
            addCriterion("ORG_CAPITAL not in", values, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalBetween(String value1, String value2) {
            addCriterion("ORG_CAPITAL between", value1, value2, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgCapitalNotBetween(String value1, String value2) {
            addCriterion("ORG_CAPITAL not between", value1, value2, "orgCapital");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelIsNull() {
            addCriterion("ORG_REG_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelIsNotNull() {
            addCriterion("ORG_REG_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelEqualTo(String value) {
            addCriterion("ORG_REG_TEL =", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelNotEqualTo(String value) {
            addCriterion("ORG_REG_TEL <>", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelGreaterThan(String value) {
            addCriterion("ORG_REG_TEL >", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_REG_TEL >=", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelLessThan(String value) {
            addCriterion("ORG_REG_TEL <", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelLessThanOrEqualTo(String value) {
            addCriterion("ORG_REG_TEL <=", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelLike(String value) {
            addCriterion("ORG_REG_TEL like", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelNotLike(String value) {
            addCriterion("ORG_REG_TEL not like", value, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelIn(List<String> values) {
            addCriterion("ORG_REG_TEL in", values, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelNotIn(List<String> values) {
            addCriterion("ORG_REG_TEL not in", values, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelBetween(String value1, String value2) {
            addCriterion("ORG_REG_TEL between", value1, value2, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegTelNotBetween(String value1, String value2) {
            addCriterion("ORG_REG_TEL not between", value1, value2, "orgRegTel");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrIsNull() {
            addCriterion("ORG_REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrIsNotNull() {
            addCriterion("ORG_REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrEqualTo(String value) {
            addCriterion("ORG_REG_ADDR =", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrNotEqualTo(String value) {
            addCriterion("ORG_REG_ADDR <>", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrGreaterThan(String value) {
            addCriterion("ORG_REG_ADDR >", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_REG_ADDR >=", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrLessThan(String value) {
            addCriterion("ORG_REG_ADDR <", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrLessThanOrEqualTo(String value) {
            addCriterion("ORG_REG_ADDR <=", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrLike(String value) {
            addCriterion("ORG_REG_ADDR like", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrNotLike(String value) {
            addCriterion("ORG_REG_ADDR not like", value, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrIn(List<String> values) {
            addCriterion("ORG_REG_ADDR in", values, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrNotIn(List<String> values) {
            addCriterion("ORG_REG_ADDR not in", values, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrBetween(String value1, String value2) {
            addCriterion("ORG_REG_ADDR between", value1, value2, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgRegAddrNotBetween(String value1, String value2) {
            addCriterion("ORG_REG_ADDR not between", value1, value2, "orgRegAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrIsNull() {
            addCriterion("ORG_CONT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrIsNotNull() {
            addCriterion("ORG_CONT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrEqualTo(String value) {
            addCriterion("ORG_CONT_ADDR =", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrNotEqualTo(String value) {
            addCriterion("ORG_CONT_ADDR <>", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrGreaterThan(String value) {
            addCriterion("ORG_CONT_ADDR >", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_ADDR >=", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrLessThan(String value) {
            addCriterion("ORG_CONT_ADDR <", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrLessThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_ADDR <=", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrLike(String value) {
            addCriterion("ORG_CONT_ADDR like", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrNotLike(String value) {
            addCriterion("ORG_CONT_ADDR not like", value, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrIn(List<String> values) {
            addCriterion("ORG_CONT_ADDR in", values, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrNotIn(List<String> values) {
            addCriterion("ORG_CONT_ADDR not in", values, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrBetween(String value1, String value2) {
            addCriterion("ORG_CONT_ADDR between", value1, value2, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgContAddrNotBetween(String value1, String value2) {
            addCriterion("ORG_CONT_ADDR not between", value1, value2, "orgContAddr");
            return (Criteria) this;
        }

        public Criteria andOrgFaxIsNull() {
            addCriterion("ORG_FAX is null");
            return (Criteria) this;
        }

        public Criteria andOrgFaxIsNotNull() {
            addCriterion("ORG_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andOrgFaxEqualTo(String value) {
            addCriterion("ORG_FAX =", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNotEqualTo(String value) {
            addCriterion("ORG_FAX <>", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxGreaterThan(String value) {
            addCriterion("ORG_FAX >", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_FAX >=", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxLessThan(String value) {
            addCriterion("ORG_FAX <", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxLessThanOrEqualTo(String value) {
            addCriterion("ORG_FAX <=", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxLike(String value) {
            addCriterion("ORG_FAX like", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNotLike(String value) {
            addCriterion("ORG_FAX not like", value, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxIn(List<String> values) {
            addCriterion("ORG_FAX in", values, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNotIn(List<String> values) {
            addCriterion("ORG_FAX not in", values, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxBetween(String value1, String value2) {
            addCriterion("ORG_FAX between", value1, value2, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNotBetween(String value1, String value2) {
            addCriterion("ORG_FAX not between", value1, value2, "orgFax");
            return (Criteria) this;
        }

        public Criteria andOrgUrlIsNull() {
            addCriterion("ORG_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrgUrlIsNotNull() {
            addCriterion("ORG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUrlEqualTo(String value) {
            addCriterion("ORG_URL =", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlNotEqualTo(String value) {
            addCriterion("ORG_URL <>", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlGreaterThan(String value) {
            addCriterion("ORG_URL >", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_URL >=", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlLessThan(String value) {
            addCriterion("ORG_URL <", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlLessThanOrEqualTo(String value) {
            addCriterion("ORG_URL <=", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlLike(String value) {
            addCriterion("ORG_URL like", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlNotLike(String value) {
            addCriterion("ORG_URL not like", value, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlIn(List<String> values) {
            addCriterion("ORG_URL in", values, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlNotIn(List<String> values) {
            addCriterion("ORG_URL not in", values, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlBetween(String value1, String value2) {
            addCriterion("ORG_URL between", value1, value2, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgUrlNotBetween(String value1, String value2) {
            addCriterion("ORG_URL not between", value1, value2, "orgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgContNameIsNull() {
            addCriterion("ORG_CONT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgContNameIsNotNull() {
            addCriterion("ORG_CONT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContNameEqualTo(String value) {
            addCriterion("ORG_CONT_NAME =", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameNotEqualTo(String value) {
            addCriterion("ORG_CONT_NAME <>", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameGreaterThan(String value) {
            addCriterion("ORG_CONT_NAME >", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_NAME >=", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameLessThan(String value) {
            addCriterion("ORG_CONT_NAME <", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_NAME <=", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameLike(String value) {
            addCriterion("ORG_CONT_NAME like", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameNotLike(String value) {
            addCriterion("ORG_CONT_NAME not like", value, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameIn(List<String> values) {
            addCriterion("ORG_CONT_NAME in", values, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameNotIn(List<String> values) {
            addCriterion("ORG_CONT_NAME not in", values, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameBetween(String value1, String value2) {
            addCriterion("ORG_CONT_NAME between", value1, value2, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContNameNotBetween(String value1, String value2) {
            addCriterion("ORG_CONT_NAME not between", value1, value2, "orgContName");
            return (Criteria) this;
        }

        public Criteria andOrgContTelIsNull() {
            addCriterion("ORG_CONT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgContTelIsNotNull() {
            addCriterion("ORG_CONT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContTelEqualTo(String value) {
            addCriterion("ORG_CONT_TEL =", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelNotEqualTo(String value) {
            addCriterion("ORG_CONT_TEL <>", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelGreaterThan(String value) {
            addCriterion("ORG_CONT_TEL >", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_TEL >=", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelLessThan(String value) {
            addCriterion("ORG_CONT_TEL <", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelLessThanOrEqualTo(String value) {
            addCriterion("ORG_CONT_TEL <=", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelLike(String value) {
            addCriterion("ORG_CONT_TEL like", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelNotLike(String value) {
            addCriterion("ORG_CONT_TEL not like", value, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelIn(List<String> values) {
            addCriterion("ORG_CONT_TEL in", values, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelNotIn(List<String> values) {
            addCriterion("ORG_CONT_TEL not in", values, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelBetween(String value1, String value2) {
            addCriterion("ORG_CONT_TEL between", value1, value2, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgContTelNotBetween(String value1, String value2) {
            addCriterion("ORG_CONT_TEL not between", value1, value2, "orgContTel");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("ORG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("ORG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(String value) {
            addCriterion("ORG_STATUS =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(String value) {
            addCriterion("ORG_STATUS <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(String value) {
            addCriterion("ORG_STATUS >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_STATUS >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(String value) {
            addCriterion("ORG_STATUS <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(String value) {
            addCriterion("ORG_STATUS <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLike(String value) {
            addCriterion("ORG_STATUS like", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotLike(String value) {
            addCriterion("ORG_STATUS not like", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<String> values) {
            addCriterion("ORG_STATUS in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<String> values) {
            addCriterion("ORG_STATUS not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(String value1, String value2) {
            addCriterion("ORG_STATUS between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(String value1, String value2) {
            addCriterion("ORG_STATUS not between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateIsNull() {
            addCriterion("ORGIV_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateIsNotNull() {
            addCriterion("ORGIV_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateEqualTo(String value) {
            addCriterion("ORGIV_VALID_DATE =", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateNotEqualTo(String value) {
            addCriterion("ORGIV_VALID_DATE <>", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateGreaterThan(String value) {
            addCriterion("ORGIV_VALID_DATE >", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORGIV_VALID_DATE >=", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateLessThan(String value) {
            addCriterion("ORGIV_VALID_DATE <", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateLessThanOrEqualTo(String value) {
            addCriterion("ORGIV_VALID_DATE <=", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateLike(String value) {
            addCriterion("ORGIV_VALID_DATE like", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateNotLike(String value) {
            addCriterion("ORGIV_VALID_DATE not like", value, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateIn(List<String> values) {
            addCriterion("ORGIV_VALID_DATE in", values, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateNotIn(List<String> values) {
            addCriterion("ORGIV_VALID_DATE not in", values, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateBetween(String value1, String value2) {
            addCriterion("ORGIV_VALID_DATE between", value1, value2, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andOrgivValidDateNotBetween(String value1, String value2) {
            addCriterion("ORGIV_VALID_DATE not between", value1, value2, "orgivValidDate");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidIsNull() {
            addCriterion("IS_ORGIV_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidIsNotNull() {
            addCriterion("IS_ORGIV_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidEqualTo(String value) {
            addCriterion("IS_ORGIV_VALID =", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidNotEqualTo(String value) {
            addCriterion("IS_ORGIV_VALID <>", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidGreaterThan(String value) {
            addCriterion("IS_ORGIV_VALID >", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ORGIV_VALID >=", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidLessThan(String value) {
            addCriterion("IS_ORGIV_VALID <", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidLessThanOrEqualTo(String value) {
            addCriterion("IS_ORGIV_VALID <=", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidLike(String value) {
            addCriterion("IS_ORGIV_VALID like", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidNotLike(String value) {
            addCriterion("IS_ORGIV_VALID not like", value, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidIn(List<String> values) {
            addCriterion("IS_ORGIV_VALID in", values, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidNotIn(List<String> values) {
            addCriterion("IS_ORGIV_VALID not in", values, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidBetween(String value1, String value2) {
            addCriterion("IS_ORGIV_VALID between", value1, value2, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andIsOrgivValidNotBetween(String value1, String value2) {
            addCriterion("IS_ORGIV_VALID not between", value1, value2, "isOrgivValid");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdIsNull() {
            addCriterion("BAS_REG_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdIsNotNull() {
            addCriterion("BAS_REG_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdEqualTo(Long value) {
            addCriterion("BAS_REG_ORG_ID =", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdNotEqualTo(Long value) {
            addCriterion("BAS_REG_ORG_ID <>", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdGreaterThan(Long value) {
            addCriterion("BAS_REG_ORG_ID >", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BAS_REG_ORG_ID >=", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdLessThan(Long value) {
            addCriterion("BAS_REG_ORG_ID <", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("BAS_REG_ORG_ID <=", value, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdIn(List<Long> values) {
            addCriterion("BAS_REG_ORG_ID in", values, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdNotIn(List<Long> values) {
            addCriterion("BAS_REG_ORG_ID not in", values, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdBetween(Long value1, Long value2) {
            addCriterion("BAS_REG_ORG_ID between", value1, value2, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andBasRegOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("BAS_REG_ORG_ID not between", value1, value2, "basRegOrgId");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNull() {
            addCriterion("IS_AUTO is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNotNull() {
            addCriterion("IS_AUTO is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoEqualTo(String value) {
            addCriterion("IS_AUTO =", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotEqualTo(String value) {
            addCriterion("IS_AUTO <>", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThan(String value) {
            addCriterion("IS_AUTO >", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUTO >=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThan(String value) {
            addCriterion("IS_AUTO <", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThanOrEqualTo(String value) {
            addCriterion("IS_AUTO <=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLike(String value) {
            addCriterion("IS_AUTO like", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotLike(String value) {
            addCriterion("IS_AUTO not like", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoIn(List<String> values) {
            addCriterion("IS_AUTO in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotIn(List<String> values) {
            addCriterion("IS_AUTO not in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoBetween(String value1, String value2) {
            addCriterion("IS_AUTO between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotBetween(String value1, String value2) {
            addCriterion("IS_AUTO not between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andAutoByIsNull() {
            addCriterion("AUTO_BY is null");
            return (Criteria) this;
        }

        public Criteria andAutoByIsNotNull() {
            addCriterion("AUTO_BY is not null");
            return (Criteria) this;
        }

        public Criteria andAutoByEqualTo(String value) {
            addCriterion("AUTO_BY =", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByNotEqualTo(String value) {
            addCriterion("AUTO_BY <>", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByGreaterThan(String value) {
            addCriterion("AUTO_BY >", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_BY >=", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByLessThan(String value) {
            addCriterion("AUTO_BY <", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByLessThanOrEqualTo(String value) {
            addCriterion("AUTO_BY <=", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByLike(String value) {
            addCriterion("AUTO_BY like", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByNotLike(String value) {
            addCriterion("AUTO_BY not like", value, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByIn(List<String> values) {
            addCriterion("AUTO_BY in", values, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByNotIn(List<String> values) {
            addCriterion("AUTO_BY not in", values, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByBetween(String value1, String value2) {
            addCriterion("AUTO_BY between", value1, value2, "autoBy");
            return (Criteria) this;
        }

        public Criteria andAutoByNotBetween(String value1, String value2) {
            addCriterion("AUTO_BY not between", value1, value2, "autoBy");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNull() {
            addCriterion("REGISTER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNotNull() {
            addCriterion("REGISTER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeEqualTo(String value) {
            addCriterion("REGISTER_CODE =", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotEqualTo(String value) {
            addCriterion("REGISTER_CODE <>", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThan(String value) {
            addCriterion("REGISTER_CODE >", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_CODE >=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThan(String value) {
            addCriterion("REGISTER_CODE <", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_CODE <=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLike(String value) {
            addCriterion("REGISTER_CODE like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotLike(String value) {
            addCriterion("REGISTER_CODE not like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIn(List<String> values) {
            addCriterion("REGISTER_CODE in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotIn(List<String> values) {
            addCriterion("REGISTER_CODE not in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeBetween(String value1, String value2) {
            addCriterion("REGISTER_CODE between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotBetween(String value1, String value2) {
            addCriterion("REGISTER_CODE not between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterAtIsNull() {
            addCriterion("REGISTER_AT is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAtIsNotNull() {
            addCriterion("REGISTER_AT is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAtEqualTo(Date value) {
            addCriterion("REGISTER_AT =", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtNotEqualTo(Date value) {
            addCriterion("REGISTER_AT <>", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtGreaterThan(Date value) {
            addCriterion("REGISTER_AT >", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_AT >=", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtLessThan(Date value) {
            addCriterion("REGISTER_AT <", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_AT <=", value, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtIn(List<Date> values) {
            addCriterion("REGISTER_AT in", values, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtNotIn(List<Date> values) {
            addCriterion("REGISTER_AT not in", values, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtBetween(Date value1, Date value2) {
            addCriterion("REGISTER_AT between", value1, value2, "registerAt");
            return (Criteria) this;
        }

        public Criteria andRegisterAtNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_AT not between", value1, value2, "registerAt");
            return (Criteria) this;
        }

        public Criteria andReview1AtIsNull() {
            addCriterion("REVIEW1_AT is null");
            return (Criteria) this;
        }

        public Criteria andReview1AtIsNotNull() {
            addCriterion("REVIEW1_AT is not null");
            return (Criteria) this;
        }

        public Criteria andReview1AtEqualTo(Date value) {
            addCriterion("REVIEW1_AT =", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtNotEqualTo(Date value) {
            addCriterion("REVIEW1_AT <>", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtGreaterThan(Date value) {
            addCriterion("REVIEW1_AT >", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW1_AT >=", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtLessThan(Date value) {
            addCriterion("REVIEW1_AT <", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW1_AT <=", value, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtIn(List<Date> values) {
            addCriterion("REVIEW1_AT in", values, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtNotIn(List<Date> values) {
            addCriterion("REVIEW1_AT not in", values, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtBetween(Date value1, Date value2) {
            addCriterion("REVIEW1_AT between", value1, value2, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview1AtNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW1_AT not between", value1, value2, "review1At");
            return (Criteria) this;
        }

        public Criteria andReview2AtIsNull() {
            addCriterion("REVIEW2_AT is null");
            return (Criteria) this;
        }

        public Criteria andReview2AtIsNotNull() {
            addCriterion("REVIEW2_AT is not null");
            return (Criteria) this;
        }

        public Criteria andReview2AtEqualTo(Date value) {
            addCriterion("REVIEW2_AT =", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtNotEqualTo(Date value) {
            addCriterion("REVIEW2_AT <>", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtGreaterThan(Date value) {
            addCriterion("REVIEW2_AT >", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW2_AT >=", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtLessThan(Date value) {
            addCriterion("REVIEW2_AT <", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW2_AT <=", value, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtIn(List<Date> values) {
            addCriterion("REVIEW2_AT in", values, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtNotIn(List<Date> values) {
            addCriterion("REVIEW2_AT not in", values, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtBetween(Date value1, Date value2) {
            addCriterion("REVIEW2_AT between", value1, value2, "review2At");
            return (Criteria) this;
        }

        public Criteria andReview2AtNotBetween(Date value1, Date value2) {
            addCriterion("REVIEW2_AT not between", value1, value2, "review2At");
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