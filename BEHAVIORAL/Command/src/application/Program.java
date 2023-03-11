package application;

import entities.Account;
import entities.Command;
import ulti.Action;

public class Program {
    public static void main(String[] args) {
        Command command = new Command(0.0);
        Account account1 = new Account(Action.DEPSITO, 100.00);
        command.process(account1);
        System.out.println(String.format("%,.2f", command.getBalance()) + "\n" + account1.getSuccess());
        
        Account account2 = new Account(Action.WITHDRAW, 50.0);
        command.process(account2);
        
        System.out.println(String.format("%,.2f", command.getBalance()) + "\n" + account2.getSuccess());
        
        account2.setAmount(150.00);
        command.process(account2);
        
        System.out.println(String.format("%,.2f", command.getBalance()) + "\n" + account2.getSuccess());

        

    }
    
}
