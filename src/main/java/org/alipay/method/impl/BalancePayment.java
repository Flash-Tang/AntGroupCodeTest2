package org.alipay.method.impl;

import org.alipay.method.PaymentMethod;
import org.alipay.util.Logger;

// 余额支付实现
public class BalancePayment implements PaymentMethod {
    public boolean isAvailable(long userId, double amount) {
        // 检查用户余额是否可用
        return getUserBalance(userId) >= amount;
    }

    public void pay(long userId, double amount) {
        // 执行余额支付
        deductUserBalance(userId, amount);
        Logger.log("Balance payment of " + amount + " for user " + userId);
    }

    private double getUserBalance(long userId) {
        // TODO
        return 1000.0;
    }

    private void deductUserBalance(long userId, double amount) {
        // TODO
    }
}
