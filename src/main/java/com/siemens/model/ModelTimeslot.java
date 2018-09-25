package com.siemens.model;

import javax.persistence.*;

/**
 * @author Thanos Yu
 * @date 2018/9/19
 */
@Entity
@Table(name="model_timeslot")
public class ModelTimeslot {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String startTime;

    private String endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}