package model;

public class Client {
    private int id;
    private String cnp;
    private String firstName;
    private String lastName;
    private String mobile;
    private String address;

    public Client(int id, String cnp, String firstName, String lastName,
                  String mobile, String address) {
        this.id = id;
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getCnp() {
        return cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime * cnp.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        if (id == client.getId()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ID number : " + id + ", CNP : " + cnp + ", First Name : " + firstName +
                ", Last Name : " + lastName + ", Mobile : " + mobile + ", Address : " +
                address + "\n";
    }

}
