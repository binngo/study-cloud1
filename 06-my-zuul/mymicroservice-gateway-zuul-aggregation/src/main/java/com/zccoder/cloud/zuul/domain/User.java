package com.zccoder.cloud.zuul.domain;

import java.math.BigDecimal;

/**
 * @title 实体类
 * @describe 用户实体类
 * @author zc
 * @version 1.0 2017-12-12
 */
public class User {
	
	private Long id;
	private String username;
	private String name;
	private Integer age;
	private BigDecimal balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}