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
 * @Description: ���ڵ�������
 * @author mao
 * @date 2017��3��23�� ����4:07:01 
 *
 */
@Component//�����Ҫ���ˣ�ע����Զ�ɨ�� �Ὣ����뵽IOC������
@Aspect
public class Audience {
	
	//����һ��������@AspectJ�����ڿ����õ��е�
	@Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performance(){
		
	}
	
	
	@Before("performance()")
	public void takeSeats(){
		//����֮ǰ
		System.out.println("���ڿ�ʼ������");
	}
	
	@Before("performance()")
	public void turnOffCellPhones(){
		//����֮ǰ
		System.out.println("������������");
	}
	
	@AfterReturning("performance()")
	public void applaud(){
		//����֮��
		System.out.println("������󣬹��ƣ����ƣ����ƣ�");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund(){
		//����ʧ��֮��
		System.out.println("����ʧ�ܣ�����Ҫ��Ǯ��");
	}
	
	//����֪ͨ
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try {
			System.out.println("�������������Լ���λ����---����֮ǰ");
			System.out.println("���ڹر����ǵ��ֻ�---����֮ǰ");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();
			
			long end=System.currentTimeMillis();
			
			System.out.println("���ݺܾ��ʣ���ҹ���....");
			System.out.println("���ݺ�ʱ:"+(end-start)+"����");
			
		} catch (Throwable e) {
			//����ʧ�ܣ�
			System.out.println("̫����ˣ�����Ҫ��Ǯ��");
		}
		
		
	}
	
	
}