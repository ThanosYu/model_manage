package com.siemens.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Thanos Yu
 * @date 2018/9/19
 */
@Entity
@Table(name="model")
public class Model {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    /**
     * init：0，training：1，ready：2，fail：3
     */
    private Integer status = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_datetime", length = 19)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime = new Date();

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    private List<ModelTimeslot> modelTimeslots;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    private List<ModelSensor> modelSensors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<ModelTimeslot> getModelTimeslots() {
        return modelTimeslots;
    }

    public void setModelTimeslots(List<ModelTimeslot> modelTimeslots) {
        this.modelTimeslots = modelTimeslots;
    }

    public List<ModelSensor> getModelSensors() {
        return modelSensors;
    }

    public void setModelSensors(List<ModelSensor> modelSensors) {
        this.modelSensors = modelSensors;
    }
}