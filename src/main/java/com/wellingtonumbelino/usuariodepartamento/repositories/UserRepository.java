package com.wellingtonumbelino.usuariodepartamento.repositories;

import com.wellingtonumbelino.usuariodepartamento.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
