package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>
{
	private E tab[];

	public ArrayList() 
	{
		super();
	}

	@Override
	public void add(int nb, E elt) 
	{
		this.tab[nb] = elt;
	}

	@Override
	public E remove(int nb) 
	{
		E save = this.tab[nb];
		this.tab[nb] = null;
		return save;
	}

	@Override
	public E get(int nb) 
	{
		return this.tab[nb];
	}

	@Override
	public int size() 
	{
		return this.tab.length;
	}

	public E[] getTab() {
		return tab;
	}
}
