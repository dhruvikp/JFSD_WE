package com.simplilearn.oops;

public class AbstractionExample {

	public static void main(String[] args) {

		Remote remote = new TVRemote();
		remote.pressPowerButton();

	}

}

interface Bouncable {
	void bounce();
}

class Ball implements Bouncable {
	@Override
	public void bounce() {

	}

}

abstract class Remote {
	abstract void pressPowerButton();

	void switchOff() {
		System.out.println("Switch of device");
	}
}

class TVRemote extends Remote {

	@Override
	void pressPowerButton() {

	}

}