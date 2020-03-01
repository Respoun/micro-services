package ms.project.first_ms_project.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ms.project.first_ms_project.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>{
	
	
	
}
