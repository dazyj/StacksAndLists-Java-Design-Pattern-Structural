package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester 
{
	
	private Stack stack;
	
	public StackOfStringTester(Stack stack) 
	{
		super();
		this.stack = stack;
	}

	public void testStack()
	{
		System.out.println(this.stack.size());
		this.stack.push("a");
		System.out.println("element 'a' is added to stack");
		System.out.println(this.stack.size());
		this.stack.push("b");
		System.out.println("element 'b' is added to stack");
		System.out.println(this.stack.size());
		System.out.println(this.stack.peek());
		System.out.println(this.stack.size());
		System.out.println(this.stack.pop());
		System.out.println(this.stack.size());
		System.out.println(this.stack.pop());
		System.out.println(this.stack.size());
	}
}
