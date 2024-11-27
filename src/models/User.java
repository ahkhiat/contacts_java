package models;

public class User {

    private String lastname;
    private String firstname;
    private String phone;

    public User(String firstname, String lastname, String phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        String capitalizedFirstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
        return  "-> " + capitalizedFirstname + " " + lastname.toUpperCase() + " : " + phone;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

}
