package com.group.Carnet_d_adresses.entities;

public class InstanceCarnetDAdresses
{
	/** Instance du carnet d'adresse utilisee par tout le programme. */
	private static CarnetDAdresses carnetDAdresses=new CarnetDAdresses();
	
	/** Accesseurs. */
	public static CarnetDAdresses getCarnetDAdresses(){return carnetDAdresses;}
	public static void setCarnetDAdresses(CarnetDAdresses carnetDAdresses0){carnetDAdresses=carnetDAdresses0;}
}
