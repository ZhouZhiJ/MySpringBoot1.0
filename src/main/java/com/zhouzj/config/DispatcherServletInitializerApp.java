package com.zhouzj.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 加载SpringMVC---DispatcherServlet </br>
 * 
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午10:02:17 </br>
 * 
 */
public class DispatcherServletInitializerApp extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 加载根配置信息  Spring 核心
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	// SpringMVC 加载配置信息
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	// SpringMVC拦截url的映射
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
