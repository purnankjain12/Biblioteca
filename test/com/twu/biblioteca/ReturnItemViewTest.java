package com.twu.biblioteca;

import com.twu.biblioteca.user.User;
import com.twu.biblioteca.view.InputView;
import com.twu.biblioteca.view.LibrarianMenuView;
import com.twu.biblioteca.view.ReturnItemView;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReturnItemViewTest {


    ReturnItemView returnItemView;
    Controller controller;
    InputView inputView;
    LibrarySection librarySection;
    User user;
    LibrarianMenuView librarianMenuView;

    @Before
    public void initialise() {
        librarySection = mock(LibrarySection.class);
        user = mock(User.class);
        inputView = mock(InputView.class);
        controller = mock(Controller.class);
        librarianMenuView = new LibrarianMenuView(null);
        returnItemView = new ReturnItemView(librarySection, inputView, "", "");
    }

    @Test
    public void shouldReturnNextView() {
        when(inputView.readInput()).thenReturn("");
        when(librarySection.checkOutItem("")).thenReturn(true);
        when(controller.nextViewAfterLogin(user)).thenReturn(librarianMenuView);

        assertEquals(LibrarianMenuView.class, returnItemView.renderView(controller, user).getClass());
    }

}