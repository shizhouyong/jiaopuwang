package cn.jiaopuwang.jiaopu.po;

public class PRecruitment {
    private Integer pAid;

    private Integer pRmid;

    private String pName;

    private String pSex;

    private String pNumber;

    public Integer getpAid() {
        return pAid;
    }

    public void setpAid(Integer pAid) {
        this.pAid = pAid;
    }

    public Integer getpRmid() {
        return pRmid;
    }

    public void setpRmid(Integer pRmid) {
        this.pRmid = pRmid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber == null ? null : pNumber.trim();
    }
}