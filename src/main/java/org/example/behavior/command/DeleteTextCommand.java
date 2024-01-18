package org.example.behavior.command;

public class DeleteTextCommand extends Command {

    public DeleteTextCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.deleteSelectedText();
    }
}
