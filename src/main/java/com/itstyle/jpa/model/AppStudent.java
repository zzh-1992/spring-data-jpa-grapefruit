package com.itstyle.jpa.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//学生表
@Entity
@Table(name = "app_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	private Integer classId;
	private String name;
	private Integer age;

	public AppStudent(Integer classId, String name, Integer age) {
		super();
		this.classId = classId;
		this.name = name;
		this.age = age;
	}
}
