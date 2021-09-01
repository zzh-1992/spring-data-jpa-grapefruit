package com.itstyle.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户实体(此处注意引用的注解包为javax.persistence*下面的)
 * 创建者 科帮网
 * 创建时间	2017年7月25日
 *
 */
@Entity
@Table(name = "sys_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(nullable = false, name = "name")
	private String name;
	@Column(nullable = false, name = "age")
	private Integer age;
}
