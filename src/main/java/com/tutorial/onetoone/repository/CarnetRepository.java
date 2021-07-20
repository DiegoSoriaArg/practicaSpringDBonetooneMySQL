package com.tutorial.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.onetoone.entity.Carnet;

@Repository
public interface CarnetRepository extends JpaRepository<Carnet, Integer>{

}
