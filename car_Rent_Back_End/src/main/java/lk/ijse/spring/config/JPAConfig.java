package lk.ijse.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:52 PM
 * @since : v0.01.0
 **/
@Configuration
@EnableJpaRepositories(basePackages = "lk.ijse.spring.repo")
@EnableTransactionManagement
@PropertySource("classpath:properties.properties")
public class JPAConfig {
    public JPAConfig(){
        System.out.println("JPAConfig : Instantiated");
    }
    
    @Autowired
    Environment env;

    //data base access (username,password,name,url)
    //Spring data jpa need a vendor to run ORM
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter vad){
        LocalContainerEntityManagerFactoryBean factory= new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(ds);
        factory.setJpaVendorAdapter(vad);
        factory.setPackagesToScan(env.getRequiredProperty("pro.entity"));
        return factory;

    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setUsername(env.getRequiredProperty("pro.username"));
        ds.setPassword(env.getRequiredProperty("pro.password"));
        ds.setDriverClassName(env.getRequiredProperty("pro.driver"));
        ds.setUrl(env.getRequiredProperty("pro.url"));
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter va= new HibernateJpaVendorAdapter();
        va.setDatabase(Database.MYSQL);
        va.setGenerateDdl(true);
        va.setDatabasePlatform(env.getRequiredProperty("pro.dial"));
        va.setShowSql(true);
        return va;
    }
}
