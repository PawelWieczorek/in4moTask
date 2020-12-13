package com.pawelwieczorek.home_budgeting_assistant_demo.services;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import com.pawelwieczorek.home_budgeting_assistant_demo.pojo.RechargeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

    Register findByName(String name);
}
