package com.twu.biblioteca;

public class InvalidMenuItem implements MenuItem{

    @Override
    public void execute(View view) {
        view.printToConsole("Select a valid option!");
    }
}