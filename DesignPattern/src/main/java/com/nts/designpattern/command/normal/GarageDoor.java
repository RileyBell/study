package com.nts.designpattern.command.normal;

public class GarageDoor {
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void on(){
		System.out.println(location + " GarageDoor is On");
	}

	public void off(){
		System.out.println(location + " GarageDoor is Off");
	}
}
