package com.algaworks.gestaofesta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.gestaofesta.model.Convidado;

public interface ConvidadoDAO extends JpaRepository<Convidado, Long> {}