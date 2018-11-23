package com.jason.neo.dao.dto;

public class TmUser {
    private String idNo;

    private String name;

    private int jpaVersion;

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(int jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    @Override
    public String toString() {
        return "TmUser{" +
                "idNo='" + idNo + '\'' +
                ", name='" + name + '\'' +
                ", jpaVersion=" + jpaVersion +
                '}';
    }
}