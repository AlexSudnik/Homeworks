package hwClass;

public class Constructor {

    private String name;
    private int price;

    public Constructor(){
        System.out.println("empty constructor");
    }

    public Constructor(String name, int price) { //почему не работает без void?
        this ();// как он понимает какой именно конструктор? а если их 3? и что дает этот вызов?
        System.out.println("data constructor");
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
