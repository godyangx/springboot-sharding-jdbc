package com.godyangx.sharding_jdbc.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Created xiang on 2019-08-23 11:49 AM
 */
@ConfigurationProperties(prefix = "sharding1")
@Component
public class Database1Config extends DatabaseConfig{
}
