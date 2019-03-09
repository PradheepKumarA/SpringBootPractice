package com.pk.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CourseController
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllList();
    }

    @RequestMapping("/courses/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void createCourse(@PathVariable Course course) {
        courseService.createCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void updateCourse(@PathVariable Course course, @PathVariable String id) {
        courseService.updateCourse(course, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}
