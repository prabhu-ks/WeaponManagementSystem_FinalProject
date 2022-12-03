/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import model.root.Enterprise;
import model.root.Enterprise.EnterpriseType;

/**
 *
 * @author manavmalavia
 */
public class Dealer extends Enterprise{
    public Dealer(){
        this.setEnterpriseType(EnterpriseType.Dealer);
    }
    
}
