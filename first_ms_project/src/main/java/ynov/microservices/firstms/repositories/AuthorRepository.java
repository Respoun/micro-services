package ms.project.first_ms_project.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ms.project.first_ms_project.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{
	
	public Author findByUsername(String username);
	
	public Optional<Author> findByUsernameAndPassword(String username, String password);
	
}
