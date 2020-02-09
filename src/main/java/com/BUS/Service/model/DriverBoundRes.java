package com.BUS.Service.model;

public class DriverBoundRes {
//    id, date, routeId, busNo, detail, driverId, diverLatitude, driverLongitude
    private String date;
    private String routeid;
    private String busno;
    private String driverid;
    private int id;
    private String detail;
    private float diverlatitude;
    private float driverLongitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getDiverlatitude() {
        return diverlatitude;
    }

    public void setDiverlatitude(float diverlatitude) {
        this.diverlatitude = diverlatitude;
    }

    public float getDriverLongitude() {
        return driverLongitude;
    }

    public void setDriverLongitude(float driverLongitude) {
        this.driverLongitude = driverLongitude;
    }

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

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }
}
