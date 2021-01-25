import java.util.Objects;
public class Item {
    private String name;
    public Item(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item that = (Item) o;
        return name.equals(that.getName());
    }

    public String toString() {
        return "Item{" + '\n'+"name = " + name +'\n'+'}';
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
