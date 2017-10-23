package com.nts.designpattern.command.normal;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.off();
	}

	public void undo() {
		garageDoor.on();
	}
}
