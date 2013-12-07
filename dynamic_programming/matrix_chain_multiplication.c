#include<stdio.h>
#define length(a) (sizeof(a) / sizeof(a[0]))

int matrix_chain_multiplication(int *p,int n);
void print_opt(int s[8][8],int i,int j);
int main(){
	int n=4;
	int p[]={30,35,15,5,10,20,25};
	matrix_chain_multiplication(p,length(p));
	return 0;
}

int matrix_chain_multiplication(int *p,int n){
	int i,j,k,l,q;
	int m[n+1][n+1],s[n+1][n+1];
	//first put zero for diagonal
	for (i = 1; i <= n; ++i)
	{
		m[i][i]=0;
	}
	
	//calculate upper matrix with different length of chain
	for (l = 2; l <= n; ++l)
	{
		for (i = 1; i <= n-l+1; ++i)
		{
			j=i+l-1;
			m[i][j]=32767;
			//select minimum of all different combination of multiplication
			for (k = i; k <= j-1; ++k)
			{
				q=m[i][k]+m[k+1][j]+(p[i-1]*p[k]*p[j]);
				if (q<m[i][j])
				{
					m[i][j]=q;
					s[i][j]=k;
				}
			}
		}
	}
	//print matrix chain optimally
	print_opt(s,1,6);
}

void print_opt(int s[8][8],int i,int j){
	if (i==j)
	{
		printf("A%d",i);
	}
	else{
		printf("(");
		print_opt(s,i,s[i][j]);
		print_opt(s,s[i][j]+1,j);
		printf(")");
	}
}

