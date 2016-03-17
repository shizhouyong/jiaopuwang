package cn.jiaopuwang.jiaopu.service;

import java.util.List;

import cn.jiaopuwang.jiaopu.po.Enterprise;

/**  
 * 类说明   
 *  
 * @author 施周勇 
 * @date 2016年3月14日  新建  
 */
public interface EnterpriseService {
	
	//商品查询列表
	public List<Enterprise> findEnterprises() throws Exception;
}
