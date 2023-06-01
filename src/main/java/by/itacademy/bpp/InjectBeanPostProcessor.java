package by.itacademy.bpp;

import by.itacademy.annotation.Inject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ReflectionUtils;

import java.util.Arrays;

public class InjectBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Arrays.asList(bean.getClass().getDeclaredFields()).forEach(field -> {
            if (field.isAnnotationPresent(Inject.class)) {
                Object dependency = applicationContext.getBean(field.getType());
                ReflectionUtils.makeAccessible(field);
                ReflectionUtils.setField(field, bean, dependency);
            }
        });
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
