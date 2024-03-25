package summer_2023_b.ex10;

import summer_2023_b.Node;

public class Renting {
    private Node<Apartment> aparts;
    private Node<Client> clients;

    public void addClient(String id) {
        Node<Client> current = this.clients;
        while (current != null) {
            if (current.getValue().getId().equals(id))
                return;
            current = current.getNext();
        }
        this.clients = new Node<Client>(new Client(id), this.clients);
    }

    public Node<Apartment> getAparts() {
        return aparts;
    }

    public void setAparts(Node<Apartment> aparts) {
        this.aparts = aparts;
    }

    public Node<Client> getClients() {
        return clients;
    }

    public void setClients(Node<Client> clients) {
        this.clients = clients;
    }

    public Renting(Node<Apartment> aparts, Node<Client> clients) {
        this.aparts = aparts;
        this.clients = clients;
    }

    public void printMatch(String city, int numRooms, int numPictures) {
        boolean match = false;

        Node<Apartment> current = this.aparts;
        while (current != null) {
            if (current.getValue().getCity().equals(city) && current.getValue().getNumRooms() == numRooms && current.getValue().getNumPictures() >= numPictures) {
                match = true;
                System.out.println(current.getValue().getCode());
            }
        }


        if (!match)
            System.out.println("not found");
    }
}
