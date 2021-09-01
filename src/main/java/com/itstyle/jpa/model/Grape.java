/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.itstyle.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * user
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-07-30 8:53 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "grape")
@Entity
public class Grape implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "uid")
    private String uid;

    @Column(name = "name")
    private String name;

    @Column(name = "role_id")
    private int roleId;

    //private String role;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "sign_up_time")
    private String signUpTime;
}
