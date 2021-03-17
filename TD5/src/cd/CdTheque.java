package cd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class CdTheque {
	 private List <CdAudio> catalogue;
	    // indexations des CDs
	 private Map<Long, CdAudio> cdByIsbn;
	 private Map<String, CdAudio> cdByartistetitle;
	 private Map<String, CdAudio> cdByStyletitle;
	
	 public CdTheque(List<CdAudio> catalogue, Map<Long, CdAudio> cdByIsbn, Map<String, CdAudio> cdByartistetitle,
			Map<String, CdAudio> cdByStyletitle) {
		super();
		this.catalogue = catalogue;
		this.cdByIsbn = cdByIsbn;
		this.cdByartistetitle = cdByartistetitle;
		this.cdByStyletitle = cdByStyletitle;
	}

	public List<CdAudio> getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(List<CdAudio> catalogue) {
		this.catalogue = catalogue;
	}

	public Map<Long, CdAudio> getCdByIsbn() {
		return cdByIsbn;
	}

	public void setCdByIsbn(Map<Long, CdAudio> cdByIsbn) {
		this.cdByIsbn = cdByIsbn;
	}

	public Map<String, CdAudio> getCdByartistetitle() {
		return cdByartistetitle;
	}

	public void setCdByartistetitle(Map<String, CdAudio> cdByartistetitle) {
		this.cdByartistetitle = cdByartistetitle;
	}

	public Map<String, CdAudio> getCdByStyletitle() {
		return cdByStyletitle;
	}

	public void setCdByStyletitle(Map<String, CdAudio> cdByStyletitle) {
		this.cdByStyletitle = cdByStyletitle;
	}
	
	 public boolean addCd(CdAudio cd) {
		 if(this.catalogue.contains(cd)) {
			 return true;
		 }
		 else {
			 this.catalogue.add(cd);
			 this.cdByIsbn.entrySet(cd.getIsbn(), cd);
			 return false;
		 }
	 }
	 
}
