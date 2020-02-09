package com.BUS.dataObject;

import java.util.Date;

public class SeatsbookdetailDO {
    private Integer id;

    private Date date;

    private String routeid;

    private String busno;

    private String detail;

    private String driverid;

    private Float diverlatitude;

    private Float driverlongitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno == null ? null : busno.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid == null ? null : driverid.trim();
    }

    public Float getDiverlatitude() {
        return diverlatitude;
    }

    public void setDiverlatitude(Float diverlatitude) {
        this.diverlatitude = diverlatitude;
    }

    public Float getDriverlongitude() {
        return driverlongitude;
    }

    public void setDriverlongitude(Float driverlongitude) {
        this.driverlongitude = driverlongitude;
    }
}