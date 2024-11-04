package org.alipay.method.impl;

import org.alipay.method.PaymentMethod;
import org.alipay.util.Logger;

// 银行卡支付实现
public class BankCardPayment implements PaymentMethod {
    public boolean isAvailable(long userId, double amount) {
        // 检查用户是否有绑定的银行卡
        return hasBankCard(userId);
    }

    public void pay(long userId, double amount) {
        // 执行银行卡支付
        processBankCardPayment(userId, amount);
        Logger.log("Bank card payment of " + amount + " for user " + userId);
    }

    private boolean hasBankCard(long UserId) {
        // TODO
        return true;
    }

    private void processBankCardPayment(long userId, double amount) {
        // TODO
    }
}
