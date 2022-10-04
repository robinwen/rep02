package projectname.vo.mg.fcss;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasFundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasFundExample() {
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

        public Criteria andBasFundIdIsNull() {
            addCriterion("BAS_FUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasFundIdIsNotNull() {
            addCriterion("BAS_FUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasFundIdEqualTo(Long value) {
            addCriterion("BAS_FUND_ID =", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdNotEqualTo(Long value) {
            addCriterion("BAS_FUND_ID <>", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdGreaterThan(Long value) {
            addCriterion("BAS_FUND_ID >", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BAS_FUND_ID >=", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdLessThan(Long value) {
            addCriterion("BAS_FUND_ID <", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdLessThanOrEqualTo(Long value) {
            addCriterion("BAS_FUND_ID <=", value, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdIn(List<Long> values) {
            addCriterion("BAS_FUND_ID in", values, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdNotIn(List<Long> values) {
            addCriterion("BAS_FUND_ID not in", values, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdBetween(Long value1, Long value2) {
            addCriterion("BAS_FUND_ID between", value1, value2, "basFundId");
            return (Criteria) this;
        }

        public Criteria andBasFundIdNotBetween(Long value1, Long value2) {
            addCriterion("BAS_FUND_ID not between", value1, value2, "basFundId");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("FUND_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("FUND_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("FUND_CODE =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("FUND_CODE <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("FUND_CODE >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CODE >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("FUND_CODE <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("FUND_CODE <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("FUND_CODE like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("FUND_CODE not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("FUND_CODE in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("FUND_CODE not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("FUND_CODE between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("FUND_CODE not between", value1, value2, "fundCode");
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

        public Criteria andVersionCodeIsNull() {
            addCriterion("VERSION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNotNull() {
            addCriterion("VERSION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeEqualTo(String value) {
            addCriterion("VERSION_CODE =", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotEqualTo(String value) {
            addCriterion("VERSION_CODE <>", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThan(String value) {
            addCriterion("VERSION_CODE >", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_CODE >=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThan(String value) {
            addCriterion("VERSION_CODE <", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThanOrEqualTo(String value) {
            addCriterion("VERSION_CODE <=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLike(String value) {
            addCriterion("VERSION_CODE like", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotLike(String value) {
            addCriterion("VERSION_CODE not like", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIn(List<String> values) {
            addCriterion("VERSION_CODE in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotIn(List<String> values) {
            addCriterion("VERSION_CODE not in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeBetween(String value1, String value2) {
            addCriterion("VERSION_CODE between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotBetween(String value1, String value2) {
            addCriterion("VERSION_CODE not between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("FUND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("FUND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("FUND_NAME =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("FUND_NAME <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("FUND_NAME >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_NAME >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("FUND_NAME <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("FUND_NAME <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("FUND_NAME like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("FUND_NAME not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("FUND_NAME in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("FUND_NAME not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("FUND_NAME between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("FUND_NAME not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundSnameIsNull() {
            addCriterion("FUND_SNAME is null");
            return (Criteria) this;
        }

        public Criteria andFundSnameIsNotNull() {
            addCriterion("FUND_SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFundSnameEqualTo(String value) {
            addCriterion("FUND_SNAME =", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameNotEqualTo(String value) {
            addCriterion("FUND_SNAME <>", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameGreaterThan(String value) {
            addCriterion("FUND_SNAME >", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_SNAME >=", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameLessThan(String value) {
            addCriterion("FUND_SNAME <", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameLessThanOrEqualTo(String value) {
            addCriterion("FUND_SNAME <=", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameLike(String value) {
            addCriterion("FUND_SNAME like", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameNotLike(String value) {
            addCriterion("FUND_SNAME not like", value, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameIn(List<String> values) {
            addCriterion("FUND_SNAME in", values, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameNotIn(List<String> values) {
            addCriterion("FUND_SNAME not in", values, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameBetween(String value1, String value2) {
            addCriterion("FUND_SNAME between", value1, value2, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundSnameNotBetween(String value1, String value2) {
            addCriterion("FUND_SNAME not between", value1, value2, "fundSname");
            return (Criteria) this;
        }

        public Criteria andFundNameEnIsNull() {
            addCriterion("FUND_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andFundNameEnIsNotNull() {
            addCriterion("FUND_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEnEqualTo(String value) {
            addCriterion("FUND_NAME_EN =", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnNotEqualTo(String value) {
            addCriterion("FUND_NAME_EN <>", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnGreaterThan(String value) {
            addCriterion("FUND_NAME_EN >", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_NAME_EN >=", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnLessThan(String value) {
            addCriterion("FUND_NAME_EN <", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnLessThanOrEqualTo(String value) {
            addCriterion("FUND_NAME_EN <=", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnLike(String value) {
            addCriterion("FUND_NAME_EN like", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnNotLike(String value) {
            addCriterion("FUND_NAME_EN not like", value, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnIn(List<String> values) {
            addCriterion("FUND_NAME_EN in", values, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnNotIn(List<String> values) {
            addCriterion("FUND_NAME_EN not in", values, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnBetween(String value1, String value2) {
            addCriterion("FUND_NAME_EN between", value1, value2, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundNameEnNotBetween(String value1, String value2) {
            addCriterion("FUND_NAME_EN not between", value1, value2, "fundNameEn");
            return (Criteria) this;
        }

        public Criteria andFundValidDateIsNull() {
            addCriterion("FUND_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFundValidDateIsNotNull() {
            addCriterion("FUND_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFundValidDateEqualTo(String value) {
            addCriterion("FUND_VALID_DATE =", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateNotEqualTo(String value) {
            addCriterion("FUND_VALID_DATE <>", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateGreaterThan(String value) {
            addCriterion("FUND_VALID_DATE >", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_VALID_DATE >=", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateLessThan(String value) {
            addCriterion("FUND_VALID_DATE <", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateLessThanOrEqualTo(String value) {
            addCriterion("FUND_VALID_DATE <=", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateLike(String value) {
            addCriterion("FUND_VALID_DATE like", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateNotLike(String value) {
            addCriterion("FUND_VALID_DATE not like", value, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateIn(List<String> values) {
            addCriterion("FUND_VALID_DATE in", values, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateNotIn(List<String> values) {
            addCriterion("FUND_VALID_DATE not in", values, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateBetween(String value1, String value2) {
            addCriterion("FUND_VALID_DATE between", value1, value2, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andFundValidDateNotBetween(String value1, String value2) {
            addCriterion("FUND_VALID_DATE not between", value1, value2, "fundValidDate");
            return (Criteria) this;
        }

        public Criteria andRdpOtcIsNull() {
            addCriterion("RDP_OTC is null");
            return (Criteria) this;
        }

        public Criteria andRdpOtcIsNotNull() {
            addCriterion("RDP_OTC is not null");
            return (Criteria) this;
        }

        public Criteria andRdpOtcEqualTo(String value) {
            addCriterion("RDP_OTC =", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcNotEqualTo(String value) {
            addCriterion("RDP_OTC <>", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcGreaterThan(String value) {
            addCriterion("RDP_OTC >", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcGreaterThanOrEqualTo(String value) {
            addCriterion("RDP_OTC >=", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcLessThan(String value) {
            addCriterion("RDP_OTC <", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcLessThanOrEqualTo(String value) {
            addCriterion("RDP_OTC <=", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcLike(String value) {
            addCriterion("RDP_OTC like", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcNotLike(String value) {
            addCriterion("RDP_OTC not like", value, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcIn(List<String> values) {
            addCriterion("RDP_OTC in", values, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcNotIn(List<String> values) {
            addCriterion("RDP_OTC not in", values, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcBetween(String value1, String value2) {
            addCriterion("RDP_OTC between", value1, value2, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpOtcNotBetween(String value1, String value2) {
            addCriterion("RDP_OTC not between", value1, value2, "rdpOtc");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeIsNull() {
            addCriterion("RDP_VACC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeIsNotNull() {
            addCriterion("RDP_VACC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeEqualTo(String value) {
            addCriterion("RDP_VACC_TYPE =", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeNotEqualTo(String value) {
            addCriterion("RDP_VACC_TYPE <>", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeGreaterThan(String value) {
            addCriterion("RDP_VACC_TYPE >", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RDP_VACC_TYPE >=", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeLessThan(String value) {
            addCriterion("RDP_VACC_TYPE <", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeLessThanOrEqualTo(String value) {
            addCriterion("RDP_VACC_TYPE <=", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeLike(String value) {
            addCriterion("RDP_VACC_TYPE like", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeNotLike(String value) {
            addCriterion("RDP_VACC_TYPE not like", value, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeIn(List<String> values) {
            addCriterion("RDP_VACC_TYPE in", values, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeNotIn(List<String> values) {
            addCriterion("RDP_VACC_TYPE not in", values, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeBetween(String value1, String value2) {
            addCriterion("RDP_VACC_TYPE between", value1, value2, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpVaccTypeNotBetween(String value1, String value2) {
            addCriterion("RDP_VACC_TYPE not between", value1, value2, "rdpVaccType");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountIsNull() {
            addCriterion("RDP_CYCLE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountIsNotNull() {
            addCriterion("RDP_CYCLE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountEqualTo(Integer value) {
            addCriterion("RDP_CYCLE_COUNT =", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountNotEqualTo(Integer value) {
            addCriterion("RDP_CYCLE_COUNT <>", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountGreaterThan(Integer value) {
            addCriterion("RDP_CYCLE_COUNT >", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RDP_CYCLE_COUNT >=", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountLessThan(Integer value) {
            addCriterion("RDP_CYCLE_COUNT <", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountLessThanOrEqualTo(Integer value) {
            addCriterion("RDP_CYCLE_COUNT <=", value, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountIn(List<Integer> values) {
            addCriterion("RDP_CYCLE_COUNT in", values, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountNotIn(List<Integer> values) {
            addCriterion("RDP_CYCLE_COUNT not in", values, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountBetween(Integer value1, Integer value2) {
            addCriterion("RDP_CYCLE_COUNT between", value1, value2, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andRdpCycleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("RDP_CYCLE_COUNT not between", value1, value2, "rdpCycleCount");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeIsNull() {
            addCriterion("APL_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeIsNotNull() {
            addCriterion("APL_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeEqualTo(String value) {
            addCriterion("APL_END_TIME =", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeNotEqualTo(String value) {
            addCriterion("APL_END_TIME <>", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeGreaterThan(String value) {
            addCriterion("APL_END_TIME >", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APL_END_TIME >=", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeLessThan(String value) {
            addCriterion("APL_END_TIME <", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeLessThanOrEqualTo(String value) {
            addCriterion("APL_END_TIME <=", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeLike(String value) {
            addCriterion("APL_END_TIME like", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeNotLike(String value) {
            addCriterion("APL_END_TIME not like", value, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeIn(List<String> values) {
            addCriterion("APL_END_TIME in", values, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeNotIn(List<String> values) {
            addCriterion("APL_END_TIME not in", values, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeBetween(String value1, String value2) {
            addCriterion("APL_END_TIME between", value1, value2, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andAplEndTimeNotBetween(String value1, String value2) {
            addCriterion("APL_END_TIME not between", value1, value2, "aplEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeIsNull() {
            addCriterion("RDP_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeIsNotNull() {
            addCriterion("RDP_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeEqualTo(String value) {
            addCriterion("RDP_END_TIME =", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeNotEqualTo(String value) {
            addCriterion("RDP_END_TIME <>", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeGreaterThan(String value) {
            addCriterion("RDP_END_TIME >", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RDP_END_TIME >=", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeLessThan(String value) {
            addCriterion("RDP_END_TIME <", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeLessThanOrEqualTo(String value) {
            addCriterion("RDP_END_TIME <=", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeLike(String value) {
            addCriterion("RDP_END_TIME like", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeNotLike(String value) {
            addCriterion("RDP_END_TIME not like", value, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeIn(List<String> values) {
            addCriterion("RDP_END_TIME in", values, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeNotIn(List<String> values) {
            addCriterion("RDP_END_TIME not in", values, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeBetween(String value1, String value2) {
            addCriterion("RDP_END_TIME between", value1, value2, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andRdpEndTimeNotBetween(String value1, String value2) {
            addCriterion("RDP_END_TIME not between", value1, value2, "rdpEndTime");
            return (Criteria) this;
        }

        public Criteria andFundStatusIsNull() {
            addCriterion("FUND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFundStatusIsNotNull() {
            addCriterion("FUND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFundStatusEqualTo(String value) {
            addCriterion("FUND_STATUS =", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotEqualTo(String value) {
            addCriterion("FUND_STATUS <>", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusGreaterThan(String value) {
            addCriterion("FUND_STATUS >", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_STATUS >=", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLessThan(String value) {
            addCriterion("FUND_STATUS <", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLessThanOrEqualTo(String value) {
            addCriterion("FUND_STATUS <=", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLike(String value) {
            addCriterion("FUND_STATUS like", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotLike(String value) {
            addCriterion("FUND_STATUS not like", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusIn(List<String> values) {
            addCriterion("FUND_STATUS in", values, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotIn(List<String> values) {
            addCriterion("FUND_STATUS not in", values, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusBetween(String value1, String value2) {
            addCriterion("FUND_STATUS between", value1, value2, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotBetween(String value1, String value2) {
            addCriterion("FUND_STATUS not between", value1, value2, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataIsNull() {
            addCriterion("TRADE_TYPE_FDATA is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataIsNotNull() {
            addCriterion("TRADE_TYPE_FDATA is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataEqualTo(String value) {
            addCriterion("TRADE_TYPE_FDATA =", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataNotEqualTo(String value) {
            addCriterion("TRADE_TYPE_FDATA <>", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataGreaterThan(String value) {
            addCriterion("TRADE_TYPE_FDATA >", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE_FDATA >=", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataLessThan(String value) {
            addCriterion("TRADE_TYPE_FDATA <", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE_FDATA <=", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataLike(String value) {
            addCriterion("TRADE_TYPE_FDATA like", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataNotLike(String value) {
            addCriterion("TRADE_TYPE_FDATA not like", value, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataIn(List<String> values) {
            addCriterion("TRADE_TYPE_FDATA in", values, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataNotIn(List<String> values) {
            addCriterion("TRADE_TYPE_FDATA not in", values, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE_FDATA between", value1, value2, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeFdataNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE_FDATA not between", value1, value2, "tradeTypeFdata");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeIsNull() {
            addCriterion("FUND_ISIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeIsNotNull() {
            addCriterion("FUND_ISIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeEqualTo(String value) {
            addCriterion("FUND_ISIN_CODE =", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeNotEqualTo(String value) {
            addCriterion("FUND_ISIN_CODE <>", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeGreaterThan(String value) {
            addCriterion("FUND_ISIN_CODE >", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ISIN_CODE >=", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeLessThan(String value) {
            addCriterion("FUND_ISIN_CODE <", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeLessThanOrEqualTo(String value) {
            addCriterion("FUND_ISIN_CODE <=", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeLike(String value) {
            addCriterion("FUND_ISIN_CODE like", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeNotLike(String value) {
            addCriterion("FUND_ISIN_CODE not like", value, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeIn(List<String> values) {
            addCriterion("FUND_ISIN_CODE in", values, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeNotIn(List<String> values) {
            addCriterion("FUND_ISIN_CODE not in", values, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeBetween(String value1, String value2) {
            addCriterion("FUND_ISIN_CODE between", value1, value2, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundIsinCodeNotBetween(String value1, String value2) {
            addCriterion("FUND_ISIN_CODE not between", value1, value2, "fundIsinCode");
            return (Criteria) this;
        }

        public Criteria andFundCurrIsNull() {
            addCriterion("FUND_CURR is null");
            return (Criteria) this;
        }

        public Criteria andFundCurrIsNotNull() {
            addCriterion("FUND_CURR is not null");
            return (Criteria) this;
        }

        public Criteria andFundCurrEqualTo(String value) {
            addCriterion("FUND_CURR =", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrNotEqualTo(String value) {
            addCriterion("FUND_CURR <>", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrGreaterThan(String value) {
            addCriterion("FUND_CURR >", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CURR >=", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrLessThan(String value) {
            addCriterion("FUND_CURR <", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrLessThanOrEqualTo(String value) {
            addCriterion("FUND_CURR <=", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrLike(String value) {
            addCriterion("FUND_CURR like", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrNotLike(String value) {
            addCriterion("FUND_CURR not like", value, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrIn(List<String> values) {
            addCriterion("FUND_CURR in", values, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrNotIn(List<String> values) {
            addCriterion("FUND_CURR not in", values, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrBetween(String value1, String value2) {
            addCriterion("FUND_CURR between", value1, value2, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundCurrNotBetween(String value1, String value2) {
            addCriterion("FUND_CURR not between", value1, value2, "fundCurr");
            return (Criteria) this;
        }

        public Criteria andFundAssetIsNull() {
            addCriterion("FUND_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andFundAssetIsNotNull() {
            addCriterion("FUND_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andFundAssetEqualTo(String value) {
            addCriterion("FUND_ASSET =", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetNotEqualTo(String value) {
            addCriterion("FUND_ASSET <>", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetGreaterThan(String value) {
            addCriterion("FUND_ASSET >", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ASSET >=", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetLessThan(String value) {
            addCriterion("FUND_ASSET <", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetLessThanOrEqualTo(String value) {
            addCriterion("FUND_ASSET <=", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetLike(String value) {
            addCriterion("FUND_ASSET like", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetNotLike(String value) {
            addCriterion("FUND_ASSET not like", value, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetIn(List<String> values) {
            addCriterion("FUND_ASSET in", values, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetNotIn(List<String> values) {
            addCriterion("FUND_ASSET not in", values, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetBetween(String value1, String value2) {
            addCriterion("FUND_ASSET between", value1, value2, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundAssetNotBetween(String value1, String value2) {
            addCriterion("FUND_ASSET not between", value1, value2, "fundAsset");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaIsNull() {
            addCriterion("FUND_REG_AREA is null");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaIsNotNull() {
            addCriterion("FUND_REG_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaEqualTo(String value) {
            addCriterion("FUND_REG_AREA =", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaNotEqualTo(String value) {
            addCriterion("FUND_REG_AREA <>", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaGreaterThan(String value) {
            addCriterion("FUND_REG_AREA >", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_REG_AREA >=", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaLessThan(String value) {
            addCriterion("FUND_REG_AREA <", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaLessThanOrEqualTo(String value) {
            addCriterion("FUND_REG_AREA <=", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaLike(String value) {
            addCriterion("FUND_REG_AREA like", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaNotLike(String value) {
            addCriterion("FUND_REG_AREA not like", value, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaIn(List<String> values) {
            addCriterion("FUND_REG_AREA in", values, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaNotIn(List<String> values) {
            addCriterion("FUND_REG_AREA not in", values, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaBetween(String value1, String value2) {
            addCriterion("FUND_REG_AREA between", value1, value2, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundRegAreaNotBetween(String value1, String value2) {
            addCriterion("FUND_REG_AREA not between", value1, value2, "fundRegArea");
            return (Criteria) this;
        }

        public Criteria andFundFDateIsNull() {
            addCriterion("FUND_F_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFundFDateIsNotNull() {
            addCriterion("FUND_F_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFundFDateEqualTo(String value) {
            addCriterion("FUND_F_DATE =", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateNotEqualTo(String value) {
            addCriterion("FUND_F_DATE <>", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateGreaterThan(String value) {
            addCriterion("FUND_F_DATE >", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_F_DATE >=", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateLessThan(String value) {
            addCriterion("FUND_F_DATE <", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateLessThanOrEqualTo(String value) {
            addCriterion("FUND_F_DATE <=", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateLike(String value) {
            addCriterion("FUND_F_DATE like", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateNotLike(String value) {
            addCriterion("FUND_F_DATE not like", value, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateIn(List<String> values) {
            addCriterion("FUND_F_DATE in", values, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateNotIn(List<String> values) {
            addCriterion("FUND_F_DATE not in", values, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateBetween(String value1, String value2) {
            addCriterion("FUND_F_DATE between", value1, value2, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andFundFDateNotBetween(String value1, String value2) {
            addCriterion("FUND_F_DATE not between", value1, value2, "fundFDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateIsNull() {
            addCriterion("RASING_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateIsNotNull() {
            addCriterion("RASING_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateEqualTo(String value) {
            addCriterion("RASING_START_DATE =", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateNotEqualTo(String value) {
            addCriterion("RASING_START_DATE <>", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateGreaterThan(String value) {
            addCriterion("RASING_START_DATE >", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("RASING_START_DATE >=", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateLessThan(String value) {
            addCriterion("RASING_START_DATE <", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateLessThanOrEqualTo(String value) {
            addCriterion("RASING_START_DATE <=", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateLike(String value) {
            addCriterion("RASING_START_DATE like", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateNotLike(String value) {
            addCriterion("RASING_START_DATE not like", value, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateIn(List<String> values) {
            addCriterion("RASING_START_DATE in", values, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateNotIn(List<String> values) {
            addCriterion("RASING_START_DATE not in", values, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateBetween(String value1, String value2) {
            addCriterion("RASING_START_DATE between", value1, value2, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingStartDateNotBetween(String value1, String value2) {
            addCriterion("RASING_START_DATE not between", value1, value2, "rasingStartDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateIsNull() {
            addCriterion("RASING_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateIsNotNull() {
            addCriterion("RASING_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateEqualTo(String value) {
            addCriterion("RASING_END_DATE =", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateNotEqualTo(String value) {
            addCriterion("RASING_END_DATE <>", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateGreaterThan(String value) {
            addCriterion("RASING_END_DATE >", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("RASING_END_DATE >=", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateLessThan(String value) {
            addCriterion("RASING_END_DATE <", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateLessThanOrEqualTo(String value) {
            addCriterion("RASING_END_DATE <=", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateLike(String value) {
            addCriterion("RASING_END_DATE like", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateNotLike(String value) {
            addCriterion("RASING_END_DATE not like", value, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateIn(List<String> values) {
            addCriterion("RASING_END_DATE in", values, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateNotIn(List<String> values) {
            addCriterion("RASING_END_DATE not in", values, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateBetween(String value1, String value2) {
            addCriterion("RASING_END_DATE between", value1, value2, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRasingEndDateNotBetween(String value1, String value2) {
            addCriterion("RASING_END_DATE not between", value1, value2, "rasingEndDate");
            return (Criteria) this;
        }

        public Criteria andRegularFlagIsNull() {
            addCriterion("REGULAR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRegularFlagIsNotNull() {
            addCriterion("REGULAR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRegularFlagEqualTo(String value) {
            addCriterion("REGULAR_FLAG =", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagNotEqualTo(String value) {
            addCriterion("REGULAR_FLAG <>", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagGreaterThan(String value) {
            addCriterion("REGULAR_FLAG >", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR_FLAG >=", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagLessThan(String value) {
            addCriterion("REGULAR_FLAG <", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagLessThanOrEqualTo(String value) {
            addCriterion("REGULAR_FLAG <=", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagLike(String value) {
            addCriterion("REGULAR_FLAG like", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagNotLike(String value) {
            addCriterion("REGULAR_FLAG not like", value, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagIn(List<String> values) {
            addCriterion("REGULAR_FLAG in", values, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagNotIn(List<String> values) {
            addCriterion("REGULAR_FLAG not in", values, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagBetween(String value1, String value2) {
            addCriterion("REGULAR_FLAG between", value1, value2, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andRegularFlagNotBetween(String value1, String value2) {
            addCriterion("REGULAR_FLAG not between", value1, value2, "regularFlag");
            return (Criteria) this;
        }

        public Criteria andNetDotIsNull() {
            addCriterion("NET_DOT is null");
            return (Criteria) this;
        }

        public Criteria andNetDotIsNotNull() {
            addCriterion("NET_DOT is not null");
            return (Criteria) this;
        }

        public Criteria andNetDotEqualTo(Integer value) {
            addCriterion("NET_DOT =", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotNotEqualTo(Integer value) {
            addCriterion("NET_DOT <>", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotGreaterThan(Integer value) {
            addCriterion("NET_DOT >", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotGreaterThanOrEqualTo(Integer value) {
            addCriterion("NET_DOT >=", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotLessThan(Integer value) {
            addCriterion("NET_DOT <", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotLessThanOrEqualTo(Integer value) {
            addCriterion("NET_DOT <=", value, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotIn(List<Integer> values) {
            addCriterion("NET_DOT in", values, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotNotIn(List<Integer> values) {
            addCriterion("NET_DOT not in", values, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotBetween(Integer value1, Integer value2) {
            addCriterion("NET_DOT between", value1, value2, "netDot");
            return (Criteria) this;
        }

        public Criteria andNetDotNotBetween(Integer value1, Integer value2) {
            addCriterion("NET_DOT not between", value1, value2, "netDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotIsNull() {
            addCriterion("UNIT_DOT is null");
            return (Criteria) this;
        }

        public Criteria andUnitDotIsNotNull() {
            addCriterion("UNIT_DOT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDotEqualTo(Integer value) {
            addCriterion("UNIT_DOT =", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotNotEqualTo(Integer value) {
            addCriterion("UNIT_DOT <>", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotGreaterThan(Integer value) {
            addCriterion("UNIT_DOT >", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIT_DOT >=", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotLessThan(Integer value) {
            addCriterion("UNIT_DOT <", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotLessThanOrEqualTo(Integer value) {
            addCriterion("UNIT_DOT <=", value, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotIn(List<Integer> values) {
            addCriterion("UNIT_DOT in", values, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotNotIn(List<Integer> values) {
            addCriterion("UNIT_DOT not in", values, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotBetween(Integer value1, Integer value2) {
            addCriterion("UNIT_DOT between", value1, value2, "unitDot");
            return (Criteria) this;
        }

        public Criteria andUnitDotNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIT_DOT not between", value1, value2, "unitDot");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashIsNull() {
            addCriterion("APPLY_MIN_CASH is null");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashIsNotNull() {
            addCriterion("APPLY_MIN_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH =", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH <>", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashGreaterThan(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH >", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH >=", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashLessThan(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH <", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH <=", value, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashIn(List<BigDecimal> values) {
            addCriterion("APPLY_MIN_CASH in", values, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_MIN_CASH not in", values, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MIN_CASH between", value1, value2, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MIN_CASH not between", value1, value2, "applyMinCash");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwIsNull() {
            addCriterion("APPLY_MIN_CASH_TW is null");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwIsNotNull() {
            addCriterion("APPLY_MIN_CASH_TW is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW =", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW <>", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwGreaterThan(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW >", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW >=", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwLessThan(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW <", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MIN_CASH_TW <=", value, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwIn(List<BigDecimal> values) {
            addCriterion("APPLY_MIN_CASH_TW in", values, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_MIN_CASH_TW not in", values, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MIN_CASH_TW between", value1, value2, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andApplyMinCashTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MIN_CASH_TW not between", value1, value2, "applyMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashIsNull() {
            addCriterion("REGULAR_MIN_CASH is null");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashIsNotNull() {
            addCriterion("REGULAR_MIN_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH =", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashNotEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH <>", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashGreaterThan(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH >", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH >=", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashLessThan(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH <", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH <=", value, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashIn(List<BigDecimal> values) {
            addCriterion("REGULAR_MIN_CASH in", values, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashNotIn(List<BigDecimal> values) {
            addCriterion("REGULAR_MIN_CASH not in", values, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_MIN_CASH between", value1, value2, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_MIN_CASH not between", value1, value2, "regularMinCash");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwIsNull() {
            addCriterion("REGULAR_MIN_CASH_TW is null");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwIsNotNull() {
            addCriterion("REGULAR_MIN_CASH_TW is not null");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW =", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwNotEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW <>", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwGreaterThan(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW >", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW >=", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwLessThan(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW <", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_MIN_CASH_TW <=", value, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwIn(List<BigDecimal> values) {
            addCriterion("REGULAR_MIN_CASH_TW in", values, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwNotIn(List<BigDecimal> values) {
            addCriterion("REGULAR_MIN_CASH_TW not in", values, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_MIN_CASH_TW between", value1, value2, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularMinCashTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_MIN_CASH_TW not between", value1, value2, "regularMinCashTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelIsNull() {
            addCriterion("REGULAR_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRegularLevelIsNotNull() {
            addCriterion("REGULAR_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRegularLevelEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL =", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelNotEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL <>", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelGreaterThan(BigDecimal value) {
            addCriterion("REGULAR_LEVEL >", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL >=", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelLessThan(BigDecimal value) {
            addCriterion("REGULAR_LEVEL <", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL <=", value, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelIn(List<BigDecimal> values) {
            addCriterion("REGULAR_LEVEL in", values, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelNotIn(List<BigDecimal> values) {
            addCriterion("REGULAR_LEVEL not in", values, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_LEVEL between", value1, value2, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_LEVEL not between", value1, value2, "regularLevel");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwIsNull() {
            addCriterion("REGULAR_LEVEL_TW is null");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwIsNotNull() {
            addCriterion("REGULAR_LEVEL_TW is not null");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW =", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwNotEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW <>", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwGreaterThan(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW >", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW >=", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwLessThan(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW <", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULAR_LEVEL_TW <=", value, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwIn(List<BigDecimal> values) {
            addCriterion("REGULAR_LEVEL_TW in", values, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwNotIn(List<BigDecimal> values) {
            addCriterion("REGULAR_LEVEL_TW not in", values, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_LEVEL_TW between", value1, value2, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andRegularLevelTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULAR_LEVEL_TW not between", value1, value2, "regularLevelTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashIsNull() {
            addCriterion("IPO_MIN_CASH is null");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashIsNotNull() {
            addCriterion("IPO_MIN_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH =", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashNotEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH <>", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashGreaterThan(BigDecimal value) {
            addCriterion("IPO_MIN_CASH >", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH >=", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashLessThan(BigDecimal value) {
            addCriterion("IPO_MIN_CASH <", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH <=", value, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashIn(List<BigDecimal> values) {
            addCriterion("IPO_MIN_CASH in", values, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashNotIn(List<BigDecimal> values) {
            addCriterion("IPO_MIN_CASH not in", values, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPO_MIN_CASH between", value1, value2, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPO_MIN_CASH not between", value1, value2, "ipoMinCash");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwIsNull() {
            addCriterion("IPO_MIN_CASH_TW is null");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwIsNotNull() {
            addCriterion("IPO_MIN_CASH_TW is not null");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW =", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwNotEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW <>", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwGreaterThan(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW >", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW >=", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwLessThan(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW <", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IPO_MIN_CASH_TW <=", value, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwIn(List<BigDecimal> values) {
            addCriterion("IPO_MIN_CASH_TW in", values, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwNotIn(List<BigDecimal> values) {
            addCriterion("IPO_MIN_CASH_TW not in", values, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPO_MIN_CASH_TW between", value1, value2, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andIpoMinCashTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPO_MIN_CASH_TW not between", value1, value2, "ipoMinCashTw");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeIsNull() {
            addCriterion("APL_SUM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeIsNotNull() {
            addCriterion("APL_SUM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeEqualTo(String value) {
            addCriterion("APL_SUM_TYPE =", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeNotEqualTo(String value) {
            addCriterion("APL_SUM_TYPE <>", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeGreaterThan(String value) {
            addCriterion("APL_SUM_TYPE >", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APL_SUM_TYPE >=", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeLessThan(String value) {
            addCriterion("APL_SUM_TYPE <", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeLessThanOrEqualTo(String value) {
            addCriterion("APL_SUM_TYPE <=", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeLike(String value) {
            addCriterion("APL_SUM_TYPE like", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeNotLike(String value) {
            addCriterion("APL_SUM_TYPE not like", value, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeIn(List<String> values) {
            addCriterion("APL_SUM_TYPE in", values, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeNotIn(List<String> values) {
            addCriterion("APL_SUM_TYPE not in", values, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeBetween(String value1, String value2) {
            addCriterion("APL_SUM_TYPE between", value1, value2, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andAplSumTypeNotBetween(String value1, String value2) {
            addCriterion("APL_SUM_TYPE not between", value1, value2, "aplSumType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeIsNull() {
            addCriterion("RDP_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeIsNotNull() {
            addCriterion("RDP_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeEqualTo(String value) {
            addCriterion("RDP_PAY_TYPE =", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeNotEqualTo(String value) {
            addCriterion("RDP_PAY_TYPE <>", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeGreaterThan(String value) {
            addCriterion("RDP_PAY_TYPE >", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RDP_PAY_TYPE >=", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeLessThan(String value) {
            addCriterion("RDP_PAY_TYPE <", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeLessThanOrEqualTo(String value) {
            addCriterion("RDP_PAY_TYPE <=", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeLike(String value) {
            addCriterion("RDP_PAY_TYPE like", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeNotLike(String value) {
            addCriterion("RDP_PAY_TYPE not like", value, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeIn(List<String> values) {
            addCriterion("RDP_PAY_TYPE in", values, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeNotIn(List<String> values) {
            addCriterion("RDP_PAY_TYPE not in", values, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeBetween(String value1, String value2) {
            addCriterion("RDP_PAY_TYPE between", value1, value2, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andRdpPayTypeNotBetween(String value1, String value2) {
            addCriterion("RDP_PAY_TYPE not between", value1, value2, "rdpPayType");
            return (Criteria) this;
        }

        public Criteria andPFlagIsNull() {
            addCriterion("P_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPFlagIsNotNull() {
            addCriterion("P_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPFlagEqualTo(String value) {
            addCriterion("P_FLAG =", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagNotEqualTo(String value) {
            addCriterion("P_FLAG <>", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagGreaterThan(String value) {
            addCriterion("P_FLAG >", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagGreaterThanOrEqualTo(String value) {
            addCriterion("P_FLAG >=", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagLessThan(String value) {
            addCriterion("P_FLAG <", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagLessThanOrEqualTo(String value) {
            addCriterion("P_FLAG <=", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagLike(String value) {
            addCriterion("P_FLAG like", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagNotLike(String value) {
            addCriterion("P_FLAG not like", value, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagIn(List<String> values) {
            addCriterion("P_FLAG in", values, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagNotIn(List<String> values) {
            addCriterion("P_FLAG not in", values, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagBetween(String value1, String value2) {
            addCriterion("P_FLAG between", value1, value2, "pFlag");
            return (Criteria) this;
        }

        public Criteria andPFlagNotBetween(String value1, String value2) {
            addCriterion("P_FLAG not between", value1, value2, "pFlag");
            return (Criteria) this;
        }

        public Criteria andShortTermIsNull() {
            addCriterion("SHORT_TERM is null");
            return (Criteria) this;
        }

        public Criteria andShortTermIsNotNull() {
            addCriterion("SHORT_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andShortTermEqualTo(Integer value) {
            addCriterion("SHORT_TERM =", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermNotEqualTo(Integer value) {
            addCriterion("SHORT_TERM <>", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermGreaterThan(Integer value) {
            addCriterion("SHORT_TERM >", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHORT_TERM >=", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermLessThan(Integer value) {
            addCriterion("SHORT_TERM <", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermLessThanOrEqualTo(Integer value) {
            addCriterion("SHORT_TERM <=", value, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermIn(List<Integer> values) {
            addCriterion("SHORT_TERM in", values, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermNotIn(List<Integer> values) {
            addCriterion("SHORT_TERM not in", values, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermBetween(Integer value1, Integer value2) {
            addCriterion("SHORT_TERM between", value1, value2, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andShortTermNotBetween(Integer value1, Integer value2) {
            addCriterion("SHORT_TERM not between", value1, value2, "shortTerm");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagIsNull() {
            addCriterion("TWD_FUND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagIsNotNull() {
            addCriterion("TWD_FUND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagEqualTo(String value) {
            addCriterion("TWD_FUND_FLAG =", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagNotEqualTo(String value) {
            addCriterion("TWD_FUND_FLAG <>", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagGreaterThan(String value) {
            addCriterion("TWD_FUND_FLAG >", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TWD_FUND_FLAG >=", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagLessThan(String value) {
            addCriterion("TWD_FUND_FLAG <", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagLessThanOrEqualTo(String value) {
            addCriterion("TWD_FUND_FLAG <=", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagLike(String value) {
            addCriterion("TWD_FUND_FLAG like", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagNotLike(String value) {
            addCriterion("TWD_FUND_FLAG not like", value, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagIn(List<String> values) {
            addCriterion("TWD_FUND_FLAG in", values, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagNotIn(List<String> values) {
            addCriterion("TWD_FUND_FLAG not in", values, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagBetween(String value1, String value2) {
            addCriterion("TWD_FUND_FLAG between", value1, value2, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andTwdFundFlagNotBetween(String value1, String value2) {
            addCriterion("TWD_FUND_FLAG not between", value1, value2, "twdFundFlag");
            return (Criteria) this;
        }

        public Criteria andApproveInfoIsNull() {
            addCriterion("APPROVE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andApproveInfoIsNotNull() {
            addCriterion("APPROVE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andApproveInfoEqualTo(String value) {
            addCriterion("APPROVE_INFO =", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoNotEqualTo(String value) {
            addCriterion("APPROVE_INFO <>", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoGreaterThan(String value) {
            addCriterion("APPROVE_INFO >", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_INFO >=", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoLessThan(String value) {
            addCriterion("APPROVE_INFO <", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_INFO <=", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoLike(String value) {
            addCriterion("APPROVE_INFO like", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoNotLike(String value) {
            addCriterion("APPROVE_INFO not like", value, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoIn(List<String> values) {
            addCriterion("APPROVE_INFO in", values, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoNotIn(List<String> values) {
            addCriterion("APPROVE_INFO not in", values, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoBetween(String value1, String value2) {
            addCriterion("APPROVE_INFO between", value1, value2, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andApproveInfoNotBetween(String value1, String value2) {
            addCriterion("APPROVE_INFO not between", value1, value2, "approveInfo");
            return (Criteria) this;
        }

        public Criteria andEditedTypeIsNull() {
            addCriterion("EDITED_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEditedTypeIsNotNull() {
            addCriterion("EDITED_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEditedTypeEqualTo(String value) {
            addCriterion("EDITED_TYPE =", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeNotEqualTo(String value) {
            addCriterion("EDITED_TYPE <>", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeGreaterThan(String value) {
            addCriterion("EDITED_TYPE >", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EDITED_TYPE >=", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeLessThan(String value) {
            addCriterion("EDITED_TYPE <", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeLessThanOrEqualTo(String value) {
            addCriterion("EDITED_TYPE <=", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeLike(String value) {
            addCriterion("EDITED_TYPE like", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeNotLike(String value) {
            addCriterion("EDITED_TYPE not like", value, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeIn(List<String> values) {
            addCriterion("EDITED_TYPE in", values, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeNotIn(List<String> values) {
            addCriterion("EDITED_TYPE not in", values, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeBetween(String value1, String value2) {
            addCriterion("EDITED_TYPE between", value1, value2, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedTypeNotBetween(String value1, String value2) {
            addCriterion("EDITED_TYPE not between", value1, value2, "editedType");
            return (Criteria) this;
        }

        public Criteria andEditedAtIsNull() {
            addCriterion("EDITED_AT is null");
            return (Criteria) this;
        }

        public Criteria andEditedAtIsNotNull() {
            addCriterion("EDITED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andEditedAtEqualTo(Date value) {
            addCriterion("EDITED_AT =", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotEqualTo(Date value) {
            addCriterion("EDITED_AT <>", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtGreaterThan(Date value) {
            addCriterion("EDITED_AT >", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("EDITED_AT >=", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtLessThan(Date value) {
            addCriterion("EDITED_AT <", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtLessThanOrEqualTo(Date value) {
            addCriterion("EDITED_AT <=", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtIn(List<Date> values) {
            addCriterion("EDITED_AT in", values, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotIn(List<Date> values) {
            addCriterion("EDITED_AT not in", values, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtBetween(Date value1, Date value2) {
            addCriterion("EDITED_AT between", value1, value2, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotBetween(Date value1, Date value2) {
            addCriterion("EDITED_AT not between", value1, value2, "editedAt");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdIsNull() {
            addCriterion("BAS_FUND_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdIsNotNull() {
            addCriterion("BAS_FUND_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdEqualTo(Long value) {
            addCriterion("BAS_FUND_TEMP_ID =", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdNotEqualTo(Long value) {
            addCriterion("BAS_FUND_TEMP_ID <>", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdGreaterThan(Long value) {
            addCriterion("BAS_FUND_TEMP_ID >", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BAS_FUND_TEMP_ID >=", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdLessThan(Long value) {
            addCriterion("BAS_FUND_TEMP_ID <", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdLessThanOrEqualTo(Long value) {
            addCriterion("BAS_FUND_TEMP_ID <=", value, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdIn(List<Long> values) {
            addCriterion("BAS_FUND_TEMP_ID in", values, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdNotIn(List<Long> values) {
            addCriterion("BAS_FUND_TEMP_ID not in", values, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdBetween(Long value1, Long value2) {
            addCriterion("BAS_FUND_TEMP_ID between", value1, value2, "basFundTempId");
            return (Criteria) this;
        }

        public Criteria andBasFundTempIdNotBetween(Long value1, Long value2) {
            addCriterion("BAS_FUND_TEMP_ID not between", value1, value2, "basFundTempId");
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