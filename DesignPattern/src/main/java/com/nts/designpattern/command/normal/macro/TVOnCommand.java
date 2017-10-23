package com.nts.designpattern.command.normal.macro;

import com.nts.designpattern.command.normal.Command;

public class TVOnCommand implements Command{
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.on();
	}

	public void undo() {
		tv.off();
	}
}
