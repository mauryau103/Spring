package com.multi.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",basePackages = {"com.multi.repository.user"},transactionManagerRef = "transactionManager")
public class UserDBConfig {
	
	
	//Now we are adding datasource here
	//here we are manually java database configuartion
	//beacause we have two datasource so may be spring ioc will confuse to use which data source
	
	//we use datasource for creating loosely coupling with datasources (like sql,postgresql,etc).--> so we can easily switch between datasources.
	
	//Now here we specify our datasource by using interface DataSource.
	//and DataSourceBuilder will return that .
	//1.@ConfiguartionProperties -->it will take parameter of our prefix which is present in application.properties
	//2.@Bean --> as we writing this in our @configuartion class so we have to define bean for that &&& and we have given a name-->
	//to use it in @Qualifier to specify the bean to our entitymanager factory (below code refer0.
	//3.@Primary --> so there are two datasources ...for taht we use this as afirst priority always
	@Primary
	@Bean(name="datasource")
	@ConfigurationProperties(prefix = "spring.user.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	
	//Creating Entity Manager Factory
	//Inside parameter will take the help of entitymanagger Factory builder
	//and second parameter is to insert our datasource by using qualifier to define that which datasource we are using
	@Primary
	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,@Qualifier("datasource") DataSource dataSource) {
		
		
		Map<String,Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		
		
		//start creating entity manager factory
		//we have builder which helps to create entity manager
		//and above created properties we have to give in this
		return builder.dataSource(dataSource).properties(properties).packages("com.multi.model.user").persistenceUnit("User").build();
		
	}
	
	//Now we need to create a transaction manager
	//which help to manage the transaction
	//here will take the help of entity manager factory
	@Primary
	@Bean(name="transactionManager")
	// Transactional / JPA Events
	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
