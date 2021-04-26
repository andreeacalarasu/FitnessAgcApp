package data;


import model.Client;


import java.util.ArrayList;
import java.util.List;


public class DataCreator {

    public List<Client> createListOfClients (){
        List<Client>clientList = new ArrayList<>();
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

}
