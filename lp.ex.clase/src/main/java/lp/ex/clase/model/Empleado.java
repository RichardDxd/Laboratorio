package lp.ex.clase.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Empleado")

public class Empleado {
	
	@Id
    @Column(name = "IdEmpleado")
    private String idEmpleado;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "Nombres")
    private String nombres;

    @Column(name = "Edad")
    private int edad;

    @Column(name = "Sexo")
    private String sexo;

    @Column(name = "Salario")
    private double salario;

	public Empleado(String idEmpleado, String apellidos, String nombres, int edad, String sexo, double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

    
}
