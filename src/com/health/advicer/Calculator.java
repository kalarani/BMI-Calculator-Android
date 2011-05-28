package com.health.advicer;

import java.util.HashMap;

public class Calculator {

	private static HashMap<String, Double> weightFactor = new HashMap<String, Double>() {
		{
			put("Male", 13.7);
			put("Female", 9.6);
		}
	};
	private static HashMap<String, Double> heightFactor = new HashMap<String, Double>() {
		{
			put("Male", 5.0);
			put("Female", 1.8);
		}
	};
	private static HashMap<String, Double> ageFactor = new HashMap<String, Double>() {
		{
			put("Male", 6.8);
			put("Female", 4.7);
		}
	};
	private static HashMap<String, Integer> sumFactor = new HashMap<String, Integer>() {
		{
			put("Male", 66);
			put("Female", 655);
		}
	};

	public static Double calculateBMR(CharSequence gender, Double weight,
			Double height, Integer age) {
		Double bmr = new Double(0);
		bmr = sumFactor.get(gender) + (weightFactor.get(gender) * weight)
				+ (heightFactor.get(gender) * height)
				- (ageFactor.get(gender) * age);
		return bmr;
	}
	
	public static Double calculateBMI(Double weight, Double height){
		return weight / (Math.pow(height/100, 2));
	}
}
