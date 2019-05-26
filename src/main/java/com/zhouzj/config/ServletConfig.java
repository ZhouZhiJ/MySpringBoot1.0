package com.zhouzj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * SpringMVC 配置信息 </br>
 * 
 * @EnableWebMvc 开启SpringMVC功能 </br>
 * 
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午9:52:46 </br>
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.zhouzj.controller"})
public class ServletConfig implements WebMvcConfigurer {
	//配置视图解析器
	//创建SpringMVC视图解析器
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		//配置jsp页面可以通过${}访问beans
		viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}
}
