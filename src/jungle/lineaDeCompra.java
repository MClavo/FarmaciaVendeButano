package jungle;
public class LineaDeCompra
{
 private int cod_lc;
 private static int num_cod_lc;
 private int cantidad_lc;
 private float precio_lc;
 private Medicamento m;
 num_cod_lc = 0;
 public LineaDeCompra(int cantidad_, Medicamento m_)
 {
 this.cod_lc = num_cod_lc = num_cod_lc + 1;
 this.cantidad_lc = cantidad_;
 this.m = m_;
 this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
 }
 //Metodos observadores
 public int getCod_lc()
 {
 return this.cod_lc;
 }
 public int getCantidad_lc()
 {
 return this.cantidad_lc;
 }
 public float getPrecio_lc()
 {
 return this.precio_lc;
 }
 public Medicamento getMedicamento()
 {
 return this.m;
 }
 public int getNum_cod_lc()
 {
 return this.num_cod_lc;
 }
}
