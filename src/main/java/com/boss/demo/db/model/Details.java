package com.boss.demo.db.model;


public class Details {

    private Integer id;
    private String name;
    private String spec;
    private Integer num;
    private Integer detailid;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    public Integer getDetailid() {
        return detailid;
    }
    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }
}