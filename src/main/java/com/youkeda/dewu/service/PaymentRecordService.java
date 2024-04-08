package com.youkeda.dewu.service;

import com.youkeda.dewu.model.PaymentRecord;
import com.youkeda.dewu.param.PaymentRecordQueryParam;

import java.util.List;

public interface PaymentRecordService {
    PaymentRecord save(PaymentRecord paymentRecord);
    List<PaymentRecord> query(PaymentRecordQueryParam queryParam);

    PaymentRecord updateStatus(PaymentRecord paymentRecord);
}
