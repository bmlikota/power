package hr.bm.vs.power.backing;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ZaruljeBacking {

	public static boolean isZuta;

	public boolean isZuta() {
		return isZuta;
	}

	public void setZuta(boolean isZuta) {
		this.isZuta = isZuta;
	}

	public boolean isCrvena() {
		return isCrvena;
	}

	public void setCrvena(boolean isCrvena) {
		this.isCrvena = isCrvena;
	}

	public static boolean isCrvena;

}