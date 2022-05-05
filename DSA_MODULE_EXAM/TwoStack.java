

class TwoStack
{
	int size=10;
	int arr[] = new int[size];
	int top1 = -1;
	int top2 = 5;
	
	public void push1(int d)
	{
		if(top1>=5)
		{
			System.out.println("Stack Overflow");
		}
		top1=top1+1;
		arr[top1]=d;
	}
	
	public void push2(int d)
	{
		if(top2>=10)
		{
			System.out.println("Stack Overflow");
		}
		top2=top2+1;
		arr[top2]=d;
	}
	
	public void pop1()
	{
		if(top1<0)
		{
			System.out.println("Stack Underflow");
		}
		int temp = arr[top1];
		top1--;
		System.out.println("Popped element from stack1 is "+temp);
	}
	
	public void pop2()
	{
		if(top2<=5)
		{
			System.out.println("Stack Underflow");
		}
		int temp = arr[top2];
		top2--;
		System.out.println("Popped element from stack2 is "+temp);
	}
	
	
   public static void main(String args[])
   
   {
	   TwoStack list = new TwoStack();
	   
	   list.push1(5);
	   list.push2(10);
	    list.push2(15);
	   list.push1(11);
	    list.push2(7);
		 list.push2(40);
		 
		 System.out.println();
		 list.pop1();
		 list.pop2();
	   
   }

}