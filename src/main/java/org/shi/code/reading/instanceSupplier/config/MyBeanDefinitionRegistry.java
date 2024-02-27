package org.shi.code.reading.instanceSupplier.config;

import org.shi.code.reading.instanceSupplier.pojo.Tu;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MyBeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        GenericBeanDefinition tuBD = (GenericBeanDefinition)registry.getBeanDefinition("tu");
        tuBD.setInstanceSupplier(() ->{
            Tu tu = new Tu();
            tu.setName("tzhengyuan");
            tu.setHusband("sliang");
            return tu;
        });
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
