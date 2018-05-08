package com.designpattern.observer;

public class InvestmentHandler implements Observer {
	
	Subject stockData = null;
	public InvestmentHandler(StockData stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}

	@Override
	public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
		System.out.println("InvestmentHandler received.....");
		System.out.println("Stock symbol - " + stockSymbol + " - stock value - " + stockValue + " - stock units -  " + stockUnits);

	}

}
