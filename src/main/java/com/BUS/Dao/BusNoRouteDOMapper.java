package com.BUS.Dao;

import com.BUS.Service.model.InquireBusResponse;
import com.BUS.dataObject.BusNoRouteDO;
import com.BUS.dataObject.BusNoRouteDOExample;
import com.BUS.dataObject.BusNoRouteDOKey;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface BusNoRouteDOMapper {
    @SelectProvider(type=BusNoRouteDOSqlProvider.class, method="countByExample")
    long countByExample(BusNoRouteDOExample example);

    @DeleteProvider(type=BusNoRouteDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(BusNoRouteDOExample example);

    @Delete({
        "delete from busrouteinfo",
        "where busNo = #{busno,jdbcType=VARCHAR}",
          "and routeId = #{routeid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(BusNoRouteDOKey key);

    @Insert({
        "insert into busrouteinfo (busNo, routeId)",
        "values (#{busno,jdbcType=VARCHAR}, #{routeid,jdbcType=VARCHAR})"
    })
    int insert(BusNoRouteDOKey record);

    @InsertProvider(type=BusNoRouteDOSqlProvider.class, method="insertSelective")
    int insertSelective(BusNoRouteDOKey record);

    @SelectProvider(type=BusNoRouteDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<BusNoRouteDOKey> selectByExample(BusNoRouteDOExample example);

    @UpdateProvider(type=BusNoRouteDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BusNoRouteDOKey record, @Param("example") BusNoRouteDOExample example);

    @UpdateProvider(type=BusNoRouteDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BusNoRouteDOKey record, @Param("example") BusNoRouteDOExample example);


    @Select({
            "select",
            "routeId, busNo",
            "from busrouteinfo",
            "where routeId = #{routeid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<BusNoRouteDO> getBusNosByRouteNo(String routeid);


}