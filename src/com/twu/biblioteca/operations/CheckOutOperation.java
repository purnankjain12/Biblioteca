package com.twu.biblioteca.operations;


import com.twu.biblioteca.ConfirmationHandler;
import com.twu.biblioteca.LibrarySection;
import com.twu.biblioteca.view.View;

public class CheckOutOperation implements Operation {
    private String item;
    private LibrarySection librarySection;
    private ConfirmationHandler confirmationHandler;

    public CheckOutOperation(String item, LibrarySection librarySection, ConfirmationHandler confirmationHandler) {
        this.item = item;
        this.librarySection = librarySection;
        this.confirmationHandler = confirmationHandler;
    }

    @Override
    public void execute(View view) {
        view.printToConsole("Enter " + item + " to checkout : \n");
        confirmationHandler.validateCheckOut(item, librarySection.checkOutItem(view.readUserInput()));
    }
}