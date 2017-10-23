package com.nts.designpattern.command.normal.macro;

import com.nts.designpattern.command.normal.Command;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
	}

	public void undo() {
		hottub.off();
	}
}
