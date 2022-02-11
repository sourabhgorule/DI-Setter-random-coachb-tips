package com.setterdemo.spring;

import java.util.Random;

public class VollyBall implements Coach {

	private Motivation motivation;
	
	
	public void setMotivation(Motivation motivation) {
		this.motivation = motivation;
	}

	@Override
	public String getdailyWorkout() {
		String arr[] = new String[5];
		Random random = new Random();

		arr[0] = " Call mine, even when it seems obvious";
		arr[1] = " Try to use all three hits";
		arr[2] = "Don’t touch the second ball – unless the setter has called for help";
		arr[3] = " Don’t land on or under the net";
		arr[4] = "Don’t catch the ball during a play";
		int a = random.nextInt(4);
		return arr[a];
	}

	@Override
	public String getDailyMotivation() {
		
		return motivation.getMotivation();
	}

}
