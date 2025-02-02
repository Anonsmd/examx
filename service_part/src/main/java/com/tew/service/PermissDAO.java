package com.tew.service;

import com.tew.pojo.Permiss;
import com.tew.pojo.PermissExample;

import java.util.List;

public interface PermissDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    int deleteByPrimaryKey(Short powerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    int insert(Permiss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    int insertSelective(Permiss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    List<Permiss> selectByExample(PermissExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    Permiss selectByPrimaryKey(Short powerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    int updateByPrimaryKeySelective(Permiss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.ACC_PERMISS
     *
     * @mbg.generated 2019-11-02 18:57:03
     */
    int updateByPrimaryKey(Permiss record);
    List<Permiss> selectById(String id);
}