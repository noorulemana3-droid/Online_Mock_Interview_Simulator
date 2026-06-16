package util;

public class Validator {

    public static boolean isEmpty(String text) {

        return text == null || text.trim().isEmpty();
    }

    public static boolean validateLogin(String username,
                                        String password) {

        return !isEmpty(username) && !isEmpty(password);
    }

    public static boolean validateAnswer(String answer) {

        return !isEmpty(answer);
    }
}