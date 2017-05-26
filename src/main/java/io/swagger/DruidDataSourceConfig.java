package io.swagger;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by tao on 17-5-17.
 */
@Configuration
@EnableTransactionManagement
public class DruidDataSourceConfig implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;



    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "../resources/*");
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("注入druid！！！");
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl("jdbc:mysql://localhost:3306/acer_pet");
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUsername("root");
        datasource.setPassword("root");
        datasource.setInitialSize(5);
        System.out.println("PPPPPPPPPPPPPPPP" + propertyResolver.getProperty("spring.datasource.minIdle"));
        datasource.setMinIdle(5);
        datasource.setMaxWait(60000);
        datasource.setMaxActive(20);
        datasource.setMinEvictableIdleTimeMillis(300000);
        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }
}
