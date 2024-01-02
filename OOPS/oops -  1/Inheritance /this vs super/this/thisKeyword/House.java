
public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    // this keyword is required, same parameter name as field this.color = color;
    public String getColor() {
        // this is optional
        return color; // same as return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // this keyword is required, same parameter name as field this.color = color;
}