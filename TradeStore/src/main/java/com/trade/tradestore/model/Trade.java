package com.trade.tradestore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
@Table(name="TradeStore")
public class Trade 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "Id")
	    private long id;
	     
	    public long getId() { 
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		@Column(name = "Trade_Id")
	    private String tradeId;
	    
	    @Column(name = "Version")
	    private int version;
	    
	    @Column(name = "Counter_Party")
        private String counterParty;
	    
	    @Column(name = "Book_Id")
        private String bookId;
	    
	    //@JsonFormat(pattern = "dd/mm/yyyy", shape = Shape.STRING)
	    @Column(name = "Maturity_Date")
        private String maturityDate;
	    
	    //@JsonFormat(pattern = "dd/mm/yyyy", shape = Shape.STRING)
	    @Column(name = "Created_Date")
        private String createdDate;
	    
	    @Column(name = "Expired_Flag")
        private String expiredFlag;
        
	    
	     public Trade()
       {
			super(); 
		}

        public Trade(Long id,String tradeId, int version, String counterParty, String bookId, String maturityDate,
        		String createdDate, String expiredFlag) 
        {
			super();
			this.id=id;
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
			return "Trade [tradeId=" + tradeId + ", version=" + version + ", counterParty=" + counterParty + ", bookId="
					+ bookId + ", maturityDate=" + maturityDate + ", createdDate=" + createdDate + ", expiredFlag="
					+ expiredFlag + "]";
		}
		
		

		
}
