package Pr_4;

public class Human {
    protected int hands;
    protected int legs;
    protected int head;
    protected int body;

    public Human(int hands, int legs, int head, int body){
        this.hands = hands;
        this.legs = legs;
        this.head = head;
        this.body = body;
    }

    public int getHands() {
        return hands; }
    public void setHands(int hands) {
        this.hands = hands;}

    public int getLegs() {
        return legs; }
    public void setLegs(int legs) {
        this.legs = legs;}

    public int getHead() {
        return head; }
    public void setHead(int head) {
        this.head = head;}

    public int getBody() {
        return body; }
    public void setBody(int body) {
        this.body = body;}
}
