public enum MusicTypes {
    CLASSICAL(1),
    JAZZ(2),
    ROCK(3),
    METAL(4);

    private final int earDamageFactor;

    MusicTypes(int earDamageFactor) {
        this.earDamageFactor = earDamageFactor;
    }

    public int calcHearingLoss(int hours){
        return this.earDamageFactor * hours;
    }

    public String toString(){
        return String.format("%s-%s-%s", this.name(), this.ordinal(), this.earDamageFactor);
    }
}
