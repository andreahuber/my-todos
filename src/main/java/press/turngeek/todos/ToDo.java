package press.turngeek.todos;

import java.util.Date;

public class ToDo {
	
	private String description;
	private Date created;
	private int priority;

	public ToDo() {

	}

	public ToDo(String description, String created, int priority) {
		this.description = description;
		this.created = new Date(created);
		this.priority = priority;
	}

	public ToDo(String description, Date created, int priority) {
		this.description = description;
		this.created = created;
		this.priority = priority;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
