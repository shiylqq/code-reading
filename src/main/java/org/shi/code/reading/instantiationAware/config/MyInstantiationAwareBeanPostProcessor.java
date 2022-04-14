package org.shi.code.reading.instantiationAware.config;

import org.shi.code.reading.instantiationAware.pojo.Cup;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (Cup.class == beanClass) {
            System.out.println("执行顺序①");
            System.out.println("postProcessBeforeInstantiation在cup实例化之前运行");

        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (Cup.class == bean.getClass()) {
            System.out.println("执行顺序②");
            System.out.println("postProcessAfterInstantiation在cup实例化之后运行，返回false的话就不会执行后面的依赖注入和值填充了");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        //在这里实现@Autowired、@Resource、@PostConstruct、@preDestroy
        if (Cup.class == bean.getClass()) {
            System.out.println("postProcessProperties在依赖注入后执行，在填充属性前执行：" + bean);
            ((Cup)bean).setColor("white");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Cup.class == bean.getClass()) {
            System.out.println("postProcessBeforeInitialization在aware方法后执行，在init-method前执行");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (Cup.class == bean.getClass()) {
            System.out.println("postProcessAfterInitialization在init-method后执行");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
