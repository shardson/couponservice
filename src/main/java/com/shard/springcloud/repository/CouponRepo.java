package com.shard.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
