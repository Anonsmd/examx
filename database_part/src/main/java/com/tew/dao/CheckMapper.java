package com.tew.dao;

import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int insert(Check record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int insertSelective(Check record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    List<Check> selectByExample(CheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    Check selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int updateByPrimaryKeySelective(Check record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_CHECK
     *
     * @mbg.generated 2019-11-09 22:33:41
     */
    int updateByPrimaryKey(Check record);
}