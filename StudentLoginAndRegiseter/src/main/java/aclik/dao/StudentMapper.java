package aclik.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import aclik.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    @Select("SELECT * FROM tb_stud where studId = #{studId} and studPwd = #{studPwd}")
    Student selectByStudNamAndStudPwd(@Param("studId") String studId,@Param("studPwd")String studPwd);
    
    @Select("SELECT * FROM tb_stud where studId = #{studId}")
    Student selectStudByStudId(@Param("studId")String studId);
}