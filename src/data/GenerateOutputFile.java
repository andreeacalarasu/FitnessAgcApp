package data;

import model.Client;
import model.GymClass;
import model.Membership;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateOutputFile {
    public void generateFile(Membership membership, Client client){
        String directoryName = "./resources";
        String fileName = "/OutputFile.txt";
        File dir = new File(directoryName);

        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("The file cannot be created.");
            }
        }
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            bw.write("Hello, " + client.getFirstName() + "! \n");
            bw.newLine();
            bw.write("Welcome to FITNESS AGC.");
            bw.newLine();
            bw.write("Our trainers are ready to help you get in the best shape of your life!");
            bw.newLine();
            bw.write("Drop by for a free lesson or reply with SCHEDULE for a full run-down of this month’s classes.");
            bw.newLine();
            bw.write("The type of membership you chose determines your level of access to the gyms across the network.");
            bw.newLine();
            bw.write("Please see below the information provided on multi-gym access which shows the access levels " +
                    "related to your membership." + "\n");
            bw.newLine();
            bw.write("Client ID: " + client.getId());
            bw.newLine();
            bw.write("Firstname: " + client.getFirstName());
            bw.newLine();
            bw.write("Lastname: " + client.getLastName());
            bw.newLine();
            bw.write("Membership code: " +  membership.getCode());
            bw.newLine();
            bw.write("Membership type: " +  membership.getMembershipType());
            bw.newLine();
            bw.write("Membership cost (RON, VAT included): " +  membership.getPrice());
            bw.newLine();
            bw.write("Membership registration date: " +  membership.getRegistrationDate());
            bw.newLine();
            bw.write("Membership start date: " +  membership.getStartDate() + "\n");
            bw.newLine();
            bw.write("Membership description: \n" +  membership.getDescription() + "\n");
            bw.newLine();
            bw.write("Access level related to your membership: \n" + membership.toString());
            bw.newLine();
            bw.write("Thank you for choosing us. ");
            bw.newLine();
            bw.write("See you soon! Stay fit!\n ");
            bw.newLine();
            bw.write("Best regards, \n ");
            bw.newLine();
            bw.write("Fitness AGC Team ");
            bw.newLine();

            bw.flush();

        } catch (IOException ex) {
            System.out.println("Failed to write to file.");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {

            }
        }
    }

    }

