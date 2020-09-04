package dao.design.pattern.edureka.module1;

public class DAOTest {

	public static void main(String args[]){
		
		Course course=new Course("Linux Administrator","LP1",18000);
		CourseDAO oracleDAO=new OracleDBCourseDAO();
		oracleDAO.addCourse(course);
		
		CourseDAO xmlDAO=new XMLFilePersistenceCourseDAO();
		xmlDAO.addCourse(course);
		
		CourseDAO excelDAO=new ExcelFilePersistenceCourseDAO();
		excelDAO.addCourse(course);
	}
	
}
