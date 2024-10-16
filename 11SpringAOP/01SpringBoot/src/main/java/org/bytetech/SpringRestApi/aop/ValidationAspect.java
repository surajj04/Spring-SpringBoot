package org.bytetech.SpringRestApi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private Logger log = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* org.bytetech.SpringRestApi.Service.JobPostService.getJob(..)) && args(id)")
    public Object vaildateAndUpdate(ProceedingJoinPoint jp, int id) throws Throwable {

        if (id < 0) {
            log.info("Post id is negative, updating it...");
            id = -id;
        }

        Object obj = jp.proceed(new Object[]{id});

        return obj;
    }

}
