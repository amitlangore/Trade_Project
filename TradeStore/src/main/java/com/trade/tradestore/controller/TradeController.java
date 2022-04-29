package com.trade.tradestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.trade.tradestore.model.Trade;
import com.trade.tradestore.service.TradeService;

@RestController
public class TradeController 
{
    
	@Autowired
	private TradeService tradeService;
	
	@PostMapping("/trade")
	public Trade addTrade(@RequestBody Trade tradeRequest) 
	{
		return tradeService.addTrade(tradeRequest);
	}
	
	@GetMapping("/trade")
	public List<Trade> getTrades()
	{
		return tradeService.getTrades();
	}
	
	@GetMapping("/trade/{Id}")
	public Trade getTrade(@PathVariable Long Id)
	{
		return this.tradeService.getTrade(Id);
	}
}
