package com.blog.dao;

import com.blog.po.UserBasicInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBasicInfoDao {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_basic_info
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    int insert(UserBasicInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_basic_info
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    int insertSelective(UserBasicInfo record);

}