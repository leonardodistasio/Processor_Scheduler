package ch.hearc.scheduler.graphic.visualization.panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;

import ch.hearc.scheduler.tools.Ordonnanceur;
import ch.hearc.scheduler.tools.Processus;

public class JPanelAction extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelAction()
		{
		this.ordonnanceur = null;

		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void addProcessus(Processus processus)
		{
		this.ordonnanceur.addProcessus(processus);
		}

	public void deleteProcessus(Processus processus)
		{
		this.ordonnanceur.deleteProcessus(processus);
		}


	public void startVisualization()
		{
		this.removeAll();
		this.repaint();
		this.revalidate();
		this.listBoxProcessus = this.ordonnanceur.showProcessus();

		for(Box box : this.listBoxProcessus)
			{
			this.add(box);
			}

		this.revalidate();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setOrdonnanceur(Ordonnanceur ordonnanceur)
		{
		this.removeAll();
		this.revalidate();
		this.invalidate();
		this.listBoxProcessus = null;
		ordonnanceur.removeAllProcessus();
		this.ordonnanceur = ordonnanceur;
		System.out.println("Nb processus : " + this.ordonnanceur.getListProcessus().size());
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Ordonnanceur getOrdonnanceur()
		{
		return this.ordonnanceur;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
			// JComponent : Instanciation

			// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add

		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private Ordonnanceur ordonnanceur;

	// Tools
	private List<Box> listBoxProcessus;
	}
