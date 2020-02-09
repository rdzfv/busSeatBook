package com.BUS.Service.model;

public class MySeatBookModel {
    private String userid;
    private String routeid;
    private int status;
    private String date;
    private String busno;
    private String seat;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getSeat() {
        return seat;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
