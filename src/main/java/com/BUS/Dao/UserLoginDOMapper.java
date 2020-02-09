package com.BUS.Dao;

import com.BUS.dataObject.UserLoginDO;
import com.BUS.dataObject.UserLoginDOExample;
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

public interface UserLoginDOMapper {
    @SelectProvider(type=UserLoginDOSqlProvider.class, method="countByExample")
    long countByExample(UserLoginDOExample example);

    @DeleteProvider(type=UserLoginDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserLoginDOExample example);

    @Delete({
        "delete from userlogininfo",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into userlogininfo (id, username, ",
        "password, type)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER})"
    })
    int insert(UserLoginDO record);

    @InsertProvider(type=UserLoginDOSqlProvider.class, method="insertSelective")
    int insertSelective(UserLoginDO record);

    @SelectProvider(type=UserLoginDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<UserLoginDO> selectByExample(UserLoginDOExample example);

    @Select({
        "select",
        "id, username, password, type",
        "from userlogininfo",
        "where username = #{username,jdbcType=VARCHAR} and password = #{password,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    UserLoginDO selectByUserNameAndPassword(String username,String password);

    @UpdateProvider(type=UserLoginDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserLoginDO record, @Param("example") UserLoginDOExample example);

    @UpdateProvider(type=UserLoginDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserLoginDO record, @Param("example") UserLoginDOExample example);

    @UpdateProvider(type=UserLoginDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserLoginDO record);

    @Update({
        "update userlogininfo",
        "set password = #{password,jdbcType=VARCHAR}",
        "where username = #{username,jdbcType=VARCHAR}"
    })
    int modifiPSW(UserLoginDO record);
}