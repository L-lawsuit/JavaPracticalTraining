package com.hp;

public class dept {
    private Integer did;
    private String dname;
    private String location;

    public dept() {
    }

    public dept(Integer did, String dname, String location) {
        this.did = did;
        this.dname = dname;
        this.location = location;
    }

    @Override
    public String toString() {
        return "dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
