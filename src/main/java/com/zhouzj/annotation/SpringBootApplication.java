/**
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午11:20:15 </br>
 */
package com.zhouzj.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义启动类注解
 * 
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午11:20:15 </br>
 *
 */

@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.RUNTIME)    
@Documented
public @interface SpringBootApplication {

}
