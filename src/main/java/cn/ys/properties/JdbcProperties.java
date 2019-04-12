package cn.ys.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

//通过@ConfigurationProperties注解声明当前类为属性读取类
//prefix="jdbc"读取属性文件中，前缀为 jdbc 的值
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    //类上定义各个属性，名称必须与属性文件中jdbc.后面部分一致
    private String url;
    private String driverClassName;
    private String username;
    private String password;
    // getters 和 setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
