package com.tew.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table SYS.INV_THEME
 *
 * @mbg.generated do_not_delete_during_merge 2019-08-31 09:33:07
 */
public class Theme implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.THEMEID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Short themeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.THEME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String theme;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.CREATE_AT
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.USERFUL_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String userfulTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.ENABLE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Short enable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.SCHOOLIN
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String schoolin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.SCHOOLINID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String schoolinid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.REQUEST
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String request;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.INV_THEME.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS.INV_THEME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.THEMEID
     *
     * @return the value of SYS.INV_THEME.THEMEID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Short getThemeid() {
        return themeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.THEMEID
     *
     * @param themeid the value for SYS.INV_THEME.THEMEID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setThemeid(Short themeid) {
        this.themeid = themeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.THEME
     *
     * @return the value of SYS.INV_THEME.THEME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.THEME
     *
     * @param theme the value for SYS.INV_THEME.THEME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.CREATE_AT
     *
     * @return the value of SYS.INV_THEME.CREATE_AT
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.CREATE_AT
     *
     * @param createAt the value for SYS.INV_THEME.CREATE_AT
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.USERFUL_TIME
     *
     * @return the value of SYS.INV_THEME.USERFUL_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getUserfulTime() {
        return userfulTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.USERFUL_TIME
     *
     * @param userfulTime the value for SYS.INV_THEME.USERFUL_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setUserfulTime(String userfulTime) {
        this.userfulTime = userfulTime == null ? null : userfulTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.ENABLE
     *
     * @return the value of SYS.INV_THEME.ENABLE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Short getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.ENABLE
     *
     * @param enable the value for SYS.INV_THEME.ENABLE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setEnable(Short enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.DESCRIPTION
     *
     * @return the value of SYS.INV_THEME.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.DESCRIPTION
     *
     * @param description the value for SYS.INV_THEME.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.SCHOOLIN
     *
     * @return the value of SYS.INV_THEME.SCHOOLIN
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getSchoolin() {
        return schoolin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.SCHOOLIN
     *
     * @param schoolin the value for SYS.INV_THEME.SCHOOLIN
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setSchoolin(String schoolin) {
        this.schoolin = schoolin == null ? null : schoolin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.SCHOOLINID
     *
     * @return the value of SYS.INV_THEME.SCHOOLINID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getSchoolinid() {
        return schoolinid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.SCHOOLINID
     *
     * @param schoolinid the value for SYS.INV_THEME.SCHOOLINID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setSchoolinid(String schoolinid) {
        this.schoolinid = schoolinid == null ? null : schoolinid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.REQUEST
     *
     * @return the value of SYS.INV_THEME.REQUEST
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getRequest() {
        return request;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.REQUEST
     *
     * @param request the value for SYS.INV_THEME.REQUEST
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.INV_THEME.END_TIME
     *
     * @return the value of SYS.INV_THEME.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.INV_THEME.END_TIME
     *
     * @param endTime the value for SYS.INV_THEME.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.INV_THEME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", themeid=").append(themeid);
        sb.append(", theme=").append(theme);
        sb.append(", createAt=").append(createAt);
        sb.append(", userfulTime=").append(userfulTime);
        sb.append(", enable=").append(enable);
        sb.append(", description=").append(description);
        sb.append(", schoolin=").append(schoolin);
        sb.append(", schoolinid=").append(schoolinid);
        sb.append(", request=").append(request);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}