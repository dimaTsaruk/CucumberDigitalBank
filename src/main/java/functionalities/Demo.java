package functionalities;

import io.cucumber.java.bs.A;

public class Demo {

    public static void main(String[] args) {
        Bank boa = new Bank("Bank Of America");

        Account testAccount = new Account(123456, "testAccount@gmail.com", 1000);
        boa.registerAccount(testAccount);

        Account test1 = new Account(11111, "test2@gmail.com", 2000);
        boa.registerAccount(test1);
        test1.transferZelle("testAccount@gmail.com", 100, boa);
        System.out.println(testAccount.getBalance());

/**
        Bank chase = new Bank("Chase");

        Account fenton = new Account(001, "fenton@gmail.com", 5000);
        chase.registerAccount(fenton);
        Account dima = new Account(002, "dima@gmail.com", 5000);
        chase.registerAccount(dima);
        Account maryna = new Account(003, "maryna", 10000);
        chase.registerAccount(maryna);

        System.out.println("Fenton balance: " + fenton.getBalance());
        System.out.println("Dima balance: " + dima.getBalance());
        System.out.println("Maryna balance: " + maryna.getBalance());

        maryna.withDraw(300);
        fenton.transferZelle("dima@gmail.com", 150, chase);

        System.out.println("\nFenton balance: " + fenton.getBalance());
        System.out.println("Dima balance: " + dima.getBalance());
        System.out.println("Maryna balance: " + maryna.getBalance());
 */


    }
}