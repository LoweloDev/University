package com.Sandbox;

public class B extends A {
    public static int z = 1;
    B(){
       z++;
    }

    B(int z){
        this.z += z;
    }
    protected String method() {
        return "true";
    }
    void X(){
    }
}
