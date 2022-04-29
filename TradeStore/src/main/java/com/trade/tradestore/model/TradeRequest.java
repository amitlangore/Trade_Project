package com.trade.tradestore.model;

import lombok.Data;

@Data
public class TradeRequest 
{
	
    private String tradeId;
    
    private int version;
    
    private String counterParty;
    
    private String bookId;
    
    private String maturityDate;
   
    private String createdDate;
    
    private String expiredFlag;
    
    

	public TradeRequest() {
		super();
		
	}



	public TradeRequest(String tradeId, int version, String counterParty, String bookId, String maturityDate,
			String createdDate, String expiredFlag) {
		super();
		this.tradeId = tradeId;
		this.version = version;
		this.counterParty = counterParty;
		this.bookId = bookId;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expiredFlag = expiredFlag;
	}



	public String getTradeId() {
		return tradeId;
	}



	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public String getCounterParty() {
		return counterParty;
	}



	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}



	public String getBookId() {
		return bookId;
	}



	public void setBookId(String bookId) {
		this.bookId = bookId;
	}



	public String getMaturityDate() {
		return maturityDate;
	}



	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}



	public String getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}



	public String getExpiredFlag() {
		return expiredFlag;
	}



	public void setExpiredFlag(String expiredFlag) {
		this.expiredFlag = expiredFlag;
	}



	@Override
	public String toString() {
		return "TradeRequest [tradeId=" + tradeId + ", version=" + version + ", counterParty=" + counterParty
				+ ", bookId=" + bookId + ", maturityDate=" + maturityDate + ", createdDate=" + createdDate
				+ ", expiredFlag=" + expiredFlag + "]";
	}
    
    
}
