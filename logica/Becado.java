package logica;

public class Becado extends Alumno{
	
	private double saldoBeca;
	
	public Becado() {
	}

	public Becado(double saldoBeca, String apellido, int grupo, double cuotaBase, Fecha nacimiento ) {
		super(apellido,grupo,cuotaBase,nacimiento);
		this.saldoBeca=saldoBeca;
	}

	public double getSaldoBeca() {
		return saldoBeca;
	}

	public void setSaldoBeca(double saldoBeca) {
		this.saldoBeca = saldoBeca;
	}

	@Override
	public String toString() {
		return super.toString() + " saldoBeca=" + saldoBeca;
	}
	
	//si el saldoBeca es <200 le corresponde boletoGratis
	
	@Override
	public boolean boletoGratis() {
		boolean corresponde=false;
		
		if (saldoBeca<200)
			corresponde=true;
		return corresponde;
		
	}
	
	@Override
	public double cuotaNeta() {
		return(super.cuotaNeta() - saldoBeca);
	}
	
}
