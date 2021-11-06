package com.beanbox.aop.advisor;

import com.beanbox.aop.aspect.AspectJExpressionPointCut;
import com.beanbox.aop.aspect.Pointcut;
import org.aopalliance.aop.Advice;

/**
 * @author: @zyz
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor,Advisor{

	/**
	 * 切面
	 */
	private AspectJExpressionPointCut pointCut;

	/**
	 * 具体拦截方法
	 */
	private Advice advice;

	/**
	 * 表达式
	 */
	private String expression;

	public AspectJExpressionPointcutAdvisor (String expression) {
		this.expression = expression;
	}

	@Override
	public Pointcut getPointcut () {
		if (null==pointCut)
		{
			pointCut=new AspectJExpressionPointCut (expression);
		}
		return pointCut;
	}

	@Override
	public Advice getAdvice () {
		return advice;
	}

	public void setAdvice(org.aopalliance.aop.Advice advice){
		this.advice = advice;
	}

}
