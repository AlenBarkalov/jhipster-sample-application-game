package ru.alenbarkalov.game.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import ru.alenbarkalov.game.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
