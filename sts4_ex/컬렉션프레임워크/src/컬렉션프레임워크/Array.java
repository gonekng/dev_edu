package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println("size : " + al.size());
		
		al.add(10);
		System.out.println(al);
		System.out.println("size : " + al.size());
		
		al.remove(3); // 인덱스로 지우기
		System.out.println(al);
		System.out.println("size : " + al.size());
		
		al.remove(Integer.valueOf(5)); // 값으로 지우기
		System.out.println(al);
		System.out.println("size : " + al.size());
		
		for(int i=0; i<al.size(); i++) {
			if(i==0) System.out.print("ArrayList : ");
			System.out.print(al.get(i) + " ");
			if(i==al.size()-1) System.out.println();
		}
		
		Iterator<Integer> iter1 = al.iterator();
		while(iter1.hasNext()) {
			System.out.println("이터레이터 원소 : " + iter1.next());
		}
	}

}
