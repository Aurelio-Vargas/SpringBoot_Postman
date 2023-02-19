package com.example.SpringBootPostman;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double precio;
	private String marca;
	private String color;
	private LocalDate releaseDate;
	private boolean online;
	
	
	public Laptop() {}
	
	public Laptop(Long id, Double precio, String marca, String color, LocalDate releaseDate, boolean online) {
		this.id=id;
		this.precio=precio;
		this.marca=marca;
		this.color=color;
		this.releaseDate=releaseDate;
		this.online=online;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio=precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getcolor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public LocalDate getReleaseDate () {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate=releaseDate;
	}
	public boolean getOnline() {
		return online;
	}
	public void setOnline (boolean online) {
		this.online=online;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", precio=" + precio + ", marca=" + marca + ", color=" + color + ", releaseDate="
				+ releaseDate + ", online=" + online + "]";
	}
	
	
}


















