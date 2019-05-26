/**
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午10:12:38 </br>
 */
package com.zhouzj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 根配置 </br>
 * 
 * @author 作者 :zhouzj </br>
 * @version 创建时间：2019年5月26日 上午10:12:38 </br>
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.zhouzj"})
public class RootConfig {

}
