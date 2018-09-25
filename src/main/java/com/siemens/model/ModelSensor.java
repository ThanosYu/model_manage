package com.siemens.model;

import javax.persistence.*;

/**
 * @author Thanos Yu
 * @date 2018/9/20
 */
@Entity
@Table(name="model_sensor")
public class ModelSensor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String sensor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
}