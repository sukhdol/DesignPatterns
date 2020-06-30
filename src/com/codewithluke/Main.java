package com.codewithluke;

import com.codewithluke.memento.Editor;
import com.codewithluke.memento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");

        history.push(editor.createState());

        editor.setContent("b");

        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println("Last Content: " + editor.getContent());
    }
}
