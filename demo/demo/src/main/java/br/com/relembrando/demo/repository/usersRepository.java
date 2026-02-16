package br.com.relembrando.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.relembrando.demo.models.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<Users,Long> {
}
