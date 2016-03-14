package club.jiaopu.service;
import org.springframework.stereotype.Service;
import club.jiaopu.domain.Applicant;
/**
 * 功能概要：ApplicantService接口类
 * 
 * @author zhouluoyang
 * @date : 2016-3-14 下午6:34:23
 */
@Service
public interface ApplicantService {
	Applicant selectApplicantById(Integer a_Id);
}
