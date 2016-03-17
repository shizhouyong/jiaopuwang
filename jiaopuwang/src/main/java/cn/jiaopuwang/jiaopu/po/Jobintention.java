package cn.jiaopuwang.jiaopu.po;

import java.math.BigDecimal;

public class Jobintention {
    private Integer jiId;

    private Integer jiRid;

    private String jiPosition;

    private String jiPlace;

    private String jiNature;

    private BigDecimal jiMoney;

    public Integer getJiId() {
        return jiId;
    }

    public void setJiId(Integer jiId) {
        this.jiId = jiId;
    }

    public Integer getJiRid() {
        return jiRid;
    }

    public void setJiRid(Integer jiRid) {
        this.jiRid = jiRid;
    }

    public String getJiPosition() {
        return jiPosition;
    }

    public void setJiPosition(String jiPosition) {
        this.jiPosition = jiPosition == null ? null : jiPosition.trim();
    }

    public String getJiPlace() {
        return jiPlace;
    }

    public void setJiPlace(String jiPlace) {
        this.jiPlace = jiPlace == null ? null : jiPlace.trim();
    }

    public String getJiNature() {
        return jiNature;
    }

    public void setJiNature(String jiNature) {
        this.jiNature = jiNature == null ? null : jiNature.trim();
    }

    public BigDecimal getJiMoney() {
        return jiMoney;
    }

    public void setJiMoney(BigDecimal jiMoney) {
        this.jiMoney = jiMoney;
    }
}