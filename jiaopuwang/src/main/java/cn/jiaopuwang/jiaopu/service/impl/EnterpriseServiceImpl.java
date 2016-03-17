package cn.jiaopuwang.jiaopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jiaopuwang.jiaopu.mapper.EnterpriseMapper;
import cn.jiaopuwang.jiaopu.po.Enterprise;
import cn.jiaopuwang.jiaopu.service.EnterpriseService;


/**  
 * 类说明   
 *  
 * @author 施周勇 
 * @date 2016年3月15日  新建  
 */

public class EnterpriseServiceImpl implements EnterpriseService {

	@Autowired
	private EnterpriseMapper enterpriseMapper;
	
	@Override
	public List<Enterprise> findEnterprises() throws Exception {

		return enterpriseMapper.findEnterprises();
	}



}
