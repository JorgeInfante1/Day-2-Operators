package com.operators.model;

public class Solve 
{

	
	public static int solve(double mealCost, int tipPercent, int taxPercent)
	{
		int totalCost = 0;
		
		tipPercent = (int) (mealCost*(tipPercent/100));
		taxPercent = (int) (mealCost*(taxPercent/100));
		totalCost = (int) mealCost+tipPercent+taxPercent;
		return totalCost;
	}
	
	
}
