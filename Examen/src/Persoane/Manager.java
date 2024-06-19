package Persoane;

import java.util.HashSet;

public class Manager extends Angajat {

	private HashSet<Muncitor> muncitori;

	public Manager(int valoareaNumerica, int anVechime, String nume) {
		super(valoareaNumerica, anVechime, nume);
		this.muncitori = new HashSet<>();;
	}
	
	public boolean addMuncitor(Muncitor muncitor) {
		return muncitori.add(muncitor);
	}
	
	public boolean removeMuncitor(Muncitor muncitor) {
		return muncitori.remove(muncitor);
	}
}
