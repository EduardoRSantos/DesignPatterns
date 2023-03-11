package entities;

import ulti.Action;

public class Account {
    private Action action;
    private Double amount;
    private boolean success;

    public Account(Action action, Double amount) {
        this.action = action;
        this.amount = amount;
        this.success = false;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
}
