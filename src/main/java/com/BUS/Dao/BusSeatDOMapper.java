package com.BUS.Dao;

import com.BUS.dataObject.BusSeatDO;
import com.BUS.dataObject.BusSeatDOExample;
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

public interface BusSeatDOMapper {
    @SelectProvider(type=BusSeatDOSqlProvider.class, method="countByExample")
    long countByExample(BusSeatDOExample example);

    @DeleteProvider(type=BusSeatDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(BusSeatDOExample example);

    @Delete({
        "delete from busseatinfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into busseatinfo (id, busNo, ",
        "seats)",
        "values (#{id,jdbcType=INTEGER}, #{busno,jdbcType=VARCHAR}, ",
        "#{seats,jdbcType=VARCHAR})"
    })
    int insert(BusSeatDO record);

    @InsertProvider(type=BusSeatDOSqlProvider.class, method="insertSelective")
    int insertSelective(BusSeatDO record);

    @SelectProvider(type=BusSeatDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
        @Result(column="seats", property="seats", jdbcType=JdbcType.VARCHAR)
    })
    List<BusSeatDO> selectByExample(BusSeatDOExample example);

    @Select({
        "select",
        "id, busNo, seats",
        "from busseatinfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="busNo", property="busno", jdbcType=JdbcType.VARCHAR),
        @Result(column="seats", property="seats", jdbcType=JdbcType.VARCHAR)
    })
    BusSeatDO selectByPrimaryKey(Integer id);

    @UpdateProvider(type=BusSeatDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BusSeatDO record, @Param("example") BusSeatDOExample example);

    @UpdateProvider(type=BusSeatDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BusSeatDO record, @Param("example") BusSeatDOExample example);

    @UpdateProvider(type=BusSeatDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BusSeatDO record);

    @Update({
        "update busseatinfo",
        "set busNo = #{busno,jdbcType=VARCHAR},",
          "seats = #{seats,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BusSeatDO record);
}