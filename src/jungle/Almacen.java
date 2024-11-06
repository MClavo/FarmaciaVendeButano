package jungle;

import java.util.Vector;
import java.io.Serializable;

public class Almacen implements Serializable
{
	private Vector<Medicamento> vec = new Vector<Medicamento>();
	
	private Medicamento m1 = new Medicamento(1,"ibuprofeno","com1","anti_inflamatorios","jarabe",true,20,4);
	private Medicamento m2 = new Medicamento(2,"paracetamol","com2","anti_inflamatorios","pomada",false,20000,5);
	private Medicamento m3 = new Medicamento(3,"nolotil","com3","mareos","jarabe",true,5,6);
	private Medicamento m4 = new Medicamento(4,"ibuprofeno-sup","com1","anti_inflamatorios","supositorio",true,20,1);
	private Medicamento m5 = new Medicamento(5,"antalgin","com4","mareos","supositorio",false,80,7);
	
	//Constructor
	public Almacen()
	{
		this.vec.add(m1);
		this.vec.add(m2);
		this.vec.add(m3);
		this.vec.add(m4);
		this.vec.add(m5);
	}
	
	
	//Constructor para cualquier vector
	public Almacen(Vector<Medicamento> v)
	{
		for(int i = 0; i < v.size(); i++)
		{
			this.vec.add(v.get(i));
		}
	}
	
	public Vector<Medicamento> getVector_medicamento()
	{
		return this.vec;
	}
	
	
	public void introduce_medicamento_Almacen(Medicamento m)
	{
		this.vec.add(m);
	}
	
	public void mostrar_contenido_almacen()
	{
		for(int i = 0; i < vec.size(); i++)
		{
			this.vec.get(i).mostrar_detalles_med();
		}
	}
	
}