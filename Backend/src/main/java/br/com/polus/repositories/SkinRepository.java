package br.com.polus.repositories;

import br.com.polus.models.Skin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkinRepository extends JpaRepository<Skin, Long> {

}
