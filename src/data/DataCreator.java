package data;


import model.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DataCreator {

    public List<Client> createListOfClients (){
        List<Client> clientList = new ArrayList<>();
        Client client1 = new Client(1,"2890307270012","Elena","Paval","0753074023",
                "Str.Nicolae Iorga nr. 53B, Bucuresti");
        Client client2 = new Client(2,"1860221240024", "Ionut","Ilincaru","0724142321",
                "Bulevardul Libertatii nr. 2, Bucuresti");
        Client client3 = new Client(3,"1821221312004", "Mihai", "Trifan", "0765321123",
                "Str. Ametistului nr.36, Bloc2, ap.15, Chiajna");
        Client client4 = new Client(4,"1870221452021", "Tiberiu", "Voroneanu", "0720111335",
                "Str. Mihai Eminescu, Bloc15, ap.2, Voluntari, Ilfov");
        Client client5 = new Client(5,"2821003252015", "Georgiana", "Modiga", "0735125336",
                "Str. Malcoci, Bloc2, ap.75, Bucuresti");
        Client client6 = new Client(6,"1880601220001", "Marian", "Chiriac", "0741313212",
                "Str. Luceafarului, nr. 3, Chiajna");
        Client client7 = new Client(7,"2980101253142", "Adina", "Chiriac", "0755342156",
                "Str. Rozelor, nr. 75, Tunari");
        Client client8 = new Client(8,"1920217401018", "Laurentiu", "Marian", "0765112375",
                "Str. Vasile Milea, nr. 7, Bucuresti");
        Client client9 = new Client(9,"2960805111258", "Oana", "Subtirica", "0766122677",
                "Str. Moise Nicoara , nr. 178, Bucuresti");
        Client client10 = new Client(10,"2970423200075", "Alexandra", "Gherghen", "0715452317",
                "Str. Italia, nr. 1, Bucuresti");

        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        clientList.add(client4);
        clientList.add(client5);
        clientList.add(client6);
        clientList.add(client7);
        clientList.add(client8);
        clientList.add(client9);
        clientList.add(client10);

        return clientList;
    }

    public List<Trainer> createListOfTrainers (){
        List<Trainer> trainerList = new ArrayList<>();
        Trainer trainer1 = new Trainer (1, "George Mares", "george.mares@fitnessagc.ro",
                "0753044021",100);
        Trainer trainer2 = new Trainer (2, "Alina Craciun", "alina.craciun@fitnessagc.ro",
                "0744312745",110);
        Trainer trainer3 = new Trainer (3, "Maria Marinescu","maria.marinescu@fitnessagc.ro",
                "0721125888",90);
        Trainer trainer4 = new Trainer(4, "Alexandru Calin", "alexandru.calin@fitnessagc.ro",
                "0744332547",120);
        Trainer trainer5 = new Trainer(5,"Alin Iofcea", "alin.iofcea@fitnessagc.ro",
                "0741158745", 110);

        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);
        trainerList.add(trainer4);
        trainerList.add(trainer5);

        return trainerList;
    }

    public List<Membership> createListOfMembership(){

        List<GymClass> weekdayList = new ArrayList<>();
        GymClass gymClassWeekDayAqua = new GymClass("AQUA11",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.MONDAY,1 );
        GymClass gymClassWeekDayAqua2 = new GymClass("AQUA12",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.WEDNESDAY,1 );
        GymClass gymClassWeekDayAqua3 = new GymClass("AQUA13",Activity.AQUA,10,TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.FRIDAY,1 );
        GymClass gymClassWeekDayBagBoxing1 = new GymClass("BAG_BOXING11",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.TUESDAY,3);
        GymClass gymClassWeekDayBagBoxing2 = new GymClass("BAG_BOXING12",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.MONDAY,3);
        GymClass gymClassWeekDayBagBoxing3 = new GymClass("BAG_BOXING13",Activity.BAG_BOXING,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.FRIDAY,4);
        GymClass gymClassWeekdayBodyCombat1 = new GymClass("BODY_COMBAT11", Activity.BODY_COMBAT,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.AVIATIEI,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.MONDAY, 5);

        weekdayList.add(gymClassWeekDayAqua);
        weekdayList.add(gymClassWeekDayAqua2);
        weekdayList.add(gymClassWeekDayAqua3);
        weekdayList.add(gymClassWeekDayBagBoxing1);
        weekdayList.add(gymClassWeekDayBagBoxing2);
        weekdayList.add(gymClassWeekDayBagBoxing3);
        weekdayList.add(gymClassWeekdayBodyCombat1);

        List<GymClass> weekendList = new ArrayList<>();

        GymClass gymClassWeekendAqua1 = new GymClass("AQUA14",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SUNDAY,2 );
        GymClass gymClassWeekendAqua2 = new GymClass("AQUA15",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SATURDAY,2 );
        GymClass gymClassWeekendBagBoxing1 = new GymClass("BAG_BOXING14",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SATURDAY,4);
        GymClass gymClassWeekendBagBoxing2 = new GymClass("BAG_BOXING15",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SUNDAY,4);
        GymClass gymClassWeekendSpinning2 = new GymClass("SPINNING12",Activity.SPINNING, 20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.TITAN,"Is based on alternating periods of effort and active recovery in a training session, which means a series of planned " +
                "alternations between high-intensity anaerobic areas (85%) and aerobic, low-intensity (65%). ",18.00,DayOfWeek.SUNDAY, 2);
        GymClass gymClassWeekendBodyCombat2 = new GymClass("BODY_COMBAT12", Activity.BODY_COMBAT,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.SATURDAY, 5);

        weekendList.add(gymClassWeekendAqua1);
        weekendList.add(gymClassWeekendAqua2);
        weekendList.add(gymClassWeekendBagBoxing1);
        weekendList.add(gymClassWeekendBagBoxing2);
        weekendList.add(gymClassWeekendBodyCombat2);
        weekendList.add(gymClassWeekendSpinning2);


        List<GymClass> monthlyList = new ArrayList<>();

        GymClass gymClassMonthlyAqua = new GymClass("AQUA11",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.MONDAY,1 );
        GymClass gymClassMonthlyAqua2 = new GymClass("AQUA12",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.WEDNESDAY,1 );
        GymClass gymClassMonthlyAqua3 = new GymClass("AQUA13",Activity.AQUA,10,TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.FRIDAY,1 );
        GymClass gymClassMonthlyAqua4 = new GymClass("AQUA14",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SUNDAY,2 );
        GymClass gymClassMonthlyAqua5 = new GymClass("AQUA15",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SATURDAY,2 );
        GymClass gymClassMonthlyBagBoxing1 = new GymClass("BAG_BOXING11",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.TUESDAY,3);
        GymClass gymClassMonthlyBagBoxing2 = new GymClass("BAG_BOXING12",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.MONDAY,3);
        GymClass gymClassMonthlyBagBoxing3 = new GymClass("BAG_BOXING13",Activity.BAG_BOXING,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.FRIDAY,4);
        GymClass gymClassMonthlyBagBoxing4 = new GymClass("BAG_BOXING14",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SATURDAY,4);
        GymClass gymClassMonthlyBagBoxing5 = new GymClass("BAG_BOXING15",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SUNDAY,4);
        GymClass gymClassMonthlySpinning1 = new GymClass("SPINNING11",Activity.SPINNING, 20, TrainingLevel.BEGINNER,
                50,GymLocation.TITAN,"Is based on alternating periods of effort and active recovery in a training " +
                "session, which means a series of planned " +"alternations between high-intensity anaerobic areas (85%) and aerobic, " +
                "low-intensity (65%). ",18.00,DayOfWeek.TUESDAY, 2);
        GymClass gymClassMonthlySpinning2 = new GymClass("SPINNING12",Activity.SPINNING, 20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.TITAN,"Is based on alternating periods of effort and active recovery in a training " +
                "session, which means a series of planned " + "alternations between high-intensity anaerobic areas (85%) and aerobic, " +
                "low-intensity (65%). ",18.00,DayOfWeek.SUNDAY, 2);
        GymClass gymClassMonthlyBodyCombat1 = new GymClass("BODY_COMBAT11", Activity.BODY_COMBAT,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.AVIATIEI,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.MONDAY, 5);
        GymClass gymClassMonthlyBodyCombat2 = new GymClass("BODY_COMBAT12", Activity.BODY_COMBAT,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.SATURDAY, 5);

        monthlyList.add(gymClassMonthlyAqua);
        monthlyList.add(gymClassMonthlyAqua2);
        monthlyList.add(gymClassMonthlyAqua3);
        monthlyList.add(gymClassMonthlyAqua4);
        monthlyList.add(gymClassMonthlyAqua5);
        monthlyList.add(gymClassMonthlyBagBoxing1);
        monthlyList.add(gymClassMonthlyBagBoxing2);
        monthlyList.add(gymClassMonthlyBagBoxing3);
        monthlyList.add(gymClassMonthlyBagBoxing4);
        monthlyList.add(gymClassMonthlyBagBoxing5);
        monthlyList.add(gymClassMonthlyBodyCombat1);
        monthlyList.add(gymClassMonthlyBodyCombat2);
        monthlyList.add(gymClassMonthlySpinning1);
        monthlyList.add(gymClassMonthlySpinning2);

        List<GymClass> annuallyList = new ArrayList<>();
        GymClass gymClassAnnuallyAqua = new GymClass("AQUA11",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.MONDAY,1 );
        GymClass gymClassAnnuallyAqua2 = new GymClass("AQUA12",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.WEDNESDAY,1 );
        GymClass gymClassAnnuallyAqua3 = new GymClass("AQUA13",Activity.AQUA,10,TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",09.00,DayOfWeek.FRIDAY,1 );
        GymClass gymClassAnnuallyAqua4 = new GymClass("AQUA14",Activity.AQUA,5,TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SUNDAY,2 );
        GymClass gymClassAnnuallyAqua5 = new GymClass("AQUA15",Activity.AQUA,10,TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI,"Improves blood circulation, lymphatic system, tones " +
                "the entire body and increases resistance – all in one workout.",11.30,DayOfWeek.SATURDAY,2 );
        GymClass gymClassAnnuallyBagBoxing1 = new GymClass("BAG_BOXING11",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.TUESDAY,3);
        GymClass gymClassAnnuallyBagBoxing2 = new GymClass("BAG_BOXING12",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.MONDAY,3);
        GymClass gymClassAnnuallyBagBoxing3 = new GymClass("BAG_BOXING13",Activity.BAG_BOXING,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.FRIDAY,4);
        GymClass gymClassAnnuallyBagBoxing4 = new GymClass("BAG_BOXING14",Activity.BAG_BOXING,20, TrainingLevel.BEGINNER,
                50,GymLocation.AVIATIEI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SATURDAY,4);
        GymClass gymClassAnnuallyBagBoxing5 = new GymClass("BAG_BOXING15",Activity.BAG_BOXING,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.MILITARI, "The punching bag, a pair of boxing gloves and great music are all " +
                "you need to melt your stress. Movement around the bag and combinations of punches and kicks will improve your coordination. " +
                "Keeping on the toes and shifting weight from one foot to another to strike will help improve balance and therefore improve " +
                "whole-body coordination.",14.00,DayOfWeek.SUNDAY,4);
        GymClass gymClassAnnuallySpinning1 = new GymClass("SPINNING11",Activity.SPINNING, 20, TrainingLevel.BEGINNER,
                50,GymLocation.TITAN,"Is based on alternating periods of effort and active recovery in a training " +
                "session, which means a series of planned " + "alternations between high-intensity anaerobic areas (85%) and aerobic, " +
                "low-intensity (65%). ",18.00,DayOfWeek.TUESDAY, 2);
        GymClass gymClassAnnuallySpinning2 = new GymClass("SPINNING12",Activity.SPINNING, 20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.TITAN,"Is based on alternating periods of effort and active recovery in a training " +
                "session, which means a series of planned " + "alternations between high-intensity anaerobic areas (85%) and aerobic, " +
                "low-intensity (65%). ",18.00,DayOfWeek.SUNDAY, 2);
        GymClass gymClassAnnuallyBodyCombat1 = new GymClass("BODY_COMBAT11", Activity.BODY_COMBAT,20, TrainingLevel.INTERMEDIATE,
                50,GymLocation.AVIATIEI,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.MONDAY, 5);
        GymClass gymClassAnnuallyBodyCombat2 = new GymClass("BODY_COMBAT12", Activity.BODY_COMBAT,20, TrainingLevel.ADVANCED,
                50,GymLocation.TITAN,"This very energetic, totally contactless workout will help you, blow by blow " +
                "to find the path to the desired physical condition and burn up to 700 calories along the way.",11.00,
                DayOfWeek.SATURDAY, 5);

        annuallyList.add(gymClassAnnuallyAqua);
        annuallyList.add(gymClassAnnuallyAqua2);
        annuallyList.add(gymClassAnnuallyAqua3);
        annuallyList.add(gymClassAnnuallyAqua4);
        annuallyList.add(gymClassAnnuallyAqua5);
        annuallyList.add(gymClassAnnuallyBagBoxing1);
        annuallyList.add(gymClassAnnuallyBagBoxing2);
        annuallyList.add(gymClassAnnuallyBagBoxing3);
        annuallyList.add(gymClassAnnuallyBagBoxing4);
        annuallyList.add(gymClassAnnuallyBagBoxing5);
        annuallyList.add(gymClassAnnuallyBodyCombat1);
        annuallyList.add(gymClassAnnuallyBodyCombat2);
        annuallyList.add(gymClassAnnuallySpinning1);
        annuallyList.add(gymClassAnnuallySpinning2);



        List<Membership> membershipList = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        String startDateStringAB1 = "01/04/2021";
        Date startDateAB1 = null;
        try {
            startDateAB1 = format.parse(startDateStringAB1);
            }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
         }

        Date registrationDate = new Date();

        Membership membership1 = new Membership("AB1_annualy","Aviatiei, Titan, Militari. " +
                " Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 2000,registrationDate,startDateAB1,
                MembershipType.ANNUALY,1 ,annuallyList);

        String startDateStringAB2 = "01/04/2021";
        Date startDateAB2 = null;
        try {
            startDateAB2 = format.parse(startDateStringAB2);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership2 = new Membership("AB2_annualy","Aviatiei, Titan, Militari. " +
                " Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 2000,registrationDate,startDateAB2,
                MembershipType.ANNUALY,2 ,annuallyList );

        String startDateStringAB3 = "10/04/2021";
        Date startDateAB3 = null;
        try {
            startDateAB3 = format.parse(startDateStringAB3);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership3 = new Membership("AB3_weekend","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 150,registrationDate,startDateAB3,
                MembershipType.WEEKEND,3 ,weekendList );

        String startDateStringAB4 = "13/04/2021";
        Date startDateAB4 = null;
        try {
            startDateAB4 = format.parse(startDateStringAB4);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership4 = new Membership("AB4_weekday","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 250,registrationDate,startDateAB4,
                MembershipType.WEEKEND,4 ,weekdayList );


        String startDateStringAB5 = "13/04/2021";
        Date startDateAB5 = null;
        try {
            startDateAB5 = format.parse(startDateStringAB5);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership5 = new Membership("AB5_monthly","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 300,registrationDate,startDateAB5,
                MembershipType.WEEKEND,5 ,monthlyList );

        String startDateStringAB6 = "23/04/2021";
        Date startDateAB6 = null;
        try {
            startDateAB6 = format.parse(startDateStringAB6);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership6 = new Membership("AB6_weekend","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 150,registrationDate,startDateAB6,
                MembershipType.WEEKEND,6 ,weekendList );

        String startDateStringAB7 = "13/04/2021";
        Date startDateAB7 = null;
        try {
            startDateAB7 = format.parse(startDateStringAB7);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership7 = new Membership("AB7_monthly","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 300,registrationDate,startDateAB7,
                MembershipType.WEEKEND,7 ,monthlyList );

        String startDateStringAB8 = "01/07/2021";
        Date startDateAB8 = null;
        try {
            startDateAB8 = format.parse(startDateStringAB8);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership8 = new Membership("AB8_monthly","Aviatiei, Titan, Militari. " +
                "Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 300,registrationDate,startDateAB8,
                MembershipType.WEEKEND,8 ,monthlyList );

        String startDateStringAB9 = "01/05/2021";
        Date startDateAB9 = null;
        try {
            startDateAB9 = format.parse(startDateStringAB9);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }

        Trainer trainer1 = new Trainer (1, "George Mares", "george.mares@fitnessagc.ro",
                "0753044021",100);
        Trainer trainer2 = new Trainer (2, "Alina Craciun", "alina.craciun@fitnessagc.ro",
                "0744312745",110);

        Membership membership9 = new CustomizedMembership("AB9_annualy", "Aviatiei, Titan, Militari. " +
                " Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.",2000,registrationDate,startDateAB9,MembershipType.ANNUALY,
                9,annuallyList,trainer1,15,GymLocation.MILITARI);


        String startDateStringAB10 = "01/07/2021";
        Date startDateAB10 = null;
        try {
            startDateAB10 = format.parse(startDateStringAB10);
        }
        catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Membership membership10 = new CustomizedMembership("AB10_annualy","Aviatiei, Titan, Militari. " +
                " Outdoor Pool, Squash land, Football land, Sauna, Kids activities, " +
                "33 areas of fitness, cardio and strength.", 2000,registrationDate,startDateAB10,
                MembershipType.ANNUALY,10 ,annuallyList,trainer2, 12,GymLocation.AVIATIEI );

        membershipList.add(membership1);
        membershipList.add(membership2);
        membershipList.add(membership3);
        membershipList.add(membership4);
        membershipList.add(membership5);
        membershipList.add(membership6);
        membershipList.add(membership7);
        membershipList.add(membership8);
        membershipList.add(membership9);
        membershipList.add(membership10);
        return membershipList;



    }

}
