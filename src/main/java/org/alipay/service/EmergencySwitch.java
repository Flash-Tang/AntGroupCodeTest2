package org.alipay.service;

import org.alipay.util.Logger;

// 应急开关类
public class EmergencySwitch {
    private boolean isActive;

    public EmergencySwitch() {
        this.isActive = false;
    }

    public void activate() {
        isActive = true;
        Logger.log("Emergency switch activated!");
    }

    public void deactivate() {
        isActive = false;
        Logger.log("Emergency switch deactivated!");
    }

    public boolean isActive() {
        return isActive;
    }
}
