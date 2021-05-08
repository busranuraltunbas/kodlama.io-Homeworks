package gameManagement.Entites;

import gameManagement.Abstract.Entity;

public class Campaign implements Entity{
	
	private int id;
	private int gameId;
	private String campaignName;
	private double price;
	private int discountRate;

	
	
	public Campaign(int id, int gameId, String campaignName, double price, int discountRate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.campaignName = campaignName;
		this.price = price;
		this.discountRate = discountRate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getGameId() {
		return gameId;
	}



	public void setGameId(int gameId) {
		this.gameId = gameId;
	}



	public String getCampaignName() {
		return campaignName;
	}



	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPriceAfterDiscountRate() {
		return this.price - (this.price*this.discountRate/100);
		
	}

    
    

}
