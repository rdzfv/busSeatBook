package com.BUS.dataObject;

import java.util.ArrayList;
import java.util.List;

public class RouteDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RouteDOExample() {
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

        public Criteria andRoutenoIsNull() {
            addCriterion("routeNo is null");
            return (Criteria) this;
        }

        public Criteria andRoutenoIsNotNull() {
            addCriterion("routeNo is not null");
            return (Criteria) this;
        }

        public Criteria andRoutenoEqualTo(String value) {
            addCriterion("routeNo =", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoNotEqualTo(String value) {
            addCriterion("routeNo <>", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoGreaterThan(String value) {
            addCriterion("routeNo >", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoGreaterThanOrEqualTo(String value) {
            addCriterion("routeNo >=", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoLessThan(String value) {
            addCriterion("routeNo <", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoLessThanOrEqualTo(String value) {
            addCriterion("routeNo <=", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoLike(String value) {
            addCriterion("routeNo like", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoNotLike(String value) {
            addCriterion("routeNo not like", value, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoIn(List<String> values) {
            addCriterion("routeNo in", values, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoNotIn(List<String> values) {
            addCriterion("routeNo not in", values, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoBetween(String value1, String value2) {
            addCriterion("routeNo between", value1, value2, "routeno");
            return (Criteria) this;
        }

        public Criteria andRoutenoNotBetween(String value1, String value2) {
            addCriterion("routeNo not between", value1, value2, "routeno");
            return (Criteria) this;
        }

        public Criteria andDatetypeIsNull() {
            addCriterion("dateType is null");
            return (Criteria) this;
        }

        public Criteria andDatetypeIsNotNull() {
            addCriterion("dateType is not null");
            return (Criteria) this;
        }

        public Criteria andDatetypeEqualTo(Integer value) {
            addCriterion("dateType =", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotEqualTo(Integer value) {
            addCriterion("dateType <>", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeGreaterThan(Integer value) {
            addCriterion("dateType >", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dateType >=", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeLessThan(Integer value) {
            addCriterion("dateType <", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("dateType <=", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeIn(List<Integer> values) {
            addCriterion("dateType in", values, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotIn(List<Integer> values) {
            addCriterion("dateType not in", values, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeBetween(Integer value1, Integer value2) {
            addCriterion("dateType between", value1, value2, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dateType not between", value1, value2, "datetype");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andRoutetypeIsNull() {
            addCriterion("routeType is null");
            return (Criteria) this;
        }

        public Criteria andRoutetypeIsNotNull() {
            addCriterion("routeType is not null");
            return (Criteria) this;
        }

        public Criteria andRoutetypeEqualTo(Integer value) {
            addCriterion("routeType =", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeNotEqualTo(Integer value) {
            addCriterion("routeType <>", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeGreaterThan(Integer value) {
            addCriterion("routeType >", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("routeType >=", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeLessThan(Integer value) {
            addCriterion("routeType <", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeLessThanOrEqualTo(Integer value) {
            addCriterion("routeType <=", value, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeIn(List<Integer> values) {
            addCriterion("routeType in", values, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeNotIn(List<Integer> values) {
            addCriterion("routeType not in", values, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeBetween(Integer value1, Integer value2) {
            addCriterion("routeType between", value1, value2, "routetype");
            return (Criteria) this;
        }

        public Criteria andRoutetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("routeType not between", value1, value2, "routetype");
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

        public Criteria andPlace1IsNull() {
            addCriterion("place1 is null");
            return (Criteria) this;
        }

        public Criteria andPlace1IsNotNull() {
            addCriterion("place1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace1EqualTo(String value) {
            addCriterion("place1 =", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1NotEqualTo(String value) {
            addCriterion("place1 <>", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1GreaterThan(String value) {
            addCriterion("place1 >", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1GreaterThanOrEqualTo(String value) {
            addCriterion("place1 >=", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1LessThan(String value) {
            addCriterion("place1 <", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1LessThanOrEqualTo(String value) {
            addCriterion("place1 <=", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1Like(String value) {
            addCriterion("place1 like", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1NotLike(String value) {
            addCriterion("place1 not like", value, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1In(List<String> values) {
            addCriterion("place1 in", values, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1NotIn(List<String> values) {
            addCriterion("place1 not in", values, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1Between(String value1, String value2) {
            addCriterion("place1 between", value1, value2, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace1NotBetween(String value1, String value2) {
            addCriterion("place1 not between", value1, value2, "place1");
            return (Criteria) this;
        }

        public Criteria andPlace2IsNull() {
            addCriterion("place2 is null");
            return (Criteria) this;
        }

        public Criteria andPlace2IsNotNull() {
            addCriterion("place2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace2EqualTo(String value) {
            addCriterion("place2 =", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2NotEqualTo(String value) {
            addCriterion("place2 <>", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2GreaterThan(String value) {
            addCriterion("place2 >", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2GreaterThanOrEqualTo(String value) {
            addCriterion("place2 >=", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2LessThan(String value) {
            addCriterion("place2 <", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2LessThanOrEqualTo(String value) {
            addCriterion("place2 <=", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2Like(String value) {
            addCriterion("place2 like", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2NotLike(String value) {
            addCriterion("place2 not like", value, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2In(List<String> values) {
            addCriterion("place2 in", values, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2NotIn(List<String> values) {
            addCriterion("place2 not in", values, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2Between(String value1, String value2) {
            addCriterion("place2 between", value1, value2, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace2NotBetween(String value1, String value2) {
            addCriterion("place2 not between", value1, value2, "place2");
            return (Criteria) this;
        }

        public Criteria andPlace3IsNull() {
            addCriterion("place3 is null");
            return (Criteria) this;
        }

        public Criteria andPlace3IsNotNull() {
            addCriterion("place3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace3EqualTo(String value) {
            addCriterion("place3 =", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3NotEqualTo(String value) {
            addCriterion("place3 <>", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3GreaterThan(String value) {
            addCriterion("place3 >", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3GreaterThanOrEqualTo(String value) {
            addCriterion("place3 >=", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3LessThan(String value) {
            addCriterion("place3 <", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3LessThanOrEqualTo(String value) {
            addCriterion("place3 <=", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3Like(String value) {
            addCriterion("place3 like", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3NotLike(String value) {
            addCriterion("place3 not like", value, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3In(List<String> values) {
            addCriterion("place3 in", values, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3NotIn(List<String> values) {
            addCriterion("place3 not in", values, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3Between(String value1, String value2) {
            addCriterion("place3 between", value1, value2, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace3NotBetween(String value1, String value2) {
            addCriterion("place3 not between", value1, value2, "place3");
            return (Criteria) this;
        }

        public Criteria andPlace4IsNull() {
            addCriterion("place4 is null");
            return (Criteria) this;
        }

        public Criteria andPlace4IsNotNull() {
            addCriterion("place4 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace4EqualTo(String value) {
            addCriterion("place4 =", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4NotEqualTo(String value) {
            addCriterion("place4 <>", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4GreaterThan(String value) {
            addCriterion("place4 >", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4GreaterThanOrEqualTo(String value) {
            addCriterion("place4 >=", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4LessThan(String value) {
            addCriterion("place4 <", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4LessThanOrEqualTo(String value) {
            addCriterion("place4 <=", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4Like(String value) {
            addCriterion("place4 like", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4NotLike(String value) {
            addCriterion("place4 not like", value, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4In(List<String> values) {
            addCriterion("place4 in", values, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4NotIn(List<String> values) {
            addCriterion("place4 not in", values, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4Between(String value1, String value2) {
            addCriterion("place4 between", value1, value2, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace4NotBetween(String value1, String value2) {
            addCriterion("place4 not between", value1, value2, "place4");
            return (Criteria) this;
        }

        public Criteria andPlace5IsNull() {
            addCriterion("place5 is null");
            return (Criteria) this;
        }

        public Criteria andPlace5IsNotNull() {
            addCriterion("place5 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace5EqualTo(String value) {
            addCriterion("place5 =", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5NotEqualTo(String value) {
            addCriterion("place5 <>", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5GreaterThan(String value) {
            addCriterion("place5 >", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5GreaterThanOrEqualTo(String value) {
            addCriterion("place5 >=", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5LessThan(String value) {
            addCriterion("place5 <", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5LessThanOrEqualTo(String value) {
            addCriterion("place5 <=", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5Like(String value) {
            addCriterion("place5 like", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5NotLike(String value) {
            addCriterion("place5 not like", value, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5In(List<String> values) {
            addCriterion("place5 in", values, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5NotIn(List<String> values) {
            addCriterion("place5 not in", values, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5Between(String value1, String value2) {
            addCriterion("place5 between", value1, value2, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace5NotBetween(String value1, String value2) {
            addCriterion("place5 not between", value1, value2, "place5");
            return (Criteria) this;
        }

        public Criteria andPlace6IsNull() {
            addCriterion("place6 is null");
            return (Criteria) this;
        }

        public Criteria andPlace6IsNotNull() {
            addCriterion("place6 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace6EqualTo(String value) {
            addCriterion("place6 =", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6NotEqualTo(String value) {
            addCriterion("place6 <>", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6GreaterThan(String value) {
            addCriterion("place6 >", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6GreaterThanOrEqualTo(String value) {
            addCriterion("place6 >=", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6LessThan(String value) {
            addCriterion("place6 <", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6LessThanOrEqualTo(String value) {
            addCriterion("place6 <=", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6Like(String value) {
            addCriterion("place6 like", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6NotLike(String value) {
            addCriterion("place6 not like", value, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6In(List<String> values) {
            addCriterion("place6 in", values, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6NotIn(List<String> values) {
            addCriterion("place6 not in", values, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6Between(String value1, String value2) {
            addCriterion("place6 between", value1, value2, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace6NotBetween(String value1, String value2) {
            addCriterion("place6 not between", value1, value2, "place6");
            return (Criteria) this;
        }

        public Criteria andPlace7IsNull() {
            addCriterion("place7 is null");
            return (Criteria) this;
        }

        public Criteria andPlace7IsNotNull() {
            addCriterion("place7 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace7EqualTo(String value) {
            addCriterion("place7 =", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7NotEqualTo(String value) {
            addCriterion("place7 <>", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7GreaterThan(String value) {
            addCriterion("place7 >", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7GreaterThanOrEqualTo(String value) {
            addCriterion("place7 >=", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7LessThan(String value) {
            addCriterion("place7 <", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7LessThanOrEqualTo(String value) {
            addCriterion("place7 <=", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7Like(String value) {
            addCriterion("place7 like", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7NotLike(String value) {
            addCriterion("place7 not like", value, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7In(List<String> values) {
            addCriterion("place7 in", values, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7NotIn(List<String> values) {
            addCriterion("place7 not in", values, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7Between(String value1, String value2) {
            addCriterion("place7 between", value1, value2, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace7NotBetween(String value1, String value2) {
            addCriterion("place7 not between", value1, value2, "place7");
            return (Criteria) this;
        }

        public Criteria andPlace8IsNull() {
            addCriterion("place8 is null");
            return (Criteria) this;
        }

        public Criteria andPlace8IsNotNull() {
            addCriterion("place8 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace8EqualTo(String value) {
            addCriterion("place8 =", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8NotEqualTo(String value) {
            addCriterion("place8 <>", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8GreaterThan(String value) {
            addCriterion("place8 >", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8GreaterThanOrEqualTo(String value) {
            addCriterion("place8 >=", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8LessThan(String value) {
            addCriterion("place8 <", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8LessThanOrEqualTo(String value) {
            addCriterion("place8 <=", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8Like(String value) {
            addCriterion("place8 like", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8NotLike(String value) {
            addCriterion("place8 not like", value, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8In(List<String> values) {
            addCriterion("place8 in", values, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8NotIn(List<String> values) {
            addCriterion("place8 not in", values, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8Between(String value1, String value2) {
            addCriterion("place8 between", value1, value2, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace8NotBetween(String value1, String value2) {
            addCriterion("place8 not between", value1, value2, "place8");
            return (Criteria) this;
        }

        public Criteria andPlace9IsNull() {
            addCriterion("place9 is null");
            return (Criteria) this;
        }

        public Criteria andPlace9IsNotNull() {
            addCriterion("place9 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace9EqualTo(String value) {
            addCriterion("place9 =", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9NotEqualTo(String value) {
            addCriterion("place9 <>", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9GreaterThan(String value) {
            addCriterion("place9 >", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9GreaterThanOrEqualTo(String value) {
            addCriterion("place9 >=", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9LessThan(String value) {
            addCriterion("place9 <", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9LessThanOrEqualTo(String value) {
            addCriterion("place9 <=", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9Like(String value) {
            addCriterion("place9 like", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9NotLike(String value) {
            addCriterion("place9 not like", value, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9In(List<String> values) {
            addCriterion("place9 in", values, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9NotIn(List<String> values) {
            addCriterion("place9 not in", values, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9Between(String value1, String value2) {
            addCriterion("place9 between", value1, value2, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace9NotBetween(String value1, String value2) {
            addCriterion("place9 not between", value1, value2, "place9");
            return (Criteria) this;
        }

        public Criteria andPlace10IsNull() {
            addCriterion("place10 is null");
            return (Criteria) this;
        }

        public Criteria andPlace10IsNotNull() {
            addCriterion("place10 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace10EqualTo(String value) {
            addCriterion("place10 =", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10NotEqualTo(String value) {
            addCriterion("place10 <>", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10GreaterThan(String value) {
            addCriterion("place10 >", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10GreaterThanOrEqualTo(String value) {
            addCriterion("place10 >=", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10LessThan(String value) {
            addCriterion("place10 <", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10LessThanOrEqualTo(String value) {
            addCriterion("place10 <=", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10Like(String value) {
            addCriterion("place10 like", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10NotLike(String value) {
            addCriterion("place10 not like", value, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10In(List<String> values) {
            addCriterion("place10 in", values, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10NotIn(List<String> values) {
            addCriterion("place10 not in", values, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10Between(String value1, String value2) {
            addCriterion("place10 between", value1, value2, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace10NotBetween(String value1, String value2) {
            addCriterion("place10 not between", value1, value2, "place10");
            return (Criteria) this;
        }

        public Criteria andPlace11IsNull() {
            addCriterion("place11 is null");
            return (Criteria) this;
        }

        public Criteria andPlace11IsNotNull() {
            addCriterion("place11 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace11EqualTo(String value) {
            addCriterion("place11 =", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11NotEqualTo(String value) {
            addCriterion("place11 <>", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11GreaterThan(String value) {
            addCriterion("place11 >", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11GreaterThanOrEqualTo(String value) {
            addCriterion("place11 >=", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11LessThan(String value) {
            addCriterion("place11 <", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11LessThanOrEqualTo(String value) {
            addCriterion("place11 <=", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11Like(String value) {
            addCriterion("place11 like", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11NotLike(String value) {
            addCriterion("place11 not like", value, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11In(List<String> values) {
            addCriterion("place11 in", values, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11NotIn(List<String> values) {
            addCriterion("place11 not in", values, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11Between(String value1, String value2) {
            addCriterion("place11 between", value1, value2, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace11NotBetween(String value1, String value2) {
            addCriterion("place11 not between", value1, value2, "place11");
            return (Criteria) this;
        }

        public Criteria andPlace12IsNull() {
            addCriterion("place12 is null");
            return (Criteria) this;
        }

        public Criteria andPlace12IsNotNull() {
            addCriterion("place12 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace12EqualTo(String value) {
            addCriterion("place12 =", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12NotEqualTo(String value) {
            addCriterion("place12 <>", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12GreaterThan(String value) {
            addCriterion("place12 >", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12GreaterThanOrEqualTo(String value) {
            addCriterion("place12 >=", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12LessThan(String value) {
            addCriterion("place12 <", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12LessThanOrEqualTo(String value) {
            addCriterion("place12 <=", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12Like(String value) {
            addCriterion("place12 like", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12NotLike(String value) {
            addCriterion("place12 not like", value, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12In(List<String> values) {
            addCriterion("place12 in", values, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12NotIn(List<String> values) {
            addCriterion("place12 not in", values, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12Between(String value1, String value2) {
            addCriterion("place12 between", value1, value2, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace12NotBetween(String value1, String value2) {
            addCriterion("place12 not between", value1, value2, "place12");
            return (Criteria) this;
        }

        public Criteria andPlace13IsNull() {
            addCriterion("place13 is null");
            return (Criteria) this;
        }

        public Criteria andPlace13IsNotNull() {
            addCriterion("place13 is not null");
            return (Criteria) this;
        }

        public Criteria andPlace13EqualTo(String value) {
            addCriterion("place13 =", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13NotEqualTo(String value) {
            addCriterion("place13 <>", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13GreaterThan(String value) {
            addCriterion("place13 >", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13GreaterThanOrEqualTo(String value) {
            addCriterion("place13 >=", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13LessThan(String value) {
            addCriterion("place13 <", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13LessThanOrEqualTo(String value) {
            addCriterion("place13 <=", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13Like(String value) {
            addCriterion("place13 like", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13NotLike(String value) {
            addCriterion("place13 not like", value, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13In(List<String> values) {
            addCriterion("place13 in", values, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13NotIn(List<String> values) {
            addCriterion("place13 not in", values, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13Between(String value1, String value2) {
            addCriterion("place13 between", value1, value2, "place13");
            return (Criteria) this;
        }

        public Criteria andPlace13NotBetween(String value1, String value2) {
            addCriterion("place13 not between", value1, value2, "place13");
            return (Criteria) this;
        }

        public Criteria andFinalplaceIsNull() {
            addCriterion("finalPlace is null");
            return (Criteria) this;
        }

        public Criteria andFinalplaceIsNotNull() {
            addCriterion("finalPlace is not null");
            return (Criteria) this;
        }

        public Criteria andFinalplaceEqualTo(String value) {
            addCriterion("finalPlace =", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceNotEqualTo(String value) {
            addCriterion("finalPlace <>", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceGreaterThan(String value) {
            addCriterion("finalPlace >", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceGreaterThanOrEqualTo(String value) {
            addCriterion("finalPlace >=", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceLessThan(String value) {
            addCriterion("finalPlace <", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceLessThanOrEqualTo(String value) {
            addCriterion("finalPlace <=", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceLike(String value) {
            addCriterion("finalPlace like", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceNotLike(String value) {
            addCriterion("finalPlace not like", value, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceIn(List<String> values) {
            addCriterion("finalPlace in", values, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceNotIn(List<String> values) {
            addCriterion("finalPlace not in", values, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceBetween(String value1, String value2) {
            addCriterion("finalPlace between", value1, value2, "finalplace");
            return (Criteria) this;
        }

        public Criteria andFinalplaceNotBetween(String value1, String value2) {
            addCriterion("finalPlace not between", value1, value2, "finalplace");
            return (Criteria) this;
        }

        public Criteria andBusnumIsNull() {
            addCriterion("busNum is null");
            return (Criteria) this;
        }

        public Criteria andBusnumIsNotNull() {
            addCriterion("busNum is not null");
            return (Criteria) this;
        }

        public Criteria andBusnumEqualTo(Integer value) {
            addCriterion("busNum =", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumNotEqualTo(Integer value) {
            addCriterion("busNum <>", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumGreaterThan(Integer value) {
            addCriterion("busNum >", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("busNum >=", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumLessThan(Integer value) {
            addCriterion("busNum <", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumLessThanOrEqualTo(Integer value) {
            addCriterion("busNum <=", value, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumIn(List<Integer> values) {
            addCriterion("busNum in", values, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumNotIn(List<Integer> values) {
            addCriterion("busNum not in", values, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumBetween(Integer value1, Integer value2) {
            addCriterion("busNum between", value1, value2, "busnum");
            return (Criteria) this;
        }

        public Criteria andBusnumNotBetween(Integer value1, Integer value2) {
            addCriterion("busNum not between", value1, value2, "busnum");
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