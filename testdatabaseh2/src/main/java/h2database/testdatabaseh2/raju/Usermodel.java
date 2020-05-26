package h2database.testdatabaseh2.raju;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usermodel {

	
	private int id;
	@Id
	private String name;
	private String course;
	private int cost;
	private int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Usermodel [id=" + id + ", name=" + name + ", course=" + course + ", cost=" + cost + ", duration="
				+ duration + "]";
	}
	public Usermodel() {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.cost = cost;
		this.duration = duration;
	}
	
	
		

	

}
