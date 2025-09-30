class Addstring{
public static void main(String arg[]){
	String s1="Computer Science Engineering";
	String s2="and";
        int index=16;
	
	String newString=s1.substring(0,index+1)+s2+""+s1.substring(index+1);
	System.out.println("Repalced:"+newString);
	
}
}