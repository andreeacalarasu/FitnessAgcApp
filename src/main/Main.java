package main;


import data.DataCreator;
import data.DataReader;
import manager.GymClassManager;
import manager.MembershipManager;
import manager.ClientManager;
import manager.TrainerManager;
import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String [] args){

        DataCreator dataCreator = new DataCreator();
        List<Membership> membershipList = dataCreator.createListOfMembership();
        List<Client> listOfClients = dataCreator.createListOfClients();
        List<Trainer> listOfTrainer = dataCreator.createListOfTrainers();

        DataReader dataReader = new DataReader();

        List<Client> clientList = dataReader.readListOfClients();
        List<GymClass> gymClassList = dataReader.readListOfGymClasses();
        List<Trainer> trainerList = dataReader.readListOfTrainer();


        System.out.println("List of clients is: " + "\n" + listOfClients+ "\n");
        System.out.println("List of gymclasses is: " + "\n"+ gymClassList+ "\n");
        System.out.println( "List of trainers is: " + "\n"+ trainerList+ "\n");
        System.out.println("List of membership is: " + "\n" + membershipList+ "\n");

        TrainerManager trainerManager1 = new TrainerManager();
        System.out.println("updatePricePerHourByTrainer method below: "+ "\n");
        trainerManager1.updatePricePerHourByTrainer(trainerList,150);
        System.out.println(trainerList + "\n");

        System.out.println("updateTrainerID method below: "+ "\n");
        trainerManager1.updateTrainerID(trainerList,55);
        System.out.println(trainerList + "\n");

        System.out.println("findTrainerById method below: "+ "\n");
        Trainer trainerResult = trainerManager1.findTrainerById(trainerList,3);
        System.out.println(trainerResult+ "\n");

        System.out.println("searchTrainerByCheaperPricePerHourThanGivenValue: "+ "\n");
        boolean result = trainerManager1.searchTrainerByCheaperPricePerHourThanGivenValue(trainerList,100.0);
        System.out.println(result+ "\n");

        List<GymClass> result2 = trainerManager1.filterListOfGymClassByTrainer(gymClassList, 1);
        System.out.println("filterListOfGymClassByTrainer method below: " + "\n" + result2+ "\n");

        List<GymClass> result1 = trainerManager1.filterListOfGymClassOfGivenTrainerByLocation(gymClassList,1,GymLocation.MILITARI);
        System.out.println("filterListOfGymClassOfGivenTrainerByLocation method below: " + "\n" + result1+ "\n");


        GymClassManager gymClassManager = new GymClassManager();

        System.out.println("updateNoOfClientsPerGymClass method below: "+ "\n");
        gymClassManager.updateNoOfClientsPerGymClass(gymClassList,15);
        System.out.println(gymClassList + "\n");

        System.out.println("updateGymClassDuration method below: "+ "\n");
        gymClassManager.updateGymClassDuration(gymClassList,55);
        System.out.println(gymClassList + "\n");

        System.out.println("findGymClassByCode method below: "+ "\n");
        GymClass gymClassResult = gymClassManager.findGymClassByCode(gymClassList,"AQUA11");
        System.out.println(gymClassResult+ "\n");

        System.out.println("searchGymClassWithGivenNoOfClientsPermitted method below: "+ "\n");
        boolean resultBooleanSearch = gymClassManager.searchGymClassWithGivenNoOfClientsPermitted(gymClassList,10);
        System.out.println(resultBooleanSearch+ "\n");

        System.out.println("searchGymClassOfGivenDayOfWeek method below: "+ "\n");
        boolean resultBooleanSearch2 = gymClassManager.searchGymClassOfGivenDayOfWeek(gymClassList,DayOfWeek.SUNDAY);
        System.out.println(resultBooleanSearch2+ "\n");

        System.out.println("searchGymClassByLocationAndActivity method below: "+ "\n");
        boolean resultBooleanSearch3 = gymClassManager.searchGymClassByLocationAndActivity(gymClassList, GymLocation.TITAN,Activity.BAG_BOXING);
        System.out.println(resultBooleanSearch3 + "\n");

        System.out.println("filterListOfGymClassByLocation method below: "+ "\n");
        List<GymClass> resultGymClassesFilter1 = gymClassManager.filterListOfGymClassByLocation(gymClassList,GymLocation.AVIATIEI);
        System.out.println(resultGymClassesFilter1 +  "\n");

        System.out.println("filterListOfGymClassByActivity method below: "+ "\n");
        List<GymClass> resultGymClassesFilter2 = gymClassManager.filterListOfGymClassByActivity(gymClassList,Activity.AQUA);
        System.out.println(resultGymClassesFilter2+ "\n");

        System.out.println("filterListOfGymClassWithNoOfClientsBiggerThanGivenValue method below:"+ "\n");
        List<GymClass> resultGymClassesFilter3 = gymClassManager.filterListOfGymClassWithNoOfClientsBiggerThanGivenValue(gymClassList,10);
        System.out.println(resultGymClassesFilter3+ "\n");


        Map<GymLocation, Integer> result4 = gymClassManager.extractListOfGymLocationWithMaximumGymClasses(gymClassList);
        System.out.println("extractListOfGymLocationWithMaximumGymClasses method below:" + "\n" + result4 + "\n");


        Map<GymLocation, List<GymClass>> result5 = gymClassManager.extractGymClassesByGymLocation(gymClassList);
        System.out.println("extractGymClassesByGymLocation method below: " + "\n" + result5 + "\n");

        Map<Integer, Integer> result6 = gymClassManager.extractNoOfGymClassesByTrainerId(trainerList,gymClassList);
        System.out.println("extractNoOfGymClassesByTrainerId method below: " + "\n" + result6 + "\n");

        GymClass newGymClass = new GymClass("SPINNING13",Activity.SPINNING,20,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Is based on alternating periods of effort and active " +
                "recovery in a training session, which means a series of planned " + "alternations between high-intensity " +
                "anaerobic areas (85%) and aerobic low-intensity (65%). ",18.00,DayOfWeek.MONDAY, 2);
        gymClassManager.addGymClassToListOfGymClass(gymClassList,newGymClass);
        System.out.println("addGymClassToListOfGymCLass method below: " + "\n" + gymClassList + "\n");

        GymClass gymClassAnnuallyAqua2 = new GymClass("AQUA12",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.WEDNESDAY,1 );

        gymClassManager.removeGymClassFromListOfGymClass(gymClassList,gymClassAnnuallyAqua2);
        System.out.println("removeGymClassFromListOfGymClass method below: " + gymClassList + "\n");

        MembershipManager membershipManager = new MembershipManager();

        System.out.println("updateRegistrationDateOfMembership method below: "+ "\n");
        Date date = new Date();
        membershipManager.updateRegistrationDateOfMembership(membershipList,date);
        System.out.println(membershipList+ "\n");

        System.out.println("searchMembershipCheaperThanGivenValue method below: "+ "\n");
        boolean resultBooleanSearch4 = membershipManager.searchMembershipCheaperThanGivenValue(membershipList,1400);
        System.out.println(resultBooleanSearch4 + "\n");

        System.out.println("filterListOfMembershipsBetweenGivenValues method below: "+ "\n");
        List<Membership> resultMembershipFilter1 = membershipManager.filterListOfMembershipsBetweenGivenValues(membershipList,100,500);
        System.out.println(resultMembershipFilter1);

        System.out.println("filterListOfMembershipWithFutureStartDate method below: "+ "\n");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String futureDateString = "01/07/2021";
        Date futureDate = null;
        try {
            futureDate = format.parse(futureDateString);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        List<Membership> resultMembershipFilter2 = membershipManager.filterListOfMembershipWithFutureStartDate(membershipList,futureDate);
        System.out.println(resultMembershipFilter2 + "\n");

        System.out.println("filterListOfMembershipByMembershipType method below: " + "\n");
        List<Membership> resultFilterMembershipType = membershipManager.filterListOfMembershipByMembershipType(membershipList, MembershipType.WEEKDAY);
        System.out.println(resultFilterMembershipType + "\n");

        System.out.println("extractMembershipByClientId method below: "+ "\n");
        Map<Integer, List<String>> result3 = membershipManager.extractMembershipByClientId(clientList,membershipList);
        System.out.println(result3+ "\n");

        System.out.println("applyDiscountToCustomizedMembership method below: " + "\n");
        membershipManager.applyDiscountToCustomizedMembership(membershipList,"AB9_annually");
        System.out.println(membershipList + "\n");


        ClientManager clientManager = new ClientManager();

        System.out.println("updateClientMobile method below: "+ "\n");
        clientManager.updateClientMobile(clientList,"0755125325",5);
        System.out.println(clientList + "\n");

        System.out.println("findClientById method below: ");
        Client result9 = clientManager.findClientById(clientList,10);
        System.out.println(result9 + "\n");

        System.out.println("filterListOfMembershipByClient method below: " + "\n");
        List<Membership> resultListClientFilter = clientManager.filterListOfMembershipByClient(membershipList,10);
        System.out.println( resultListClientFilter + "\n");




    }

}
