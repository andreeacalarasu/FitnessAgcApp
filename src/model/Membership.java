package model;

import java.util.Date;
import java.util.List;

public class Membership {
    private String code;
    private String description;
    private double price;
    private Date registrationDate;
    private Date startDate;
    private MembershipType membershipType;
    private Client client;
    private List<GymClass> gymClassList;

    public Membership(String code, String description,
                      double price,  Date registrationDate, Date startDate, MembershipType membershipType,
                      Client client,List<GymClass> gymClassList){
        this.code = code;
        this.description = description;
        this.price = price;
        this.registrationDate = registrationDate;
        this.startDate = startDate;
        this.membershipType = membershipType;
        this.client = client;
        this.gymClassList = gymClassList;

    }
    public String getCode(){return code;}
    public String getDescription(){return description;}
    public double getPrice(){return  price;}
    public Date getRegistrationDate(){return registrationDate;}
    public Date getStartDate(){return startDate;}
    public MembershipType getMembershipType(){return membershipType;}
    public Client getClient(){return client;}
    private List<GymClass> getGymClassList(){return gymClassList;}

    public void setCode(String code) {this.code = code;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice(double price) {this.price = price;}
    public void setRegistrationDate(Date registrationDate) {this.registrationDate = registrationDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
    public void setMembershipType(MembershipType membershipType) {this.membershipType = membershipType;}
    public void setClient(Client client) {this.client = client;}
    public void setGymClassList(List<GymClass> gymClassList) {this.gymClassList = gymClassList;}

    @Override
    public int hashCode(){
        int prime = 31;
        int result = prime * code.hashCode();
        return result;
     }

     @Override
    public boolean equals(Object o){
        Membership membership = (Membership) o;
        if(code.equals(membership.getCode())){return true;}
        else {return false;}
     }
    @Override
    public String toString(){
        return "Code number : " + code + ", Membership description : " + description + ", Price : "+ price +
                ", Registration Date : " + registrationDate + ", Start date : " + startDate+", Membership Type : " +
                membershipType + ", Client : " + client + ", GymClass List : " + gymClassList;
    }
}
