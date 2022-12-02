import java.util.*;

class patient_room{
    String name;
    int id,room_no;
    static int roomcount=0;
    static int available=0;
    static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    patient_room(){
        this.name="";
        this.id=-1;
        this.room_no=this.roomcount+1;
        this.roomcount++;
    }

    patient_room(String name,int id){
        this();
        this.name=name;
        this.id=id;
        patient_room.map.put(id,this.roomcount);
    }

    static int roomCheck(){
        return patient_room.available;
    }

    boolean is_available(){
        if(this==null) return true;
        return false;
    }

    static int patientcheck(int id){
        if(patient_room.map.get(id)==null) return -1;
        return patient_room.map.get(id);
    }

    void vacate(){
        patient_room.map.remove(this.id);
        this.id=-1;
        this.name="";
        patient_room.available++;
    }

    patient_room admit(String name,int id,int room_no){
        this.name=name;
        this.id=id;
        patient_room.map.put(id,room_no);
        patient_room.available--;
        return this;
    }

}

public class healthcare{

    static void print(){
        System.out.println("Enter the choice: \n");
        System.out.println(" 1) Create Room\n 2) Admit\n 3) Vacate\n 4) Patient Check\n 5) Room Check\n 6) Exit\n");
        System.out.print("Enter the option: ");
    }

    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        int n=0,i,j;
        String name;
        int id,num,ans;
        patient_room[] p=new patient_room[100];
        while(n!=6){
            healthcare.print();
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the patient name: ");
                    name=sc.next();
                    System.out.println("Enter the patient id: ");
                    id=sc.nextInt();
                    p[patient_room.roomcount]= new patient_room(name,id);
                    break;

                case 2:
                    System.out.println("Enter the patient name: ");
                    name=sc.next();
                    System.out.println("Enter the patient id: ");
                    id=sc.nextInt();
                    System.out.println("Enter the room number to be admitted: ");
                    num=sc.nextInt();
                    if(num<patient_room.roomcount && p[num-1].is_available())
                        p[num-1]=p[num-1].admit(name,id,num);
                    else
                        System.out.println("The requested room is not available! ");
                    break;

                case 3:
                    System.out.println("Enter the room number to be vacated: ");
                    num=sc.nextInt();
                    if(num<patient_room.roomcount && p[num-1].is_available())
                        System.out.println("The room is already empty! ");
                    else
                        p[num-1].vacate();
                    break;

                case 4:
                    System.out.println("Enter the patient id to be checked: ");
                    num=sc.nextInt();
                    ans=patient_room.patientcheck(num);
                    if(ans==-1)
                        System.out.println("The patient has been discharged! ");
                    else
                        System.out.println("The patient is in room number: " + ans);
                    break;

                case 5:
                    num=patient_room.roomCheck();
                    System.out.println("There are " + num + " number of rooms available! ");
                    break;

                case 6:
                    break;
            }
        }

    }
}