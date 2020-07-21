package com.boss.demo.db.mapper;

import com.boss.demo.db.model.Details;
import com.boss.demo.db.sqlprovider.DetailsSqlProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DetailsMapper {
    @Delete({
        "delete from details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into details (id, name, ",
        "spec, num, detailId)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{spec,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER}, #{detailid,jdbcType=INTEGER})"
    })
    int insert(Details record);
    @InsertProvider(type= DetailsSqlProvider.class, method="insertSelective")
    int insertSelective(Details record);

    @Select({
        "select",
        "id, name, spec, num, detailId",
        "from details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="detailId", property="detailid", jdbcType=JdbcType.INTEGER)
    })
    Details selectByPrimaryKey(Integer id);

    @Select("Select * from details where detailId = #{detailId,jdbcType=INTEGER}")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
            @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
            @Result(column="detailId", property="detailid", jdbcType=JdbcType.INTEGER)
    })
    List<Details> selectAll(Integer detailsId);

    @UpdateProvider(type=DetailsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Details record);

    @Update({
        "update details",
        "set name = #{name,jdbcType=VARCHAR},",
          "spec = #{spec,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER},",
          "detailId = #{detailid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Details record);
}