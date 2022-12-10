/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.backend;

/**
 *
 * @author prasa
 */
public class SystemConfig {
    public static OperatingSystem configure(){
        OperatingSystem os = OperatingSystem.getOs();
        return os;
    }
}
