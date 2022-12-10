/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.backend;

/**
 *
 * @author pho3nix28
 */
public class SystemConfig {
    
    public static OperatingSystem configure(){
        OperatingSystem os = OperatingSystem.getInstance();
        return os;
    }
    
}
