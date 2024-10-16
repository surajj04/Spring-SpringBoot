package org.bytetech.SpringRestApi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private final Logger log = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getJob(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = jp.proceed();
        long end = System.currentTimeMillis();

        log.info("Time taken: " + (end - start)+"ms");
        return obj;
    }

}
