package jungle;
import java.lang.String;
public class Cliente
{
private String cod_cli;
private String nombre_cli;
private String fecha_nacimiento;
private String sexo;
private String grupo_sanguineo;
//Constructor
public Cliente(String cod_cli_, String nombre_cli_, String fecha_nacimiento_,
String sexo_, String grupo_sanguineo_)
{
 this.cod_cli = cod_cli_;
 this.nombre_cli = nombre_cli_;
 this.fecha_nacimiento = fecha_nacimiento_;
 this.sexo = sexo_;
 this.grupo_sanguineo = grupo_sanguineo_;
}
//Metodos observadores
public String getCod_cli()
{
 return cod_cli;
}
public String getNombre_cli()
{
 return nombre_cli;
}
public String getFecha_nacimiento()
{
 return fecha_nacimiento;
}
public String getSexo()
{
 return sexo;
}
public String getGrupo_sanguineo()
{
 return grupo_sanguineo;
}

public void mostrar_detalles_cli()
{
 try
 {
 System.out.println(" ");
 System.out.println("DNI: " + this.cod_cli);
 System.out.println("Nombre completo: " + this.nombre_cli);
 System.out.println("Fecha de nacimiento: " + this.fecha_nacimiento);
 System.out.println("Sexo: " + this.sexo);
 System.out.println("Grupo sanguineo: " + this.grupo_sanguineo);
 }catch(Exception e)
 {
 System.out.println("No se ha podido ejecutar la funcion mostrar_detalles_cli()");
 }
}
}