package by.itacademy.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        ConstructorArgumentValues.ValueHolder genericArgumentValue = beanFactory.getBeanDefinition("by.itacademy.ConnectionPool#0")
                .getConstructorArgumentValues()
                .getGenericArgumentValue(String.class, "driver");

        genericArgumentValue.setValue("H2");
    }
}
