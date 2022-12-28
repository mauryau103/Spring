package com.multi.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "bookEntityManagerFactory",basePackages = {"com.multi.repository.book"},transactionManagerRef = "bookTransactionManager")
public class BookDBConfig {

	
	
	@Bean(name="bookDatasource")
	@ConfigurationProperties(prefix = "spring.book.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	
	@Bean(name="bookEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,@Qualifier("bookDatasource") DataSource dataSource) {
		
		
		Map<String,Object> properties = new HashMap<>();
		//mysql properties setting
		/*
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		*/
		
		//postgres properties setting
		
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("spring.jpa.database-platform","org.hibernate.dialect.PostgreSQL95Dialect");
        properties.put("spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults","false");
		
      //  properties.put("hibernate.physical_naming_strategy","org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        
		return builder.dataSource(dataSource).properties(properties).packages("com.multi.model.book").persistenceUnit("Book").build();
		
	}
	
	@Bean(name="bookTransactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("bookEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
	
}
