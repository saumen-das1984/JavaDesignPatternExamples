package dao.design.pattern.edureka.module1;

public class Course {

	private String courseName;
	private String courseId;
	private int price;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Course(String courseName, String courseId, int price) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
