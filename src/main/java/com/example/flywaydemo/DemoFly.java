package com.example.flywaydemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@Entity
@Table(name = "DemoFly")
public class DemoFly {
    @Id
    private Long id;
    private String name;
}
