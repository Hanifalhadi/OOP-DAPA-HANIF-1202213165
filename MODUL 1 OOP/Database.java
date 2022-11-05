import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
List<menu> listmenu = new ArrayList<>();

    
}
    // TODO Create Method to Insert Menu to Database
    public void insert menu(Menu menu){
        listmenu.add(menu);

    }

    // TODO Create Method to Show Menu from Database
    public void showmenu(Menu menu){
        System.out.println(x:"menu");
        System.out.println(x:"===================================");
        for(int i = 0; <listmenu.size(); i++){
            System.out.println((i+1)+ "."+listmenu.get(i.name+"("+ listmenu.get(i).category));
        }
    }


    // TODO Create Method to Search Menu from Database



}
