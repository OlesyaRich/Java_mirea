package Pr_4;

public class Head {
    protected int eyes;
    protected int mouth;
    protected int ears;
    protected int nose;

    public Head(int eyes, int mouth, int ears, int nose){
        this.eyes = eyes;
        this.mouth = mouth;
        this.ears = ears;
        this.nose = nose;
    }

    public int getEyes() {
        return eyes; }
    public void setEyes(int eyes) {
        this.eyes = eyes;}

    public int getMouth() {
        return mouth; }
    public void setMouth(int mouth) {
        this.mouth = mouth;}

    public int getEars() {
        return ears; }
    public void setEars(int ears) {
        this.ears = ears;}

    public int getNose() {
        return nose; }
    public void setNose(int nose) {
        this.nose = nose;}
}
