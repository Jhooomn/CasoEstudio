package com.cava.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cava.web.domain.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
	boolean existsByNroDocumento(String nroDocumento);
	Vendedor findByCorreo(String correo);
}