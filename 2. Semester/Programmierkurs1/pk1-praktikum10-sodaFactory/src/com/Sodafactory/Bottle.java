package com.Sodafactory;

public class Bottle {
    private Lable lable;

    void printLable() {
        System.out.println(getLable());
    }

    Lable getLable() {
        return lable;
    }

    void setLable(Lable lable) {
        this.lable = lable;
    }
}
