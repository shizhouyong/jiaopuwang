package club.jiaopu.service;
import org.springframework.stereotype.Service;
import club.jiaopu.domain.Applicant;
/**
 * ���ܸ�Ҫ��ApplicantService�ӿ���
 * 
 * @author zhouluoyang
 * @date : 2016-3-14 ����6:34:23
 */
@Service
public interface ApplicantService {
	Applicant selectApplicantById(Integer a_Id);
}
