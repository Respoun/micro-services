package ms.project.first_ms_project.model;

import java.sql.Date;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;

	@Column(name="category")
	private String category;

	@Column(name="date")
	private Date date;

	@Column(name="author")
	private String author;

	@Column(name="content")
	private Long content;

	@Column(name="commentary")
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