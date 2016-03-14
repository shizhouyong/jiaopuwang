package club.jiaopu.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import club.jiaopu.baseTest.SpringTestCase;
import club.jiaopu.domain.Applicant;

public class ApplicantServiceTest extends SpringTestCase{
	@Autowired  
    private ApplicantService applicantService;  
    Logger logger = Logger.getLogger(ApplicantServiceTest.class);  
      
    @Test  
    public void selectApplicantByIdTest(){  
    	Applicant user = applicantService.selectApplicantById(2013333001);  
        logger.debug("²éÕÒ½á¹û" + user);  
    }  
}
