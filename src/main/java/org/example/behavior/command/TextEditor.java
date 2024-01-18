package org.example.behavior.command;

public class TextEditor {
    private Command currentCommand;

    public void setCommand(Command command) {
        currentCommand = command;
    }

    public void executeCommand() {
        currentCommand.execute();
    }
}
