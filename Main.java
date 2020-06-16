import java.util.*;
class Main {
static boolean occupied=false;
static boolean unoccupied=true;
static int r1=0;
static int r2=0;
static int temp=0;
static Random generator;
static Scanner in;
 static char a[][]={{'0','1','2'},
                    {'3','4','5'},
                    {'6','7','8'},
                  };
  public static void main(String[] args) {
    System.out.println("TicTacToeGame Generator Recursion");
    generator = new Random();
    in=new Scanner(System.in);
    board();
    AI();
  }
 
  public static void AI(){
    ArrayClass2 arr[]=new ArrayClass2[1];
    arr[0]=new ArrayClass2();
    boolean P1win=false;
    occupied=(a[0][0]!=('0')&&a[0][1]!=('1')&&a[0][2]!=('2')&&a[1][0]!=('3')&&a[1][1]!=('4')&&a[1][2]!=('5')&&a[2][0]!=('6')&&a[2][1]!=('7')&&a[2][2]!=('8'));
    unoccupied=(a[0][0]==('0')||a[0][1]==('1')||a[0][2]==('2')||a[1][0]==('3')||a[1][1]==('4')||a[1][2]==('5')||a[2][0]==('6')||a[2][1]==('7')||a[2][2]==('8'));
    
    if(occupied==true){
      System.out.println("full");
      }
   
    if(unoccupied){
      for (;;)
      {
      r1=generator.nextInt(9);
      System.out.println("r1="+r1);
      if (r1==0&&a[0][0]=='0')
        {a[0][0]='x';
        break;}

      if (r1==1&&a[0][1]=='1')
        {a[0][1]='x';
        break;}

      if (r1==2&&a[0][2]=='2')
        {a[0][2]='x';
        break;}

      if (r1==3&&a[1][0]=='3')
        {a[1][0]='x';
        break;}

      if (r1==4&&a[1][1]=='4')
        {a[1][1]='x';
        break;}

      if (r1==5&&a[1][2]=='5')
        {a[1][2]='x';
        break;}

      if (r1==6&&a[2][0]=='6')
        {a[2][0]='x';
        break;}

      if (r1==7&&a[2][1]=='7')
      {a[2][1]='x';
        break;}

      if (r1==8&&a[2][2]=='8')
      {a[2][2]='x';
        break;}

       }
       board();

       if ((a[0][0]=='x'&&a[0][1]=='x'&&a[0][2]=='x'))
      {System.out.println("P1wins");
      P1win=true;}

      if (a[1][0]=='x'&&a[1][1]=='x'&&a[1][2]=='x')
      {System.out.println("P1wins");
     P1win=true;}

      if (a[2][0]=='x'&&a[2][1]=='x'&&a[2][2]=='x')
      {System.out.println("P1wins");
      P1win=true;}
      if ((a[0][0]=='x'&&a[1][0]=='x'&&a[2][0]=='x'))
      {System.out.println("P1wins");
      P1win=true;
      }

      if (a[0][1]=='x'&&a[1][1]=='x'&&a[2][1]=='x')
      {System.out.println("P1wins");
      P1win=true;}

      if (a[0][2]=='x'&&a[1][2]=='x'&&a[2][2]=='x')
      {System.out.println("P1wins");
      P1win=true;}

      if((a[0][0]!=('0')&&a[0][1]!=('1')&&a[0][2]!=('2')&&a[1][0]!=('3')&&a[1][1]!=('4')&&a[1][2]!=('5')&&a[2][0]!=('6')&&a[2][1]!=('7')&&a[2][2]!=('8'))){
      System.out.println("full");
      }
       temp=in.nextInt();
      for (;;)
      {
        if (P1win||occupied)
        break;
      r2=generator.nextInt(9);
      System.out.println("r2="+r2);
      if(occupied==true){
      System.out.println("full");
      break;
      }
      if (r2==0&&a[0][0]=='0')
        {a[0][0]='o';
        break;}

      if (r2==1&&a[0][1]=='1')
        {a[0][1]='o';
        break;}

      if (r2==2&&a[0][2]=='2')
        {a[0][2]='o';
        break;}

      if (r2==3&&a[1][0]=='3')
        {a[1][0]='o';
        break;}

      if (r2==4&&a[1][1]=='4')
        {a[1][1]='o';
        break;}

      if (r2==5&&a[1][2]=='5')
        {a[1][2]='o';
        break;}

      if (r2==6&&a[2][0]=='6')
        {a[2][0]='o';
        break;}

      if (r2==7&&a[2][1]=='7')
      {a[2][1]='o';
        break;}

      if (r2==8&&a[2][2]=='8')
      {a[2][2]='o'; 
      break;}
       }
      board();
      if (P1win==true)
      {arr[0].a[0][0]=a[0][0];
      arr[0].a[0][1]=a[0][1];
      arr[0].a[0][2]=a[0][2];
      arr[0].a[1][0]=a[1][0];
      arr[0].a[1][1]=a[1][1];
      arr[0].a[1][2]=a[1][2];
      arr[0].a[2][0]=a[2][0];
      arr[0].a[2][1]=a[2][1];
      arr[0].a[2][2]=a[2][2];
      System.out.println("good");
      arr[0].printArray();
      }
       }
      
      if (unoccupied&&!P1win&&!occupied)
      AI();
  }

  public static void delay()
  {
    for(int time=0;time<=1e+8;time++);
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  public static void board()
  {
  System.out.println(a[0][0]+""+a[0][1]+""+a[0][2]);
  System.out.println(a[1][0]+""+a[1][1]+""+a[1][2]);
  System.out.println(a[2][0]+""+a[2][1]+""+a[2][2]);
  }
}