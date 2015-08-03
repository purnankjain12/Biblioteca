package com.twu.biblioteca;

import com.twu.biblioteca.view.View;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ConfirmationHandlerTest {

    ConfirmationHandler confirmationHandler;
    View view;

    @Before
    public void initialise() {
        view = mock(View.class);
        confirmationHandler = new ConfirmationHandler(view);
    }

    @Test
    public void shouldConfirmSuccessfulCheckOut() {

        assertEquals(true, confirmationHandler.validateCheckOut("Book", true));
    }

    @Test
    public void shouldConfirmUnSuccessfulCheckOut() {

        assertEquals(false, confirmationHandler.validateCheckOut("Book", false));
    }

    @Test
    public void shouldConfirmSuccessfulReturn() {

        assertEquals(true, confirmationHandler.validateReturn("Book", true));
    }

    @Test
    public void shouldConfirmUnSuccessfulReturn() {

        assertEquals(false, confirmationHandler.validateReturn("Book", false));
    }
}