/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class DoctorDirectory {

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
     private ArrayList<Doctor> doctorList;

    public DoctorDirectory(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

}
