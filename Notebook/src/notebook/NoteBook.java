package notebook;

import java.util.ArrayList;

public class NoteBook {
	
	private ArrayList<String> notes = new ArrayList<String>();	
	
	public void add(String s, int location)
	{
		notes.add(location, s);
	}
	
	public int getSize()
	{
		return notes.size(); 
	}
	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public boolean removeNote(int index)
	{
		return true;
	}
	
	public String[] list()
	{
		return new String[10];
	}

	public static void main(String[] args) 
	{
		String[] a = new String[2];
		
		a[0] = "One";
		a[1] = "Two";
		
		System.out.println(a.length);

		NoteBook nb = new NoteBook();
		
		nb.add("First");
		nb.add("Second");
		
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
	}

}
