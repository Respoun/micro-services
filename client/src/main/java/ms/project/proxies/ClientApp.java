package ms.project.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ms.project.model.Article;
import ms.project.model.Author;
import ms.project.model.Commentary;

@FeignClient(name = "ms")
@RibbonClient(name= "ms")
public interface ClientApp {

	@GetMapping(value = "/authors")
	List<Author> getAuthor();
	
	@GetMapping( value = "/author/{id}")
	Optional<Author> getAuthor(@PathVariable("id") Long id);
	
	@GetMapping(value = "/articles")
	List<Article> getArticles();
	
	@GetMapping( value = "/article/{id}")
	Optional<Article> getArticle(@PathVariable("id") Long id);
	
	@GetMapping(value = "/commentarys")
	List<Commentary> getCommentary();
	
	@GetMapping( value = "/commentary/{id}")
	Optional<Commentary> getCommentary(@PathVariable("id") Long id);
	}
