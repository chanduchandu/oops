class met{
public static void main(String[]args){
	int input1=12433354;
int p=(int)(Math.log10(input1))+1;
	int input=input1;
	int r0,r1,r2,r3,r4,r5,r6,r7,r8,r9;
	r0=r1=r2=r3=r4=r5=r6=r7=r8=r9=0;
	int count=0;
	int r;
	//int a[]=new int[100];
	for(int i=0;i<p;i++){
		r=input%10;
		switch(r){
		case 0:
		r0++;
		break;
		case 1:
		r1++;
		break;
		case 2:
		r2++;
		break;
		case 3:
		r3++;
		break;
		case 4:
		r4++;
		break;
		case 5:
		r5++;
		break;
		case 6:
		r6++;
		break;
		case 7:
		r7++;
		break;
		case 8:
		r8++;
		break;
		case 9:
		r9++;
		break;
		}
input=input/10;		
}
        if(r0==1){count++;}
		if(r1==1){count++;}
		if(r2==1){count++;}
		if(r3==1){count++;}
		if(r4==1){count++;}
		if(r5==1){count++;}
		if(r6==1){count++;}
		if(r7==1){count++;}
		if(r8==1){count++;}
		if(r9==1){count++;}
System.out.println(count);	
}}