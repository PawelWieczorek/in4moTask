package com.pawelwieczorek.home_budgeting_assistant_demo.pojo;

public class RechargeModel {

    private String registerName;
    private int amount;

    public RechargeModel() {
    }

    public RechargeModel(String registerName, int amount) {
        this.registerName = registerName;
        this.amount = amount;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
