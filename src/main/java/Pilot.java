public class Pilot {

    private String name;
    private Rank rank;
    private String licenceNumber;

    public Pilot(String name,Rank rank,String licenceNumber){
        this.licenceNumber=licenceNumber;
        this.name=name;
        this.rank=rank;
    };

    public String flyPlane(){
        return "It is time for take off";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
