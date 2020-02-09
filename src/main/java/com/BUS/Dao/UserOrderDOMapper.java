package com.BUS.Dao;

import com.BUS.Service.model.DropOffModel;
import com.BUS.Service.model.MySeatBookModel;
import com.BUS.dataObject.UserOrderDO;
import com.BUS.dataObject.UserOrderDOExample;
import com.BUS.dataObject.UserOrderDOKey;

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

public interface UserOrderDOMapper {
    @SelectProvider(type=UserOrderDOSqlProvider.class, method="countByExample")
    long countByExample(UserOrderDOExample example);

    @DeleteProvider(type=UserOrderDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserOrderDOExample example);

    @Delete({
        "delete from userorder",
        "where userId = #{userid,jdbcType=VARCHAR}",
          "and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR} and date = #{date,jdbcType=DATE}"
    })
    @Results({
            @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="date", property="date", jdbcType=JdbcType.DATE),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    int cancelMyBookSeat(String date,String busno,String routeid,String userid);

    @Insert({
        "insert into userorder (userId, routeId, ",
        "status, date, ",
        "busNo, seat, startPlace, targetPlace)",
        "values (#{userid,jdbcType=VARCHAR}, #{routeid,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP}, ",
        "#{busno,jdbcType=VARCHAR}, #{seat,jdbcType=VARCHAR}, #{startplace,jdbcType=VARCHAR}, #{targetplace,jdbcType=VARCHAR})"
    })
    @Results({
            @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="date", property="date", jdbcType=JdbcType.DATE),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    int insert(String date,String busno,String routeid,String seat,String userid,int status,String startplace,String targetplace);

    @InsertProvider(type=UserOrderDOSqlProvider.class, method="insertSelective")
    int insertSelective(UserOrderDO record);

    @SelectProvider(type=UserOrderDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
        @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    List<UserOrderDO> selectByExample(UserOrderDOExample example);

    @Select({
        "select",
        "userId, routeId, status, date, busNo, seat",
        "from userorder",
        "where userId = #{userid,jdbcType=VARCHAR}",
          "and routeId = #{routeid,jdbcType=VARCHAR} and date = #{date,jdbcType=DATE} and busNo = #{busno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="date", property="date", jdbcType=JdbcType.DATE),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
        @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    MySeatBookModel select(String date,String busno,String routeid,String userid);

    @Select({
            "select targetPlace",
            "from userorder",
            "where routeId = #{routeid,jdbcType=VARCHAR} and date = #{date,jdbcType=DATE} and busNo = #{busno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="targetPlace", property="targetplace", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<String> selectFinalPlace(String busno, String date, String routeid);


    @Select({
            "select",
            "userId, routeId, status, date, busNo",
            "from userorder",
            "where userId = #{userid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="date", property="date", jdbcType=JdbcType.DATE),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<MySeatBookModel> getMyOrders(String userid);




    @UpdateProvider(type=UserOrderDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserOrderDO record, @Param("example") UserOrderDOExample example);

    @UpdateProvider(type=UserOrderDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserOrderDO record, @Param("example") UserOrderDOExample example);

    @UpdateProvider(type=UserOrderDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserOrderDO record);

    @Update({
        "update userorder",
        "set seat = #{seat,jdbcType=VARCHAR}",
        "where userId = #{userid,jdbcType=VARCHAR}",
          "and routeId = #{routeid,jdbcType=VARCHAR} and busNo = #{busno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="routeId", property="routeid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="date", property="date", jdbcType=JdbcType.DATE),
            @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
            @Result(column="seat", property="seat", jdbcType=JdbcType.VARCHAR)
    })
    int updateMyBySeatsbookdetail(String date,String busno,String routeid,String seat,String userid,int status);
}