package model;

import java.util.Date;
import java.util.List;

public class CustomizedMembership extends Membership implements Discountable {
    private Trainer trainer;
    private int noOfPrivateHours;
    private GymLocation location;

    public CustomizedMembership(String code, String description,double price, Activity activity, Date registrationDate,
                                Date startDate, MembershipType membershipType, int clientID, List<GymClass> gymClassList,
                                Trainer trainer, int noOfPrivateHours, GymLocation location) {
        super(code, description, price, registrationDate, startDate, membershipType, clientID, gymClassList);
        this.trainer = trainer;
        this.noOfPrivateHours = noOfPrivateHours;
        this.location = location;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public int getNoOfPrivateHours() {
        return noOfPrivateHours;
    }

    public GymLocation getLocation() {
        return location;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setNoOfPrivateHours(int noOfPrivateHours) {
        this.noOfPrivateHours = noOfPrivateHours;
    }

    public void setLocation(GymLocation location) {
        this.location = location;
    }

    @Override
    public double getPrice(){
        double basicPrice = getPrice();
        double pricePerHour = trainer.getPricePerHour();
        double privateHoursPrice = noOfPrivateHours*pricePerHour;
        double totalPrice = basicPrice+privateHoursPrice;
        return totalPrice;
    }
    @Override
    public void applyDiscount(int percent){
        double newPrice;
        double actualPrice =getPrice();
        newPrice = actualPrice - (actualPrice*percent/100);
        setPrice(newPrice);

    }
}