package cn.jiaopuwang.jiaopu.po;

public class Applicant {
    private Integer aId;

    private String aUname;

    private String aPwd;

    private String aEmail;

    private String aPhonenumber;

    private String aThirdaccount;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUname() {
        return aUname;
    }

    public void setaUname(String aUname) {
        this.aUname = aUname == null ? null : aUname.trim();
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd == null ? null : aPwd.trim();
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail == null ? null : aEmail.trim();
    }

    public String getaPhonenumber() {
        return aPhonenumber;
    }

    public void setaPhonenumber(String aPhonenumber) {
        this.aPhonenumber = aPhonenumber == null ? null : aPhonenumber.trim();
    }

    public String getaThirdaccount() {
        return aThirdaccount;
    }

    public void setaThirdaccount(String aThirdaccount) {
        this.aThirdaccount = aThirdaccount == null ? null : aThirdaccount.trim();
    }
}