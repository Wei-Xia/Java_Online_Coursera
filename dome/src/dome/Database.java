package dome;

import java.util.*;

public class Database {
	private ArrayList<Item> items = new ArrayList<Item>();

	public void add(Item i){
		items.add(i);
	}

	public void list(){
		for (Item i : items){
			i.print();
			System.out.println();
		}
	}

	public static void main (String[] args){
		Database db = new Database();
		CD cd = new CD("Owl City", 7);
		DVD dvd = new DVD("House of Cards", "Kevin");
		db.add(cd);
		db.add(dvd);
		db.list();
		Item i = cd;
	
	}
}