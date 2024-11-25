package jungle;
public class LineaDeCompra
{
private int cod_lc;
private static int num_cod_lc = 0;
private int cantidad_lc;
private float precio_lc;
private Medicamento m;
public LineaDeCompra(int cantidad_, Medicamento m_)
{
this.cod_lc = num_cod_lc++;
this.cantidad_lc = cantidad_;
this.m = m_;
this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
}
}
