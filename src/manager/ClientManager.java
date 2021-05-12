package manager;

import model.Client;
import model.Membership;
import model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class ClientManager {


    public void updateClientMobile(List<Client> clientList, String newClientMobile,int clientID){
        for(Client client : clientList){
            if( client.getId()==clientID){
                client.setMobile(newClientMobile);
            }
        }
    }
    public Client findClientById(List<Client> clientList, int clientIdToLookFor){
        Client client = null;
        for(Client client1:clientList){
            if(client1.getId() == clientIdToLookFor){
                client = client1;
            }
        }
        return client;
    }
    public List<Membership> filterListOfMembershipByClient(List<Membership> membershipList, int givenClientID){
        List<Membership> resultListOfMembershipByClient = new ArrayList<>();
        for(Membership membership:membershipList){
            if(membership.getClientID() == givenClientID){
                resultListOfMembershipByClient.add(membership);
            }
        }
        return resultListOfMembershipByClient;
    }
}
