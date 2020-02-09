package com.BUS.Service.model;

import java.util.Date;

public class SeatBookModel {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String date;
    private String routeid;
    private String busno;
    private String detail;
    private String userid;
    private String myseatstring;
    private String driverid;
    private String diverlatitude;
    private String startplace;
    private String targetplace;

    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace;
    }

    public String getTargetplace() {
        return targetplace;
    }

    public void setTargetplace(String targetplace) {
        this.targetplace = targetplace;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public String getDiverlatitude() {
        return diverlatitude;
    }

    public void setDiverlatitude(String diverlatitude) {
        this.diverlatitude = diverlatitude;
    }

    public String getDriverlongitude() {
        return driverlongitude;
    }

    public void setDriverlongitude(String driverlongitude) {
        this.driverlongitude = driverlongitude;
    }

    private String driverlongitude;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid;
    }

    public String getBusid() {
        return busno;
    }

    public void setBusid(String busid) {
        this.busno = busid;
    }

    public String getSeatstring() {
        return detail;
    }

    public void setSeatstring(String seatstring) {
        this.detail = seatstring;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMyseatstring() {
        return myseatstring;
    }

    public void setMyseatstring(String myseatstring) {
        this.myseatstring = myseatstring;
    }
}
