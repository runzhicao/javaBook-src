package com.huifer.springboot.mysql.pojo.one;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * <p>Title : StudentTwo </p>
 * <p>Description : </p>
 *
 * @author huifer
 * @date 2019-06-28
 */
@Entity
@Data
@ToString
@Builder
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private Integer age;
}
