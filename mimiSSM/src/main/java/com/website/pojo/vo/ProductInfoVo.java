package com.website.pojo.vo;

import com.website.pojo.ProductInfo;

public class ProductInfoVo {
    private String pname;
    private String typeid;
    private Double iprice;
    private Double hprice;
    private  Integer page =1;

    public ProductInfoVo(){

    }

    public ProductInfoVo(String pname, String typeid, Double iprice, Double hprice, Integer page) {
        this.pname = pname;
        this.typeid = typeid;
        this.iprice = iprice;
        this.hprice = hprice;
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public String getTypeid() {
        return typeid;
    }

    public Double getIprice() {
        return iprice;
    }

    public Double getHprice() {
        return hprice;
    }

    public Integer getPage() {
        return page;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public void setIprice(Double iprice) {
        this.iprice = iprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ProductInfoVo{" +
                "pname='" + pname + '\'' +
                ", typeid='" + typeid + '\'' +
                ", iprice=" + iprice +
                ", hprice=" + hprice +
                ", page=" + page +
                '}';
    }
}
