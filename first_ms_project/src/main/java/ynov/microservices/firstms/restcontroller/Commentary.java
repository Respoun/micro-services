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

import ms.project.first_ms_project.model.Commentary;
import ms.project.first_ms_project.repositories.CommentaryRepository;

@RestController
public class CommentaryController {

	@Autowired
	private CommentaryRepository commentaryRepository;
	
	@GetMapping(value = "/commentary/{id}")
	public Optional<Commentary> getCommentary(@PathVariable Long id) {
		return commentaryRepository.findById(id);
	}
	
	@GetMapping(value = "/commentarys")
	public List<Commentary> getCommentarys() {
		System.out.println("trace getCommentarys");
		List<Commentary> commentarys = new ArrayList<Commentary>(); 
		commentaryRepository.findAll().forEach(commentarys::add);
		return commentarys;
	}
	
	@PostMapping(value = "/add") 
	public void addCommentary(@RequestBody Commentary u) {
		commentaryRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateCommentary(@RequestBody Commentary u) {
		commentaryRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteCommentary(@RequestBody Commentary u) {
		commentaryRepository.delete(u);
	}	
 	
}
