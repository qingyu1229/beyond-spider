package com.beyond.factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis Connection Factory, which reads the configuration data from a XML
 * file.
 * 
 * @author Loiane Groner http://loianegroner.com (English) http://loiane.com
 *         (Portuguese)
 */
public class MybatisConnectionFactory {
	
	 private  final static SqlSessionFactory sqlSessionFactory; 
	    static { 
	       String resource = "mybatis-config.xml"; 
	       Reader reader = null; 
	       try { 
	           reader = Resources.getResourceAsReader(resource); 
	       } catch (IOException e) { 
	           System.out.println(e.getMessage()); 
	       } 
	       sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); 
	    } 
	    
	    private static SqlSessionFactory getSqlSessionFactory() { 
	       return sqlSessionFactory; 
	    }
	    
	    public static SqlSession getSession(){
	    	return getSqlSessionFactory().openSession();
	    }
	    
}

