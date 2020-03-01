package ms.project.model;

import java.sql.Date;

public class Article {

	private Long id;
	private String category;
	private Date date;
	private String author;
	private Long content;
	private Long commentary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String category() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Long getcontent() {
		return content;
	}
	public void setcontent(Long content) {
		this.content = content;
	}
	
	public Long getCommentary() {
		return commentary;
	}
	public void setAuthor(Long commentary) {
		this.commentary = commentary;
	}
	
}