package com.blog.service;


import com.blog.AbstractSpringbootTest;
import com.blog.po.UserBasicInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yirui_dai
 * @Description:
 * @Date: Created in 19:00 2018/4/5 0005
 */
public class UserInfoServiceTest extends AbstractSpringbootTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void saveTest() {
        UserBasicInfo userBasicInfo = UserBasicInfo.builder().userId(21312312L)
                .loginName("33829@qq.com")
                .loginPassword("111111")
                .email("53329@qq.com")
                .nickname("小铭").phone("1734834344").sex(1).remark("测试用").build();
        userInfoService.saveUserBasicInfo(userBasicInfo);
    }


}
