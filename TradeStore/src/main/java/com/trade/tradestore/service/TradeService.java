package com.trade.tradestore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.trade.tradestore.model.Trade;

@Service
public interface TradeService 
{
    
	public Trade addTrade(Trade trade) ;
	
	public List<Trade> getTrades();

	public Trade getTrade(Long id);
	
	//public boolean checkMaturityDate(TradeRequest tradeRequest);
	
	//public boolean checkVersion(TradeRequest tradeRequest);
		
}
