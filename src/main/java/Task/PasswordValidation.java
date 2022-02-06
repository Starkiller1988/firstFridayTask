package Task;

public class PasswordValidation {

    public static boolean passwordCheck(String password){
        if(password.length() <= 5){
            return false;
        }

    if (passNumber (password)){
        return true;
    } else {
        return false;
    }
    }

    private static boolean passNumber(String password){
        for(int p = 0; p < password.length(); p++){
            char letter = password.charAt(p);
            if (letter >= 34 && letter <= 46){
                return true;
            }
        }
        return false;
    }


}
