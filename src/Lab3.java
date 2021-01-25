public class Lab3 {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika("Neznaika");
        Sineglazka sineglazka = new Sineglazka("Sineglazka");
        neznaika.stay(Adverb.FORAWHILE, Adverb.SILENTLY);
        sineglazka.stay(Adverb.FORAWHILE, Adverb.SILENTLY);


        Neznaika.Throat throat = neznaika.new Throat("throat");
        neznaika.setThroat(throat);
        neznaika.getThroat().setClosely(true);
        neznaika.tryToSay();

        neznaika.see(Direction.DOWN);
        Item boot = new Item("boot");
        neznaika.digTheGround(boot);
        neznaika.lookTo(sineglazka, Adverb.DIDNTDARETO);
        neznaika.wasAfraid();
        sineglazka.willNotice(neznaika.getEyes(), neznaika);

        neznaika.raised(Direction.UP,Adverb.FINALLY);
        sineglazka.raised(Direction.UP,Adverb.FINALLY);
        neznaika.getEyes().meetOtherEyes(sineglazka.getEyes());

        Korotyshka znaika = new Korotyshka("Znaika");
        Korotyshka pilylkin = new Korotyshka("Pinylkin");
        Korotyshka vintik = new Korotyshka("Vintik");
        Korotyshka shpuntik = new Korotyshka("Shpuntik");

        znaika.wentHiking(Adverb.NEXTDAY);
        shpuntik.wentHiking(Adverb.NEXTDAY);
        pilylkin.wentHiking(Adverb.NEXTDAY);
        vintik.wentHiking(Adverb.NEXTDAY);
        neznaika.wentHiking(Adverb.NEXTDAY);
        sineglazka.wentHiking(Adverb.NEXTDAY);
        neznaika.walking(WalkingMode.ONBOOT, true);

        Flyingball flyingball = new Flyingball("flyingball");
        flyingball.burst();
        flyingball.setHardToFix(true);
        flyingball.fix();
        Wind.isWind();

        for(int i=1;i<=5;i++){
            switch (i){
                case 1:
                    System.out.print("first was ");
                    znaika.haveItem(new Item("compass"),znaika.getHand());
                    break;

                case 2:
                    System.out.print("second was ");
                    System.out.println(pilylkin.getName());
                    break;

                case 3:
                    System.out.print("third was ");
                    System.out.println(vintik.getName()+" and "+shpuntik.getName());
                    break;

                case 4:
                    System.out.print("behind them were ");
                    for(int j=0;j<(int)(Math.random()*3+3);j++) {
                        Korotyshka malyshKorotysh = new Korotyshka("malysh korotysh");
                        System.out.print(' '+malyshKorotysh.getName()+(j+1));
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("The last one was "+neznaika.getName());
                    break;
            }
        }
    }
}