package model;

import java.util.Date;
import java.util.List;

public class CustomizedMembership extends Membership {
    private Trainer trainer;
    private int noOfPrivateHours;
    private GymLocation location;

    public CustomizedMembership(String code, String description,
                                double price, Activity activity, Date registrationDate, Date startDate, MembershipType membershipType,
                                Client client, List<GymClass> gymClassList, Trainer trainer, int noOfPrivateHours, GymLocation location) {
        super(code, description, price, activity, registrationDate, startDate, membershipType, client, gymClassList);
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
}