package press.turngeek.todos;

import java.util.Date;

public class ToDo {
	
	private String description;
	private Date created;
	private String priority;

	public ToDo() {

	}

	public ToDo(String description, String created, String priority) {
		this.description = description;
		this.created = new Date(created);
		this.priority = priority;
	}

	public ToDo(String description, Date created, String priority) {
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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
}
