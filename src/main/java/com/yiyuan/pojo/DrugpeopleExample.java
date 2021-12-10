package com.yiyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugpeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugpeopleExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDrugP_idIsNull() {
            addCriterion("drugP_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugP_idIsNotNull() {
            addCriterion("drugP_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugP_idEqualTo(Integer value) {
            addCriterion("drugP_id =", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idNotEqualTo(Integer value) {
            addCriterion("drugP_id <>", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idGreaterThan(Integer value) {
            addCriterion("drugP_id >", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugP_id >=", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idLessThan(Integer value) {
            addCriterion("drugP_id <", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idLessThanOrEqualTo(Integer value) {
            addCriterion("drugP_id <=", value, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idIn(List<Integer> values) {
            addCriterion("drugP_id in", values, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idNotIn(List<Integer> values) {
            addCriterion("drugP_id not in", values, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idBetween(Integer value1, Integer value2) {
            addCriterion("drugP_id between", value1, value2, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("drugP_id not between", value1, value2, "drugP_id");
            return (Criteria) this;
        }

        public Criteria andDr_idIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDr_idIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDr_idEqualTo(Integer value) {
            addCriterion("dr_id =", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThan(Integer value) {
            addCriterion("dr_id <", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idIn(List<Integer> values) {
            addCriterion("dr_id in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idIsNull() {
            addCriterion("hosR_id is null");
            return (Criteria) this;
        }

        public Criteria andHosR_idIsNotNull() {
            addCriterion("hosR_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_idEqualTo(Integer value) {
            addCriterion("hosR_id =", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotEqualTo(Integer value) {
            addCriterion("hosR_id <>", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idGreaterThan(Integer value) {
            addCriterion("hosR_id >", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_id >=", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idLessThan(Integer value) {
            addCriterion("hosR_id <", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_id <=", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idIn(List<Integer> values) {
            addCriterion("hosR_id in", values, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotIn(List<Integer> values) {
            addCriterion("hosR_id not in", values, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idBetween(Integer value1, Integer value2) {
            addCriterion("hosR_id between", value1, value2, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_id not between", value1, value2, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberIsNull() {
            addCriterion("drugP_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberIsNotNull() {
            addCriterion("drugP_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberEqualTo(Integer value) {
            addCriterion("drugP_number =", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberNotEqualTo(Integer value) {
            addCriterion("drugP_number <>", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberGreaterThan(Integer value) {
            addCriterion("drugP_number >", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugP_number >=", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberLessThan(Integer value) {
            addCriterion("drugP_number <", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberLessThanOrEqualTo(Integer value) {
            addCriterion("drugP_number <=", value, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberIn(List<Integer> values) {
            addCriterion("drugP_number in", values, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberNotIn(List<Integer> values) {
            addCriterion("drugP_number not in", values, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberBetween(Integer value1, Integer value2) {
            addCriterion("drugP_number between", value1, value2, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("drugP_number not between", value1, value2, "drugP_number");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberIsNull() {
            addCriterion("drugP_givenNumber is null");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberIsNotNull() {
            addCriterion("drugP_givenNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberEqualTo(Integer value) {
            addCriterion("drugP_givenNumber =", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberNotEqualTo(Integer value) {
            addCriterion("drugP_givenNumber <>", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberGreaterThan(Integer value) {
            addCriterion("drugP_givenNumber >", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugP_givenNumber >=", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberLessThan(Integer value) {
            addCriterion("drugP_givenNumber <", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberLessThanOrEqualTo(Integer value) {
            addCriterion("drugP_givenNumber <=", value, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberIn(List<Integer> values) {
            addCriterion("drugP_givenNumber in", values, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberNotIn(List<Integer> values) {
            addCriterion("drugP_givenNumber not in", values, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberBetween(Integer value1, Integer value2) {
            addCriterion("drugP_givenNumber between", value1, value2, "drugP_givenNumber");
            return (Criteria) this;
        }

        public Criteria andDrugP_givenNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("drugP_givenNumber not between", value1, value2, "drugP_givenNumber");
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