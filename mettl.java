class mettl{
public static void main(String[]args){
	int input1=1243;
int p=(int)(Math.log10(input1))+1;
System.out.println(p);
	int input=input1;
	int r,k=0,count=1,d;
	int a[]=new int[100];
	for(int i=0;i<p;i++){
		r=input%10;
		a[k++]=r;
		input=input/10;
	}
	for(int i=0;i<p;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=0;i<p;i++)
	{
		for(int j=i+1;j<p;j++){
			if(a[i]>a[j]){
				d=a[i];
				a[i]=a[j];
				a[j]=d;
			}	
		}
	}
	for(int i=0;i<p;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=0;i<p;i++)
	{
		for(int j=i+1;j<p;j++){
			if(a[i]==a[j]){
				count++;
				break;
			}
			else{
				break;	
			}
				
		}
		
	}
    int result=p-count;
	System.out.println(result);
}}