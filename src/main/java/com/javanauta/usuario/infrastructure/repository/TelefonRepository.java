package com.javanauta.usuario.infrastructure.repository;

import com.brunaneves.aprendendospring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonRepository extends JpaRepository<Telefone, Long> {
}
