package com.nts.designpattern.command.normal;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.on();
	}

	public void undo() {
		garageDoor.off();
	}
}
