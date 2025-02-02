package com.studentcoursemaker.coursemaker;

public class Course {
    private String courseType;
    private String courseTime;
    private int sectionNum;
    private String labCode;
    private String labTime;
    private String courseCode;
    private String facultyName;
    private int capacity;


    public Course(String courseType, String courseTime, int sectionNum, String courseCode, String facultyName, int capacity) {
        this.courseType = courseType;
        this.courseTime = courseTime;
        this.sectionNum = sectionNum;
        this.courseCode = courseCode;
        this.facultyName = facultyName;
        this.capacity = capacity;
    }

    public Course(String courseType, String courseTime, int sectionNum, String labCode, String labTime, String courseCode, String facultyName, int capacity) {
        this.courseType = courseType;
        this.courseTime = courseTime;
        this.sectionNum = sectionNum;
        this.labCode = labCode;
        this.labTime = labTime;
        this.courseCode = courseCode;
        this.facultyName = facultyName;
        this.capacity = capacity;

    }


    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public int getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabTime() {
        return labTime;
    }

    public void setLabTime(String labTime) {
        this.labTime = labTime;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseType='" + courseType + '\n' +
                ", courseTime='" + courseTime + '\n' +
                ", sectionNum=" + sectionNum +
                ", labCode='" + labCode + '\n' +
                ", labTime='" + labTime + '\n' +
                ", courseCode='" + courseCode + '\n' +
                ", facultyName='" + facultyName + '\n' +
                ", capacity=" + capacity +
                '}';
    }
}
