public class Sineglazka extends Korotyshka{
    public Sineglazka(String name) {
        super(name);
    }
    public void willNotice(Head.Eyes eyes, Human human){
        System.out.println(getName() + " will notice tears on "+human.getName()+" "+eyes.getName());
    }
}
