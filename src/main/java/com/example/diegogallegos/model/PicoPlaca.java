package com.example.diegogallegos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PicoPlaca")
public class PicoPlaca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_picoPlaca;
	private String dia;
	private String horarioInicial;
	private String horarioFinal;
	private String digito;
	
	public Long getId_picoPlaca() {
		return id_picoPlaca;
	}
	public void setId_picoPlaca(Long id_picoPlaca) {
		this.id_picoPlaca = id_picoPlaca;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHorarioInicial() {
		return horarioInicial;
	}
	public void setHorarioInicial(String horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	public String getHorarioFinal() {
		return horarioFinal;
	}
	public void setHorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	public String getDigito() {
		return digito;
	}
	public void setDigito(String digito) {
		this.digito = digito;
	}
	@Override
	public String toString() {
		return "PicoPlaca [id_picoPlaca=" + id_picoPlaca + ", dia=" + dia + ", horarioInicial=" + horarioInicial
				+ ", horarioFinal=" + horarioFinal + ", digito=" + digito + ", getId_picoPlaca()=" + getId_picoPlaca()
				+ ", getDia()=" + getDia() + ", getHorarioInicial()=" + getHorarioInicial() + ", getHorarioFinal()="
				+ getHorarioFinal() + ", getDigito()=" + getDigito() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
