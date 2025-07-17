public class Advisor {
    // Fields
    private int id;
    private String name;
    private String placeName;

    // Constructor
    public Advisor(int id, String name, String placeName) {
        this.id = id;
        this.name = name;
        this.placeName = placeName;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlaceName() {
        return placeName;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    // toString method
    @Override
    public String toString() {
        return "Advisor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", placeName='" + placeName + '\'' +
                '}';
    }
}
