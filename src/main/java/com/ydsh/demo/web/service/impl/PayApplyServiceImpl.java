/**
 * @filename:PayApplyServiceImpl 2019-06-11 10:50:21
 * @project ydsh-saas-service-demo  V1.0
 * Copyright(c) 2018 姚仲杰 Co. Ltd. 
 * All right reserved. 
 */
package com.ydsh.demo.web.service.impl;

import com.ydsh.demo.web.entity.PayApply;
import com.ydsh.demo.web.dao.PayApplyDao;
import com.ydsh.demo.web.service.PayApplyService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**   
 * <p>自定义serviceImpl写在这里</p>
 * 
 * <p>说明： 表注释服务实现层</P>
 * @version: V1.0
 * @author: 姚仲杰
 * 
 */
@Service
public class PayApplyServiceImpl  extends ServiceImpl<PayApplyDao, PayApply> implements PayApplyService  {
	
}