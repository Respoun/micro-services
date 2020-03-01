package ms.project.first_ms_project.restcontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ms.project.first_ms_project.model.Author;
import ms.project.first_ms_project.repositories.AuthorRepository;

@RestController
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;
	
	@GetMapping(value = "/author/{id}")
	public Optional<Author> getAuthor(@PathVariable Long id) {
		return authorRepository.findById(id);
	}
	
	@GetMapping(value = "/authors")
	public List<Author> getAuthors() {
		System.out.println("trace getAuthors");
		List<Author> authors = new ArrayList<Author>(); 
		authorRepository.findAll().forEach(authors::add);
		return authors;
	}
	
	@PostMapping(value = "/add") 
	public void addAuthor(@RequestBody Author u) {
		authorRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateAuthor(@RequestBody Author u) {
		authorRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteAuthor(@RequestBody Author u) {
		authorRepository.delete(u);
	}	
	

}
