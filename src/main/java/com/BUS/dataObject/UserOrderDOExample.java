package com.BUS.dataObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrderDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderDOExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andStartplaceIsNull() {
            addCriterion("startPlace is null");
            return (Criteria) this;
        }

        public Criteria andStartplaceIsNotNull() {
            addCriterion("startPlace is not null");
            return (Criteria) this;
        }

        public Criteria andStartplaceEqualTo(String value) {
            addCriterion("startPlace =", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotEqualTo(String value) {
            addCriterion("startPlace <>", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceGreaterThan(String value) {
            addCriterion("startPlace >", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceGreaterThanOrEqualTo(String value) {
            addCriterion("startPlace >=", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLessThan(String value) {
            addCriterion("startPlace <", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLessThanOrEqualTo(String value) {
            addCriterion("startPlace <=", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLike(String value) {
            addCriterion("startPlace like", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotLike(String value) {
            addCriterion("startPlace not like", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceIn(List<String> values) {
            addCriterion("startPlace in", values, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotIn(List<String> values) {
            addCriterion("startPlace not in", values, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceBetween(String value1, String value2) {
            addCriterion("startPlace between", value1, value2, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotBetween(String value1, String value2) {
            addCriterion("startPlace not between", value1, value2, "startplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceIsNull() {
            addCriterion("targetPlace is null");
            return (Criteria) this;
        }

        public Criteria andTargetplaceIsNotNull() {
            addCriterion("targetPlace is not null");
            return (Criteria) this;
        }

        public Criteria andTargetplaceEqualTo(String value) {
            addCriterion("targetPlace =", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceNotEqualTo(String value) {
            addCriterion("targetPlace <>", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceGreaterThan(String value) {
            addCriterion("targetPlace >", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceGreaterThanOrEqualTo(String value) {
            addCriterion("targetPlace >=", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceLessThan(String value) {
            addCriterion("targetPlace <", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceLessThanOrEqualTo(String value) {
            addCriterion("targetPlace <=", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceLike(String value) {
            addCriterion("targetPlace like", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceNotLike(String value) {
            addCriterion("targetPlace not like", value, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceIn(List<String> values) {
            addCriterion("targetPlace in", values, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceNotIn(List<String> values) {
            addCriterion("targetPlace not in", values, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceBetween(String value1, String value2) {
            addCriterion("targetPlace between", value1, value2, "targetplace");
            return (Criteria) this;
        }

        public Criteria andTargetplaceNotBetween(String value1, String value2) {
            addCriterion("targetPlace not between", value1, value2, "targetplace");
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