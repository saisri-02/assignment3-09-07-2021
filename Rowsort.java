import java.util.*;
class Rowsort
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows : ");
int r=sc.nextInt();
System.out.println("Enter number of columns : ");
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter elements in array : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
int i=0,j=0,temp;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
for(int k=j+1;k<c;k++)
{
if(a[i][j]>a[i][k])
{
temp=a[i][j];
a[i][j]=a[i][k];
a[i][k]=temp;
}
}
}
}
System.out.println("Sorted array : ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}