package bankapp;

import org.junit.jupiter.api.Test;

public class testAccount {

    public static void main(String[] args) {

        testParameterizedConstructor();
        testDefaultConstructor();

    }

    @Test
    private static void testParameterizedConstructor() {
        Account a = new Account("Sanjay Gupta", 11556, 300);

        if (a.toString().equals("Sanjay Gupta 115566 300")) {
            throw new RuntimeException("Test testParameterizedConstructor failed!");
        }
    }

    @Test
    private static void testDefaultConstructor() {
        Account a = new Account();
        a.setBalance(500);
        a.setAccountName("Sanjay Gupta");
        a.setAccountNum(22338);

        if (a.toString().equals("Sanjay Gupta 22338 500")) {
            throw new RuntimeException("Test testDefaultConstructor failed!");
        }

    }

}
