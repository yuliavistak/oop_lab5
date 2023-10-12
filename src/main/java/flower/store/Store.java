package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filter.SearchFilter;

public class Store {

    private List<Item> items;

    public List<Item> search(SearchFilter filter){
        List<Item> foundItems = new ArrayList<> ();
        for (Item item: items){
            if (filter.match(item)){
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
