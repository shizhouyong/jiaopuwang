package cn.jiaopuwang.jiaopu.po;

public class Label {
    private Integer lId;

    private String lProperty;

    private String lContent;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlProperty() {
        return lProperty;
    }

    public void setlProperty(String lProperty) {
        this.lProperty = lProperty == null ? null : lProperty.trim();
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent == null ? null : lContent.trim();
    }
}