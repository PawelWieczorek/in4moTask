package com.pawelwieczorek.home_budgeting_assistant_demo.services;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.RechargeModel;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.TransferModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Component
public class RegisterServiceImpl implements RegisterService {

    private RegisterRepository repo;

    @Autowired
    public RegisterServiceImpl(RegisterRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Register> getBalance() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public void recharge(RechargeModel model) {

        if (model.getAmount() > 0) {
            Register reg = repo.findByName(model.getRegisterName());

            if (reg != null) {
                reg.setBalance(reg.getBalance() + model.getAmount());
            }
        }
    }

    @Override
    @Transactional
    public void transfer(TransferModel model) {

        if (model.getAmount() > 0) {
            Register srcReg = repo.findByName(model.getSourceRegisterName());
            Register destReg = repo.findByName(model.getDestinationRegisterName());

            if (null != srcReg && null != destReg) {
                int srcBalance = srcReg.getBalance();

                if (srcBalance >= model.getAmount()) {
                    srcReg.setBalance(srcBalance - model.getAmount());
                    destReg.setBalance(destReg.getBalance() + model.getAmount());
                }
            }
        }
    }
}
