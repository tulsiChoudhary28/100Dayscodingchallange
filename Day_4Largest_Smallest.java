class Largest_Smallest
{
 public static void main(String[]args){
      int a=20;
      int b=25;
      int c=4;
if(a>b&&a>c)
             System.out.println(a+": is largest number");
else if(b>a&&b>c)
            
             System.out.println(b+": is largest number");
else
            System.out.println(c+": is largest number");

if(a<b&&a>c)
            System.out.println(a+"; is smallest number");
else if(b>a&&b>c)
            System.out.println(b+": is smallest number");
else 
            System.out.println(c+": is smallest number");
}
}