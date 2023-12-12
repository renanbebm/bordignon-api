package br.com.construcasabordignon.bordignonapis.domain.repository;

import br.com.construcasabordignon.bordignonapis.domain.entity.BorCfxClientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorCfxClientesRepository extends JpaRepository<BorCfxClientes, Integer> {
}