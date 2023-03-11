package entities;

import ulti.Action;

public class Command {

    private Double balance;

    public Command(Double balance) {
        if (balance != 0.0) {
            this.balance = balance;
        }else {
            this.balance = 0.0;
        }
        
    }

    public void process(Account account) {
        Action action = account.getAction();
        if (action == Action.DEPSITO) {
            this.balance += account.getAmount();
            account.setSuccess(true);
        } else if (action == Action.WITHDRAW && account.getAmount() <= this.balance) {
            this.balance -= account.getAmount();
            account.setSuccess(true);
        } else {
            account.setSuccess(false);
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
