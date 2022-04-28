package br.com.fiap.login.login85311.repository;

import br.com.fiap.login.login85311.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>  {
}
