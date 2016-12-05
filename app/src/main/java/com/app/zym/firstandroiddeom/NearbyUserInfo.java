package com.app.zym.firstandroiddeom;

/**
 * Created by Administrator on 2016/12/5.
 */

public class NearbyUserInfo {
    public int head;
    public String name;
    public String adr;
    public String content;
    public String distance;
    public String age;

    @Override
    public String toString() {
        return "NearbyUserInfo{" +
                "head=" + head +
                ", name='" + name + '\'' +
                ", adr='" + adr + '\'' +
                ", content='" + content + '\'' +
                ", distance='" + distance + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
