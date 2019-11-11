package com.tew.service.Impl;

import com.tew.dao.LogsMapper;
import com.tew.pojo.Logs;
import com.tew.service.LogsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("logsDAO")
public class LogsDAOImpl implements LogsDAO {

    @Autowired
    private LogsMapper logsMapper;
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public int deleteByPrimaryKey(Short id){
        return  logsMapper.deleteByPrimaryKey(id);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public int insert(Logs record){
        return logsMapper.insert(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public int insertSelective(Logs record){
        return logsMapper.insertSelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public Logs selectByPrimaryKey(Short id){
        return logsMapper.selectByPrimaryKey(id);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public int updateByPrimaryKeySelective(Logs record){
        return logsMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.LOGS
     *
     * @mbg.generated 2019-08-28 10:51:31
     */
    public int updateByPrimaryKey(Logs record){
        return logsMapper.updateByPrimaryKey(record);
    }
}