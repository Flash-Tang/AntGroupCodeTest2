package org.alipay.service;

import org.alipay.method.PaymentMethod;
import org.alipay.method.PaymentMethodFactory;
import org.alipay.model.PaymentRequest;

import java.util.ArrayList;
import java.util.List;

// 支付策略管理
public class PaymentStrategyManager {
    private List<PaymentMethod> paymentMethods;

    public PaymentStrategyManager() {
        paymentMethods = new ArrayList<>();
        // 从配置文件或其他地方获取支付方式类型
        String[] methodTypes = {"BALANCE", "BANKCARD", "HUABEI"};
        for (String type : methodTypes) {
            paymentMethods.add(PaymentMethodFactory.createPaymentMethod(type));
        }
    }

    public List<PaymentMethod> getAvailablePaymentMethods(PaymentRequest request) {
        List<PaymentMethod> availableMethods = new ArrayList<>();
        for (PaymentMethod method : paymentMethods) {
            if (method.isAvailable(request.getUserId(), request.getAmount())) {
                availableMethods.add(method);
            }
        }
        return availableMethods;
    }
}
