
package com.mycompany.texteditor;
import java.util.Stack;

public class AdvancedTextEditor extends TextEditor {
    private Stack<String> history;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        history = new Stack<>();
    }

    @Override
    public void append(String newText) {
        history.push(getText());
        super.append(newText);
    }

    @Override
    public void delete(int n) {
        history.push(getText());
        super.delete(n);
    }

    public void undo() {
        if (!history.isEmpty()) {
            setText(history.pop());
        }
    }
}
