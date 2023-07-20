public class Ball {

    private String name;
    private String color;
    private int radius;

    private int price;

    Ball(String name, String color, int radius, int price){
        this.name = name;
        this.color = color;
        this.radius = radius;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void makeColorDark(){

        color = "koyu " + color;
    }




}