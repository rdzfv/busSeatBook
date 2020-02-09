package com.BUS.Dao;

import com.BUS.Service.model.DropOffModel;
import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.InquireMyOrder;
import com.BUS.dataObject.RouteDO;
import com.BUS.dataObject.RouteDOExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RouteDOMapper {
    @SelectProvider(type=RouteDOSqlProvider.class, method="countByExample")
    long countByExample(RouteDOExample example);

    @DeleteProvider(type=RouteDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(RouteDOExample example);

    @Delete({
        "delete from routeinfo",
        "where routeNo = #{routeno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String routeno);

    @Insert({
        "insert into routeinfo (routeNo, dateType, ",
        "startTime, routeType, ",
        "startPlace, place1, ",
        "place2, place3, ",
        "place4, place5, ",
        "place6, place7, ",
        "place8, place9, ",
        "place10, place11, ",
        "place12, place13, ",
        "finalPlace, busNum)",
        "values (#{routeno,jdbcType=VARCHAR}, #{datetype,jdbcType=INTEGER}, ",
        "#{starttime,jdbcType=VARCHAR}, #{routetype,jdbcType=INTEGER}, ",
        "#{startplace,jdbcType=VARCHAR}, #{place1,jdbcType=VARCHAR}, ",
        "#{place2,jdbcType=VARCHAR}, #{place3,jdbcType=VARCHAR}, ",
        "#{place4,jdbcType=VARCHAR}, #{place5,jdbcType=VARCHAR}, ",
        "#{place6,jdbcType=VARCHAR}, #{place7,jdbcType=VARCHAR}, ",
        "#{place8,jdbcType=VARCHAR}, #{place9,jdbcType=VARCHAR}, ",
        "#{place10,jdbcType=VARCHAR}, #{place11,jdbcType=VARCHAR}, ",
        "#{place12,jdbcType=VARCHAR}, #{place13,jdbcType=VARCHAR}, ",
        "#{finalplace,jdbcType=VARCHAR}, #{busnum,jdbcType=INTEGER})"
    })
    int insert(RouteDO record);

    @InsertProvider(type=RouteDOSqlProvider.class, method="insertSelective")
    int insertSelective(RouteDO record);

    @SelectProvider(type=RouteDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="routeNo", property="routeno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="dateType", property="datetype", jdbcType=JdbcType.INTEGER),
        @Result(column="startTime", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="routeType", property="routetype", jdbcType=JdbcType.INTEGER),
        @Result(column="startPlace", property="startplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
        @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
        @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
        @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
        @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
        @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
        @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
        @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
        @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
        @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
        @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
        @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
        @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
        @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="busNum", property="busnum", jdbcType=JdbcType.INTEGER)
    })
    List<RouteDO> selectByExample(RouteDOExample example);

    @Select({
        "select",
        "routeNo, dateType, startTime, routeType, startPlace, place1, place2, place3, ",
        "place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, ",
        "finalPlace, busNum",
        "from routeinfo",
        "where routeNo = #{routeno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="routeNo", property="routeno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="dateType", property="datetype", jdbcType=JdbcType.INTEGER),
        @Result(column="startTime", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="routeType", property="routetype", jdbcType=JdbcType.INTEGER),
        @Result(column="startPlace", property="startplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
        @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
        @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
        @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
        @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
        @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
        @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
        @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
        @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
        @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
        @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
        @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
        @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
        @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="busNum", property="busnum", jdbcType=JdbcType.INTEGER)
    })
    RouteDO selectByPrimaryKey(String routeno);

    @Select({
            "select",
            "routeNo, startTime, startPlace, finalPlace,startTime,place1,place2,place3,place4,place5,place6,place7,place8,place9,place10,place11,place12,place13",
            "from routeinfo",
            "where dateType = #{datetype,jdbcType=INTEGER} and startTime = #{starttime,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="routeNo", property="routeno", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="dateType", property="datetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startTime", property="starttime", jdbcType=JdbcType.VARCHAR),
            @Result(column="routeType", property="routetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startPlace", property="startplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
            @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
            @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
            @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
            @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
            @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
            @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
            @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
            @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
            @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
            @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
            @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
            @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
            @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNum", property="busnum", jdbcType=JdbcType.INTEGER)
    })
    ArrayList<InquireBusResponse> selectByDateTypeAndStartTime(int datetype,String starttime);


    @Select({
            "select",
            "routeNo, startTime, startPlace, finalPlace,startTime,place1,place2,place3,place4,place5,place6,place7,place8,place9,place10,place11,place12,place13",
            "from routeinfo"
    })
    @Results({
            @Result(column="routeNo", property="routeno", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="dateType", property="datetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startTime", property="starttime", jdbcType=JdbcType.VARCHAR),
            @Result(column="routeType", property="routetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startPlace", property="startplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
            @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
            @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
            @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
            @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
            @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
            @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
            @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
            @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
            @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
            @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
            @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
            @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
            @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNum", property="busnum", jdbcType=JdbcType.INTEGER)
    })
    ArrayList<InquireBusResponse> selectAll();


    @Select({
            "select",
            "startTime, startPlace, finalPlace",
            "from routeinfo",
            "where routeNo = #{routeno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="routeNo", property="routeno", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="dateType", property="datetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startTime", property="starttime", jdbcType=JdbcType.VARCHAR),
            @Result(column="routeType", property="routetype", jdbcType=JdbcType.INTEGER),
            @Result(column="startPlace", property="startplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
            @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
            @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
            @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
            @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
            @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
            @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
            @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
            @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
            @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
            @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
            @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
            @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
            @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNum", property="busnum", jdbcType=JdbcType.INTEGER)
    })
    InquireMyOrder inquireRoute(String routeno);


    @Select({
            "select place1, place2, place3, place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, finalPlace",
            "from routeinfo",
            "where routeNo = #{routeno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="place1", property="place1", jdbcType=JdbcType.VARCHAR),
            @Result(column="place2", property="place2", jdbcType=JdbcType.VARCHAR),
            @Result(column="place3", property="place3", jdbcType=JdbcType.VARCHAR),
            @Result(column="place4", property="place4", jdbcType=JdbcType.VARCHAR),
            @Result(column="place5", property="place5", jdbcType=JdbcType.VARCHAR),
            @Result(column="place6", property="place6", jdbcType=JdbcType.VARCHAR),
            @Result(column="place7", property="place7", jdbcType=JdbcType.VARCHAR),
            @Result(column="place8", property="place8", jdbcType=JdbcType.VARCHAR),
            @Result(column="place9", property="place9", jdbcType=JdbcType.VARCHAR),
            @Result(column="place10", property="place10", jdbcType=JdbcType.VARCHAR),
            @Result(column="place11", property="place11", jdbcType=JdbcType.VARCHAR),
            @Result(column="place12", property="place12", jdbcType=JdbcType.VARCHAR),
            @Result(column="place13", property="place13", jdbcType=JdbcType.VARCHAR),
            @Result(column="finalPlace", property="finalplace", jdbcType=JdbcType.VARCHAR)
    })
    InquireBusResponse selectAllPlaceByRouteId(String routeno);


    @UpdateProvider(type=RouteDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RouteDO record, @Param("example") RouteDOExample example);

    @UpdateProvider(type=RouteDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RouteDO record, @Param("example") RouteDOExample example);

    @UpdateProvider(type=RouteDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RouteDO record);

    @Update({
        "update routeinfo",
        "set dateType = #{datetype,jdbcType=INTEGER},",
          "startTime = #{starttime,jdbcType=VARCHAR},",
          "routeType = #{routetype,jdbcType=INTEGER},",
          "startPlace = #{startplace,jdbcType=VARCHAR},",
          "place1 = #{place1,jdbcType=VARCHAR},",
          "place2 = #{place2,jdbcType=VARCHAR},",
          "place3 = #{place3,jdbcType=VARCHAR},",
          "place4 = #{place4,jdbcType=VARCHAR},",
          "place5 = #{place5,jdbcType=VARCHAR},",
          "place6 = #{place6,jdbcType=VARCHAR},",
          "place7 = #{place7,jdbcType=VARCHAR},",
          "place8 = #{place8,jdbcType=VARCHAR},",
          "place9 = #{place9,jdbcType=VARCHAR},",
          "place10 = #{place10,jdbcType=VARCHAR},",
          "place11 = #{place11,jdbcType=VARCHAR},",
          "place12 = #{place12,jdbcType=VARCHAR},",
          "place13 = #{place13,jdbcType=VARCHAR},",
          "finalPlace = #{finalplace,jdbcType=VARCHAR},",
          "busNum = #{busnum,jdbcType=INTEGER}",
        "where routeNo = #{routeno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RouteDO record);
}