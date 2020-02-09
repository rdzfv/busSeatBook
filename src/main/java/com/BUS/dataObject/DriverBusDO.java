package com.BUS.dataObject;

public class DriverBusDO {
    private String driverno;

    private String busno;

    public String getDriverno() {
        return driverno;
    }

    public void setDriverno(String driverno) {
        this.driverno = driverno == null ? null : driverno.trim();
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno == null ? null : busno.trim();
    }
}