package com.Mediaplayer;

public abstract class Medium {
    String name;
    Medium(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    abstract int berechneSpeicherverbrauch();
}
