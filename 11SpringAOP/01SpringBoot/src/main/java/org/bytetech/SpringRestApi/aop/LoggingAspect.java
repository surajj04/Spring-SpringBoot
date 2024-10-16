package org.bytetech.SpringRestApi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    // return-type class-name.method-name.()

    /*  @Before("execution(* org.bytetech.SpringRestApi.Service.JobPostService.*(..))")
    public void logMethodCall() {
        log.info("Method Called...");
    }   */

    /*  @Before("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getAllJobs(..))")
    public void getMethodCall() {
        log.info("Get Method Called...");
    }   */

    @Before("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getAllJobs(..))")
    public void getMethodCall(JoinPoint jp) {
        log.info(jp.getSignature().getName() + " Method Called...");
    }

    @After("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getJob(..))")
    public void logMethodCall(JoinPoint jp) {
        log.info(jp.getSignature().getName() + " Method Executed...");
    }

    @AfterThrowing("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getJob(..))")
    public void MethodCrash(JoinPoint jp) {
        log.info(jp.getSignature().getName() + " Method With Error Executed...");
    }





}
