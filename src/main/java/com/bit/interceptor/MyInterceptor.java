package com.bit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bit.log1.controller.LogController01;

// HandlerInterceptor Interface
public class MyInterceptor implements HandlerInterceptor{
	
	private static final Log LOG
	= LogFactory.getLog(LogController01.class);
	
	@Override
	public boolean preHandle(HttpServletRequest req		//arg0
							, HttpServletResponse res	//arg1
							, Object obj				//arg2
							) throws Exception{
		System.out.println("MyInterceptor.preHandle() Called...");
		LOG.debug("#login - debug log");
		LOG.info("#login - info log");
		LOG.warn("#login - warn log");
		LOG.error("#login - error log");
		System.out.println("---------------------------------------------------------------------------------------------");
		return true;
		// true  : 정상적으로 컨트롤러를 수행해라 (요청을 이어가라)
		// false : 컨트롤러를 수행 하지마라 (요청을 이어가지 마라)
	}
	
	// postHandle() : 컨트롤러 수행 후, 화면 응답 전 수행
	@Override
	public void postHandle(HttpServletRequest req	//arg0
						, HttpServletResponse res	//arg1
						, Object obj				//arg2
						, ModelAndView mav			//arg3
						) throws Exception{
		System.out.println("MyInterceptor.postHandle() Called...");
		LOG.debug("#login - debug log");
		LOG.info("#login - info log");
		LOG.warn("#login - warn log");
		LOG.error("#login - error log");
		System.out.println("---------------------------------------------------------------------------------------------");
	}
	
	// afterCompletion() : 컨트롤러 수행 후, 화면 응답 후에 수행 (전부  완료)
	@Override
	public void afterCompletion(HttpServletRequest req	//arg0
							, HttpServletResponse res	//arg1
							, Object obj				//arg2
							, Exception ex				//arg3
							) throws Exception{
		System.out.println("MyInterceptor.afterCompletion() Called...");
		LOG.debug("#login - debug log");
		LOG.info("#login - info log");
		LOG.warn("#login - warn log");
		LOG.error("#login - error log");
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}
