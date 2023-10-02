package com.satc.satcloja.repository;

import com.satc.satcloja.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
