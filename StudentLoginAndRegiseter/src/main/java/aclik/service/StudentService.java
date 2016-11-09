package aclik.service;

import java.util.List;

import aclik.model.Student;

public interface StudentService {
	
	public Student getStudById(Integer studId);
	
	public Student selectByStudNameAndStudPwd(String studName,String password);
	
	public Student selectStudByStudId(String studId);
	
	public int insertNewStudent(Student student);
}
