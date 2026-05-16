package com.svdev.dao;

import com.svdev.entity.Payment;
import jakarta.persistence.EntityManager;

public class PaymentRepository extends RepositoryBase<Long,Payment> {

    public PaymentRepository(EntityManager entityManager){
        super(Payment.class,entityManager);
    }
}
