package club.jiaopu.dao;
import club.jiaopu.domain.Applicant;
/**
 * ���ܸ�Ҫ��Applicant��DAO��
 * 
 * @author zhouluoyang
 * @date : 2016-3-14 ����6:27:30
 */
public interface ApplicantDao {
	/**
	 * @return Applicant
	 * @param userId 
	 * @author zhouluoyang
	 * @date : 2016-3-14 ����6:28:41
	 */
	public Applicant selectApplicantById(Integer a_Id);  
}
