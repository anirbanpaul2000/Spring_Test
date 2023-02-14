package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList<Course>();
//		list.add(new Course(100,"Java Core","Detailed explaination of basics of Java"));
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		for(Course c:list) {
//			if(c.getId()==courseId) {
//				return c;
//			}
//		}
//		return null;
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	
	public Course updateCourse(Course course) {
//		list.forEach(e-> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescr(course.getDescr());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		
		Course entity=courseDao.findById(courseId).get();
		courseDao.delete(entity);
	}
	
//	@Override
//	public void deleteCourse(long courseId) {
//		list.remove(courseId);
//	}

}
