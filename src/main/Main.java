package main;


import data.DataCreator;
import data.DataReader;
import data.GenerateOutputFile;
import manager.GymClassManager;
import manager.Manager;
import manager.MembershipManager;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String [] args){

        DataCreator dataCreator = new DataCreator();
        List<Membership> membershipList = dataCreator.createListOfMembership();
        List<Client> clientList = dataCreator.createListOfClients();
        List<Trainer> trainerList = dataCreator.createListOfTrainers();

        DataReader dataReader = new DataReader();
        List<Client> listOfClients = dataReader.readListOfClients();
        List<GymClass> gymClassList = dataReader.readListOfGymClasses();


        System.out.println("List of clients is: " + "\n" + listOfClients);
        System.out.println("List of gymclasses is: " + "\n"+ gymClassList);
        System.out.println( "List of trainers is: " + "\n"+ trainerList);

        Manager manager = new Manager();
        List<GymClass> result = manager.filterListOfGymClassByTrainer(gymClassList, 1);
        System.out.println("filterListOfGymClassByTrainer method below: " + "\n" + result);

        Manager manager1 = new Manager();
        List<GymClass> result1 = manager1.filterListOfGymClassOfGivenTrainerByLocation(gymClassList,1,GymLocation.MILITARI);
        System.out.println("filterListOfGymClassOfGivenTrainerByLocation method below: " + "\n" + result1);

        Manager manager2 = new Manager();
        List<Trainer> result2 = manager2.findTrainerById(trainerList,5);
        System.out.println(manager2);

    }

}
