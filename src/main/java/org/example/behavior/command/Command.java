package org.example.behavior.command;

public abstract class Command {
    protected Editor editor;

    abstract void execute();

}
