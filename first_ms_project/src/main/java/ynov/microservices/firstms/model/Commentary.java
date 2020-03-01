package ms.project.first_ms_project.model;

import java.sql.Date;

@Entity
public class Commentary {

	@Column(name="date")
	private Date date;

	@Column(name="author")
	private Long author;

	@Column(name="text")
	private Long text;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Long getAuthor() {
		return author;
	}
	public void setAuthor(Long author) {
		this.author = author;
	}
	
	public Long getText() {
		return text;
	}
	public void setText(Long text) {
		this.text = text;
	}

	
}
