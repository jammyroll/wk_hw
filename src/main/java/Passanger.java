public class Passanger {

    private String name;
    private int bags;

    public Passanger(String name, int bags){
        this.bags = bags;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }
}
