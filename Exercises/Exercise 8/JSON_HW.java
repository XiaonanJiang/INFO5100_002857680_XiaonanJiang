import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
public class JSON_HW {
    public static void main(String args[]) {
        //Creating a JSONObject object
        JSONObject  BookShelf= new JSONObject();
        JSONObject Book_1 = new JSONObject();
        JSONObject Book_2 = new JSONObject();
        JSONObject Book_3 = new JSONObject();

        JSONArray authors_1 = new JSONArray();
        authors_1.add("me");
        Book_1.put("title", "A liter of whiskey and me");
        Book_1.put("publishedYear", "2023");
        Book_1.put("numberOfPages", "7.62");
        Book_1.put("authors",authors_1);

        JSONArray authors_2 = new JSONArray();
        authors_2.add("me again");
        Book_2.put("title", "Dangers of Caffeine Addiction");
        Book_2.put("publishedYear", "2023");
        Book_2.put("numberOfPages", "1001");
        Book_2.put("authors",authors_2);

        JSONArray authors_3 = new JSONArray();
        authors_3.add("Mysterious Caffeine Addict");
        Book_3.put("title","Headache tomorrow morning");
        Book_3.put("publishedYear", "2023");
        Book_3.put("numberOfPages", "-31");
        Book_3.put("authors",authors_3);





        BookShelf.put("Book_1", new JSONObject(Book_1));
        BookShelf.put("Book_2", new JSONObject(Book_2));
        BookShelf.put("Book_3", new JSONObject(Book_3));



        try {
            FileWriter file = new FileWriter("output.json");
            file.write(BookShelf.toJSONString());
            file.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+BookShelf);


        new JSONObject(BookShelf).toString();
        authors_3.add("kkkkkkkkkkkkkkkkk");
        new JSONObject(BookShelf).toString();
        System.out.println("JSON file created: "+BookShelf);


    }
}