package com.pawelwieczorek.home_budgeting_assistant_demo.pojo;

public class TransferModel {

    private String sourceRegisterName;
    private String destinationRegisterName;
    private int amount;

    public TransferModel() {
    }

    public TransferModel(String sourceRegisterName, String destinationRegisterName, int amount) {
        this.sourceRegisterName = sourceRegisterName;
        this.destinationRegisterName = destinationRegisterName;
        this.amount = amount;
    }

    public String getSourceRegisterName() {
        return sourceRegisterName;
    }

    public void setSourceRegisterName(String sourceRegisterName) {
        this.sourceRegisterName = sourceRegisterName;
    }

    public String getDestinationRegisterName() {
        return destinationRegisterName;
    }

    public void setDestinationRegisterName(String destinationRegisterName) {
        this.destinationRegisterName = destinationRegisterName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
