package com.overlay.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(sqlSessionFactoryRef = "sqlSessionFactory", basePackages =
    { "com.overlay.repository.mapper"})
@ComponentScan(basePackages =
    { "com.overlay.repository.imp", })
public class MyBatisConfig {
	
	   private static SqlSessionFactory sqlSessionFactory;
	   static {

	       try {
	    
	    
	           String resource = "mapper/mybatis-config.xml";
	           InputStream inputStream = Resources.getResourceAsStream(resource);
	           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       } catch (IOException e) {
	    
	          e.printStackTrace();
	      }
	  }


	   public static SqlSession getSession(){
	    
	    
	       return sqlSessionFactory.openSession();
	  }
	
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DatabaseIdProvider databaseIdProvider, DataSource dataSource)
            throws Exception
    {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.overlay.model");
        sessionFactory.setDatabaseIdProvider(databaseIdProvider);
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*Mapper.xml"));
        return sessionFactory;
    }
    
    @Bean
    public DatabaseIdProvider databaseIdProvider()
    {
        DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();

        Properties props = new Properties();
        props.put("Microsoft SQL Server", "mssql");
        props.put("PostgreSQL", "postgres");
        databaseIdProvider.setProperties(props);
        return databaseIdProvider;
    }  

}
