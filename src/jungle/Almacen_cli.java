package jungle;

import java.util.Vector;

public class Almacen_cli {
    private Vector<Cliente> vec = new Vector<Cliente>();
private Cliente c1 = new Cliente("32074097L","Don Bartolome Mendez
Zuloaga","01/04/1998","H","B+");
    private Cliente c2=new Cliente("32094058k","Cristiano Ronaldo Dos SantosAveiro","02/04/1999","H","A-");

    public Almacen_cli() {
        this.vec.add(c1);
        this.vec.add(c2);
    }

    // Constructor para cualquier vector
    public Almacen_cli(Vector<Cliente> c) {
        for (int i = 0; i < c.size(); i++) {
            this.vec.add(c.get(i));
        }
    }

    public Vector<Cliente> getVector_cliente() {
        return this.vec;
    }
}
