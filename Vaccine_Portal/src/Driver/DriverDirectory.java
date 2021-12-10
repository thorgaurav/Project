/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Driver;

import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class DriverDirectory {

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }

    public DriverDirectory(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    private ArrayList<Driver> driverList;
}
