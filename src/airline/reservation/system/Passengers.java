/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

/**
 *
 * @author Dasuni
 */
public class Passengers {

    private String title;
    private String firstName;
    private String lastName;
    private String nic;
    private String nation;
    private String address;
    private String email;
    private String gender;
    private int ticketnum;

    public Passengers(String title, String firstName, String lastName, String nic, String nation, String address, String email, int ticketnum, String gender) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.nation = nation;
        this.address = address;
        this.email = email;
        this.ticketnum = ticketnum;
        this.gender = gender;
    }

    public Passengers() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getTicketnum(){
        return this.ticketnum;
    }
    
    public void setTicketnum(){
        this.ticketnum = (int) ((Math.random() * (0.99999 - 0.10000) + 0.1) * 10e+4);
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
