package cd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class CdThequeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CdAudio> ACdlist = new ArrayList<CdAudio>();
		LinkedList<CdAudio> LCdlist = new LinkedList<CdAudio>();
		TreeSet<CdAudio> TCdlist = new TreeSet<CdAudio>();
		CdTheque CDT = new CdTheque(ACdlist,LCdlist,TCdlist);
		CdAudio cd1 = new CdAudio(1,"Damso","Batterie Faible","Rap", 12);
		CdAudio cd2 = new CdAudio(2,"Chromeo","Head Over Heels","Electronique",12);
		CDT.addCd(cd1);
		CDT.addCd(cd2);
		System.out.println("Avant suppression du cd2:"+CDT.toString());
		CDT.removeCd(cd2);
		System.out.println("Après suppression du cd2:"+CDT.toString());
		System.out.println((CDT.getCdByArtistTitle("Damso", "Batterie Faible")));
		System.out.println(CDT.getCds());
		
		

	}

}
