package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRule;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none(); //Waits for an exception to be thrown

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private AuthenticationService authenticationService; // Creates a mock of the AuthenticationService.

    //Pulls a SpotifyAccountService called subject
    private SpotifyAccountService subject;

    @Before
    public void setUp() {
        //Put stuff in here that will be run every time you create a test
        //Creates a new one
        subject = new SpotifyAccountService(authenticationService);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void whenUserNameAndPasswordValidThenAccountReturned() {
//        Arrange
        String username = "john@test.com";
        String password = "123456789";
        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);

//        Act
        SpotifyAccount result = subject.verify(username, password);


//        Assert
        Assertions.assertThat(result.getUsername())
                .isEqualTo(expectedAccount.getUsername());

    }

    @Test
    public void whenUserNameAndPasswordInvalidThenExceptionThrown() {
//        Arrange
        String username = "john@test.com";
        String password = "123456789";

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false); //If provided with any string it will return false.Makes the authentication behave in a certain way

        expectedException.expect(SpotifyAccountNotValidException.class); // Catches an exception and
        // expects that the exception is of the class 'SpotifyAccountNotValid'
//        Act
        subject.verify(username, password);

        //      Assert
        BDDMockito.verify(authenticationService).authenticate(username, password); //Similar to an assert that call. Proving that the authenticationService.authenticate
        // has been called.


    }
}


