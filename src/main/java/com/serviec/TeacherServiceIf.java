package com.serviec;

/**
 * @author gousheng
 * @date ${Date}- 11:09
 */

import com.pojo.Teacher;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**该接口功能有
 * 新增教师
 * 移除教师
 * 教师所带班级
 * 查询全部教师
 * 教师教授科目名称
 * 教师个人资料更改
 * */
//教师业务接口
@Mapper
public interface TeacherServiceIf {

    //新增教师
    @Insert("insert into teacher (name,sex,age,phone,politics,home_site) values(#{name},#{sex},#{age},#{phone},#{politics},#{home_site})")
    void addTeacher(Teacher teacher);
    //根据名字移除教师
    @Delete("delete from teacher where name=#{name}")
    void removeTeacher(String name);
    //教师所带班级
    @Select("select class_grade.name from teacher,class_grade where class_grade.teacher_id=teacher.id")
    List<Class_grade> referTeachergrade();
    //查询全部教师
    @Select("select * from teacher")
    List<Teacher> referTeacher();
    //教师教授科目名称
    @Update("update subject set subject_name=#{subName} where teacher_id=(select id from teacher where name=#{TeacherName})")
    void updateTeacherSubName(@Param("TeacherName")String TName,@Param("subName")String sName);
    //教师个人资料更改
    @Update("update teacher set home_site=#{home_site},politics=#{politics},phone=#{phone}")
    void updateTeacher(Teacher teacher);


}
