package model;

public class Trainer {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private double pricePerHour;

    public Trainer(int id, String name, String email, String mobile, double pricePerHour) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.pricePerHour = pricePerHour;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getMobile() {return mobile;}
    public double getPricePerHour() {return pricePerHour;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setMobile(String mobile) {this.mobile = mobile;}
    public void setPricePerHour(double pricePerHour) {this.pricePerHour = pricePerHour;}

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime * id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Trainer trainer = (Trainer) o;
        if (id == trainer.getId()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ID number : " + id + ", Trainer name : " + name + ", Email : " + email +
                ", Mobile : " + mobile + ", Price per hour : " + pricePerHour;
    }
}
