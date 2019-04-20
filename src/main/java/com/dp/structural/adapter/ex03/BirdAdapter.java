package com.dp.structural.adapter.ex03;

public class BirdAdapter implements ToyDuck{

	private Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	public void squeak() {
		bird.makeSound();
	}

}
