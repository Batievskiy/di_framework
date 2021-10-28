package com.useraccount;

import org.di.framework.Injector;

public class UserAccountApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Injector.startApplication(UserAccountApplication.class);
        try {
            Injector.getService(UserAccountClientComponent.class).displayUserAccount();
        } catch (NullPointerException e) {
            throw new RuntimeException("Null pointer exception");
        }
        long endime = System.currentTimeMillis();
    }
}