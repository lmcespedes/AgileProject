package co.com.cct.requerimientos.repositories.mongo.entities;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * @author Lina C
 *
 */
public class Requerimiento {
	
	
	@Id
	private String id;
	String titulo;
	String descripcion;
	Vendedor vendedor;
	SLA sla;
	Date fechaVencimiento;
	Date fechaApertura;
	int costoMaximo;
	
	public Requerimiento() {
		super();
	}

	public Requerimiento(String id, String titulo, String descripcion, Vendedor vendedor,
			Date fechaVencimiento, Date fechaApertura, int costoMaximo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.vendedor = vendedor;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaApertura = fechaApertura;
		this.costoMaximo = costoMaximo;
	}

	public String getId() {
		return id;
	}

	public void setId(String idRequerimiento) {
		this.id = idRequerimiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getCostoMaximo() {
		return costoMaximo;
	}

	public void setCostoMaximo(int costoMaximo) {
		this.costoMaximo = costoMaximo;
	}
	public SLA getSla() {
		return sla;
	}

	public void setSla(SLA sla) {
		this.sla = sla;
	}

	
}
