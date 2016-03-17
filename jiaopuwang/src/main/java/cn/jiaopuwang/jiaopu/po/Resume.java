package cn.jiaopuwang.jiaopu.po;

public class Resume {
    private Integer rId;

    private Integer rAid;

    private String rPic;

    private String rName;

    private String rSex;

    private Integer rAge;

    private String rResidence;

    private String rEducation;

    private Integer rWorktime;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getrAid() {
        return rAid;
    }

    public void setrAid(Integer rAid) {
        this.rAid = rAid;
    }

    public String getrPic() {
        return rPic;
    }

    public void setrPic(String rPic) {
        this.rPic = rPic == null ? null : rPic.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrSex() {
        return rSex;
    }

    public void setrSex(String rSex) {
        this.rSex = rSex == null ? null : rSex.trim();
    }

    public Integer getrAge() {
        return rAge;
    }

    public void setrAge(Integer rAge) {
        this.rAge = rAge;
    }

    public String getrResidence() {
        return rResidence;
    }

    public void setrResidence(String rResidence) {
        this.rResidence = rResidence == null ? null : rResidence.trim();
    }

    public String getrEducation() {
        return rEducation;
    }

    public void setrEducation(String rEducation) {
        this.rEducation = rEducation == null ? null : rEducation.trim();
    }

    public Integer getrWorktime() {
        return rWorktime;
    }

    public void setrWorktime(Integer rWorktime) {
        this.rWorktime = rWorktime;
    }
}