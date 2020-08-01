package ServiceTools;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class that represents our menu in the restaurant.
 */
public class Menu{


    /**
     * A menu is just an arrangement of categories and items which we call MenuItems.
     */
    private HashMap<String, ArrayList<MenuItem>> menu;

    public Menu(){
       menu=new HashMap<String, ArrayList<MenuItem>>();
    }

    public HashMap<String, ArrayList<MenuItem>> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, ArrayList<MenuItem>> menu) {
        this.menu = menu;
    }


}