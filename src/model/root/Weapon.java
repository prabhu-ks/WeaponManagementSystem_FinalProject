/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

/**
 *
 * @author manavmalavia
 */
public class Weapon {
    private String name;
    private long id;
    private String type;
    private long price;
    private boolean approval;

    public Weapon(String name, long id, String type, long price, boolean approval) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.price = price;
        this.approval = approval;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
    
    
}
