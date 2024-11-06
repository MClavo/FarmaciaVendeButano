package jungle;

import java.lang.String;
import java.io.Serializable;

public class Medicamento implements Serializable
{
	/*Atributos de la clase*/
	
	private int cod_med;
	private String nombre_med;
	private String comp_med;
	//private enum cat{mareos, anti_inflamatorios, analgesicos, bucal_y_garganta, sistema_digestivo};
	//private enum formato{capsulas, suspension_oral, jarabe, pomada, unguento, supositorio};
	private String cat_med;
	private String formato_med;
	private boolean receta_med;
	private int stock_med;
	private float precio_med;
	
	
	/*Metodos de la clase*/
	
	//Constructor
	public Medicamento(int cod_med_, String nombre_,String comp_, String cat_, String formato_, boolean receta_, int stock_, float precio_med_)
	{
		this.cod_med = cod_med_;
		this.nombre_med = nombre_;
		this.comp_med = comp_;
		this.cat_med = cat_;
		this.formato_med = formato_;
		this.receta_med = receta_;
		this.stock_med = stock_;
		this.precio_med = precio_med_;
	}
	
	//Constructor de copia
	public Medicamento(Medicamento m_)
	{
		this.cod_med = m_.getCod_med();
		this.nombre_med = m_.getNombre_med();
		this.comp_med = m_.getComp_med();
		this.cat_med = m_.getCat_med();
		this.formato_med = m_.getFormato_med();
		this.receta_med = m_.isReceta_med();
		this.stock_med = m_.getStock_med();
		this.precio_med = m_.getPrecio_med();
	}
	
	//Constructor vacio
	public Medicamento()
	{
		this.cod_med = 0;
		this.nombre_med = "";
		this.comp_med = "";
		this.cat_med = "";
		this.formato_med = "";
		this.receta_med = true;
		this.stock_med = 0;
		this.precio_med = 0;
	}

	
	//Metodos observadores
	
	public int getCod_med()
	{
		return cod_med;
	}
	
	public void setCod_med(int cod)
	{
		this.cod_med = cod;
	}

	public String getNombre_med()
	{
		return nombre_med;
	}
	
	public void setNombre_med(String cad)
	{
		this.nombre_med = cad;
	}

	public String getComp_med()
	{
		return comp_med;
	}
	
	public void setComp_med(String cad)
	{
		this.comp_med = cad;
	}

	public String getCat_med()
	{
		return cat_med;
	}
	
	public void setCat_med(String cad)
	{
		this.cat_med = cad;
	}

	public String getFormato_med()
	{
		return formato_med;
	}
	
	public void setFormato_med(String cad)
	{
		this.formato_med = cad;
	}

	public boolean isReceta_med()
	{
		return receta_med;
	}
	
	public void setReceta_med(boolean b)
	{
		this.receta_med = b;
	}
	
	public int getStock_med()
	{
		return stock_med;
	}
	
	public void setStock_med(int cant)
	{
		this.stock_med = cant;
	}

	public float getPrecio_med()
	{
		return precio_med;
	}
	
	public void setPrecio_med(float pre)
	{
		this.precio_med = pre;
	}
	
	
	
	public void restar_stock_med(int cantidad_)
	{
		this.stock_med -= cantidad_;
	}
	
	public void aumentar_stock_med(int cantidad_)
	{
		this.stock_med += cantidad_;
	}
	
	
	
	public void mostrar_detalles_med()
	{
		try
		{
			System.out.println(" ");
			
			System.out.println("Codigo Nacional: " + this.cod_med);
			System.out.println("Nombre comercial: " + this.nombre_med);
			System.out.println("Composicion: " + this.comp_med);
			System.out.println("Categoria: " + this.cat_med);
			System.out.println("Forma farmaceutica: " + this.formato_med);
			
			if(this.receta_med)
				System.out.println("Con Receta");
			else
				System.out.println("Sin Receta");
			System.out.println("Stock disponible: " + this.stock_med);
			System.out.println("Precio unitario: " + this.precio_med);
			System.out.println(" ");
		}catch(Exception e)
		{
			System.out.println("No se ha podido ejecutar la funcion mostrar_detalles_med()");
		}	
		
	}
	
	
}
