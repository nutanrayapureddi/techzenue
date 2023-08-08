/**
 * program about College App For hostellers Details
 * @author Nutan
 * @since Day 6
 */
package com.techzenure.day6;

class Hosteller extends StudentDetails {
    private String hostelName;
    private int roomNumber;

    public Hosteller(int studentId, String name, int departmentId, String gender, String phone,
                     String hostelName, int roomNumber) {
        super(studentId, name, departmentId, gender, phone);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}