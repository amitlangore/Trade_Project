package com.trade.tradestore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.tradestore.model.Trade;
import com.trade.tradestore.repository.TradeRepo;
import com.trade.tradestore.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService 
{
	@Autowired
	private TradeRepo tradeRepo;
			
	@Override
	public Trade addTrade(Trade trade) 
	{
		/*
		Trade tradeEntity = new Trade();
		
		if(isLowerVersion(tradeRequest)) 
		{
			System.out.println("Invalid trade");
		}
		else {
			tradeEntity= tradeRepo.findByTradeIdAndVersion(tradeRequest.getTradeId(), tradeRequest.getVersion());
			
			tradeEntity.setBookId(tradeRequest.getBookId());
			tradeEntity.setCounterParty(tradeRequest.getCounterParty());
			//DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			tradeEntity.setCreatedDate(tradeRequest.getCreatedDate());
			tradeEntity.setExpiredFlag(tradeRequest.getExpiredFlag());			
			tradeEntity.setMaturityDate(tradeRequest.getMaturityDate());
			tradeEntity.setTradeId(tradeRequest.getTradeId());
			tradeEntity.setVersion(tradeRequest.getVersion());	
		}
		*/
		   return tradeRepo.save(trade);
	}
	
	@Override
	public List<Trade> getTrades()
	{
		return tradeRepo.findAll();
				
	}

	@Override
	public Trade getTrade(Long id) 
	{
		Optional<Trade> trade = tradeRepo.findById(id);
		if(trade.isPresent())
			return trade.get();
		
		return null; 
	}
	
/*
	//Condition 1 - Check version	
	private boolean isLowerVersion(TradeRequest tradeRequest) 
	{
		 List<Trade> trades = tradeRepo.findByTradeId(tradeRequest.getTradeId());
		 
		 int versionId= trades.stream().max(Comparator.comparing(Trade :: getVersion )).get().getVersion();
		 
		 if(tradeRequest.getVersion()<versionId) {
			 return true;
		 }else 
		 {
			 return false;
		 }		 
	}
	
	//Condition 2 - Check maturity date 
	
	private boolean checkMaturityDate(TradeRequest tradeRequest) 
	{
		 String maturityDate;
		 maturityDate = tradeRequest.getMaturityDate();
		 LocalDate todayDate = LocalDate.now();
		 
		 if(maturityDate.isBefore(todayDate))
		 {
			 return false;
		 }
		 else 
		 {
			 return true;
		 }
		
	} 
	 */
		

}
