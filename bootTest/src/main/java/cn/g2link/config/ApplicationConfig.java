package cn.g2link.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by G2_User on 2017/4/26.
 */
@Configuration
public class ApplicationConfig implements EnvironmentAware {
    private RelaxedPropertyResolver propertyResolver;
    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment);
    }
}
