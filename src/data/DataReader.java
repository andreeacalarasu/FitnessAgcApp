package data;

import model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Boolean.parseBoolean;

public class DataReader {

    private static final String PATH = "./resources/listOfClients.txt";
    private static final String PATH2 = "./resources/listOfGymClass.txt";
    private static final String PATH3 = "./resources/listOfTrainers.txt";
    public List<Client> readListOfClients(){
        List<Client> clientList = new ArrayList<>();
        File file = new File(PATH);
        if (!file.exists()) {
            System.out.println("The file does not exists. Please check the path.");
            return clientList;
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(";");
                String idString = words[0].trim();
                String cnpString = words[1].trim();
                String firstNameString=words[2].trim();
                String lastNameString = words[3].trim();
                String mobileString = words[4].trim();
                String addressString = words[5].trim();

                int id = Integer.parseInt(idString);
                String cnp = cnpString;
                String firstName = firstNameString;
                String lastName = lastNameString;
                String mobile = mobileString;
                String address = addressString;

                Client client = new Client(id,cnp,firstName,lastName,mobile,address);
                clientList.add(client);
            }
        }
        catch(IOException e){
            System.out.println("The file cannot be read.");
        }
        finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                }
        }
        return clientList;
    }

    public List<GymClass> readListOfGymClasses(){
        List<GymClass> gymClassList = new ArrayList<>();
        File file = new File(PATH2);
        if (!file.exists()) {
            System.out.println("The file does not exists. Please check the path.");
            return gymClassList;
            }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(";");
            String codeString = words[0].trim();
            String activityString = words[1].trim();
            String noOfClientsString=words[2].trim();
            String trainingLevelString = words[3].trim();
            String classDurationString = words[4].trim();
            String locationString = words[5].trim();
            String classDescriptionString = words[6].trim();
            String trainingClassTimeString = words[7].trim();
            String dayOfWeekString = words[8].trim();
            String idString = words[9].trim();

            String code = codeString;
            Activity activity = Activity.valueOf(activityString);
            int noOfClients = Integer.parseInt(noOfClientsString);
            TrainingLevel trainingLevel = TrainingLevel.valueOf(trainingLevelString);
            int classDuration = Integer.parseInt(classDurationString);
            GymLocation location = GymLocation.valueOf(locationString);
            String classDescription = classDescriptionString;
            double trainingClassTime = Double.parseDouble(trainingClassTimeString);
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(dayOfWeekString);
            int id = Integer.parseInt(idString);

            GymClass gymClass = new GymClass(code,activity,noOfClients,trainingLevel,classDuration,location,
                    classDescription,trainingClassTime,dayOfWeek,id);
            gymClassList.add(gymClass);
            }
        }
            catch(IOException e){
                System.out.println("The file cannot be read.");
            }
            finally {
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (IOException e) {
                }
            }
            return gymClassList;
    }

    public List<Trainer> readListOfTrainer(){
        List<Trainer> trainerList = new ArrayList<>();
        File file = new File(PATH3);
        if (!file.exists()) {
            System.out.println("The file does not exists. Please check the path.");
        return trainerList;
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(";");
                String idString = words[0].trim();
                String nameString = words[1].trim();
                String emailString=words[2].trim();
                String mobileString = words[3].trim();
                String pricePerHourString = words[4].trim();

                int id = Integer.parseInt(idString);
                String name = nameString;
                String email = emailString;
                String mobile = mobileString;
                double pricePerHour = Double.parseDouble(pricePerHourString);

                Trainer trainer = new Trainer(id,name, email, mobile, pricePerHour);
                trainerList.add(trainer);
            }
        }
        catch(IOException e){
            System.out.println("The file cannot be read.");
        }
        finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
            }
        }
        return trainerList;
    }

}
