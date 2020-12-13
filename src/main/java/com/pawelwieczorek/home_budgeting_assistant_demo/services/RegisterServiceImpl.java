package com.pawelwieczorek.home_budgeting_assistant_demo.services;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.RechargeModel;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.TransferModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class RegisterServiceImpl implements RegisterService {

    private RegisterRepository repo;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public RegisterServiceImpl(RegisterRepository repo, EntityManager em) {
        this.repo = repo;
        this.em = em;
    }

    @Override
    public List<Register> getBalance() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public void recharge(RechargeModel model) {

        Register reg = repo.findByName(model.getRegisterName());
        if(reg != null) {
            reg.setBalance(reg.getBalance() + model.getAmount());
        }
    }

    @Override
    @Transactional
    public void transfer(TransferModel model) {

    }
}
