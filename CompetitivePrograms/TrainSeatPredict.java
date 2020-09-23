import java.util.Scanner;
/*
 * code to predict oposite seat in train and what type of seat is that
 */
public class TrainSeatPredict {

	public static void main(String[] args) 
	{
		
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int [] arr = new int[num];
	        for(int i=0;i<num;i++)
	        {
	            arr[i]=sc.nextInt();
	        }

	        for(int seat:arr)
	        {
	            int a =seat/12,beg,loc=0,indexopp=0;
	            
	            if(seat%12==0)
	            {
	                beg=(a-1)*12 +1;
	            //    System.out.println(beg +" is beg");
	            }
	            else beg=12*a+1;
	            
	          //  System.out.println(beg);
	            int [] seats = new int[12];
	            
	            for(int i=0;i<12;i++)
	            {
	                seats[i]=beg+i;
	            }
	           // for(int tem:seats)System.out.print(tem+ " ");
	            for(int i=0;i<12;i++)
	            {
	                if(seat==seats[i])
	                {
	                 loc=i;
	                }

	            }
	        //System.out.println(loc+" is the position");
	        
                    indexopp = 11-loc;
                
            
	        //System.out.println(indexopp +" opp ");
	        System.out.print(seats[indexopp]+ " is the op seat ");
	        String s;
	        switch(indexopp)
	        {
	        case 0: case 5: case 6: case 11:s="ws";break;
	        case 2: case 3: case 8: case 9:s="as";break;
	        default:s="ms";break;
	        
	        }
	        System.out.println(s);
	        }
	}

}
