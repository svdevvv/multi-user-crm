package com.svdev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "task")
@Audited
public class Task extends BaseEntity{

    @NotAudited
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "task_name")
    private String taskName;

    @Enumerated
    private Status status;

    @Enumerated
    private Priority priority;

    @Column(name = "expected_time")
    private Integer expectedTime;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
