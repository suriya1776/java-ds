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
	
	public listnode insertanywhere(int position,int value) {
		listnode newthing=new listnode(value);
		listnode current=head;
		if(position==1) {
			newthing.next=current;
			head=newthing;
			return head;
		}
		else
		{
			int count =1;
			while(count<position-1) {
				current=current.next;
				count++;
			}
			newthing.next=current.next;
			current.next=newthing;
		    return head;
			
		}
	}
	public listnode deleteanywhere(int position){
		listnode current=head;
		if(position==1) {
			current=current.next;
			head=current;
			return head;
		}
		else {
			int count=1;
			while(count<position-1) {
				current=current.next;
				count++;
			}
			current.next=current.next.next;
			return head;
		}
	}
	
	public void findvalueexist(int value) {
		listnode current=head;
		while(current.next!=null) {
			if(current.data==value) {
				System.out.println("The value present in the list");
				return;
			}
			else
			{
				current=current.next;
			}
			
		}
		System.out.println("The value is not there in the list");
	}
	public void findposition(int value) {
		listnode current=head;
		int count=1;
		while(current.next!=null){
			
			if(current.data==value) {
				System.out.println("the value is in position "+ count);
				return;
			}
			else
			{
				current=current.next;
				count++;
			}
		}
		System.out.println("please enter a valid number");
	}
	public listnode listreverse() {
	
		if(head==null) {
			return head;
		}
		else
		{
			listnode current =head;
			listnode previous=null;
			listnode next=null;
			while(current.next!=null) {
				next=current.next;
				current.next=previous;
				previous=current;
				current=next;
			}
			
			
			return head=previous;
			
		}
	}
	public void findmiddle() {
		if(head==null) {
			System.out.println("there is no elements in the list");
		}
		else
		{
			listnode start=head;
			listnode end =head;
			while(end!=null && end.next!=null) {
				start=start.next;
				end=end.next.next;
			}
			
			System.out.println("the middle element in the list is "+ start.data);
			
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
        sl.insertfirst(72);
        sl.insertfirst(13);
        sl.deletefirst();
        sl.deletelast();
        sl.insertlast(35);

        sl.insertanywhere(3,65);
        sl.deleteanywhere(3);
        sl.findvalueexist(20);
        sl.findposition(12);

        sl.listreverse();
        sl.findmiddle();
     
        sl.display();
        
		
		

	}



}
