package com.mycompany.texteditor;
public class PrintTextEditor extends TextEditor {
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(getText());
    }
}
