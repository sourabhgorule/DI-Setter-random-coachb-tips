package com.setterdemo.spring;

import java.util.Random;

public class CricketCoach implements Coach {

	private Motivation motivation;
	
	
	public void setMotivation(Motivation motivation) {
		this.motivation = motivation;
	}

	@Override
	public String getdailyWorkout() {
		String arr[]=new String[5];
		Random random=new Random();
		
		arr[0]="Feet evenly spread with toes lined up with centre stump";
		arr[1]="Weight slightly toward inside of front and back feet ";
		arr[2]="Head and front shoulder pointing towards bowler";
		arr[3]="Grip bat with top hand (guide) dominant and bottom hand (power) relaxed";
		arr[4]="V’s of thumb & index finger pointing down back of bat";
		int a=random.nextInt(4);
		return arr[a];
	}

	@Override
	public String getDailyMotivation() {
		
		return motivation.getMotivation();
	}

}
