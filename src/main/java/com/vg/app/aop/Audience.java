package com.vg.app.aop;

import org.aspectj.lang.annotation.*;

@Aspect     // indicates that this class isn't just any POJO - it's an aspect
public class Audience {

    @Pointcut("execution(** com.vg.app.logic.interfaces.Performance.perform(..))")   // define named pointcut
    public void performance() {}

    @Before("execution(** com.vg.app.logic.interfaces.Performance.perform(..))")     // obviously, looks not very good
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")   // better
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @After("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterReturning("performance()")
    public void leaveSeats() {
        System.out.println("Leaving seats");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
