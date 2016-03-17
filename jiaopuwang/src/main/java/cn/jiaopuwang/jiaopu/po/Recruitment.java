package cn.jiaopuwang.jiaopu.po;

import java.util.Date;

public class Recruitment {
    private Integer rmId;

    private Date rmStarttime;

    private Date rmEndtime;

    private String rmPlace;

    private Integer rmEnum;

    private Integer rmAnum;

    private String rmHost;

    private String organizationcode;

    private String rmContacts;

    private String rmPhone;

    private String rmRelease;

    private String rmReleasephone;

    private Integer rmStatement;

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public Date getRmStarttime() {
        return rmStarttime;
    }

    public void setRmStarttime(Date rmStarttime) {
        this.rmStarttime = rmStarttime;
    }

    public Date getRmEndtime() {
        return rmEndtime;
    }

    public void setRmEndtime(Date rmEndtime) {
        this.rmEndtime = rmEndtime;
    }

    public String getRmPlace() {
        return rmPlace;
    }

    public void setRmPlace(String rmPlace) {
        this.rmPlace = rmPlace == null ? null : rmPlace.trim();
    }

    public Integer getRmEnum() {
        return rmEnum;
    }

    public void setRmEnum(Integer rmEnum) {
        this.rmEnum = rmEnum;
    }

    public Integer getRmAnum() {
        return rmAnum;
    }

    public void setRmAnum(Integer rmAnum) {
        this.rmAnum = rmAnum;
    }

    public String getRmHost() {
        return rmHost;
    }

    public void setRmHost(String rmHost) {
        this.rmHost = rmHost == null ? null : rmHost.trim();
    }

    public String getOrganizationcode() {
        return organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode == null ? null : organizationcode.trim();
    }

    public String getRmContacts() {
        return rmContacts;
    }

    public void setRmContacts(String rmContacts) {
        this.rmContacts = rmContacts == null ? null : rmContacts.trim();
    }

    public String getRmPhone() {
        return rmPhone;
    }

    public void setRmPhone(String rmPhone) {
        this.rmPhone = rmPhone == null ? null : rmPhone.trim();
    }

    public String getRmRelease() {
        return rmRelease;
    }

    public void setRmRelease(String rmRelease) {
        this.rmRelease = rmRelease == null ? null : rmRelease.trim();
    }

    public String getRmReleasephone() {
        return rmReleasephone;
    }

    public void setRmReleasephone(String rmReleasephone) {
        this.rmReleasephone = rmReleasephone == null ? null : rmReleasephone.trim();
    }

    public Integer getRmStatement() {
        return rmStatement;
    }

    public void setRmStatement(Integer rmStatement) {
        this.rmStatement = rmStatement;
    }
}