package com.boss.demo.db.mapper;

import com.boss.demo.db.model.Form;
import com.boss.demo.db.sqlprovider.FormSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @Delete({
            "delete from form",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @Insert({
        "insert into form (id, department, ",
        "date, detailId, ",
        "user)",
        "values (#{id,jdbcType=INTEGER}, #{department,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=VARCHAR}, #{detailid,jdbcType=INTEGER}, ",
        "#{user,jdbcType=VARCHAR})"
    })
    int insert(Form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @InsertProvider(type= FormSqlProvider.class, method="insertSelective")
    int insertSelective(Form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @Select({
        "select",
        "id, department, date, detailId, user",
        "from form",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="detailId", property="detailid", jdbcType=JdbcType.INTEGER),
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR)
    })
    Form selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @UpdateProvider(type=FormSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    @Update({
        "update form",
        "set department = #{department,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=VARCHAR},",
          "detailId = #{detailid,jdbcType=INTEGER},",
          "user = #{user,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Form record);
}