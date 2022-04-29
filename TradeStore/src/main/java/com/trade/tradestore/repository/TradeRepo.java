package com.trade.tradestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trade.tradestore.model.Trade;

@Repository
public interface TradeRepo extends JpaRepository<Trade, Long>
{
   
	public List<Trade> findByTradeId(String tradeId);
	
	public Trade findByTradeIdAndVersion(String tradeId, int version);
	
}
