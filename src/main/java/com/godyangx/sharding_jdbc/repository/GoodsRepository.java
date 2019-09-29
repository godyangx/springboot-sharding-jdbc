package com.godyangx.sharding_jdbc.repository;

import com.godyangx.sharding_jdbc.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created xiang on 2019-08-23 11:48 AM
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {

    List<Goods> findAllByGoodsIdBetween(Long goodsId1,Long goodsId2);

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);

    Goods getFirstByGoodsIdAndAndGoodsName(Long goodsId, String goodsName);

    Goods getFirstByGoodsName(String goodsName);
}
