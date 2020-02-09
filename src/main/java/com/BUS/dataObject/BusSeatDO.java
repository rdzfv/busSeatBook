package com.BUS.dataObject;

public class BusSeatDO {
    private Integer id;

    private String busno;

    private String seats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno == null ? null : busno.trim();
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats == null ? null : seats.trim();
    }
}