package com.boss.demo.db.sqlprovider;

import com.boss.demo.db.model.Form;
import org.apache.ibatis.jdbc.SQL;

public class FormSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public String insertSelective(Form record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("form");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDepartment() != null) {
            sql.VALUES("department", "#{department,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            sql.VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (record.getDetailid() != null) {
            sql.VALUES("detailId", "#{detailid,jdbcType=INTEGER}");
        }
        
        if (record.getUser() != null) {
            sql.VALUES("user", "#{user,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public String updateByPrimaryKeySelective(Form record) {
        SQL sql = new SQL();
        sql.UPDATE("form");
        
        if (record.getDepartment() != null) {
            sql.SET("department = #{department,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            sql.SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getDetailid() != null) {
            sql.SET("detailId = #{detailid,jdbcType=INTEGER}");
        }
        
        if (record.getUser() != null) {
            sql.SET("user = #{user,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}