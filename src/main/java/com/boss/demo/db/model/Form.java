package com.boss.demo.db.model;


import java.util.ArrayList;

public class Form {

    private Integer id;
    private String department;
    private String date;
    private Integer detailid;
    private String user;
    private ArrayList<Details> details;

    public ArrayList<Details> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Details> details) {
        this.details = details;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Integer getDetailid() {
        return detailid;
    }
    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}