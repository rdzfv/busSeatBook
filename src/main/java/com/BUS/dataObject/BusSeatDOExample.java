package com.BUS.dataObject;

import java.util.ArrayList;
import java.util.List;

public class BusSeatDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusSeatDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBusnoIsNull() {
            addCriterion("busNo is null");
            return (Criteria) this;
        }

        public Criteria andBusnoIsNotNull() {
            addCriterion("busNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusnoEqualTo(String value) {
            addCriterion("busNo =", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoNotEqualTo(String value) {
            addCriterion("busNo <>", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoGreaterThan(String value) {
            addCriterion("busNo >", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoGreaterThanOrEqualTo(String value) {
            addCriterion("busNo >=", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoLessThan(String value) {
            addCriterion("busNo <", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoLessThanOrEqualTo(String value) {
            addCriterion("busNo <=", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoLike(String value) {
            addCriterion("busNo like", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoNotLike(String value) {
            addCriterion("busNo not like", value, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoIn(List<String> values) {
            addCriterion("busNo in", values, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoNotIn(List<String> values) {
            addCriterion("busNo not in", values, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoBetween(String value1, String value2) {
            addCriterion("busNo between", value1, value2, "busno");
            return (Criteria) this;
        }

        public Criteria andBusnoNotBetween(String value1, String value2) {
            addCriterion("busNo not between", value1, value2, "busno");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNull() {
            addCriterion("seats is null");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNotNull() {
            addCriterion("seats is not null");
            return (Criteria) this;
        }

        public Criteria andSeatsEqualTo(String value) {
            addCriterion("seats =", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotEqualTo(String value) {
            addCriterion("seats <>", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThan(String value) {
            addCriterion("seats >", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThanOrEqualTo(String value) {
            addCriterion("seats >=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThan(String value) {
            addCriterion("seats <", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThanOrEqualTo(String value) {
            addCriterion("seats <=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLike(String value) {
            addCriterion("seats like", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotLike(String value) {
            addCriterion("seats not like", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsIn(List<String> values) {
            addCriterion("seats in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotIn(List<String> values) {
            addCriterion("seats not in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsBetween(String value1, String value2) {
            addCriterion("seats between", value1, value2, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotBetween(String value1, String value2) {
            addCriterion("seats not between", value1, value2, "seats");
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