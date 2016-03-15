package club.jiaopu.domain;
/**
 * Applicant”≥…‰¿‡
 * 
 * @author zhouluoyang
 * @date : 2016-3-14 œ¬ŒÁ4:57:33
 */
public class Applicant {
	 int a_Id ;
	 String a_Uname;
	 String a_Pwd;
	 String a_Email;
	 String a_PhoneNumber;
	 String a_ThirdAccount;
	public int getA_Id() {
		return a_Id;
	}
	public void setA_Id(int a_Id) {
		this.a_Id = a_Id;
	}
	public String getA_Uname() {
		return a_Uname;
	}
	public void setA_Uname(String a_Uname) {
		this.a_Uname = a_Uname;
	}
	public String getA_Pwd() {
		return a_Pwd;
	}
	public void setA_Pwd(String a_Pwd) {
		this.a_Pwd = a_Pwd;
	}
	public String getA_Email() {
		return a_Email;
	}
	public void setA_Email(String a_Email) {
		this.a_Email = a_Email;
	}
	public String getA_PhoneNumber() {
		return a_PhoneNumber;
	}
	public void setA_PhoneNumber(String a_PhoneNumber) {
		this.a_PhoneNumber = a_PhoneNumber;
	}
	public String getA_ThirdAccount() {
		return a_ThirdAccount;
	}
	public void setA_ThirdAccount(String a_ThirdAccount) {
		this.a_ThirdAccount = a_ThirdAccount;
	}
	@Override  
    public String toString() {  
        return "User [userId=" + a_Id + ", userName=" + a_Uname  
                + ", userPassword=" + a_Pwd 
                + "]";  
    }  
}