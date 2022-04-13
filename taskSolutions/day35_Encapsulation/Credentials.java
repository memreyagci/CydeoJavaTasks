package day35_Encapsulation;

public class Credentials {
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord()) {
            System.err.println("Passowrd is not strong enough: " + password);
            System.exit(1);
        } else {
            this.password = password;
        }
    }

    public boolean isStrongPassWord() {
        int numOfLetter = 0, numOfSpecialChar = 0, numOfDigit = 0;

        if (password.length() < 8 || password.contains(" ")) {
            return false;
        } else {
            for (char ch : password.toCharArray()) {
                if (Character.isLetter(ch)) {
                    numOfLetter++;
                } else if (Character.isDigit(ch)) {
                    numOfDigit++;
                } else {
                    numOfSpecialChar++;
                }

                if (numOfDigit == 0 || numOfLetter == 0 || numOfSpecialChar == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

 */