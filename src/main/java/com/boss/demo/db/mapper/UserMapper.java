package com.boss.demo.db.mapper;

import com.boss.demo.db.sqlprovider.UserSqlProvider;
import com.boss.demo.db.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
public interface UserMapper {
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, name, ",
        "age)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER})"
    })
    int insert(User record);
    @InsertProvider(type= UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, name, age",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(Integer id);


    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);
    @Update({
        "update user",
        "set name = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}