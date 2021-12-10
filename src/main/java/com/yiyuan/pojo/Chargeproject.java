package com.yiyuan.pojo;

public class Chargeproject {
    private Integer cp_id;

    private String cp_name;

    private Double cp_money;

    public Integer getCp_id() {
        return cp_id;
    }

    public void setCp_id(Integer cp_id) {
        this.cp_id = cp_id;
    }

    public String getCp_name() {
        return cp_name;
    }

    public void setCp_name(String cp_name) {
        this.cp_name = cp_name == null ? null : cp_name.trim();
    }

    public Double getCp_money() {
        return cp_money;
    }

    public void setCp_money(Double cp_money) {
        this.cp_money = cp_money;
    }
}