public class Brand {

    private String name;
    private int id;
    private static int counter = 0;

    public Brand (String name) {
        this.id = ++counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo (Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
