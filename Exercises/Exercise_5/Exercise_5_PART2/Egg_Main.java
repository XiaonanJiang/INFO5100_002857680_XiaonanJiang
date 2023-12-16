
//Suppose there is a farm that produces a large number of eggs. We need a method
// to count eggs that is stable, reliable, and does not require high equipment during operation.
// Singleton pattern is suitable


public class Egg_Main {
    public static void main(String[] args) {
        egg_counter egg_counter_1 = egg_counter.getInstance();
        egg_counter_1.new_eggs();
        egg_counter_1.new_eggs();
        egg_counter_1.new_eggs();
        egg_counter_1.new_eggs();
        egg_counter_1.new_eggs();
        egg_counter_1.new_eggs();
        egg_counter_1.Get_number();
        egg_counter_1.reset_number();
    }
}