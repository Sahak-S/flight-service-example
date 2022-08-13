package com.javatechie.flightserviceexample.repository;

import com.javatechie.flightserviceexample.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,Long> {
}
