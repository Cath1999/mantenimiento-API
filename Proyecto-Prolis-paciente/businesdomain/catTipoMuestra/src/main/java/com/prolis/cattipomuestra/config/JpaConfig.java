package com.prolis.cattipomuestra.config;

import com.prolis.cattipomuestra.service.CatTipoMuestraService;
import com.prolis.cattipomuestra.service.impl.CatTipoMuestraServiceImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
@ComponentScan({"com.prolis.cattipomuestra"})
@EntityScan(basePackages = "com.prolis.cattipomuestra")
@EnableJpaRepositories(basePackages = "com.prolis.cattipomuestra.repository")
public class JpaConfig {

    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        return sessionFactory;
    }
}
