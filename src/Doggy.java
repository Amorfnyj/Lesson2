public class Doggy {

    private double tailLength;
    private String petName;
    private boolean isMale;

    public Doggy(double tailLength, String petName, boolean isMale) {
        this.tailLength = tailLength;
        this.petName = petName;
        this.isMale = isMale;
    }

    public double getTailLength() {
        return tailLength;
    }

    public String getPetName() {
        return petName;
    }

    public boolean isMale() {
        return isMale;
    }

    public String toString() {
        String result = "A doggy's name is " + getPetName() + ", its tail lenght is " + getTailLength() +
                " and is it male: " + isMale;
        return result;
    }
}
