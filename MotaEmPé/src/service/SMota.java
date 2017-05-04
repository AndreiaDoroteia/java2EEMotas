package service;

import java.util.ArrayList;
import model.Mota;

public class SMota {

	ArrayList<Mota> arMota;

	public ArrayList<Mota> getArMota() {
		return arMota;
	}

	public void setArMota(ArrayList<Mota> arMota) {
		this.arMota = arMota;
	}

	public SMota() {
		super();
		this.arMota = new ArrayList<Mota>();
	}
	
}
