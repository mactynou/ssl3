import java.util.Objects;

public abstract class Human implements Walking{
    private String name;
    private Head head = new Head("head");
    private Head.Eyes eyes = head.new Eyes("eyes");
    private PartOfBody hand = new PartOfBody("hand");

    public Human(String name){
        this.name=name;
    }

    public void stay(Adverb ... adverbs){
        String help="";
        for(int i=0;i<adverbs.length;i++){
            help=help+' '+adverbs[i].getUrl();
        }
        System.out.println(getName()+" stays"+help);
    }

    public void raised(Direction direction, Adverb adverb){
        System.out.println(adverb +" " +getName() + " " + direction + " head");
    }

    @Override
    public void walking(WalkingMode walkingMode, boolean isPrint) {
        System.out.println(getName()+" walking");
        if(isPrint){
            System.out.println("Walkingmode is: " + walkingMode);
        }
    }

    public void haveItem(Item item, PartOfBody partOfBody){
        System.out.println(getName()+" with "+item.getName()+" in his "+partOfBody.getName());
    }

    public String getName() {
        return name;
    }

    public Head.Eyes getEyes() {
        return eyes;
    }

    public PartOfBody getHand() {
        return hand;
    }

    public boolean equals(Object o)
    {
        return o instanceof Human && Objects.equals(getName(), ((Human) o).getName());
    }

    public int hashCode()
    {
        return Objects.hash(getName());
    }

    public String toString()
    {
        return "Human " + getName();
    }
}
