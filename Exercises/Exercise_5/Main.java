
//Factory Method pattern.
//Suppose there is a domestic animal. There is a huge difference in body
//fat percentage between each of them. Farmers need to judge whether animals
// are too fat or too thin based on their body fat percentage
//This is also the Composite Design Pattern

public class Main {
    public static void main(String[] args) {
        fat_rate_factory the_factory = new fat_rate_factory();
        body_fat_rate animal_1 = the_factory.getRate(21);
        animal_1.measure();
        body_fat_rate animal_2 = the_factory.getRate(16);
        animal_2.measure();
        body_fat_rate animal_3 = the_factory.getRate(10);
        animal_3.measure();
    }
}