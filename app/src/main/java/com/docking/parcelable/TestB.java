package com.docking.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by docking on 15/9/17.
 */
public class TestB implements Parcelable {

    private int num;
    boolean isPlay = false;
    private String address;

    public TestB() {

    }

    protected TestB(Parcel in) {
    }

    public static final Creator<TestB> CREATOR = new Creator<TestB>() {
        @Override
        public TestB createFromParcel(Parcel in) {
            TestB mTestB = new TestB();
            mTestB.setNum(in.readInt());
            mTestB.setAddress(in.readString());
            return mTestB;
        }

        @Override
        public TestB[] newArray(int size) {
            return new TestB[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(num);
        dest.writeString(address);
//        dest.writeByte((isPlay ? 1:0));
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setIsPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }

    @Override
    public String toString() {
        return "TestB{" +
                "num=" + num +
                ", address='" + address + '\'' +
                '}';
    }
}
