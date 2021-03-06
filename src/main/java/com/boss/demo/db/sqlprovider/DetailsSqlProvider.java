package com.boss.demo.db.sqlprovider;

import com.boss.demo.db.model.Details;
import org.apache.ibatis.jdbc.SQL;


public class DetailsSqlProvider {
    public String insertSelective(Details record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("details");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSpec() != null) {
            sql.VALUES("spec", "#{spec,jdbcType=VARCHAR}");
        }
        
        if (record.getNum() != null) {
            sql.VALUES("num", "#{num,jdbcType=INTEGER}");
        }
        
        if (record.getDetailid() != null) {
            sql.VALUES("detailId", "#{detailid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
    public String updateByPrimaryKeySelective(Details record) {
        SQL sql = new SQL();
        sql.UPDATE("details");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSpec() != null) {
            sql.SET("spec = #{spec,jdbcType=VARCHAR}");
        }
        
        if (record.getNum() != null) {
            sql.SET("num = #{num,jdbcType=INTEGER}");
        }
        
        if (record.getDetailid() != null) {
            sql.SET("detailId = #{detailid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}