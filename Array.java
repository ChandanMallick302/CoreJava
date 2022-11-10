package javaPackage;

public class Array {

	public static void main(String[] args) {
		int a1[]= {1};
		String a2[]= {"adc","aqw"};
		boolean a3[]= {true};
		System.out.println(a1[0]+a2[1]);
		System.out.println(a3[0]);
    //Single Array
	int a[]=new int[6];// Setting the limit
	a[0]=10;
	a[1]=11;
	a[2]=12;
	a[3]=13;
	a[4]=14;
	a[5]=15;
	System.out.println(a[5]);//15
	//or
	int b[]= {16,17,18,19,20};// no limit
	System.out.println(b[2]);//18
	//Multiple Array
	//2D
	                 
	int c[][]=new int[3][2];// Setting the limit
	              // Column Row
	c[0][0]=10;
	c[0][1]=11;
	c[1][0]=11;
	c[1][1]=12;
	c[2][0]=13;
	c[2][1]=14;

	System.out.println(c[2][1]);
	//OR	
	           //00 01    10 11 12
	int d[][]= {{16,17,},{18,19,20}};
	//Column Row
	System.out.println(d[1][2]);//20
	//3D
	int e[][][]=new int[2][3][2];// Setting the limit
    // No. of Array, Column, Row
    e[0][0][0]=10;
    e[0][0][1]=11;
    e[0][1][0]=11;
    e[0][1][1]=12;
    e[0][2][0]=10;
    e[0][2][1]=14;
    e[1][0][0]=13;
    e[1][0][1]=14;
    e[1][1][0]=15;
    e[1][1][1]=16;
    e[1][2][0]=15;
    e[1][2][1]=24;
    System.out.println(e[1][2][1]);
    //OR
                //000 001 002 010 011  100 101 102 110 111
    int f[][][]= {{{16,17,18},{19,20}},{{21,22,23},{24,25}}};
    System.out.println(f[1][1][1]);
	}

}
