/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

/**
 *
 * @author florm
 */
public class CustomerDetailsC {
    private String FirstName, LastName, Mobile, Email;
    private int Room;
    
    public CustomerDetailsC(){
        
        FirstName = new String();
        LastName = new String();
        Mobile = new String();
        Email = new String();
        
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getRoom() {
        return Room;
    }

    public void setRoom(int Room) {
        this.Room = Room;
    }

   
 
    
    
}
