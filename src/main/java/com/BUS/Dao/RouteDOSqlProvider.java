package com.BUS.Dao;

import com.BUS.dataObject.RouteDO;
import com.BUS.dataObject.RouteDOExample.Criteria;
import com.BUS.dataObject.RouteDOExample.Criterion;
import com.BUS.dataObject.RouteDOExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RouteDOSqlProvider {

    public String countByExample(RouteDOExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("routeinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RouteDOExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("routeinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RouteDO record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("routeinfo");
        
        if (record.getRouteno() != null) {
            sql.VALUES("routeNo", "#{routeno,jdbcType=VARCHAR}");
        }
        
        if (record.getDatetype() != null) {
            sql.VALUES("dateType", "#{datetype,jdbcType=INTEGER}");
        }
        
        if (record.getStarttime() != null) {
            sql.VALUES("startTime", "#{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutetype() != null) {
            sql.VALUES("routeType", "#{routetype,jdbcType=INTEGER}");
        }
        
        if (record.getStartplace() != null) {
            sql.VALUES("startPlace", "#{startplace,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace1() != null) {
            sql.VALUES("place1", "#{place1,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace2() != null) {
            sql.VALUES("place2", "#{place2,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace3() != null) {
            sql.VALUES("place3", "#{place3,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace4() != null) {
            sql.VALUES("place4", "#{place4,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace5() != null) {
            sql.VALUES("place5", "#{place5,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace6() != null) {
            sql.VALUES("place6", "#{place6,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace7() != null) {
            sql.VALUES("place7", "#{place7,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace8() != null) {
            sql.VALUES("place8", "#{place8,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace9() != null) {
            sql.VALUES("place9", "#{place9,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace10() != null) {
            sql.VALUES("place10", "#{place10,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace11() != null) {
            sql.VALUES("place11", "#{place11,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace12() != null) {
            sql.VALUES("place12", "#{place12,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace13() != null) {
            sql.VALUES("place13", "#{place13,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalplace() != null) {
            sql.VALUES("finalPlace", "#{finalplace,jdbcType=VARCHAR}");
        }
        
        if (record.getBusnum() != null) {
            sql.VALUES("busNum", "#{busnum,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RouteDOExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("routeNo");
        } else {
            sql.SELECT("routeNo");
        }
        sql.SELECT("dateType");
        sql.SELECT("startTime");
        sql.SELECT("routeType");
        sql.SELECT("startPlace");
        sql.SELECT("place1");
        sql.SELECT("place2");
        sql.SELECT("place3");
        sql.SELECT("place4");
        sql.SELECT("place5");
        sql.SELECT("place6");
        sql.SELECT("place7");
        sql.SELECT("place8");
        sql.SELECT("place9");
        sql.SELECT("place10");
        sql.SELECT("place11");
        sql.SELECT("place12");
        sql.SELECT("place13");
        sql.SELECT("finalPlace");
        sql.SELECT("busNum");
        sql.FROM("routeinfo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RouteDO record = (RouteDO) parameter.get("record");
        RouteDOExample example = (RouteDOExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("routeinfo");
        
        if (record.getRouteno() != null) {
            sql.SET("routeNo = #{record.routeno,jdbcType=VARCHAR}");
        }
        
        if (record.getDatetype() != null) {
            sql.SET("dateType = #{record.datetype,jdbcType=INTEGER}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("startTime = #{record.starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutetype() != null) {
            sql.SET("routeType = #{record.routetype,jdbcType=INTEGER}");
        }
        
        if (record.getStartplace() != null) {
            sql.SET("startPlace = #{record.startplace,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace1() != null) {
            sql.SET("place1 = #{record.place1,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace2() != null) {
            sql.SET("place2 = #{record.place2,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace3() != null) {
            sql.SET("place3 = #{record.place3,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace4() != null) {
            sql.SET("place4 = #{record.place4,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace5() != null) {
            sql.SET("place5 = #{record.place5,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace6() != null) {
            sql.SET("place6 = #{record.place6,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace7() != null) {
            sql.SET("place7 = #{record.place7,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace8() != null) {
            sql.SET("place8 = #{record.place8,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace9() != null) {
            sql.SET("place9 = #{record.place9,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace10() != null) {
            sql.SET("place10 = #{record.place10,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace11() != null) {
            sql.SET("place11 = #{record.place11,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace12() != null) {
            sql.SET("place12 = #{record.place12,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace13() != null) {
            sql.SET("place13 = #{record.place13,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalplace() != null) {
            sql.SET("finalPlace = #{record.finalplace,jdbcType=VARCHAR}");
        }
        
        if (record.getBusnum() != null) {
            sql.SET("busNum = #{record.busnum,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("routeinfo");
        
        sql.SET("routeNo = #{record.routeno,jdbcType=VARCHAR}");
        sql.SET("dateType = #{record.datetype,jdbcType=INTEGER}");
        sql.SET("startTime = #{record.starttime,jdbcType=VARCHAR}");
        sql.SET("routeType = #{record.routetype,jdbcType=INTEGER}");
        sql.SET("startPlace = #{record.startplace,jdbcType=VARCHAR}");
        sql.SET("place1 = #{record.place1,jdbcType=VARCHAR}");
        sql.SET("place2 = #{record.place2,jdbcType=VARCHAR}");
        sql.SET("place3 = #{record.place3,jdbcType=VARCHAR}");
        sql.SET("place4 = #{record.place4,jdbcType=VARCHAR}");
        sql.SET("place5 = #{record.place5,jdbcType=VARCHAR}");
        sql.SET("place6 = #{record.place6,jdbcType=VARCHAR}");
        sql.SET("place7 = #{record.place7,jdbcType=VARCHAR}");
        sql.SET("place8 = #{record.place8,jdbcType=VARCHAR}");
        sql.SET("place9 = #{record.place9,jdbcType=VARCHAR}");
        sql.SET("place10 = #{record.place10,jdbcType=VARCHAR}");
        sql.SET("place11 = #{record.place11,jdbcType=VARCHAR}");
        sql.SET("place12 = #{record.place12,jdbcType=VARCHAR}");
        sql.SET("place13 = #{record.place13,jdbcType=VARCHAR}");
        sql.SET("finalPlace = #{record.finalplace,jdbcType=VARCHAR}");
        sql.SET("busNum = #{record.busnum,jdbcType=INTEGER}");
        
        RouteDOExample example = (RouteDOExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(RouteDO record) {
        SQL sql = new SQL();
        sql.UPDATE("routeinfo");
        
        if (record.getDatetype() != null) {
            sql.SET("dateType = #{datetype,jdbcType=INTEGER}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("startTime = #{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutetype() != null) {
            sql.SET("routeType = #{routetype,jdbcType=INTEGER}");
        }
        
        if (record.getStartplace() != null) {
            sql.SET("startPlace = #{startplace,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace1() != null) {
            sql.SET("place1 = #{place1,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace2() != null) {
            sql.SET("place2 = #{place2,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace3() != null) {
            sql.SET("place3 = #{place3,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace4() != null) {
            sql.SET("place4 = #{place4,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace5() != null) {
            sql.SET("place5 = #{place5,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace6() != null) {
            sql.SET("place6 = #{place6,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace7() != null) {
            sql.SET("place7 = #{place7,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace8() != null) {
            sql.SET("place8 = #{place8,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace9() != null) {
            sql.SET("place9 = #{place9,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace10() != null) {
            sql.SET("place10 = #{place10,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace11() != null) {
            sql.SET("place11 = #{place11,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace12() != null) {
            sql.SET("place12 = #{place12,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace13() != null) {
            sql.SET("place13 = #{place13,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalplace() != null) {
            sql.SET("finalPlace = #{finalplace,jdbcType=VARCHAR}");
        }
        
        if (record.getBusnum() != null) {
            sql.SET("busNum = #{busnum,jdbcType=INTEGER}");
        }
        
        sql.WHERE("routeNo = #{routeno,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RouteDOExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}