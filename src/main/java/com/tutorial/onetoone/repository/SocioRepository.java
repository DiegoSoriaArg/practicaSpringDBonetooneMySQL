package com.tutorial.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.onetoone.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer> {

}
