package com.design.pattern.command.command;

import com.design.pattern.command.receiver.Receiver;

public class ConcreateCommand implements Command {
	Receiver receiver;
	public ConcreateCommand(Receiver receiver){
		this.receiver = receiver;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.action();
	}

	public void undo() {
		// TODO Auto-generated method stub

	}

}
