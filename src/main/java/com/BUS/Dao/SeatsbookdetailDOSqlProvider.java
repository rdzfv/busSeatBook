package com.BUS.Dao;

import com.BUS.dataObject.SeatsbookdetailDO;
import com.BUS.dataObject.SeatsbookdetailDOExample.Criteria;
import com.BUS.dataObject.SeatsbookdetailDOExample.Criterion;
import com.BUS.dataObject.SeatsbookdetailDOExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SeatsbookdetailDOSqlProvider {

    public String countByExample(SeatsbookdetailDOExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("seatsbookdetailinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SeatsbookdetailDOExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("seatsbookdetailinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SeatsbookdetailDO record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("seatsbookdetailinfo");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDate() != null) {
            sql.VALUES("date", "#{date,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRouteid() != null) {
            sql.VALUES("routeId", "#{routeid,jdbcType=VARCHAR}");
        }
        
        if (record.getBusno() != null) {
            sql.VALUES("busNo", "#{busno,jdbcType=VARCHAR}");
        }
        
        if (record.getDetail() != null) {
            sql.VALUES("detail", "#{detail,jdbcType=VARCHAR}");
        }
        
        if (record.getDriverid() != null) {
            sql.VALUES("driverId", "#{driverid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiverlatitude() != null) {
            sql.VALUES("diverLatitude", "#{diverlatitude,jdbcType=REAL}");
        }
        
        if (record.getDriverlongitude() != null) {
            sql.VALUES("driverLongitude", "#{driverlongitude,jdbcType=REAL}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SeatsbookdetailDOExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("date");
        sql.SELECT("routeId");
        sql.SELECT("busNo");
        sql.SELECT("detail");
        sql.SELECT("driverId");
        sql.SELECT("diverLatitude");
        sql.SELECT("driverLongitude");
        sql.FROM("seatsbookdetailinfo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SeatsbookdetailDO record = (SeatsbookdetailDO) parameter.get("record");
        SeatsbookdetailDOExample example = (SeatsbookdetailDOExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("seatsbookdetailinfo");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDate() != null) {
            sql.SET("date = #{record.date,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRouteid() != null) {
            sql.SET("routeId = #{record.routeid,jdbcType=VARCHAR}");
        }
        
        if (record.getBusno() != null) {
            sql.SET("busNo = #{record.busno,jdbcType=VARCHAR}");
        }
        
        if (record.getDetail() != null) {
            sql.SET("detail = #{record.detail,jdbcType=VARCHAR}");
        }
        
        if (record.getDriverid() != null) {
            sql.SET("driverId = #{record.driverid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiverlatitude() != null) {
            sql.SET("diverLatitude = #{record.diverlatitude,jdbcType=REAL}");
        }
        
        if (record.getDriverlongitude() != null) {
            sql.SET("driverLongitude = #{record.driverlongitude,jdbcType=REAL}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("seatsbookdetailinfo");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("date = #{record.date,jdbcType=TIMESTAMP}");
        sql.SET("routeId = #{record.routeid,jdbcType=VARCHAR}");
        sql.SET("busNo = #{record.busno,jdbcType=VARCHAR}");
        sql.SET("detail = #{record.detail,jdbcType=VARCHAR}");
        sql.SET("driverId = #{record.driverid,jdbcType=VARCHAR}");
        sql.SET("diverLatitude = #{record.diverlatitude,jdbcType=REAL}");
        sql.SET("driverLongitude = #{record.driverlongitude,jdbcType=REAL}");
        
        SeatsbookdetailDOExample example = (SeatsbookdetailDOExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SeatsbookdetailDO record) {
        SQL sql = new SQL();
        sql.UPDATE("seatsbookdetailinfo");
        
        if (record.getDate() != null) {
            sql.SET("date = #{date,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRouteid() != null) {
            sql.SET("routeId = #{routeid,jdbcType=VARCHAR}");
        }
        
        if (record.getBusno() != null) {
            sql.SET("busNo = #{busno,jdbcType=VARCHAR}");
        }
        
        if (record.getDetail() != null) {
            sql.SET("detail = #{detail,jdbcType=VARCHAR}");
        }
        
        if (record.getDriverid() != null) {
            sql.SET("driverId = #{driverid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiverlatitude() != null) {
            sql.SET("diverLatitude = #{diverlatitude,jdbcType=REAL}");
        }
        
        if (record.getDriverlongitude() != null) {
            sql.SET("driverLongitude = #{driverlongitude,jdbcType=REAL}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SeatsbookdetailDOExample example, boolean includeExamplePhrase) {
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