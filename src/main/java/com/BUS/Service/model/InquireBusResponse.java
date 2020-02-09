package com.BUS.Service.model;

import com.BUS.dataObject.BusNoRouteDO;

import java.util.ArrayList;

public class InquireBusResponse {
    private String startTime;
    private String startPlace;
    private String finalPlace;
    private ArrayList<String> BusNo;
    private String routeNo;
    private String place1;
    private String place2;
    private String place3;
    private String place4;
    private String place5;
    private String place6;
    private String place7;
    private String place8;
    private String place9;
    private String place10;
    private String place11;
    private String place12;
    private String place13;

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public void setFinalPlace(String finalPlace) {
        this.finalPlace = finalPlace;
    }

    public void setBusNo(ArrayList<String> busNo) {
        BusNo = busNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getPlace1() {
        return place1;
    }

    public void setPlace1(String place1) {
        this.place1 = place1;
    }

    public String getPlace2() {
        return place2;
    }

    public void setPlace2(String place2) {
        this.place2 = place2;
    }

    public String getPlace3() {
        return place3;
    }

    public void setPlace3(String place3) {
        this.place3 = place3;
    }

    public String getPlace4() {
        return place4;
    }

    public void setPlace4(String place4) {
        this.place4 = place4;
    }

    public String getPlace5() {
        return place5;
    }

    public void setPlace5(String place5) {
        this.place5 = place5;
    }

    public String getPlace6() {
        return place6;
    }

    public void setPlace6(String place6) {
        this.place6 = place6;
    }

    public String getPlace7() {
        return place7;
    }

    public void setPlace7(String place7) {
        this.place7 = place7;
    }

    public String getPlace8() {
        return place8;
    }

    public void setPlace8(String place8) {
        this.place8 = place8;
    }

    public String getPlace9() {
        return place9;
    }

    public void setPlace9(String place9) {
        this.place9 = place9;
    }

    public String getPlace10() {
        return place10;
    }

    public void setPlace10(String place10) {
        this.place10 = place10;
    }

    public String getPlace11() {
        return place11;
    }

    public void setPlace11(String place11) {
        this.place11 = place11;
    }

    public String getPlace12() {
        return place12;
    }

    public void setPlace12(String place12) {
        this.place12 = place12;
    }

    public String getPlace13() {
        return place13;
    }

    public void setPlace13(String place13) {
        this.place13 = place13;
    }

    public String getrouteno() {
        return routeNo;
    }
    public void setrouteno(String routeNo) {
        this.routeNo = routeNo;
    }
    public String getStartTime() {
        return startTime;
    }

    public void setstarttime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setstartplace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getFinalPlace() {
        return finalPlace;
    }

    public void setfinalplace(String finalPlace) {
        this.finalPlace = finalPlace;
    }

    public ArrayList<String> getBusNo() {
        return BusNo;
    }

    public void setbusno(String busNo) {
        System.out.println("调用了set方法");
        if(BusNo == null){
            BusNo = new ArrayList<String>();
        }
        System.out.println(BusNo);
        BusNo.add(busNo);
    }
}
