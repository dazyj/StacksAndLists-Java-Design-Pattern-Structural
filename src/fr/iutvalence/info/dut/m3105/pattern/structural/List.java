package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> 
{
	public void add(int nb, E elt);
	
	public E remove(int nb);
	
	public E get(int nb);
	
	public int size();
}
