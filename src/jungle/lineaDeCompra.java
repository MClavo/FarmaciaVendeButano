package jungle;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
21
import java.io.IOException;
import java.util.*;
public class LineaDeCompra
{
private int cod_lc;
private int cantidad_lc;
private float precio_lc;
private Medicamento m;
public LineaDeCompra(int cantidad_, Medicamento m_)
{
this.cantidad_lc = cantidad_;
this.m = m_;
this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
}
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
}
19.6. Alu
