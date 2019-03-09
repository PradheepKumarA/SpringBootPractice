package com.pk.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseService
 *
 * @author PradheepKumarA
 * @date 2019-03-09
 */
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllList() {
        List<Course> list = new ArrayList<Course>();
        courseRepository.findAll().forEach(course -> list.add(course));
        return list;
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).get();
    }

    public void createCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course, String id) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
