package com.docking.parcelable;

import java.io.Serializable;

/**
 * Created by docking on 15/9/17.
 */
public class TestObj implements Serializable {
    String objStr;
    int objInt;

    public String getObjStr() {
        return objStr;
    }

    public void setObjStr(String objStr) {
        this.objStr = objStr;
    }

    public int getObjInt() {
        return objInt;
    }

    public void setObjInt(int objInt) {
        this.objInt = objInt;
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "objStr='" + objStr + '\'' +
                ", objInt=" + objInt +
                '}';
    }
}
