package com.pawelwieczorek.home_budgeting_assistant_demo.controller;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.RechargeModel;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.TransferModel;
import com.pawelwieczorek.home_budgeting_assistant_demo.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private RegisterService service;

    @Autowired
    public MainController(RegisterService service) {
        this.service = service;
    }

    @GetMapping("/balance")
    List<Register> getBalance() {
        return service.getBalance();
    }

    @PostMapping(path = "/recharge", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    RechargeModel recharge(@RequestBody RechargeModel model) {
        service.recharge(model);
        return model;
    }

    @PostMapping(path = "/transfer", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    TransferModel transfer(@RequestBody TransferModel model) {
        service.transfer(model);
        return model;
    }
}
