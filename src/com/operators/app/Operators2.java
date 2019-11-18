package com.operators.app;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import com.operators.model.Solve;
public class Operators2 
{
	static int totalCost = 0;
	public static void main(String[] args) 
	{
		//Variable Declaration
		double mealCost = 12.00;
		int tipPercent = 20;
		int taxPercent = 8;
		
		//Process
		
		solve(mealCost,tipPercent, taxPercent);
		System.out.println(totalCost);

	}

	static void solve(double mealCost, int tipPercent, int taxPercent) 
	{

		
		double tipPercent1 = 20;
		double taxPercent1 = 8;
		
		tipPercent1 =  ((mealCost*tipPercent1)/100);
		taxPercent1 =  ((mealCost*taxPercent1)/100);
		totalCost = (int) Math.round(mealCost+tipPercent1+taxPercent1);
		
		
	}





}

