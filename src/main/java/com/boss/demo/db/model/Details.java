package com.boss.demo.db.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table details
 *
 * @mbg.generated do_not_delete_during_merge Mon Jul 20 23:09:11 CST 2020
 */
public class Details {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column details.id
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column details.name
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column details.spec
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    private String spec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column details.num
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column details.detailId
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    private Integer detailid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column details.id
     *
     * @return the value of details.id
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column details.id
     *
     * @param id the value for details.id
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column details.name
     *
     * @return the value of details.name
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column details.name
     *
     * @param name the value for details.name
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column details.spec
     *
     * @return the value of details.spec
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public String getSpec() {
        return spec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column details.spec
     *
     * @param spec the value for details.spec
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column details.num
     *
     * @return the value of details.num
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column details.num
     *
     * @param num the value for details.num
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column details.detailId
     *
     * @return the value of details.detailId
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public Integer getDetailid() {
        return detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column details.detailId
     *
     * @param detailid the value for details.detailId
     *
     * @mbg.generated Mon Jul 20 23:09:11 CST 2020
     */
    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }
}