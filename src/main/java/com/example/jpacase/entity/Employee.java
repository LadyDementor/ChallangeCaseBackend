package com.example.jpacase.entity;
import jakarta.persistence.*;
import lombok.Data ;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="employee",schema="public")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="salary")
    private double salary;

    @Column(name="is_married")
    private boolean isMarried;

    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employerId;



    @Enumerated(EnumType.STRING)
    private Gender gender;



}
