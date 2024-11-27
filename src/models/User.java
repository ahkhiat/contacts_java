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
        return "Nom : " + lastname + ", Prénom : " + firstname + ", Téléphone : " + phone;
    }

    public String getLastname() {
        return lastname;
    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }



}
