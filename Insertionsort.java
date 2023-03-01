import java.lang.*
public class Insertionsort
{
public static void main(String args[])
{
int i,j=0,temp=0;
int arr[5]={10,7,6,8,1};
for(i=1;i<4;i++)
{
temp=arr[i];
j=i-1;
while(j>=0 && arr[j]>temp)
{
arr[j+1]=arr[j];
j--;
}
arr[j+1]=temp;
}
for(i=0;i<5;i++)
{
system.out.println(arr[i]);
}
}
}