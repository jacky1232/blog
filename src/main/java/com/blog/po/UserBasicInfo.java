package com.blog.po;

import lombok.*;

import java.util.Date;

/**
 * @Author: yirui_dai
 * @Description:
 * @Date: Created in 15:27 2018/4/5 0005
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserBasicInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.id
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.user_id
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.login_name
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.login_password
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.nickname
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.sex
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private Byte sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.email
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.phone
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.create_time
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_basic_info.update_time
     *
     * @mbggenerated Thu Apr 05 17:55:57 CST 2018
     */
    private Date updateTime;


}