import java.util.*;
class patternzoho
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,input,x=0;
System.out.println("Enter Input:");
input=sc.nextInt();    //Input 5
int a[][]=new int[input][input];
x=input;
for(i=0;i<input;i++)
{
	for(j=i;j<input;j++)
	{
		a[i][j]=x;
		a[j][i]=x;
	}
	x--;
}
for(i=0;i<input;i++)
{
	for(j=0;j<input;j++)
	{
		System.out.print(a[i][j]+"  ");
	}
	System.out.println();
}
}
}