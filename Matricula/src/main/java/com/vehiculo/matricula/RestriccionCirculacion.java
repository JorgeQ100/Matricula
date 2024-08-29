package com.vehiculo.matricula;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class RestriccionCirculacion {
	public boolean puedeCircula(Vehiculo vehiculo, LocalDate horaActual) {
		
		int ultimoDigito = Integer.parseInt(vehiculo.getMatricula().substring(vehiculo.getMatricula().length()-1));
		DayOfWeek diaSemana = horaActual.getDayOfWeek();
		
		switch (diaSemana) {
		case MONDAY:
			return ultimoDigito != 1 && ultimoDigito != 2;
		case TUESDAY:
			return ultimoDigito != 3 && ultimoDigito != 4;
		case WEDNESDAY:
			return ultimoDigito != 5 && ultimoDigito != 6;
		case THURSDAY:
			return ultimoDigito != 7 && ultimoDigito != 8;
		case FRIDAY:
			return ultimoDigito != 9 && ultimoDigito != 0;
		default:
			return true;
		}
	}
		
}
