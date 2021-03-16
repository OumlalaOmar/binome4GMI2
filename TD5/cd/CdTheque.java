package cd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class CdTheque {
	private ArrayList<CdAudio> ACdlist;
	private LinkedList<CdAudio> LCdlist;
	private TreeSet<CdAudio> TCdlist;
	
	public CdTheque(ArrayList<CdAudio> aCdlist, LinkedList<CdAudio> lCdlist, TreeSet<CdAudio> tCdlist) {
		super();
		ACdlist = aCdlist;
		LCdlist = lCdlist;
		TCdlist = tCdlist;
	}

	public ArrayList<CdAudio> getACdlist() {
		return ACdlist;
	}

	public void setACdlist(ArrayList<CdAudio> aCdlist) {
		ACdlist = aCdlist;
	}

	public LinkedList<CdAudio> getLCdlist() {
		return LCdlist;
	}

	public void setLCdlist(LinkedList<CdAudio> lCdlist) {
		LCdlist = lCdlist;
	}

	public TreeSet<CdAudio> getTCdlist() {
		return TCdlist;
	}

	public void setTCdlist(TreeSet<CdAudio> tCdlist) {
		TCdlist = tCdlist;
	}

	@Override
	public String toString() {
		return "CdTheque [ACdlist=" + ACdlist + ", LCdlist=" + LCdlist + ", TCdlist=" + TCdlist + "]";
	}
	
	public boolean addCd(CdAudio cd) {
		if(this.ACdlist.contains(cd)==true || this.LCdlist.contains(cd)==true) {
			return false;
		}
		else {
			this.ACdlist.add(cd);
			this.LCdlist.add(cd);
			return true;
		}
	}
	
	public boolean removeCd(CdAudio cd) {
		this.ACdlist.remove(cd);
		this.LCdlist.remove(cd);
		return true;
	}
	
	public CdAudio getCdAt(int position) {
		CdAudio cd;
		cd=this.ACdlist.get(position);
		if(cd.equals(LCdlist.get(position))) {
			cd=this.ACdlist.get(position);
		}
		else {
			cd=null;
		}
		return cd;
	}
	
	public CdAudio getCdByIsbn(long isbn) {
		CdAudio cd;
		cd=null;
		for(int i=0;i<ACdlist.size();i++) {
			if(isbn==ACdlist.get(i).getIsbn()) {
				cd=ACdlist.get(i);
				break;
			}
		}
		return cd;
	}
	
	public CdAudio getCdByArtistTitle(String artist, String title) {
		CdAudio cd=null;
		for(int i=0;i<ACdlist.size();i++) {
			if(artist==ACdlist.get(i).getArtist() && title==ACdlist.get(i).getTitle()) {
				cd=ACdlist.get(i);
				break;
			}
		}
		return cd;
	}
	
	public CdAudio getCdByStyleTitle(String style, String title) {
		CdAudio cd=null;
		for(int i=0;i<ACdlist.size();i++) {
			if(style==ACdlist.get(i).getArtist() && title==ACdlist.get(i).getTitle()) {
				cd=ACdlist.get(i);
				break;
			}
		}
		return cd;
	}
	
	public ArrayList<CdAudio> getCds() {
		return ACdlist;
	}
	
	public void classer() {
		
	}
	
	/*public String makeKey(String field1, String field2) {
		
	}
	*/
}
