package com.BUS.Dao;

import com.BUS.dataObject.DriverBusDO;
import com.BUS.dataObject.DriverBusDOExample;
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

public interface DriverBusDOMapper {
    @SelectProvider(type=DriverBusDOSqlProvider.class, method="countByExample")
    long countByExample(DriverBusDOExample example);

    @DeleteProvider(type=DriverBusDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(DriverBusDOExample example);

    @Delete({
        "delete from busdriverinfo",
        "where driverNo = #{driverno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String driverno);

    @Insert({
        "insert into busdriverinfo (driverNo, busNo)",
        "values (#{driverno,jdbcType=VARCHAR}, #{busno,jdbcType=VARCHAR})"
    })
    int insert(DriverBusDO record);

    @InsertProvider(type=DriverBusDOSqlProvider.class, method="insertSelective")
    int insertSelective(DriverBusDO record);

    @SelectProvider(type=DriverBusDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="driverNo", property="driverno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR)
    })
    List<DriverBusDO> selectByExample(DriverBusDOExample example);

    @Select({
        "select",
        "driverNo, busNo",
        "from busdriverinfo",
        "where driverNo = #{driverno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="driverNo", property="driverno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR)
    })
    DriverBusDO selectByPrimaryKey(String driverno);

    @UpdateProvider(type=DriverBusDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DriverBusDO record, @Param("example") DriverBusDOExample example);

    @UpdateProvider(type=DriverBusDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DriverBusDO record, @Param("example") DriverBusDOExample example);

    @UpdateProvider(type=DriverBusDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DriverBusDO record);

    @Update({
        "update busdriverinfo",
        "set busNo = #{busno,jdbcType=VARCHAR}",
        "where driverNo = #{driverno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DriverBusDO record);
}