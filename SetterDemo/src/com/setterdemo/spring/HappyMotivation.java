package com.setterdemo.spring;

import java.util.Random;

public class HappyMotivation implements Motivation {

	@Override
	public String getMotivation() {
		String arr[] = new String[5];
		Random random = new Random();

		arr[0] = "When we slow down and deeply listen, the differences dissolve";
		arr[1] = "Never give up";
		arr[2] = "Wherever you go, no matter what the weather, always bring your own sunshine.";
		arr[3] = "If you want light to come into your life, you need to stand where it is shining";
		arr[4] = "Success is the sum of small efforts repeated day in and day out";
		int a = random.nextInt(4);
		return arr[a];
	}

}
