package com.example.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware, BeanFactoryAware {

    private String beanName;
    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void outputResult() throws IOException {
        System.out.println("Bean名称为:" + beanName);
        Resource resource = resourceLoader.getResource("classpath:resource_load.txt");
        System.out.println("ResourceLoader加载的配置文件内容为:" + IOUtils.toString(resource.getInputStream()));
        System.out.println("BeanFactory类工厂为:" + beanFactory.getClass().getName());
    }

}
