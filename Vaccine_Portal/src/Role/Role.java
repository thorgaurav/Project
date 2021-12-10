/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author varun
 */
public abstract class Role {
    public enum RoleType{
        FactoryAdmin("FactoryAdmin"),
            GovernmentAdmin("GovernmentAdmin"),
            VaccineCenterAdmin("VaccineCenterAdmin"),
        Person("Person"),
        Driver("Driver"),
        PortalAdmin("PortalAdmin"),
    Doctor("Doctor");
    
    private RoleType(String value){
            this.value = value;
        }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    private String value;
    
    }    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business);
}
