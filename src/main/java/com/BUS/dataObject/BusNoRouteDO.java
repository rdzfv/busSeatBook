package com.BUS.dataObject;

public class BusNoRouteDO {
    private String busno;

    private String routeid;

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno == null ? null : busno.trim();
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }
}