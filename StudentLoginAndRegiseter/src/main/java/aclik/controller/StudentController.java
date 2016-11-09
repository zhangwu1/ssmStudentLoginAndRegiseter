package aclik.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aclik.model.Student;
import aclik.service.StudentService;

@Controller
@RequestMapping("/studentController")
public class StudentController {

	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/login")
	public String studLogin() {
		return "showStudent";
	}

	/**
	 * 
	 * @param name
	 *            ajax异步传的用户名数据
	 * @param password
	 *            ajax异步传的密码
	 * @param response
	 */
	@RequestMapping("/showStudent")
	@ResponseBody
	public void showStudent(String name, String password,
			HttpServletResponse response) {

		Student student = studentService.selectByStudNameAndStudPwd(name,
				password);
		String studentId = "";
		if (student != null) {
			studentId = student.getStudid();
		}
		try {
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(studentId);// 登录成功,将学号返回至Ajax
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param studentId
	 * @param model
	 * @return
	 */
	@RequestMapping("/loginSuccess")
	public String loginSuccess(String studentId, Model model) {

		// 通过Ajax传过来的学号进行查询学生信息
		Student student = studentService.selectStudByStudId(studentId);
		model.addAttribute("student", student);
		return "loginSuccess";
	}

	@RequestMapping("/registerNewStudent")
	public String registerNewStudent() {
		return "registerNewStudent";
	}

	@RequestMapping("saveRegisterStudInfo")
	@ResponseBody
	public void saveRegisterStudInfo(
			@RequestParam(value = "studArra[]") String[] studArra,
			HttpServletResponse response) {
		Student student = new Student();
		student.setStudid(studArra[0]);
		student.setStudname(studArra[1]);
		student.setStudpwd(studArra[2]);
		student.setStudplace(studArra[3]);
		student.setStudphone(studArra[4]);
		String studSex = studArra[5];
		if ("m".equals(studSex)) {
			student.setStudsex("男");
		} else {
			student.setStudsex("女");
		}
		int result = studentService.insertNewStudent(student);
		System.out.println(result);
		try {
			response.setCharacterEncoding("UTF-8");
			if (result > 0) {
				response.getWriter().write("注册成功");
			} else {
				response.getWriter().write("注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
