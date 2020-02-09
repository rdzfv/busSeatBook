package com.BUS.Dao;

import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.dataObject.LAFDO;
import com.BUS.dataObject.LAFDOExample;

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

public interface LAFDOMapper {
    @SelectProvider(type=LAFDOSqlProvider.class, method="countByExample")
    long countByExample(LAFDOExample example);

    @DeleteProvider(type=LAFDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(LAFDOExample example);

    @Delete({
        "delete from lafinfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into lafinfo (id, userId, ",
        "LAFType, name, releaseTime, ",
        "status, description, ",
        "picUrl, tel)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=VARCHAR}, ",
        "#{laftype,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{releasetime,jdbcType=TIMESTAMP}, ",
        "0, #{description,jdbcType=VARCHAR}, ",
        "#{picurl,jdbcType=VARCHAR}, #{tel,jdbcType=VARCHAR})"
    })
    int insert(LAFDO record);

    @InsertProvider(type=LAFDOSqlProvider.class, method="insertSelective")
    int insertSelective(LAFDO record);

    @SelectProvider(type=LAFDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAFType", property="laftype", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="releaseTime", property="releasetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="picUrl", property="picurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR)
    })
    List<LAFDO> selectByExample(LAFDOExample example);

    @Select({
        "select",
        "id, userId, LAFType, name, releaseTime, status, description, picUrl, tel",
        "from lafinfo"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAFType", property="laftype", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="releaseTime", property="releasetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="picUrl", property="picurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<InquireLAFResponse> selectAll();

    @Select({
            "select",
            "id, userId, LAFType, name, releaseTime, status, description, picUrl, tel",
            "from lafinfo",
            "where userId = #{userid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR),
            @Result(column="LAFType", property="laftype", jdbcType=JdbcType.INTEGER),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="releaseTime", property="releasetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
            @Result(column="picUrl", property="picurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<InquireLAFResponse> selectMyAll(String userid);

    @UpdateProvider(type=LAFDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LAFDO record, @Param("example") LAFDOExample example);

    @UpdateProvider(type=LAFDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LAFDO record, @Param("example") LAFDOExample example);

    @UpdateProvider(type=LAFDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LAFDO record);

    @Update({
        "update lafinfo",
        "set status = 1",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateLAFById(LAFDO record);
}