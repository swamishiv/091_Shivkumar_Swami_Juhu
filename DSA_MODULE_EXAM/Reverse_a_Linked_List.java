
import java.util.*;

class Reverse_a_Linked_List
{
	Node head;
	Node res;
	
    static class Node 
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	
	public void insert(int d)
	{
		Node n = head;
		
		while(n!=null)
		{
			if(n.data==d){return;}
			n=n.next;
		}
		Node newnode = new Node(d);
		
		Node m = head;
		if(m==null)
		{
			head=newnode;
			return;
		}
		while(m.next!=null)
			m=m.next;
		m.next=newnode;
		
	}
	
	public Node reverse(Node temp)
	{
		Node prev = null;
		Node current = temp;
		Node next = null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		temp =prev;
		return temp;
		
	}
	
	public void display(Node n)
	{
		
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}

		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Reverse_a_Linked_List list = new Reverse_a_Linked_List();
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++)
		{
			list.insert(sc.nextInt());
		}
		list.res = list.reverse(list.head);
		System.out.println("The output is ");
		list.display(list.res);
		
	}


}