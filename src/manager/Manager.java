package manager;

import model.*;

import java.util.*;

public class Manager {

    public void updatePricePerHourByTrainer(List<Trainer> trainerList, double newPricePerHourByTrainer) {
        for (Trainer trainer : trainerList) {
            if (trainer.getPricePerHour() == newPricePerHourByTrainer) {
                trainer.setPricePerHour(newPricePerHourByTrainer);
            }
        }
    }

    public void updateTrainerID(List<Trainer> trainerList, int newTrainerID) {
        for (Trainer trainer : trainerList) {
            if (trainer.getId() == newTrainerID) {
                trainer.setId(newTrainerID);
            }
        }
    }

    public Trainer findTrainerById(List<Trainer> trainerList, int idToLookFor) {
        Trainer trainer = null;
        for (Trainer trainer1 : trainerList) {
            if (trainer1.getId() == idToLookFor) {
                trainer = trainer1;
            }
        }
        return trainer;
    }

    public boolean searchTrainerByCheaperPricePerHourThanGivenValue(List<Trainer> trainerList, double givenPricePerHour) {
        boolean foundedTrainer = false;
        for (Trainer trainer : trainerList) {
            if (trainer.getPricePerHour() < givenPricePerHour) {
                foundedTrainer = true;
            }
        }
        return foundedTrainer;
    }

    public List<GymClass> filterListOfGymClassOfGivenTrainerByLocation(List<GymClass> gymClassList, int trainerID, GymLocation givenLocation) {
        List<GymClass> resultListOfGymClassOfGivenTrainerByLocation = new ArrayList<>();
        for (GymClass gymClass : gymClassList) {
            if (gymClass.getLocation() == givenLocation && trainerID == gymClass.getTrainerID()) {
                resultListOfGymClassOfGivenTrainerByLocation.add(gymClass);
            }
        }
        return resultListOfGymClassOfGivenTrainerByLocation;
    }

    public List<GymClass> filterListOfGymClassByTrainer(List<GymClass> gymClassList, int givenTrainerID) {
        List<GymClass> resultListOfGymClassByTrainer = new ArrayList<>();
        for (GymClass gymClass : gymClassList) {
            if (gymClass.getTrainerID() == givenTrainerID) {
                resultListOfGymClassByTrainer.add(gymClass);
            }
        }
        return resultListOfGymClassByTrainer;
    }

    public Map<Integer, List<String>> extractMembershipByClientId(List<Client> clientList, List<Membership> membershipList) {
        Map<Integer, List<String>> resultMembershipByClientId = new HashMap<>();
        for(Client client:clientList) {
            for (Membership membership : membershipList) {
                List<String> membershipCodeList = new ArrayList<>();
                if (client.getId()==membership.getClientID()){
                    membershipCodeList.add(membership.getCode());
                }
                resultMembershipByClientId.put(client.getId(), membershipCodeList);
            }
          }
        return resultMembershipByClientId;
    }

    public Map<GymLocation, List<GymClass>> extractGymClassesByGymLocation(GymLocation gymLocation, List<GymClass> gymClassList) {
        Map<GymLocation, List<GymClass>> resultGymClassesByGymLocation = new HashMap<>();
        for (GymClass gymClass : gymClassList) {
            List<GymClass> resultGymClassList = new ArrayList<>();
            if (gymClass.getLocation().equals(gymLocation)) {
                resultGymClassList.add(gymClass);
                resultGymClassesByGymLocation.put(gymLocation, resultGymClassList);
            }
        }
        return resultGymClassesByGymLocation;
    }

    //public Map<Integer, Integer> extractNoOfGymClassesByTrainerId(List<Trainer> trainerList, List<GymClass> gymClassList) {
    //        Map<Integer, Integer> resultNoOfGymClassesByTrainerId = new HashMap<>();
    //        for (Trainer trainer : trainerList) {
    //            for (GymClass gymClass : gymClassList) {
    //
    //                if(resultNoOfGymClassesByTrainerId.containsKey(gymClass.getTrainerID()){
    //                    int number = resultNoOfGymClassesByTrainerId.get(gymClass.getTrainerID());
    //                    resultNoOfGymClassesByTrainerId.put()
    //                }
    //            }
    //
    //        }
    //}

}