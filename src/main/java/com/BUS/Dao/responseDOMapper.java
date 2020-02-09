package com.BUS.Dao;

import com.BUS.dataObject.responseDO;
import com.BUS.dataObject.responseDOExample;
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

public interface responseDOMapper {
    @SelectProvider(type=responseDOSqlProvider.class, method="countByExample")
    long countByExample(responseDOExample example);

    @DeleteProvider(type=responseDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(responseDOExample example);

    @Delete({
        "delete from responseinfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into responseinfo",
        "values (#{content,jdbcType=VARCHAR})"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR)
    })
    int pushResponse(String content);

//    @Insert({
//            "insert into responseinfo(content)",
//            "values (#{content,jdbcType=VARCHAR})"
//    })
//    @Results({
//            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR)
//    })
//    int pushResponse(String content);

    @InsertProvider(type=responseDOSqlProvider.class, method="insertSelective")
    int insertSelective(responseDO record);

    @SelectProvider(type=responseDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR)
    })
    List<responseDO> selectByExample(responseDOExample example);

    @Select({
        "select",
        "id, content",
        "from responseinfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR)
    })
    responseDO selectByPrimaryKey(Integer id);

    @UpdateProvider(type=responseDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") responseDO record, @Param("example") responseDOExample example);

    @UpdateProvider(type=responseDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") responseDO record, @Param("example") responseDOExample example);

    @UpdateProvider(type=responseDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(responseDO record);

    @Update({
        "update responseinfo",
        "set content = #{content,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(responseDO record);
}