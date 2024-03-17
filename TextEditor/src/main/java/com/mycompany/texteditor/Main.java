package com.mycompany.texteditor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            PrintTextEditor editor = new PrintTextEditor(initialText);
            System.out.print("Enter code: ");
            int code = scanner.nextInt();
            if (code == 1) {
                editor.print();
                System.out.println("SUCCESS");
            }
        } else if (choice == 2) {
            AdvancedTextEditor editor = new AdvancedTextEditor(initialText);
            System.out.print("Enter code: ");
            int code = scanner.nextInt();
            if (code == 1) {
                editor.undo();
                System.out.println("New Text:");
                System.out.println(editor.getText());
                System.out.println("SUCCESS");
            }
        }
        scanner.close();
    }
}
