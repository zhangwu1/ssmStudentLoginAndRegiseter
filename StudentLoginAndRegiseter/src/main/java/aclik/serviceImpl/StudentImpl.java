package aclik.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aclik.dao.StudentMapper;
import aclik.model.Student;
import aclik.service.StudentService;


@Service("studentService")
public class StudentImpl implements StudentService {
	
	private StudentMapper studentMapper;
	
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}
	
	@Autowired
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	public Student getStudById(Integer studId) {
		return studentMapper.selectByPrimaryKey(studId);
	}

	public Student selectByStudNameAndStudPwd(String studName, String password) {
		return studentMapper.selectByStudNamAndStudPwd(studName, password);
	}

	public Student selectStudByStudId(String studId) {
		return studentMapper.selectStudByStudId(studId);
	}

	public int insertNewStudent(Student student) {
		return studentMapper.insert(student);
	}

}
