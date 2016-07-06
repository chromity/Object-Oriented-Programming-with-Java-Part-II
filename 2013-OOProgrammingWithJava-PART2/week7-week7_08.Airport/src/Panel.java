import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    private HashMap<String, Airplane> airport;
    private ArrayList<String> flights;
    private Scanner reader;
    
    public Panel() {
        this.airport = new HashMap<String, Airplane>(); // store the airport data
        this.reader = new Scanner(System.in);
        this.flights = new ArrayList<String>();
     
    }
    
    public void startUI() {
        airportPanel(); // starts the Airport Panel (asks for the planes & flights)
        flightService(); // starts the Flight Service (prints details)
    }
    
    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String choice = reader.nextLine();
            
            if (choice.equals("x")) {
                break; // exit if equal to X then proceed to flight service
            } 
            
            panelOperation(choice);
        }
    }
    
    public void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            String choice = reader.nextLine();
            
            if (choice.equals("x")) {
                break;
            }
            
            flightHandleOperation(choice);
        }
    }
    
    public void panelOperation(String choice) {
        /* handles adding of plane and it's details */
        String planeID = null;
        Airplane plane = null;
        
        if (choice.equals("1")) {
            System.out.print("Give plane ID: ");
            planeID = reader.nextLine();
            System.out.print("Give plane capacity: ");
            int planeCapacity = Integer.parseInt(reader.nextLine());
            
            plane = new Airplane(planeCapacity);
            this.airport.put(planeID, plane);
        } else if (choice.equals("2")) {
            System.out.print("Give plane ID: ");
            planeID =  reader.nextLine();
            System.out.print("Give departure airport code: ");
            String departureCode = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destinationCode = reader.nextLine();
            
            flights.add(planeID + " (" + this.airport.get(planeID).getPlaneCapacity() +
                    " ppl) (" + departureCode + "-" + destinationCode + ")");

        } 
        

    }
    
    public void flightHandleOperation(String choice){
        if (choice.equals("1")) {
            for (String keys : this.airport.keySet()) {
                System.out.println(keys + " (" + this.airport.get(keys).getPlaneCapacity()
                        + " ppl)");
            }
        } else if (choice.equals("2")) {
            for (String flights: this.flights) {
                System.out.println(flights);
            }
        } else if (choice.equals("3")) {
            System.out.print("Give plane ID: ");
            String planeID = reader.nextLine();
            
            if (this.airport.get(planeID) == null) {
                System.out.println("Plane does not exist.");
            } else {
                 System.out.println(planeID + " (" + this.airport.get(planeID).getPlaneCapacity()
                        + " ppl)");
            }
        }
    }
}
