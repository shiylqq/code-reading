package org.shi.code.reading.annotationAC;


import org.shi.code.reading.annotationAC.config.SpringConfiguration;
import org.shi.code.reading.annotationAC.pojo.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationAop {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();//这里已经通过AnnotationConfigUtils将解析注解的BFPP注册到beanFactory
        ac.register(SpringConfiguration.class);//注册@Configuration类
        ac.refresh();//开始解析解析bean
        MyCalculator bean = ac.getBean(MyCalculator.class);
        System.out.println(bean.add(1, 1));
    }
}
