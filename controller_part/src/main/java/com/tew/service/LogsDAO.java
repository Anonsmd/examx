package com.tew.service;

import com.tew.pojo.Logs;

public interface LogsDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    int insert(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    int insertSelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    Logs selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    int updateByPrimaryKeySelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    int updateByPrimaryKey(Logs record);
}