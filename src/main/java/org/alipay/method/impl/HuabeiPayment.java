package org.alipay.method.impl;

import org.alipay.method.PaymentMethod;
import org.alipay.util.Logger;

// 花呗支付实现
public class HuabeiPayment implements PaymentMethod {
    public boolean isAvailable(long userId, double amount) {
        // 检查用户的花呗额度
        return getHuabeiLimit(userId) >= amount;
    }

    public void pay(long userId, double amount) {
        // 执行花呗支付
        processHuabeiPayment(userId, amount);
        Logger.log("Huabei payment of " + amount + " for user " + userId);
    }

    private double getHuabeiLimit(long userId) {
        // TODO
        return 1000.0;
    }

    private void processHuabeiPayment(long userId, double amount) {
        // TODO
    }
}