package manager;

import model.Membership;
import model.MembershipType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MembershipManager {
    public void updateRegistrationDateOfMembership(List<Membership> membershipList, Date newRegistrationDate ){
        for(Membership membership:membershipList){
            if(membership.getRegistrationDate() == newRegistrationDate){
                membership.setRegistrationDate(newRegistrationDate);
            }
        }
    }
    public boolean searchMembershipCheaperThanGivenValue(List<Membership> membershipList, double givenMembershipValue){
        boolean foundedMembership = false;
        for(Membership membership:membershipList){
            if(membership.getPrice() < givenMembershipValue){
                foundedMembership = true;
            }
        }
        return foundedMembership;
    }
    public List<Membership> filterListOfMembershipsBetweenGivenValues(List<Membership> membershipList, double minimumPrice, double maximumPrice){
        List<Membership> resultListOfMembershipsBetweenGivenValues = new ArrayList<>();
        for(Membership membership:membershipList){
            if(membership.getPrice()>minimumPrice && membership.getPrice()<maximumPrice){
                resultListOfMembershipsBetweenGivenValues.add(membership);
            }
        }
        return resultListOfMembershipsBetweenGivenValues;
    }
    public List<Membership> filterListOfMembershipWithFutureStartDate(List<Membership> membershipList, Date givenDate){
        List<Membership> resultListOfMembershipWithFutureStartDate = new ArrayList<>();
        for(Membership membership:membershipList){
            if(membership.getStartDate().after(givenDate)){
                resultListOfMembershipWithFutureStartDate.add(membership);
            }
        }
        return resultListOfMembershipWithFutureStartDate;
    }
    public List<Membership> filterListOfMembershipByMembershipType(List<Membership> membershipList, MembershipType givenMembershipType){
        List<model.Membership> resultListOfMembershipByMembershipType = new ArrayList<>();
        for(model.Membership membership:membershipList){
            if(membership.getMembershipType().equals(givenMembershipType)){
                resultListOfMembershipByMembershipType.add(membership);
            }
        }
        return resultListOfMembershipByMembershipType;
    }

}
