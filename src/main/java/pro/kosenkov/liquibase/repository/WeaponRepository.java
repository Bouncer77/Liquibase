package pro.kosenkov.liquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.kosenkov.liquibase.entity.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}
