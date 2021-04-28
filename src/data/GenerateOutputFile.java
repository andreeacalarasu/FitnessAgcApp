package data;

import model.Client;
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
                System.out.println("NU s-a reusit crearea fisierului");
            }
        }
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            bw.write("...mesaj abonare ...fiecare linie o propozitie");
            bw.newLine();//adauga linie noua
            bw.write("Bucuresti");
            bw.newLine();

            bw.flush();//verifica daca au fost scrisi toti bitii intr-un fisier

        } catch (IOException ex) {
            System.out.println("Nu s-a reusit scrierea in fisier");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (bw != null) {
                    bw.close();// elibereaza memoria
                }
            } catch (IOException e) {

            }
        }
    }

    }

