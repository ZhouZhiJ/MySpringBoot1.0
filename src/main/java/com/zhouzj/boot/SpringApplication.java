package com.zhouzj.boot;

import org.springframework.util.StringUtils;

import com.zhouzj.annotation.SpringBootApplication;

/**
 * 
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午11:45:05 </br>
 */
public class SpringApplication {

	 public static void run(Class<?> classes, String[] args) {
		 SpringBootApplication annotation = classes.getDeclaredAnnotation(SpringBootApplication.class);
		 if (!StringUtils.isEmpty(annotation)) {
			 SpringBootApp.start();
		 }
	 }
}
