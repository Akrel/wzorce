package org.example.behavior.command;

public class InsertTextCommand extends Command {

    private String textToInsert;

    public InsertTextCommand(Editor editor, String textToInsert) {
        this.editor = editor;
        this.textToInsert = textToInsert;
    }

    @Override
    public void execute() {
        editor.insertText(textToInsert);
    }
}
