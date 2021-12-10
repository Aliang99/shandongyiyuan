package com.yiyuan.pojo;

public class Drug {
    private Integer dr_id;

    private String dr_url;

    private Double dr_inPrice;

    private Double dr_outPrice;

    private String dr_name;

    private String dr_type;

    private String dr_simDesc;

    private String dr_dateDesc;

    private String dr_EXP;

    private String dr_factory;

    private String dr_direction;

    private String dr_remark;

    private Integer dr_number;

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_url() {
        return dr_url;
    }

    public void setDr_url(String dr_url) {
        this.dr_url = dr_url == null ? null : dr_url.trim();
    }

    public Double getDr_inPrice() {
        return dr_inPrice;
    }

    public void setDr_inPrice(Double dr_inPrice) {
        this.dr_inPrice = dr_inPrice;
    }

    public Double getDr_outPrice() {
        return dr_outPrice;
    }

    public void setDr_outPrice(Double dr_outPrice) {
        this.dr_outPrice = dr_outPrice;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name == null ? null : dr_name.trim();
    }

    public String getDr_type() {
        return dr_type;
    }

    public void setDr_type(String dr_type) {
        this.dr_type = dr_type == null ? null : dr_type.trim();
    }

    public String getDr_simDesc() {
        return dr_simDesc;
    }

    public void setDr_simDesc(String dr_simDesc) {
        this.dr_simDesc = dr_simDesc == null ? null : dr_simDesc.trim();
    }

    public String getDr_dateDesc() {
        return dr_dateDesc;
    }

    public void setDr_dateDesc(String dr_dateDesc) {
        this.dr_dateDesc = dr_dateDesc == null ? null : dr_dateDesc.trim();
    }

    public String getDr_EXP() {
        return dr_EXP;
    }

    public void setDr_EXP(String dr_EXP) {
        this.dr_EXP = dr_EXP == null ? null : dr_EXP.trim();
    }

    public String getDr_factory() {
        return dr_factory;
    }

    public void setDr_factory(String dr_factory) {
        this.dr_factory = dr_factory == null ? null : dr_factory.trim();
    }

    public String getDr_direction() {
        return dr_direction;
    }

    public void setDr_direction(String dr_direction) {
        this.dr_direction = dr_direction == null ? null : dr_direction.trim();
    }

    public String getDr_remark() {
        return dr_remark;
    }

    public void setDr_remark(String dr_remark) {
        this.dr_remark = dr_remark == null ? null : dr_remark.trim();
    }

    public Integer getDr_number() {
        return dr_number;
    }

    public void setDr_number(Integer dr_number) {
        this.dr_number = dr_number;
    }
}