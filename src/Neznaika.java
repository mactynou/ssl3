public class Neznaika extends Korotyshka implements Cansee{
    private Throat throat;

    public Neznaika(String name) {
        super(name);
    }

    public void tryToSay(){
        if(getThroat().isClosely) {
            System.out.print(getName() + " tries to say but ");
            System.out.print("in "+getName()+"'s "+getThroat().getName()+" closely");
            System.out.println(" and words didn't come from within");
        }
        else{
            System.out.println(getName()+" says");
        }
    }

    @Override
    public void lookTo(Human human, Adverb adverb) {
        System.out.println(getName() + " " + adverb.getUrl() + " look to " + human.getName());
    }

    @Override
    public void see(Direction direction) {
        System.out.println(getName()+ " looked "+direction.name());
    }

    public void wasAfraid(){
        System.out.println(getName() + " was afraid what");
    }

    public void digTheGround(Item item){
        System.out.println(getName()+" digs the ground using his "+item.getName());
    }

    public class Throat extends PartOfBody{
        private boolean isClosely=false;
        public Throat(String name) {
            super(name);
        }

        public boolean isClosely() {
            return isClosely;
        }

        public void setClosely(boolean closely) {
            this.isClosely=closely;
        }
    }

    public Throat getThroat() {
        return throat;
    }

    public void setThroat(Throat throat) {
        this.throat = throat;
    }
}
