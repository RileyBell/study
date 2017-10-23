package com.nts.designpattern.command.normal;

public class Stereo {
	int volume;
	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Stereo is On");
	}

	public void off() {
		System.out.println(location + " Stereo is Off");
	}

	public void setCd() {

	}

	public void setDvd() {

	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
