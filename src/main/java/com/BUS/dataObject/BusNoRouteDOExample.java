package com.BUS.dataObject;

import java.util.ArrayList;
import java.util.List;

public class BusNoRouteDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusNoRouteDOExample() {
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

        public Criteria andRouteidIsNull() {
            addCriterion("routeId is null");
            return (Criteria) this;
        }

        public Criteria andRouteidIsNotNull() {
            addCriterion("routeId is not null");
            return (Criteria) this;
        }

        public Criteria andRouteidEqualTo(String value) {
            addCriterion("routeId =", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotEqualTo(String value) {
            addCriterion("routeId <>", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThan(String value) {
            addCriterion("routeId >", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThanOrEqualTo(String value) {
            addCriterion("routeId >=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThan(String value) {
            addCriterion("routeId <", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThanOrEqualTo(String value) {
            addCriterion("routeId <=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLike(String value) {
            addCriterion("routeId like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotLike(String value) {
            addCriterion("routeId not like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidIn(List<String> values) {
            addCriterion("routeId in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotIn(List<String> values) {
            addCriterion("routeId not in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidBetween(String value1, String value2) {
            addCriterion("routeId between", value1, value2, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotBetween(String value1, String value2) {
            addCriterion("routeId not between", value1, value2, "routeid");
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