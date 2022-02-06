package Task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void ifPasswordToSmall (){
        boolean result = PasswordValidation.passwordCheck("abcdefghijklmnopqrstuvwxyz");
        assertFalse(result);
    }

    @Test
    void ifPasswordHasNumbers (){
        boolean result = PasswordValidation.passwordCheck("1234567890");
        assertFalse(result);
    }

    @Test
    void ifPasswordIsValid (){
        boolean result = PasswordValidation.passwordCheck("justic3_!m4n");
        assertFalse(result);
    }

    @Test
    void ifPasswordShouldHaveNumbers (){
        boolean result = PasswordValidation.passwordCheck("SamSch1988+*");
        assertFalse(result);
    }





}
