
class coffee{
    int Caffeine_content;
    int volume;
    int price;
    int Calories;
    boolean sweated;
    boolean gluten_free;
    boolean refrigeration;
    boolean Decaf;
    public void Set_price(int p){
        price=p;
    }
    public void Set_Calories(int c){
        Calories=c;
    }
    public void Set_volume(int v){
        volume=v;
    }
    public coffee(){
        System.out.println("A new instance coffee has been created");
    }

}
class Bizzy extends coffee{
    public String propaganda_B="CRAFT-BREWED 18 HOURS FOR MAXIMUM FLAVOR & STRENGTH";
    public Bizzy() {
        System.out.println("A new instance Bizzy has been created");
    }

}
class Starbucks extends coffee{
    public String propaganda_S="Order from your local Starbucks café and pick up a cup of your favorite coffee today.";
    public Starbucks() {
        System.out.println("A new instance Starbucks has been created");
    }
}


class alcho{
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;
    public void set_Alcohol_content(int a){
        this.Alcohol_content=a;
    }
    public void set_volume(int a){
        this.volume=a;
    }
    public void set_price(int a){
        this.price=a;
    }
    public alcho() {
        System.out.println("A new instance alcho has been created");
    }
}
class beer {
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;
    public void set_Alcohol_content(int a){
        this.Alcohol_content=a;
    }
    public void set_volume(int a){
        this.volume=a;
    }
    public void set_price(int a){
        this.price=a;
    }
    public beer() {
        System.out.println("A new instance beer has been created");
    }

}
class wine {
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;
    public void set_Alcohol_content(int a){
        this.Alcohol_content=a;
    }
    public void set_volume(int a){
        this.volume=a;
    }
    public void set_price(int a){
        this.price=a;
    }
    public wine() {
        System.out.println("A new instance wine has been created");
    }

}
class rum{
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;
    public void set_Alcohol_content(int a){
        this.Alcohol_content=a;
    }
    public void set_volume(int a){
        this.volume=a;
    }
    public void set_price(int a){
        this.price=a;
    }
    public rum() {
        System.out.println("A new instance rum has been created");
    }
}

class Medical_alcohol{
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;
    public void set_Alcohol_content(int a){
        this.Alcohol_content=a;
    }
    public void set_volume(int a){
        this.volume=a;
    }
    public void set_price(int a){
        this.price=a;
    }
    public Medical_alcohol() {
        System.out.println("A new instance Medical_alcohol has been created");
    }

}
class hand_sanitizer {
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;

    public void set_Alcohol_content(int a) {
        this.Alcohol_content = a;
    }

    public void set_volume(int a) {
        this.volume = a;
    }

    public void set_price(int a) {
        this.price = a;
    }
    public hand_sanitizer() {
        System.out.println("A new instance hand_sanitizer has been created");
    }
}

class gin {
    String product_name;
    int Alcohol_content;
    int volume;
    int price;
    String storage_method;
    String shelf_life;
    String Production_Date;
    String manufacturer;

    public void set_Alcohol_content(int a) {
        this.Alcohol_content = a;
    }

    public void set_volume(int a) {
        this.volume = a;
    }

    public void set_price(int a) {
        this.price = a;
    }
    public gin() {
        System.out.println("A new instance gin has been created");
    }
}

public class Main {
    public static void main(String[] args) {
        coffee c1=new coffee();
        coffee c2=new coffee();
        coffee c3=new coffee();

        Bizzy b1=new Bizzy();
        Bizzy b2=new Bizzy();
        Bizzy b3=new Bizzy();

        Starbucks s1=new Starbucks();
        Starbucks s2=new Starbucks();
        Starbucks s3=new Starbucks();

        alcho a1=new alcho();
        alcho a2=new alcho();
        alcho a3=new alcho();

        beer be1=new beer();
        beer be2=new beer();
        beer be3=new beer();

        wine w1=new wine();
        wine w2=new wine();
        wine w3=new wine();

        rum r1=new rum();
        rum r2=new rum();
        rum r3=new rum();

        Medical_alcohol m1=new Medical_alcohol();
        Medical_alcohol m2=new Medical_alcohol();
        Medical_alcohol m3=new Medical_alcohol();

        hand_sanitizer h1=new hand_sanitizer();
        hand_sanitizer h2=new hand_sanitizer();
        hand_sanitizer h3=new hand_sanitizer();

        gin g1=new gin();
        gin g2=new gin();
        gin g3=new gin();

    }
}