package com.boss.demo.db.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table form
 *
 * @mbg.generated do_not_delete_during_merge Mon Jul 20 23:01:41 CST 2020
 */
public class Form {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.id
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.department
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.date
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    private String date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.detailId
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    private Integer detailid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.user
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    private String user;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.id
     *
     * @return the value of form.id
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.id
     *
     * @param id the value for form.id
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.department
     *
     * @return the value of form.department
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.department
     *
     * @param department the value for form.department
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.date
     *
     * @return the value of form.date
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.date
     *
     * @param date the value for form.date
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.detailId
     *
     * @return the value of form.detailId
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public Integer getDetailid() {
        return detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.detailId
     *
     * @param detailid the value for form.detailId
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.user
     *
     * @return the value of form.user
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.user
     *
     * @param user the value for form.user
     *
     * @mbg.generated Mon Jul 20 23:01:41 CST 2020
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}