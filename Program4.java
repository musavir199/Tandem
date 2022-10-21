
public class Program4 {
public static void main(String[] args) {
	int[] a= {1,2,8,9,12,46,76,82,15,20,30};
	int a1=0,a2=0,a3=0,a4 = 0,a5 = 0,a6 = 0,a7 = 0,a8=0,a9=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]%1==0)
			a1++;
		if(a[i]%2==0)
			a2++;
		if(a[i]%3==0)
			a3++;
		if(a[i]%4==0)
			a4++;
		if(a[i]%5==0)
			a5++;
		if(a[i]%6==0)
			a6++;
		if(a[i]%7==0)
			a7++;
		if(a[i]%8==0)
			a8++;
		if(a[i]%9==0)
			a9++;
		}
	System.out.println("{1:"+a1+", 2:"+a2+", 3:"+a3+", 4:"+a4+", 5:"+a5+" , 6:"+a6+" , 7:"+a7+" , 8:"+a8+" , 9:"+a9+"}");
	//{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
	
}
}