package cn.jiaopuwang.jiaopu.po;

import java.util.Date;

public class Enterprise {
    private Integer eId;

    private String eUname;

    private String ePwd;

    private String eUemail;

    private String enterprisename;

    private String eLogo;

    private String eNature;

    private Integer eScale;

    private String eEmail;

    private String ePhonenumber;

    private Date eTime;

    private String eCorporatename;

    private Integer eIntegration;

    private String eProfile;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteUname() {
        return eUname;
    }

    public void seteUname(String eUname) {
        this.eUname = eUname == null ? null : eUname.trim();
    }

    public String getePwd() {
        return ePwd;
    }

    public void setePwd(String ePwd) {
        this.ePwd = ePwd == null ? null : ePwd.trim();
    }

    public String geteUemail() {
        return eUemail;
    }

    public void seteUemail(String eUemail) {
        this.eUemail = eUemail == null ? null : eUemail.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }

    public String geteLogo() {
        return eLogo;
    }

    public void seteLogo(String eLogo) {
        this.eLogo = eLogo == null ? null : eLogo.trim();
    }

    public String geteNature() {
        return eNature;
    }

    public void seteNature(String eNature) {
        this.eNature = eNature == null ? null : eNature.trim();
    }

    public Integer geteScale() {
        return eScale;
    }

    public void seteScale(Integer eScale) {
        this.eScale = eScale;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public String getePhonenumber() {
        return ePhonenumber;
    }

    public void setePhonenumber(String ePhonenumber) {
        this.ePhonenumber = ePhonenumber == null ? null : ePhonenumber.trim();
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public String geteCorporatename() {
        return eCorporatename;
    }

    public void seteCorporatename(String eCorporatename) {
        this.eCorporatename = eCorporatename == null ? null : eCorporatename.trim();
    }

    public Integer geteIntegration() {
        return eIntegration;
    }

    public void seteIntegration(Integer eIntegration) {
        this.eIntegration = eIntegration;
    }

    public String geteProfile() {
        return eProfile;
    }

    public void seteProfile(String eProfile) {
        this.eProfile = eProfile == null ? null : eProfile.trim();
    }
}