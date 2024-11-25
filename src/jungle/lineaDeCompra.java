package jungle;

public class LineaDeCompra {
    private int cod_lc;
    private static int num_cod_lc = 0;
    private int cantidad_lc;
    private float precio_lc;
    private Medicamento m;

    public LineaDeCompra(int cantidad_, Medicamento m_) {
        this.cod_lc = num_cod_lc++;
        this.cantidad_lc = cantidad_;
        this.m = m_;
        this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
    }

    // Metodos observadores
    public int getCod_lc() {
        return this.cod_lc;
    }

    public int getCantidad_lc() {
        return this.cantidad_lc;
    }

    public float getPrecio_lc() {
        return this.precio_lc;
    }

    public Medicamento getMedicamento() {
        return this.m;
    }
}
