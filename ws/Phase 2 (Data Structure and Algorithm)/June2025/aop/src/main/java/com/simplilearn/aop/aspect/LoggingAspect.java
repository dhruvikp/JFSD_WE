package com.simplilearn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* com.simplilearn.aop.service.*.*(..))")
	public void serviceMethods() {}
	
	@Before("serviceMethods()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before Method: "+ joinPoint.getSignature());
	}
	
	@After("serviceMethods()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After Method: "+ joinPoint.getSignature());
	}
	
	@AfterReturning(value="serviceMethods()", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("Method returned: "+ joinPoint.getSignature() + " Result: "+ result);
	}
	
	@AfterThrowing(value="serviceMethods()", throwing = "ex")
	public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {
		System.out.println("Exception in method: "+ joinPoint.getSignature() + " Exception: "+ ex);
	}
}
