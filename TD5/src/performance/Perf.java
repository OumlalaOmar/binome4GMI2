package performance;

import java.lang.Runtime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Perf {
	private ArrayList<Integer> list;
	
	

	public Perf(ArrayList<Integer> list) {
		super();
		this.list = list;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Perf [list=" + list + "]";
	}
	
	public void add3(Integer a) {
		list.add(a);
	}
	
	public void Ctableau3() {
		int a=0;
		int i=0;
		while(a<9999) {
			this.list.add(i*3);
			a=i*3;
			i++;
		}
	
	}

	public static void testArrayList(ArrayList<Integer> a) {
		
	}
	
	public static void testLinkedList(LinkedList<Integer> a) {
		
	}
	
	public static void testTreeSet(TreeSet<Integer> a) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runtime R = Runtime.getRuntime();
		long memo = R.freeMemory();
		long start = System.currentTimeMillis();
		ArrayList<Integer> list = new ArrayList<Integer>(5000);
		Perf p = new Perf(list);
		p.Ctableau3();
		System.out.println("Avant:" + p.toString()+ "Mémoire disponible:"+ memo);
		for(int i=0; i<3334; i++) {
			list.remove(3334-(i+1));
		}
		System.out.println("Après:" + p.toString());
		System.out.println("Run time : " + (System.currentTimeMillis() - start));
		System.out.println(memo-R.freeMemory());*/
		Runtime R = Runtime.getRuntime();
		ArrayList<Integer> Atab = new ArrayList<Integer>();
		LinkedList<Integer> Ltab = new LinkedList<Integer>();
		TreeSet<Integer> Ttab = new TreeSet<Integer>();
		HashSet<Integer> Htab = new HashSet<Integer>();
		long memo = R.freeMemory();
		long start = System.currentTimeMillis();
		System.out.println("Mémoire disponible:"+ memo);
		testTreeSet(Ttab);
		System.out.println("Run time : " + (System.currentTimeMillis() - start));
		System.out.println(memo-R.freeMemory());
	}
	/*Question 3 :
	 * En moyenne 8,2 millisecondes//
	 * 126105392-705800 = 125399592 bytes utilisés
	 */
	/*Question 4 :
	 * En moyenne 7,7 milisecondes//
	 * 126105392-568176 = 125537216 bytes utilisés
	 */
	/*Question 5 :
	 * Pour ArrayList: entre 0 et 1 milliseconde.
	 * Pour LinkedList: entre 0 et 1 milliseconde.
	 */
}
