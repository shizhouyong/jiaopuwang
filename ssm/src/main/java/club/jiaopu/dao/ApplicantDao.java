package club.jiaopu.dao;
import club.jiaopu.domain.Applicant;
/**
 * 功能概要：Applicant的DAO层
 * 
 * @author zhouluoyang
 * @date : 2016-3-14 下午6:27:30
 */
public interface ApplicantDao {
	/**
	 * @return Applicant
	 * @param userId 
	 * @author zhouluoyang
	 * @date : 2016-3-14 下午6:28:41
	 */
	public Applicant selectApplicantById(Integer a_Id);  
}
