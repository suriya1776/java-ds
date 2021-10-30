public class SingleList {
	
 
    private listnode head;

	
	private static class listnode{
		private int data;
		private listnode next;
	
	
		public listnode(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void display() {

    listnode current=head;
     while(current!=null) {
	 System.out.print(current.data+"--->");
	 current=current.next;
}
	 System.out.println("null");
	
	}
	
	
	public listnode insertfirst(int value) {
		 listnode current=new listnode(value);
		 current.next=head;
		 head=current;
		 return head;

	}
	
	public listnode deletefirst() {
		if(head==null) {
			return head;
		}
		else {
			head=head.next;
			return head;
		}
	}
	
	public listnode deletelast() {
		if(head==null) {
			return head;
		}
		
		else {
			listnode current=head;
			while(current.next.next!=null) {
				current=current.next;
			}
			current.next=null;
			return head;
			
		}
	}
	
	public listnode insertlast(int value) {
		listnode node=new listnode(value);
		listnode current=head;
		if(head==null) {
			head=node;
			return head;
		}
		else
		{
		  while(current.next!=null) {
			  current=current.next;
			  
		  }
		  node.next=null;
		  current.next=node;
	      return head;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingleList sl=new SingleList();
	    sl.head= new listnode(20);
	    listnode second=new listnode(54);
	    listnode third=new listnode(12);
	    listnode fourth=new listnode(21);
	    
        sl.head.next=second;
        second.next=third;
        third.next=fourth;
        sl.insertfirst(12);
        sl.insertfirst(101);
        sl.insertfirst(72);
     
        sl.deletefirst();
        sl.deletelast();
        sl.insertlast(35);
   
        sl.display();
        
		
		

	}



}
