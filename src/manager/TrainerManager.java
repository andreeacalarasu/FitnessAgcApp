package manager;

import model.*;


import java.util.*;

public class TrainerManager {

    public void updatePricePerHourByTrainer(List<Trainer> trainerList, double newPricePerHourByTrainer) {
        for (Trainer trainer : trainerList) {
            if(trainer.getPricePerHour()==newPricePerHourByTrainer){
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









}