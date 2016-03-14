package club.jiaopu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.jiaopu.dao.ApplicantDao;
import club.jiaopu.domain.Applicant;
@Service
public class ApplicantServiceImpl implements ApplicantService{
	@Autowired  
    private ApplicantDao applicantDao;
	public Applicant selectApplicantById(Integer a_Id) {  
        return applicantDao.selectApplicantById(a_Id);          
    } 
}
