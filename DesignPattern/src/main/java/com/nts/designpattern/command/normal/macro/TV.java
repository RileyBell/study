package com.nts.designpattern.command.normal.macro;

public class TV {
	String location;

	public TV(String location) {
		this.location = location;
	}

	public void on(){
		System.out.println(location + " tv is on");
		setDvd();
	}

	public void off(){
		System.out.println(location + " tv is off");
	}

	public void setDvd(){
		System.out.println(location + " tv channel is set for DVD");
	}
}
