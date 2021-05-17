package manager;

import model.Client;
import model.CustomizedMembership;
import model.Membership;
import model.MembershipType;

import java.util.*;

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
        List<Membership> resultListOfMembershipByMembershipType = new ArrayList<>();
        for(Membership membership:membershipList){
            if(membership.getMembershipType().equals(givenMembershipType)){
                resultListOfMembershipByMembershipType.add(membership);
            }
        }
        return resultListOfMembershipByMembershipType;
    }

    public Map<Integer, List<String>> extractMembershipByClientId(List<Client> clientList, List<Membership> membershipList) {
        Map<Integer, List<String>> resultMembershipByClientId = new HashMap<>();
        for(Client client:clientList) {
            List<String> membershipCodeList = new ArrayList<>();
            for (Membership membership : membershipList) {
                if (client.getId()==membership.getClientID() ){
                    membershipCodeList.add(membership.getCode());
                }
                resultMembershipByClientId.put(client.getId(), membershipCodeList);
            }
        }
        return resultMembershipByClientId;
    }

    public void applyDiscountToCustomizedMembership(List<Membership> membershipList, String givenMembershipCode){

        for(Membership membership: membershipList){
            if(membership.getCode().equals(givenMembershipCode)){
               CustomizedMembership customizedMembership1 = (CustomizedMembership) membership;
               customizedMembership1.applyDiscount(20);
            }
        }
    }
}
