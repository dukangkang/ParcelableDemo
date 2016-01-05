package com.docking.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by docking on 15/9/17.
 */
public class InfoEntity implements Parcelable {

    private int age;
    private long time;
    private boolean isRun;
    private String name;
    private List<String> info;

    private TestObj mTestObj;
    private TestB mTestB;

    public InfoEntity() {

    }

//    public static final Creator<InfoEntity> CREATOR = new Creator<InfoEntity>() {
//        @Override
//        public InfoEntity createFromParcel(Parcel in) {
//            InfoEntity infoEntity = new InfoEntity();
//            infoEntity.setAge(in.readInt());
//            infoEntity.setTime(in.readLong());
//            infoEntity.setName(in.readString());
//            infoEntity.setInfo(in.createStringArrayList());
//            infoEntity.setTestObj((TestObj) in.readSerializable());
//            return infoEntity;
//        }
//
//        @Override
//        public InfoEntity[] newArray(int size) {
//            return new InfoEntity[size];
//        }
//    };
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(age);
//        dest.writeLong(time);
//        dest.writeString(name);
//        dest.writeStringList(info);
//        dest.writeSerializable(mTestObj);
//        dest.writeParcelable(mTestB, flags);
//    }

    protected InfoEntity(Parcel in) {
        age = in.readInt();
        time = in.readLong();
        name = in.readString();
        info = in.createStringArrayList();
        mTestObj = (TestObj) in.readSerializable();
        mTestB = in.readParcelable(TestB.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(age);
        dest.writeLong(time);
        dest.writeString(name);
        dest.writeStringList(info);
        dest.writeSerializable(mTestObj);
        dest.writeParcelable(mTestB, flags);
    }

    public static final Creator<InfoEntity> CREATOR = new Creator<InfoEntity>() {
        @Override
        public InfoEntity createFromParcel(Parcel in) {
            return new InfoEntity(in);
        }

        @Override
        public InfoEntity[] newArray(int size) {
            return new InfoEntity[size];
        }
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setIsRun(boolean isRun) {
        this.isRun = isRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    public TestObj getTestObj() {
        return mTestObj;
    }

    public void setTestObj(TestObj testObj) {
        mTestObj = testObj;
    }

    public TestB getTestB() {
        return mTestB;
    }

    public void setTestB(TestB testB) {
        mTestB = testB;
    }

    @Override
    public String toString() {
        return "InfoEntity{" +
                "age=" + age +
                ", time=" + time +
                ", isRun=" + isRun +
                ", name='" + name + '\'' +
                ", info=" + info +
                ", mTestObj=" + mTestObj +
                ", mTestB=" + mTestB +
                '}';
    }
}
