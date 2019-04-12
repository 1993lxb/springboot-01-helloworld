package cn.ys.config;

import cn.ys.properties.JdbcProperties;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/*//@Configuration：声明我们JdbcConfig是一个配置类
//@PropertySource：指定属性文件的路径是:classpath:jdbc.properties
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {


    //通过@Value为属性注入值
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;
//通过@Bean将 dataSource()方法声明为一个注册 Bean 的方法，Spring 会自动调用该方法，将方法的返回值加入 Spring 容器中。
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}*/

//通过@EnableConfigurationProperties(JdbcProperties.class)来声明要使用JdbcProperties这个类的对象
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

   /* @Autowired
    private JdbcProperties jdbc;
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;
    }*/

   /* private JdbcProperties jdbc;
    public JdbcConfig(JdbcProperties prop){
        this.jdbc = prop;
    }
  / @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;
    }*/

    @Bean
    public DataSource dataSource(JdbcProperties jdbc) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;
    }



}

