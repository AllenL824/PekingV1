import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private Map<MenuItem, Integer> items; // creates a dictionary that matches specific dish with amount of orders of that specific dish
    private double total;

    //constructor or order class
    public Order()
    {
        //initiate items
        items = new HashMap<>();
        total = 0;
    }

    //method to add item to order
    public void addItem(MenuItem item, int quanity)
    {
        //if order already contains item, add new quanity to exsisting
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + quanity);
        }
        //else, set as new key and value
        else {
            items.put(item, quanity);
        }
        total += item.getPrice() * quanity;
    }
    
    public void displayOrder () 
    {
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            MenuItem item = entry.getKey();
            int quanity = entry.getValue();
            System.out.println(item.getItemName() + " x" + quanity + " = $" + (item.getPrice() * quanity));
        }
        System.out.println("Total = $" + total);
    }
    
    public double getTotal()
    {
        return total;
    }
}
