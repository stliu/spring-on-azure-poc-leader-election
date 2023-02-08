package com.azure.spring.integration.lock;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.integration.support.locks.ExpirableLockRegistry;
import org.springframework.integration.support.locks.RenewableLockRegistry;

import java.util.concurrent.locks.Lock;

public class AzureStorageBlobLockRegistry implements ExpirableLockRegistry, RenewableLockRegistry, InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void expireUnusedOlderThan(long age) {

    }

    @Override
    public Lock obtain(Object lockKey) {
        return null;
    }

    @Override
    public void renewLock(Object lockKey) {

    }
}
