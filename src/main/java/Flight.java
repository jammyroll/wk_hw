import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passanger> passangers;
    private Plane plane;
    private String flightNumeber;
    private String destination;
    private String departure;
    private String departingTime;

    public Flight(Pilot pilot,Plane plane,String flightNumeber,String destination, String departure,String departingTime){
        this.cabinCrewMembers=new ArrayList<CabinCrewMember>();
        this.passangers=new ArrayList<Passanger>();
        this.departingTime=departingTime;
        this.flightNumeber=flightNumeber;
        this.pilot=pilot;
        this.plane=plane;
        this.flightNumeber=flightNumeber;
        this.destination=destination;
        this.departure=departure;

    }

    public void checkInPassanger(Passanger passanger){
        if(passangers.size()<plane.getPlaneType().getCapacity()){
            passangers.add(passanger);
        }
    }

    public int checkForSpace(){
    return plane.getPlaneType().getCapacity()-passangers.size();
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers =cabinCrewMembers;
    }

    public void addCrew(CabinCrewMember cabinCrewMember2) {
        cabinCrewMembers.add(cabinCrewMember2);
    }

    public void addPassanger(Passanger passanger1) {
        passangers.add(passanger1);
    }


}
