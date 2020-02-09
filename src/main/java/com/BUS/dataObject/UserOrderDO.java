package com.BUS.dataObject;

public class UserOrderDO extends UserOrderDOKey {
    private Integer status;

    private String busno;

    private String seat;

    private String startplace;

    private String targetplace;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno == null ? null : busno.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace == null ? null : startplace.trim();
    }

    public String getTargetplace() {
        return targetplace;
    }

    public void setTargetplace(String targetplace) {
        this.targetplace = targetplace == null ? null : targetplace.trim();
    }
}