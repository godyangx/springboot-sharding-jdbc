package com.godyangx.sharding_jdbc.database;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;

import javax.sql.DataSource;

/**
 * Created xiang on 2019-09-17 4:08 PM
 */
@Data
class DatabaseConfig {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String databaseName;

    DataSource createDataSource() {
        DruidDataSource result = new DruidDataSource();
        result.setDriverClassName(getDriverClassName());
        result.setUrl(getUrl());
        result.setUsername(getUsername());
        result.setPassword(getPassword());
        return result;
    }
}
