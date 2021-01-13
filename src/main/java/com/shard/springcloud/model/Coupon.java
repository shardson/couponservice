package com.shard.springcloud.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Coupon {
	
	@Id
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private BigDecimal discount;
	private String exp_date;
	
	public Long getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}

}
