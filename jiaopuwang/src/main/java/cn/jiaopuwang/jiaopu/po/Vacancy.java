package cn.jiaopuwang.jiaopu.po;

public class Vacancy {
    private Integer vId;

    private String vEid;

    private String vName;

    private Integer vType;

    private String department;

    private String vProperty;

    private String vMaxmoney;

    private String vMinmoney;

    private String vArea;

    private Integer vNumber;

    private String vPublishname;

    private String vPublishphone;

    private String vReceiveemail;

    private String vProfile;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvEid() {
        return vEid;
    }

    public void setvEid(String vEid) {
        this.vEid = vEid == null ? null : vEid.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public Integer getvType() {
        return vType;
    }

    public void setvType(Integer vType) {
        this.vType = vType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getvProperty() {
        return vProperty;
    }

    public void setvProperty(String vProperty) {
        this.vProperty = vProperty == null ? null : vProperty.trim();
    }

    public String getvMaxmoney() {
        return vMaxmoney;
    }

    public void setvMaxmoney(String vMaxmoney) {
        this.vMaxmoney = vMaxmoney == null ? null : vMaxmoney.trim();
    }

    public String getvMinmoney() {
        return vMinmoney;
    }

    public void setvMinmoney(String vMinmoney) {
        this.vMinmoney = vMinmoney == null ? null : vMinmoney.trim();
    }

    public String getvArea() {
        return vArea;
    }

    public void setvArea(String vArea) {
        this.vArea = vArea == null ? null : vArea.trim();
    }

    public Integer getvNumber() {
        return vNumber;
    }

    public void setvNumber(Integer vNumber) {
        this.vNumber = vNumber;
    }

    public String getvPublishname() {
        return vPublishname;
    }

    public void setvPublishname(String vPublishname) {
        this.vPublishname = vPublishname == null ? null : vPublishname.trim();
    }

    public String getvPublishphone() {
        return vPublishphone;
    }

    public void setvPublishphone(String vPublishphone) {
        this.vPublishphone = vPublishphone == null ? null : vPublishphone.trim();
    }

    public String getvReceiveemail() {
        return vReceiveemail;
    }

    public void setvReceiveemail(String vReceiveemail) {
        this.vReceiveemail = vReceiveemail == null ? null : vReceiveemail.trim();
    }

    public String getvProfile() {
        return vProfile;
    }

    public void setvProfile(String vProfile) {
        this.vProfile = vProfile == null ? null : vProfile.trim();
    }
}