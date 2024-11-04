package org.alipay;

import org.alipay.method.PaymentMethod;
import org.alipay.model.PaymentRequest;
import org.alipay.service.EmergencySwitch;
import org.alipay.service.PaymentStrategyManager;
import org.alipay.util.Logger;

import java.util.List;

// 主类
class PaymentSystem {
    private PaymentStrategyManager strategyManager;
    private EmergencySwitch emergencySwitch;

    public PaymentSystem() {
        strategyManager = new PaymentStrategyManager();
        emergencySwitch = new EmergencySwitch();
    }

    public void processPayment(PaymentRequest request) {
        if (emergencySwitch.isActive()) {
            Logger.log("Payment processing is currently disabled due to emergency.");
            return;
        }

        List<PaymentMethod> availableMethods = strategyManager.getAvailablePaymentMethods(request);
        if (availableMethods.isEmpty()) {
            Logger.log("No available payment methods for user " + request.getUserId());
            return;
        }

        // 假设选择第一个可用的支付方式进行支付
        PaymentMethod selectedMethod = availableMethods.get(0);
        selectedMethod.pay(request.getUserId(), request.getAmount());
    }

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        PaymentRequest request = new PaymentRequest(123456789L, 100.0);
        paymentSystem.processPayment(request);
    }
}
