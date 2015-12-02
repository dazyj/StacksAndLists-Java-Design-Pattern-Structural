package fr.iutvalence.info.dut.m3105.pattern.structural;


public class ArrayStack<E> implements Stack<E>
{
	
	private E tab[];

	public ArrayStack()
	{
		super();
	}

	@Override
	public void push(E elt) 
	{
		this.tab[tab.length] = elt;
	}

	@Override
	public E pop() 
	{
		E save = this.tab[tab.length - 1];
		this.tab[tab.length - 1] = null;
		return save;
	}

	@Override
	public E peek() 
	{
		return this.tab[tab.length - 1];
	}

	@Override
	public int size() 
	{
		return this.tab.length;
	}
	
}
