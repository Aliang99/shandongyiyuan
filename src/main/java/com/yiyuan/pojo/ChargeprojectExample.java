package com.yiyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChargeprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeprojectExample() {
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

        public Criteria andCp_idIsNull() {
            addCriterion("cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCp_idIsNotNull() {
            addCriterion("cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCp_idEqualTo(Integer value) {
            addCriterion("cp_id =", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idNotEqualTo(Integer value) {
            addCriterion("cp_id <>", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idGreaterThan(Integer value) {
            addCriterion("cp_id >", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_id >=", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idLessThan(Integer value) {
            addCriterion("cp_id <", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idLessThanOrEqualTo(Integer value) {
            addCriterion("cp_id <=", value, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idIn(List<Integer> values) {
            addCriterion("cp_id in", values, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idNotIn(List<Integer> values) {
            addCriterion("cp_id not in", values, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idBetween(Integer value1, Integer value2) {
            addCriterion("cp_id between", value1, value2, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_idNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_id not between", value1, value2, "cp_id");
            return (Criteria) this;
        }

        public Criteria andCp_nameIsNull() {
            addCriterion("cp_name is null");
            return (Criteria) this;
        }

        public Criteria andCp_nameIsNotNull() {
            addCriterion("cp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCp_nameEqualTo(String value) {
            addCriterion("cp_name =", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameNotEqualTo(String value) {
            addCriterion("cp_name <>", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameGreaterThan(String value) {
            addCriterion("cp_name >", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cp_name >=", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameLessThan(String value) {
            addCriterion("cp_name <", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameLessThanOrEqualTo(String value) {
            addCriterion("cp_name <=", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameLike(String value) {
            addCriterion("cp_name like", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameNotLike(String value) {
            addCriterion("cp_name not like", value, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameIn(List<String> values) {
            addCriterion("cp_name in", values, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameNotIn(List<String> values) {
            addCriterion("cp_name not in", values, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameBetween(String value1, String value2) {
            addCriterion("cp_name between", value1, value2, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_nameNotBetween(String value1, String value2) {
            addCriterion("cp_name not between", value1, value2, "cp_name");
            return (Criteria) this;
        }

        public Criteria andCp_moneyIsNull() {
            addCriterion("cp_money is null");
            return (Criteria) this;
        }

        public Criteria andCp_moneyIsNotNull() {
            addCriterion("cp_money is not null");
            return (Criteria) this;
        }

        public Criteria andCp_moneyEqualTo(Double value) {
            addCriterion("cp_money =", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyNotEqualTo(Double value) {
            addCriterion("cp_money <>", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyGreaterThan(Double value) {
            addCriterion("cp_money >", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cp_money >=", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyLessThan(Double value) {
            addCriterion("cp_money <", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyLessThanOrEqualTo(Double value) {
            addCriterion("cp_money <=", value, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyIn(List<Double> values) {
            addCriterion("cp_money in", values, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyNotIn(List<Double> values) {
            addCriterion("cp_money not in", values, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyBetween(Double value1, Double value2) {
            addCriterion("cp_money between", value1, value2, "cp_money");
            return (Criteria) this;
        }

        public Criteria andCp_moneyNotBetween(Double value1, Double value2) {
            addCriterion("cp_money not between", value1, value2, "cp_money");
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