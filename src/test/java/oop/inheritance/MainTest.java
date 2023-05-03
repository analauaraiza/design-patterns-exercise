package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MainTest {


    @Test
    public void when1IdTyped_thenDoSaleIsCalled(){
        //Given
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("1");

        //When
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions(application);

    }
    @Test
    public void when2IdTyped_thenDoRefundIsCalled(){
        //Given
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("2");

        //When
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions(application);

    }
    @Test
    public void when3IdTyped_thenPrintReportIsCalled(){
        //Given
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("3");

        //When
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions(application);

    }

    @Test
    public void when4IdTyped_thenShowConfigurationIsCalled(){
        //Given
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("4");

        //When
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();

        verifyNoMoreInteractions(application);

    }
}
