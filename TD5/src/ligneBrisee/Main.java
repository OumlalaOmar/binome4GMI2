package ligneBrisee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Voici la partie LigneBriseeArrayList : ");
		ArrayList<Point> list = new ArrayList<Point>();
		LigneBriseeArrayList LBA = new LigneBriseeArrayList(list);
		Point p1 = new Point(7,9);
		Point p2 = new Point(7,1);
		Point p3 = new Point(27,9);
		Point p4 = new Point(17,5);
		System.out.println("Avant:"+ LBA.toString());
		LBA.addPoint(p1);
		LBA.addPoint(p2);
		LBA.addPoint(p3);
		System.out.println("Après les trois ajouts:"+ LBA.toString());
		LBA.deletePoint(p2);
		System.out.println("p4 est-il dans la Ligne ? : "+LBA.contientPoint(p4));
		System.out.println("Après:"+ LBA.toString());
		System.out.println("///////////////////////////////////////");
		System.out.println("");
		
		
		System.out.println("Voici la partie LigneBriseeLinkedList : ");
		LinkedList<Point> points = new LinkedList<Point>();
		LigneBriseeLinkedList LBL = new LigneBriseeLinkedList(points);
		LBL.addPoint(p1);
		LBL.addPoint(p2);
		LBL.addPoint(p3);
		System.out.println("Après les trois ajouts:"+ LBL.toString());
		LBL.deletePoint(p2);
		System.out.println("p4 est-il dans la Ligne ? : "+LBL.contientPoint(p4));
		System.out.println("Après:"+ LBL.toString());
		System.out.println("///////////////////////////////////////");
		System.out.println("");
		
		
		System.out.println("Voici la partie LigneBriseeTreeSet : ");
		TreeSet<Point> TSL = new TreeSet<Point>();
		LigneBriseeTreeSet LBT = new LigneBriseeTreeSet(TSL);
		System.out.println("Avant:"+ LBT.toString());
		LBT.addPoint(p1);
		LBT.addPoint(p2);
		LBT.addPoint(p3);
		System.out.println("Après les trois ajouts:"+ LBT.toString());
		LBT.deletePoint(p2);
		System.out.println("p4 est-il dans la Ligne ? : "+LBT.contientPoint(p4));
		System.out.println("Après:"+ LBT.toString());
		System.out.println("///////////////////////////////////////");
		System.out.println("");
		
		
		System.out.println("Voici la partie LigneBriseeMap : ");
		Map<Point, Integer> m = new HashMap<Point, Integer>();
		LigneBriseeMap LBM = new LigneBriseeMap(m);
		System.out.println("Avant:"+ LBM.toString());
		LBM.addPoint(p1);
		LBM.addPoint(p2);
		LBM.addPoint(p3);
		System.out.println("Après les trois ajouts:"+ LBM.toString());
		LBM.deletePoint(p2);
		System.out.println("p4 est-il dans la Ligne ? : "+LBM.contientPoint(p4));
		System.out.println("Après:"+ LBM.toString());
		System.out.println("///////////////////////////////////////");
		System.out.println("");
		
	}
	

}
