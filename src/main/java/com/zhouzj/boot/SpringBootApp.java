/**
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午10:16:15 </br>
 */
package com.zhouzj.boot;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

/**
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午10:16:15 </br>
 *
 */
public class SpringBootApp {
	
	private static int PORT = 8080;
	
	private static String PATH = "target/classes";

	public static void start() {
		//创建Tomcat容器
		Tomcat tomcat = new Tomcat();
		//设置tomcat端口号
		tomcat.setPort(PORT);
		//添加项目读取路径
		StandardContext standardContext = null;
		try {
			standardContext = (StandardContext) tomcat.addWebapp("/", new File("src/main").getAbsolutePath());
		} catch (ServletException e) {
			e.printStackTrace();
		}
		//禁止重新载入
		standardContext.setReloadable(false);
		//创建WebRoot
		StandardRoot standardRoot = new StandardRoot(standardContext);
		//获取class文件读取地址
		File fileClasses = new File(PATH);
		//tomcat读取classes执行
		standardRoot.addPreResources(new DirResourceSet(standardRoot, "/WEB-INF/classes", fileClasses.getAbsolutePath(), "/"));
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		//异步等待请求执行
		tomcat.getServer().await();
	}
}
