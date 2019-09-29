package com.godyangx.sharding_jdbc.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;




/**
 * Created xiang on 2019-08-23 11:48 AM
 */
@ConfigurationProperties(prefix = "sharding0")
@Component
public class Database0Config extends DatabaseConfig{
}