import java.util.*;
class Addelement{
public static void main(String args[]){
	int index=4;
	int a[]={5,6,7,9};
	int b[]=new int[4];
	int newelement=8;
	for(int i=0;i<a.length;i++){
		b[i]=a[i];
		b[index-4]=newelement;
}
	System.out.println(Arrays.toString(b));
}
}