package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: Audience 
 * @Description: 观众的切面类
 * @author mao
 * @date 2017年3月23日 下午4:07:01 
 *
 */
@Component//这个不要忘了，注解的自动扫描 会将其加入到IOC容器中
@Aspect
public class Audience {
	
	//定义一个可以在@AspectJ切面内可重用的切点
	@Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performance(){
		
	}
	
	
	@Before("performance()")
	public void takeSeats(){
		//表演之前
		System.out.println("观众开始入座！");
	}
	
	@Before("performance()")
	public void turnOffCellPhones(){
		//表演之前
		System.out.println("观众正在坐着");
	}
	
	@AfterReturning("performance()")
	public void applaud(){
		//表演之后
		System.out.println("表演完后，鼓掌！鼓掌！鼓掌！");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund(){
		//表演失败之后
		System.out.println("表演失败，我们要退钱！");
	}
	
	//环绕通知
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try {
			System.out.println("观众正在坐在自己的位置上---表演之前");
			System.out.println("观众关闭他们的手机---表演之前");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();
			
			long end=System.currentTimeMillis();
			
			System.out.println("表演很精彩，大家鼓掌....");
			System.out.println("表演耗时:"+(end-start)+"毫秒");
			
		} catch (Throwable e) {
			//表演失败，
			System.out.println("太糟糕了，我们要退钱！");
		}
		
		
	}
	
	
}
