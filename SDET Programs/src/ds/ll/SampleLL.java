package ds.ll;

import java.util.LinkedList;

public class SampleLL {

	//
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Aravind");
		names.add("Praveen");
		names.add("Dass");
		names.add("VKC");
		names.add("Vinoth");
		
//		find next to VKC
		
		System.out.println(names.iterator().next());
		
		for(int i=0; i<names.size(); i++){
			if(names.listIterator(i).next() == "VKC"){
				System.out.println(names.listIterator(i+1).next());
			
				names.listIterator(i+1).remove();	
			
			}
		}
		System.out.println(names);
		
	}
	
}
