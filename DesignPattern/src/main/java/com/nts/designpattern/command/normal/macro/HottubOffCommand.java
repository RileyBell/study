package com.nts.designpattern.command.normal.macro;

import com.nts.designpattern.command.normal.Command;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.off();
	}

	public void undo() {
		hottub.on();
	}
}
