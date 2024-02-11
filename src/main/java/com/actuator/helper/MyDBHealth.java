package com.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealth implements HealthIndicator {

    public static final String DB_SERVICE="Database Service";

    public boolean isHealthGood() {
        return true;
    }

    @Override
    public Health health()
    {
        if(isHealthGood())
        {
            return Health.up().withDetail(DB_SERVICE, "Database is Running").build();
        }
        return Health.down().withDetail(DB_SERVICE, "Database is down").build();
    }
}
