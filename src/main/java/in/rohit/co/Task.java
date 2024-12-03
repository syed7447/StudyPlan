package in.rohit.co;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Task {
	private String description;
    private String subject;
    private String date;
    private String dueDate;
    private String color;
    private int hours;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String getDescription() {
		return description;
	}
	public String getSubject() {
		return subject;
	}
	public String getDate() {
		return date;
	}
	public String getDueDate() {
		return dueDate;
	}
	public String getColor() {
		return color;
	}
	public int getHours() {
		return hours;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

    // Getters and setters
}
