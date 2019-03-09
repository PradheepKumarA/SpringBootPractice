package com.pk.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Course
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@Entity
public class Course {
    @Id
    private String id;
    private String courseName;
    private String courseContent;

    public Course(String id, String courseName, String courseContent) {
        this.id = id;
        this.courseName = courseName;
        this.courseContent = courseContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }
}
