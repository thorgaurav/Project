/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.*;

/**
 *
 * @author varun
 */
public class SystemAdminRole extends Role {
    
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem ecosystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        
    }
}
