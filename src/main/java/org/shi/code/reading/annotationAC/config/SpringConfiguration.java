package org.shi.code.reading.annotationAC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="org.shi.code.reading.annotationAC")
@EnableAspectJAutoProxy
public class SpringConfiguration { }