package SQLiteDatabaseBrowserPortable.App.exception_hendling.datastructure;

public class linklist <t>{

node head;
    public linklist(){
        head=null;
    }
    public void add(Object value){

        node newnode=new node(value,null);
        if(head==null)
            head=newnode;

        else{

            newnode.next=head; // this node will add at the beginning 
            head=newnode;
        }    

    }
    public void delete(){
        head=head.next;
    }
    public void display(){
        node n=head;
        while(n!=null)
        {
            System.out.println((t)n.value);
            n=n.next;
        }
      
    }



    
}
