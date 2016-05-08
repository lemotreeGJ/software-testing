import java.util.*;

public class Triangle {
	
public static int ifTri(int a,int b,int c){
		
		if(a<=0||b<=0||c<=0||!((a+b)>c&&(a+c)>b&&(c+b)>a)){
			System.out.println(a+","+b+","+c+"不能构成三角形，请重新输入");
			return 0;
		}else{
			System.out.println(a+","+b+","+c+"可以构成三角形");
			return 1;
		}
	}

public static int kindTri(int a,int b,int c){
	
		if(a==b||b==c||a==c){
			System.out.println("此三角形为等腰三角形");
			return 1;
		}
		if(a*a+b*b==c*c||c*c+b*b==a*a||a*a+c*c==b*b){
			System.out.println("此三角形为直角三角形");
			return 2;
		}else{
			if(a*a+b*b<c*c||c*c+b*b<a*a||a*a+c*c<b*b){
			System.out.println("此三角形为锐角三角形");
			return 3;
			}else{
				System.out.println("此三角形为钝角三角形");
				return 4;
			}	
		}
	}
	/*public static void main(String args[]){
		int a;
		int b;
		int c;
	System.out.println("请输入三角形三边");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	int d=ifTri(a,b,c);
	if(d==1){
		kindTri(a,b,c);
	}
	
	}
	*/
	
	
}
