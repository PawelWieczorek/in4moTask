package com.pawelwieczorek.home_budgeting_assistant_demo.services;

import com.pawelwieczorek.home_budgeting_assistant_demo.entities.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

    Register findByName(String name);
}
