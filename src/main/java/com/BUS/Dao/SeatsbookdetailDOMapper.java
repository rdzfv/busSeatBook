package com.BUS.Dao;

import com.BUS.Service.model.DriverBoundRes;
import com.BUS.Service.model.SeatBookModel;
import com.BUS.dataObject.SeatsbookdetailDO;
import com.BUS.dataObject.SeatsbookdetailDOExample;

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

public interface SeatsbookdetailDOMapper {
    @SelectProvider(type=SeatsbookdetailDOSqlProvider.class, method="countByExample")
    long countByExample(SeatsbookdetailDOExample example);

    @DeleteProvider(type=SeatsbookdetailDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(SeatsbookdetailDOExample example);

    @Delete({
            "delete from seatsbookdetailinfo",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into seatsbookdetailinfo (id, date, ",
            "routeId, busNo, ",
            "detail, driverId, ",
            "diverLatitude, driverLongitude)",
            "values (#{id,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP}, ",
            "#{routeid,jdbcType=VARCHAR}, #{busno,jdbcType=VARCHAR}, ",
            "#{detail,jdbcType=VARCHAR}, #{driverid,jdbcType=VARCHAR}, ",
            "#{diverlatitude,jdbcType=REAL}, #{driverlongitude,jdbcType=REAL})"
    })
    int insert(SeatsbookdetailDO record);

    @InsertProvider(type=SeatsbookdetailDOSqlProvider.class, method="insertSelective")
    int insertSelective(SeatsbookdetailDO record);

    @SelectProvider(type=SeatsbookdetailDOSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    List<SeatsbookdetailDO> selectByExample(SeatsbookdetailDOExample example);

    @Select({
            "select",
            "id, date, routeId, busNo, detail, driverId, diverLatitude, driverLongitude",
            "from seatsbookdetailinfo",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    SeatsbookdetailDO selectByPrimaryKey(Integer id);

    // 根据date、routeid、busno查询发车记录////////////////////////////////////////////////////////////////////////////////////////
    @Select({
            "select",
            "id, date, routeId, busNo, detail, driverId, diverLatitude, driverLongitude",
            "from seatsbookdetailinfo",
            "where date = #{date,jdbcType=DATE} and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR} and driverId = #{driverid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    ArrayList<DriverBoundRes> selectByDateAndBusNoAndRouteIdAndDriverId(String date, String routeid, String busno, String driverid);

    //
    @Select({
            "select",
            "id, date, routeId, busNo, detail, driverId, diverLatitude, driverLongitude",
            "from seatsbookdetailinfo",
            "where date = #{date,jdbcType=DATE} and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    SeatBookModel selectByDateAndBusNoAndRouteId(String date, String routeid, String busno);

    @UpdateProvider(type=SeatsbookdetailDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SeatsbookdetailDO record, @Param("example") SeatsbookdetailDOExample example);

    @UpdateProvider(type=SeatsbookdetailDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SeatsbookdetailDO record, @Param("example") SeatsbookdetailDOExample example);

    @UpdateProvider(type=SeatsbookdetailDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SeatsbookdetailDO record);

    // 根据date,busno,routeid,detail更新发车记录///////////////////////////////////////////////////////////////////
    @Update({
            "update seatsbookdetailinfo",
            "set detail = #{detail,jdbcType=VARCHAR}",
            "where date = #{date,jdbcType=DATE} and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    int updateBySeatsbookdetail(String date,String busno,String routeid,String detail);

    @Update({
            "update seatsbookdetailinfo",
            "set diverLatitude = #{diverlatitude,jdbcType=REAL}, driverLongitude= #{driverlongitude,jdbcType=REAL}",
            "where date = #{date,jdbcType=DATE} and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR} and driverId = #{driverid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
            @Result(column="driverId", property="driverid", jdbcType=JdbcType.VARCHAR),
            @Result(column="diverLatitude", property="diverlatitude", jdbcType=JdbcType.REAL),
            @Result(column="driverLongitude", property="driverlongitude", jdbcType=JdbcType.REAL)
    })
    int updateByDriverLoc(float diverlatitude, float driverlongitude, String date,String busno,String driverid,String routeid);
}