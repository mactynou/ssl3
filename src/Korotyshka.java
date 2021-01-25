
public class Korotyshka extends Human{
    public Korotyshka(String name) {
        super(name);
    }

    public void wentHiking(Adverb adverb){
        System.out.println(adverb.getUrl()+' '+getName()+" went on a campaign");
    }

}
