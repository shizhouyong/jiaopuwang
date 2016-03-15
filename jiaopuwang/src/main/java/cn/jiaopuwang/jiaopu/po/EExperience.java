package cn.jiaopuwang.jiaopu.po;

import java.util.Date;

public class EExperience {
    private Integer eId;

    private Integer eRid;

    private Date eStarttime;

    private Date eEndtime;

    private String eSchoole;

    private String eMajor;

    private String ePosition;

    private String eAwards;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer geteRid() {
        return eRid;
    }

    public void seteRid(Integer eRid) {
        this.eRid = eRid;
    }

    public Date geteStarttime() {
        return eStarttime;
    }

    public void seteStarttime(Date eStarttime) {
        this.eStarttime = eStarttime;
    }

    public Date geteEndtime() {
        return eEndtime;
    }

    public void seteEndtime(Date eEndtime) {
        this.eEndtime = eEndtime;
    }

    public String geteSchoole() {
        return eSchoole;
    }

    public void seteSchoole(String eSchoole) {
        this.eSchoole = eSchoole == null ? null : eSchoole.trim();
    }

    public String geteMajor() {
        return eMajor;
    }

    public void seteMajor(String eMajor) {
        this.eMajor = eMajor == null ? null : eMajor.trim();
    }

    public String getePosition() {
        return ePosition;
    }

    public void setePosition(String ePosition) {
        this.ePosition = ePosition == null ? null : ePosition.trim();
    }

    public String geteAwards() {
        return eAwards;
    }

    public void seteAwards(String eAwards) {
        this.eAwards = eAwards == null ? null : eAwards.trim();
    }
}