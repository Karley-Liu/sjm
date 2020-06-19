/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: TomcatConfig
 * Author:   chenhz
 * Date:     2020/6/19 17:09
 * Description: tomcatConfig
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.sjm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 *
 *
 * @author chenhz
 * @create 2020/6/19
 * @since 1.0.0
 */
@Configuration
public class TomcatConfig {
//    @Value("${bw.factory.doc.root}")
    private String rootDoc;

    @Bean
    public AbstractServletWebServerFactory embeddedServletContainerFactory(){
        rootDoc="C:\\Users\\Administrator\\Desktop\\sjm\\src\\main\\webapp";
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.setDocumentRoot(
                new File(rootDoc));
        return tomcatServletWebServerFactory;
    }
}
