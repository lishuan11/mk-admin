package com.lishuan.mk.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qianfeng.ms.service.MerchantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * creator：杜夫人
 * date: 2020/7/1
 */
@Service
public class MerchantServiceImpl implements MerchantService {

    // userServiceFeign
    // merchantServiceFeign
    // goodsServiceFeign

    @Override
    @Transactional
    @LcnTransaction  // 分布式事务的控制器
    public void addPre() {
        // 以上三个方法分别调用
//        userServiceFeign.add(user);
//        merchantServiceFeign.add(merchant);
//        goodsServiceFeign.addGood(merchant);
    }
}
