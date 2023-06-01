package by.itacademy.bpp;

import by.itacademy.annotation.Transactional;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Proxy;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Object proxyBean = bean;
        if (bean.getClass().isAnnotationPresent(Transactional.class)) {
            proxyBean = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        System.out.println("Открыл Транзакцию");
                        Object invoke = method.invoke(bean, args);
                        System.out.println("Закрыл Транзакцию");
                        return invoke;
                    });
        }

        return proxyBean;
    }
}
