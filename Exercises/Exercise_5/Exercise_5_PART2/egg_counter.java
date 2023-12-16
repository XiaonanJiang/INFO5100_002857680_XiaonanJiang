public class egg_counter {

    private static egg_counter Only_instance = new egg_counter();
    private static int number_of_eggs=0;
    private egg_counter(){}
    public static void Get_number(){
        System.out.println("number of eggs:"+number_of_eggs);
     }
        public void new_eggs(){
            number_of_eggs+=1;
            System.out.println("An egg has been added!");
        }
    public void reset_number(){
        number_of_eggs=0;
        System.out.println("number of eggs:"+number_of_eggs);
    }
    public static egg_counter getInstance(){
        return Only_instance;
    }
}
