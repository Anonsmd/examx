package com.tew.dao;

import com.tew.pojo.Extest;
import com.tew.pojo.ExtestExample;
import java.util.List;

public interface ExtestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    int insert(Extest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    int insertSelective(Extest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    List<Extest> selectByExample(ExtestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    Extest selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    int updateByPrimaryKeySelective(Extest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.EX_TEST
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    int updateByPrimaryKey(Extest record);
}