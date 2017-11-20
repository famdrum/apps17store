public class Game {
    protected String name;
    protected String genre;
    protected String description;
    protected double price;
    public Game(String name, double price, String genre, String description){
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.description = description;
    }
    public String get_name(){
        return this.name;
    }
    public double get_price(){
        return this.price;
    }
    public String get_genre(){
        return this.genre;
    }
    public String get_description(){
        return this.description;
    }
}
