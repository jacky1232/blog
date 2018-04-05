package com.blog.service.impl;

import com.blog.dao.UserBasicInfoDao;
import com.blog.po.UserBasicInfo;
import com.blog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: yirui_dai
 * @Description:
 * @Date: Created in 18:12 2018/4/5 0005
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserBasicInfoDao userBasicInfoDao;
    @Override
    public boolean saveUserBasicInfo(UserBasicInfo userBasicInfo) {
        return userBasicInfoDao.insert(userBasicInfo) == 1;
    }
}
