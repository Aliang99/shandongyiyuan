package com.yiyuan.pojo;

public class Behospital {
    private Integer beH_id;

    private Integer beH_nursepeople;

    private Integer beH_patBed;

    private Double beh_antecedent;

    private String beH_illness;

    private Integer beH_closePrice;

    private Integer beH_state;

    public Integer getBeH_id() {
        return beH_id;
    }

    public void setBeH_id(Integer beH_id) {
        this.beH_id = beH_id;
    }

    public Integer getBeH_nursepeople() {
        return beH_nursepeople;
    }

    public void setBeH_nursepeople(Integer beH_nursepeople) {
        this.beH_nursepeople = beH_nursepeople;
    }

    public Integer getBeH_patBed() {
        return beH_patBed;
    }

    public void setBeH_patBed(Integer beH_patBed) {
        this.beH_patBed = beH_patBed;
    }

    public Double getBeh_antecedent() {
        return beh_antecedent;
    }

    public void setBeh_antecedent(Double beh_antecedent) {
        this.beh_antecedent = beh_antecedent;
    }

    public String getBeH_illness() {
        return beH_illness;
    }

    public void setBeH_illness(String beH_illness) {
        this.beH_illness = beH_illness == null ? null : beH_illness.trim();
    }

    public Integer getBeH_closePrice() {
        return beH_closePrice;
    }

    public void setBeH_closePrice(Integer beH_closePrice) {
        this.beH_closePrice = beH_closePrice;
    }

    public Integer getBeH_state() {
        return beH_state;
    }

    public void setBeH_state(Integer beH_state) {
        this.beH_state = beH_state;
    }
}