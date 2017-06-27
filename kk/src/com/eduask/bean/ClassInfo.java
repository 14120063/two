package com.eduask.bean;

import java.util.Set;

public class ClassInfo {

	private Integer classId;
	private String className;
	private Set<StuInfo> stuSet;
	
	public ClassInfo() {
	}
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Set<StuInfo> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<StuInfo> stuSet) {
		this.stuSet = stuSet;
	}
}
