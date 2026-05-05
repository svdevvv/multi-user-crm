package com.svdev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment")
@Audited
public class Payment extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY )
    private Project project;

    private BigDecimal amount;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;
    private Status status;
}
