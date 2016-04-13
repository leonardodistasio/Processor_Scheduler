
package ch.hearc.scheduler.tools;

import javax.swing.Box;

public class Processus
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Processus(String nom, int nbRafale, int arrive, int rafaleActuel)
		{
		this.nom = nom;
		this.nbRafale = nbRafale;
		this.arrive = arrive;
		this.rafaleActuel = rafaleActuel;
		this.etat = Etat.READY;
		}

	public Processus(String nom, int nbRafale, int arrive)
		{
		this(nom, nbRafale, arrive, 0);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public Box showRafale()
		{
		// TODO : Jesh

		// Affiche une boxV avec une couleur et un label
		// retourne une boxV
		return null;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setNom(String nom)
		{
		this.nom = nom;
		}

	public void setNbRafale(int nbRafale)
		{
		this.nbRafale = nbRafale;
		}

	public void setArrive(int arrive)
		{
		this.arrive = arrive;
		}

	public void setRafaleActuel(int rafaleActuel)
		{
		this.rafaleActuel = rafaleActuel;
		}

	public void setEtat(Etat etat)
		{
		this.etat = etat;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return this.nom;
		}

	public int getNbRafale()
		{
		return this.nbRafale;
		}

	public int getArrive()
		{
		return this.arrive;
		}

	public int getRafaleActuel()
		{
		return this.rafaleActuel;
		}

	public Etat getEtat()
		{
		return this.etat;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private String nom;
	private int nbRafale;
	private int arrive;
	private int rafaleActuel;

	// Tools
	private Etat etat;

	}
