package cn.jiaopuwang.jiaopu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jiaopuwang.jiaopu.po.Enterprise;
import cn.jiaopuwang.jiaopu.service.EnterpriseService;
/**  
 * 类说明   
 *  
 * @author 施周勇 
 * @date 2016年3月14日  新建  
 */

@Controller
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	private EnterpriseService enterpriseService;
	// 企业查询
	@RequestMapping("/queryEnterprises")
	public ModelAndView queryEnterprises(HttpServletRequest request) throws Exception {
		
		System.out.println(request.getParameter("id"));
		List<Enterprise> enterpriseList = enterpriseService.findEnterprises();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("enterpriseList", enterpriseList);
		modelAndView.setViewName("enterprise/enterpriseList");
		return modelAndView;

	}
}
