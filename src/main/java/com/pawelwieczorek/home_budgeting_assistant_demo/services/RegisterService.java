package com.pawelwieczorek.home_budgeting_assistant_demo.services;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.RechargeModel;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.TransferModel;

import java.util.List;

public interface RegisterService {

    List<Register> getBalance();
    void recharge(RechargeModel model);
    void transfer(TransferModel model);
}
