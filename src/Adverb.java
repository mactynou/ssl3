public enum Adverb {
    SILENTLY("Silently"),
    FORAWHILE("For a while"),
    NEXTDAY("Next day"),
    FINALLY("Finally"),
    DIDNTDARETO("didnt dare"),
    HARD("hard");
    private final String url;
    Adverb(String url){
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
