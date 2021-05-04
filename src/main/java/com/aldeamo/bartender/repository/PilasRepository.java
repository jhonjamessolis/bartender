package com.aldeamo.bartender.repository;

import com.aldeamo.bartender.dto.Pila;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PilasRepository extends JpaRepository<Pila, Integer> {

    @Override
    Optional<Pila> findById(Integer integer);
}