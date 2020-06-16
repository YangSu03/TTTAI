public class ArrayClass2
{
char a[][]={{'0','1','2'},
            {'3','4','5'},
            {'6','7','8'},
          };
public ArrayClass2(){
}
public int getArrayLength()
{return a.length;}
public void printArray()
{
  for (int y=0;y<3;y++)
  {
    for(int x=0;x<3;x++)
    {
    System.out.print(a[y][x]);
    }
    System.out.println();
  }
}

}