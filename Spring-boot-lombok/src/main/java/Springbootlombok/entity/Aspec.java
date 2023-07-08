package Springbootlombok.entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspec {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(Aspec.class);
	
	@Before("execution (* com.shiva.student.*.*.*(..))")
	public void beforeStart(JoinPoint point) {
		
		String s=point.getSignature().getName();
		String c=point.getTarget().getClass().getName();
		
		
		LOGGER.info("start the  method name=="+s);
		LOGGER.info("start the class name==="+c);
	}
@After("execution (* com.shiva.student.*.*.*(..))")
public void afterStart(JoinPoint point) {
		
		String s=point.getSignature().getName();
		String c=point.getTarget().getClass().getName();
		
		
		LOGGER.info("end for  method name=="+s);
		LOGGER.info("end for class name==="+c);
	}
@Around("execution (* com.shiva.student.*.*.*(..))")
public Object getTime(ProceedingJoinPoint joinPoint ) throws Throwable {
	Object object= null;
	
	long StartTime=System.currentTimeMillis();
    object	=joinPoint.proceed();
	long EndTime=System.currentTimeMillis();
	long Time=EndTime-StartTime;
	LOGGER.info("time taken to execute the method==="+Time);
	return object;	
}
 @AfterReturning( pointcut = "execution (* com.shiva.student.*.*.*(..))",returning = "obj")
public void afterReturning( Object obj) {
	
	
	
}


















}
