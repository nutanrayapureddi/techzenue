/**
 * program about College App For hostellers Details
 * @author Nutan
 * @since Day 6
 */
package com.techzenure.day6;

public class StudentDetails {
	protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    public StudentDetails(int studentId, String name, int departmentId, String gender, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



