package com.designpattern;

import com.designpattern.observer.IncomeHandler;
import com.designpattern.observer.InvestmentHandler;
import com.designpattern.observer.StockData;

public class TestDesignPattern {

	public static void main(String[] args) {
		StockData stockData = new StockData();
		new IncomeHandler(stockData);
		new InvestmentHandler(stockData);
		stockData.setStockData("Price Changed", Float.valueOf("100.0"), Integer.valueOf(10));
	}

}
