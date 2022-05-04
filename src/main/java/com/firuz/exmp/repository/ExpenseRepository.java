package com.firuz.exmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firuz.exmp.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
