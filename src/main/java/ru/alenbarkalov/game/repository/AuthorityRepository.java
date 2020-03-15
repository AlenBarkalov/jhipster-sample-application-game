package ru.alenbarkalov.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alenbarkalov.game.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
