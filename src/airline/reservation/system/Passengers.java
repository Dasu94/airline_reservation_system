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

    public Passengers(String title, String firstName, String lastName, String nic, String nation, String address, String email) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.nation = nation;
        this.address = address;
        this.email = email;
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
}
