package classwork_17.bank_account;

//- Реализуем класс BankAccount:
//  - поля: account, owner, bank, branch, balance
//  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
//  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
//    полиморфизма)
//  - реализуем методы deposit() и withdraw() в классе BankAccount

import classwork_17.bank_account.model.BankAccount;

public class BankAppl {

    public static void main(String[] args) {

        BankAccount account001 = new BankAccount(101L, "John Smith","Bank#1", 1, 100);
        account001.display();

        //toString
        System.out.println(account001);

        BankAccount account002 = new BankAccount(102, "Pierce Brosnan", "Bank#1", 1);
        account002.display();

        BankAccount account003 = new BankAccount(103, "Bank#1", 1, 1000000);
        account003.display(); // null - это пустая ссылка, никуда не ведет

        account002.deposit(150);
        account002.display();

        System.out.println("-----------------------------");

        account003.withdraw(500);
        account003.display();

        account001.withdraw(200);
        account001.display();


    }//end of main

}//end of class
