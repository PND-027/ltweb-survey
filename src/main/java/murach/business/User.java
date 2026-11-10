package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    
    private String dob;
    private String heardFrom;
    private String announcements;
    private String contactVia;



    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDob() { 
        return dob; 
    }
    
    public void setDob(String dob) { 
        this.dob = dob; 
    }
    
    public String getHeardFrom() { 
        return heardFrom; 
    }
    
    public void setHeardFrom(String heardFrom) { 
        this.heardFrom = heardFrom; 
    }
    
    public String getAnnouncements() { 
        return announcements; 
    }
    
    public void setAnnouncements(String announcements) { 
        this.announcements = announcements; 
    }
    
    public String getContactVia() { 
        return contactVia; 
    }
    
    public void setContactVia(String contactVia) { 
        this.contactVia = contactVia; 
    }
}
