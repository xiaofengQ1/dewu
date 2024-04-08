package com.youkeda.dewu.param;

import com.youkeda.dewu.model.PayType;
import com.youkeda.dewu.model.PaymentStatus;

public class PaymentRecordQueryParam {
    private String userId;

    private String orderNumber;

    private PayType payType;

    private PaymentStatus paymentStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
