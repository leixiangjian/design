package com.design.pattern.command;

import com.design.pattern.command.command.Command;
import com.design.pattern.command.command.ConcreateCommand;
import com.design.pattern.command.invoker.Invoker;
import com.design.pattern.command.receiver.Receiver;

public class CommandApplication {

	public static void main(String[] args) {
		Invoker controller = new Invoker();
		Receiver receiver = new Receiver();
		Command command = new ConcreateCommand(receiver);
		controller.setCommand(command);
		
		controller.executeTest();
	}

}
