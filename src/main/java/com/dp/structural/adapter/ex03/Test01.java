package com.dp.structural.adapter.ex03;

public class Test01 {

	public static void main(String[] args) {
		Bird bird = null;
		ToyDuck toyDuck = null;
		BirdAdapter adapter = null;		
		try {
			bird = new Sparrow();
			toyDuck = new PlasticToyDuck();
			adapter = new BirdAdapter(bird);
			toyDuck.squeak();
			adapter.squeak();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
