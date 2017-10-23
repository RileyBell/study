package com.nts.designpattern.command.normal.macro;

import com.nts.designpattern.command.normal.Stereo;
import com.nts.designpattern.command.normal.StereoOnWithCDCommand;

public class StereoOnCommand extends StereoOnWithCDCommand {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		super(stereo);
	}

	public void execute() {
		super.execute();
	}

	public void undo() {
		super.undo();
	}
}
