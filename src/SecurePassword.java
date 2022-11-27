public class SecurePassword {
    // instance variable
    private String password;

    // constructor
    public SecurePassword(String password) {
        this.password = password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean isSecure() {
        if (isLongEnough() == true && containsUppercase() == true && containsLowercase() == true
        && containsDigit() == true && containsSpecialSymbol() == true) {
            return true;
        } else {
            return false;
        }
    }


    public String status() {
        String temp = "";
        if(!isLongEnough()) {
            temp += "The password must contain at least 8 characters" + "\n";
        }
        if(!containsUppercase()) {
            temp += "The password must contain at least one uppercase letter" + "\n";
        }
        if(!containsLowercase()) {
            temp += "The password must contain at least one lowerCase letter" + "\n";
        }
        if(!containsDigit()) {
            temp += "The password must contain at least one digit" + "\n";
        }
        if(!containsSpecialSymbol()) {
            temp += "The password must contain at least one special symbol: ! @ # $ % ^ & * ?" + "\n";
        }
        return temp;
    }


    private boolean isLongEnough() {
        if(password.length()>=8) {
            return true;
        } else {
            return false;
        }
    }


    private boolean containsUppercase() {
        /* this one is completed for you as a hint for how to do the others! */
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return checkString(upperCaseLetters);  // this method implemented below
    }


    private boolean containsLowercase() {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        return checkString(lowerCaseLetters);
    }


    private boolean containsDigit() {
        String numbers = "0123456789";
        return checkString(numbers);
    }


    private boolean containsSpecialSymbol() {
        String special = "!@#$%^&*?";
        return checkString(special);
    }


    private boolean checkString(String characterString) {
        boolean temp1 = false;
        for(int i = 0; i<password.length(); i++) {
            String temp = password.substring(i, i+1);
            if(characterString.contains(temp)) {
                return temp1 = true;
            }
        }
        return temp1;
    }
}
