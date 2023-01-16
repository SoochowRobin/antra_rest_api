package com.antra.restapi001.bean;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Integer id;
    @Column(name = "stu_name")
    private String name;
    @Column(name = "stu_grade")
    private String grade;
}

