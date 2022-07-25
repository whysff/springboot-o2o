package io.whysff.o2o.config.dao;

import com.alibaba.druid.pool.DruidDataSource;
import io.whysff.o2o.util.DESUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/24
 */

@Configuration
@MapperScan("io.whysff.o2o.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driverClass}")
    private String jdbcDriverClass;
    @Value("${jdbc.master.url}")
    private String jdbcMasterUrl;
    @Value("${jdbc.userName}")
    private String jdbUserName;
    @Value("${jdbc.password}")
    private String jdbcPassword;
    @Value("${jdbc.maxActive}")
    private int jdbcMaxActive;
    @Value("${jdbc.initialSize}")
    private int jdbcInitialSize;
    @Value("${jdbc.maxWait}")
    private long jdbcMaxWait;
    @Value("${jdbc.minIdle}")
    private int jdbcMinIdle;
    @Value("${jdbc.timeBetweenEvictionRunsMillis}")
    private long jdbcTimeBetweenEvictionRunsMillis;
    @Value("${jdbc.minEvictableIdleTimeMillis}")
    private long jdbcMinEvictableIdleTimeMillis;
    @Value("${jdbc.validationQuery}")
    private String jdbcValidationQuery;
    @Value("${jdbc.testWhileIdle}")
    private boolean jdbcTestWhileIdle;
    @Value("${jdbc.testOnBorrow}")
    private boolean jdbcTestOnBorrow;
    @Value("${jdbc.testOnReturn}")
    private boolean jdbcTestOnReturn;
    @Value("${jdbc.poolPreparedStatements}")
    private boolean jdbcPoolPreparedStatements;
    @Value("${jdbc.maxOpenPreparedStatements}")
    private int jdbcMaxOpenPreparedStatements;

    @Bean(name = "dataSource")
    public DruidDataSource createDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcDriverClass);
        dataSource.setUrl(DESUtil.getDecryptString(jdbcMasterUrl));
        dataSource.setUsername(DESUtil.getDecryptString(jdbUserName));
        dataSource.setPassword(DESUtil.getDecryptString(jdbcPassword));
        dataSource.setMaxActive(jdbcMaxActive);
        dataSource.setInitialSize(jdbcInitialSize);
        dataSource.setMaxWait(jdbcMaxWait);
        dataSource.setMinIdle(jdbcMinIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(jdbcTimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(jdbcMinEvictableIdleTimeMillis);
        dataSource.setValidationQuery(jdbcValidationQuery);
        dataSource.setTestWhileIdle(jdbcTestWhileIdle);
        dataSource.setTestOnBorrow(jdbcTestOnBorrow);
        dataSource.setTestOnReturn(jdbcTestOnReturn);
        dataSource.setPoolPreparedStatements(jdbcPoolPreparedStatements);
        dataSource.setMaxOpenPreparedStatements(jdbcMaxOpenPreparedStatements);
        return dataSource;
    }


}
