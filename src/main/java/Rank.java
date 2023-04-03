public enum Rank {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String ranking;

    Rank(String ranking){
        this.ranking=ranking;
    }

    public String getRank() {
        return ranking;
    }
}
