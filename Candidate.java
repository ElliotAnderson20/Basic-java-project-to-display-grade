import java.util.*;
class Candidate
{
    char grades;
    private long rno;
    float f;
    private double agg_marks=(double)f;
    private String cname;

    public  Candidate()
    {
            rno='0';
            agg_marks=0.0;
            cname="n.a";
    }
    public void getdata()
    {
        Scanner sc= new Scanner(System.in);// the creation of scanner object
            System.out.println("Enter your name: ");  
            cname = sc.nextLine();
            System.out.println("enter the roll no.:");
            rno=sc.nextInt();
            System.out.println("enter the aggregate marks:-");
            agg_marks=sc.nextInt();
    }
    public void setgrades()
    {
            if(agg_marks>=85)
            {
                    grades='A';
            }
            else if(agg_marks>=75 && agg_marks<85 )
            {
                    grades='B';
            }       
            else if(agg_marks>=65 && agg_marks<75)
            {
                    grades ='C';
            }
            else if(agg_marks>=55 && agg_marks<65)
            {
                    grades ='D';
            }
            else{
                    grades='F';
            }
    }
    public void dispresult()
    {
            System.out.println("the name of student:"+cname);
            System.out.println("enter the roll no.:"+rno);
            System.out.println("the aggregate marks:-"+agg_marks);
            System.out.println("the grades are:"+grades);
    }    
    public static void main(String args[])
    {
        Candidate t =new Candidate();
        t.getdata();
        t.setgrades();
        t.dispresult();
    }
}
