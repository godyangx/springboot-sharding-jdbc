package com.godyangx.sharding_jdbc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created xiang on 2019-08-23 11:47 AM
 */
@Entity
@Table(name="goods")
@Data
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;
}
