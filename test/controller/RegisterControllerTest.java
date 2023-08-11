package controller;

import java.awt.event.ActionListener;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import model.RegisterModel;
import view.SignUp;

public class RegisterControllerTest {

    private RegisterController controller;
    private SignUpStub viewStub;

    @Before
    public void setUp() {
        viewStub = new SignUpStub();
        controller = new RegisterController(viewStub);
    }

    @Test
    public void testCheckUser_ValidData_ReturnsTrue() throws Exception {
        // Arrange: Prepare the test scenario
        RegisterModel testUserData = new RegisterModel("Ram", "Dangol", "ram@gmail.com", "9800000", "user1","123455","What is your name?","Ram");
        
        // Set up the stub to provide test data
        viewStub.setUser(testUserData);
        
        // Act: Call the method to be tested
        boolean status = controller.checkUser(testUserData);

        // Assert: Verify the result
        assertTrue(status);
    }

    @Test
    public void testCheckUser_InvalidData_ReturnsFalse() throws Exception {
        // Arrange: Prepare the test scenario
        RegisterModel testUserData = new RegisterModel("Invalid", "Data", "invalid@example.com", "123456", "invalid_user", "password", "Security Question?", "Answer");

        // Set up the stub to provide test data
        viewStub.setUser(testUserData);
        
        // Act: Call the method to be tested
        boolean status = controller.checkUser(testUserData);

        // Assert: Verify the result
        assertFalse(status);
    }
    
    // Stub implementation of the SignUp view class
    private class SignUpStub extends SignUp {
        private RegisterModel user;

        @Override
        public void addLoginListener(ActionListener listener) {
            // Do nothing for the test
        }

        @Override
        public RegisterModel getUser() {
            return user;
        }

        @Override
        public void setMessage(String message) {
            // Do nothing for the test
        }

        public void setUser(RegisterModel user) {
            this.user = user;
        }
    }
}
