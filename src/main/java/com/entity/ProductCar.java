package com.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class ProductCar {
    @Id
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    private String id;
    @Column
    private String code;
    @Column
    private String conf;
    @Column
    private Double price;
    @Column
    private String Detail;
    @Column
    private String up;
    @Column
    private Integer count;
    @Column(name="CITY_ID")
    private String cityId;
    @Column(name="MODEL_ID")
    private String modelId;
    @Column
    private String type;
    @Column(name="DELIVER_TIME")
    private Date deliverTime;
    @Column
    private String position;
    @Column(name="POSITION_NUM")
    private String positionNum;
    @Column
    private String audit;
    @Column
    private Date createtime;
    @Column
    private Date updatetime;
    @Column(name="COMPANY_ID")
    private String companyId;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(String positionNum) {
        this.positionNum = positionNum;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }



}
