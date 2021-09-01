package com.itstyle.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//学生(组合表)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer studentId;
	private Integer classId;
	private String className;
	private String teacherName;
	private String name;
	private Integer age;
}
