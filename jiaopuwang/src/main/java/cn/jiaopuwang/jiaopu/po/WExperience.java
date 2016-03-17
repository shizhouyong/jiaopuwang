package cn.jiaopuwang.jiaopu.po;

import java.math.BigDecimal;
import java.util.Date;

public class WExperience {
    private Integer wId;

    private Integer wRid;

    private Date timestart;

    private Date timeend;

    private String wCompany;

    private String wPosition;

    private BigDecimal wMoney;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Integer getwRid() {
        return wRid;
    }

    public void setwRid(Integer wRid) {
        this.wRid = wRid;
    }

    public Date getTimestart() {
        return timestart;
    }

    public void setTimestart(Date timestart) {
        this.timestart = timestart;
    }

    public Date getTimeend() {
        return timeend;
    }

    public void setTimeend(Date timeend) {
        this.timeend = timeend;
    }

    public String getwCompany() {
        return wCompany;
    }

    public void setwCompany(String wCompany) {
        this.wCompany = wCompany == null ? null : wCompany.trim();
    }

    public String getwPosition() {
        return wPosition;
    }

    public void setwPosition(String wPosition) {
        this.wPosition = wPosition == null ? null : wPosition.trim();
    }

    public BigDecimal getwMoney() {
        return wMoney;
    }

    public void setwMoney(BigDecimal wMoney) {
        this.wMoney = wMoney;
    }
}