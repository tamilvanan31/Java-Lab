class finelimitException extends Exception{
    
    public String toString(){
        return ("Fine limit exceeded");
    }
}


class daylimitException extends Exception{
    
    public String toString(){
        return ("Day limit exceeded");
    }
}


class Library{
    
    int id;
    int fine;
    int finelimit;
    int days;
    int daylimit;
    Library(int id,int fine,int finelimit,int days,int daylimit)
    {
        this.id=id;
        this.fine=fine;
        this.finelimit=finelimit;
        this.days=days;
        this.daylimit=daylimit;
    }
     void check(){
        try{
        if(fine>finelimit)
        throw new finelimitException();
        else{
            System.out.println("Fine limit is not exceeded");
            
        }
        if(days>daylimit)
        throw new daylimitException();
        else{
            System.out.println("Day limit is not exceeded");
            
        }
     }
        catch(finelimitException e)
        {
            System.out.println("Fine limit exceeded");
        }
        catch(daylimitException e)
        {
            System.out.println("Day limit exceeded");
        }
        
        
    }
}
public class Libraryex
{
	public static void main(String[] args) {
	
	
	    Library l1= new Library(1,200,250,25,20);
	    Library l2= new Library(2,300,250,19,20);
	    Library l3= new Library(1,200,250,5,20);
	    System.out.println("L1 :");
	    
	    l1.check();
	    System.out.println("L2 :");
	    
	    l2.check();
	    System.out.println("L3 :");
	    
	    l3.check();
	    
	
	}
}