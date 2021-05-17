package manager;

import model.*;

import java.util.*;

public class GymClassManager {
    public void updateNoOfClientsPerGymClass(List<GymClass> gymClassList, int newNoOfClientsPerGymClass){
        for(GymClass gymClass:gymClassList){
            if(gymClass.getNoOfClients() == newNoOfClientsPerGymClass){
                gymClass.setNoOfClients(newNoOfClientsPerGymClass);
            }
        }
    }
    public void updateGymClassDuration(List<GymClass> gymClassList, int newClassDuration){
        for(GymClass gymClass:gymClassList){
            if(gymClass.getClassDuration() == newClassDuration){
                gymClass.setClassDuration(newClassDuration);
            }
        }
    }
    public GymClass findGymClassByCode(List<GymClass> gymClassList, String gymClassCodeToLookFor) {
        GymClass gymClass= null;
        for(GymClass gymClass2: gymClassList){
            if(gymClass2.getCode().equals(gymClassCodeToLookFor)){
                gymClass = gymClass2;
            }
        }
        return gymClass;
    }
    public boolean searchGymClassWithGivenNoOfClientsPermitted(List<GymClass> gymClass, int noOfClientsPermitted){
        boolean foundedGymClass = false;
        for(GymClass gymClass2: gymClass){
            if(gymClass2.getNoOfClients() == noOfClientsPermitted){
                foundedGymClass = true;
            }
        }
        return foundedGymClass;
    }
    public boolean searchGymClassOfGivenDayOfWeek(List<GymClass> gymClassList, DayOfWeek givenDayOfWeek){
        boolean foundedGymClass = false;
        for(GymClass gymClass: gymClassList){
            if(gymClass.getDayOfWeek() == givenDayOfWeek){
                foundedGymClass = true;
            }
        }
        return foundedGymClass;
    }
    public boolean searchGymClassByLocationAndActivity(List<GymClass> gymClassList, GymLocation givenLocation, Activity givenActivity ){
        boolean foundedGymClass = false;
        for(GymClass gymClass: gymClassList){
            if(gymClass.getLocation().equals(givenLocation) && gymClass.getActivity() == givenActivity){
                foundedGymClass = true;
            }
        }
        return foundedGymClass;
    }
    public List<GymClass> filterListOfGymClassByLocation(List<GymClass> gymClassList, GymLocation givenLocation){
        List<GymClass> resultListOfGymClassByLocation = new ArrayList<>();
        for (GymClass gymClass : gymClassList){
            if(gymClass.getLocation().equals(givenLocation)){
                resultListOfGymClassByLocation.add(gymClass);
            }
        }
        return resultListOfGymClassByLocation;
    }
    public List<GymClass> filterListOfGymClassByActivity (List<GymClass> gymClassList, Activity givenActivity){
        List<GymClass> resultListOfGymClassByActivity = new ArrayList<>();
        for(GymClass gymClass:gymClassList){
            if(gymClass.getActivity() == givenActivity){
                resultListOfGymClassByActivity.add(gymClass);
            }
        }
        return resultListOfGymClassByActivity;
    }
    public List<GymClass> filterListOfGymClassWithNoOfClientsBiggerThanGivenValue(List<GymClass> gymClassList, int givenNoOfClients){
        List<GymClass> resultListOfGymClassWithNoOfClientsBiggerThanGivenValue = new ArrayList<>();
        for(GymClass gymClass:gymClassList){
            if(gymClass.getNoOfClients() == givenNoOfClients){
                resultListOfGymClassWithNoOfClientsBiggerThanGivenValue.add(gymClass);
            }
        }
        return resultListOfGymClassWithNoOfClientsBiggerThanGivenValue;
    }
    public Map<GymLocation, Integer> extractListOfGymLocationWithMaximumGymClasses(List<GymClass> gymClassList) {
        Map<GymLocation, Integer> resultLocationMap = new HashMap<>();
        for (GymClass gymClass : gymClassList) {
            GymLocation gymLocation = gymClass.getLocation();
            if(resultLocationMap.containsKey(gymLocation)){
                int number = resultLocationMap.get(gymLocation);
                resultLocationMap.put(gymLocation,number++);
            }
            else {
                resultLocationMap.put(gymLocation,1);
            }
        }
        return resultLocationMap;
    }

    public Map<GymLocation, List<GymClass>> extractGymClassesByGymLocation(List<GymClass> gymClassList) {
        Map<GymLocation, List<GymClass>> resultGymClassesByGymLocation = new HashMap<>();
        for(GymLocation gymLocation: GymLocation.values()){
            List<GymClass> resultGymClasses = new ArrayList<>();
            for(GymClass gymClass: gymClassList){
                if(gymClass.getLocation()==gymLocation){
                    resultGymClasses.add(gymClass);
                }
            }
            resultGymClassesByGymLocation.put(gymLocation,resultGymClasses);
        }
        return resultGymClassesByGymLocation;
    }

    public Map<Integer, Integer> extractNoOfGymClassesByTrainerId(List<Trainer> trainerList, List<GymClass> gymClassList) {
        Map<Integer, Integer> resultNoOfGymClassesByTrainerId = new HashMap<>();
        for (Trainer trainer : trainerList) {
            int resultNoOfGymClasses = 0;
            for (GymClass gymClass : gymClassList) {
                if(trainer.getId() == gymClass.getTrainerID()){
                    resultNoOfGymClasses ++;
                }
            }
            resultNoOfGymClassesByTrainerId.put(trainer.getId(),resultNoOfGymClasses) ;
        }
        return  resultNoOfGymClassesByTrainerId;
    }

    public void addGymClassToListOfGymClass(List<GymClass> gymClassList, GymClass newGymClass){
        gymClassList.add(newGymClass);
    }

    public void removeGymClassFromListOfGymClass(List<GymClass> gymClassList, GymClass gymClassToBeRemoved){
        gymClassList.remove(gymClassToBeRemoved);
    }

}
