/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.backend;

/**
 *
 * @author manavmalavia
 */
public class SytemConfig {
    public static OperatingSystem configure(){
        OperatingSystem os = OperatingSystem.getInstance();
        return os;
    }
}
