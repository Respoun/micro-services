package ms.project.model;

import java.sql.Date;


public class Commentary {

	private Date date;
	private Long author;
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
