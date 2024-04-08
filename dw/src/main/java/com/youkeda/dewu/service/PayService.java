package com.youkeda.dewu.service;

import com.youkeda.dewu.model.Result;
import com.youkeda.dewu.param.PaymentParam;

import java.util.Map;

public interface PayService {
    Result payOrder(PaymentParam paymentParam);

    Result alipayCallBack(Map<String, String> mapParam);
}
