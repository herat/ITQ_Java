#include<stdio.h>
#include<string.h>
#define length(a) (sizeof(a) / sizeof(a[0]))

int longest_common_subsequence(char *x,char *y,int m,int n);
void print_opt(int b[8][7],char *x,int i,int j);
int main(){
	char x[]="ABCBDAB";
	char y[]="BDCABA";
	int m=strlen(x);
	int n=strlen(y);
	printf("Longest common subsequence length : %d\n",longest_common_subsequence(x,y,m,n));
	return 0;
}

int longest_common_subsequence(char *x,char *y,int m,int n){
	int c[m+1][n+1];
	int b[m+1][n+1];
	int i,j;
	for (i = 0; i <= m; ++i)
	{
		for (j = 0; j <= n; ++j)
		{
			if (i==0 || j==0)
			{
				c[i][j]=0;
			}
			else if(x[i-1]==y[j-1]){
				//if same store +1
				c[i][j]=c[i-1][j-1]+1;
				b[i][j]=2;
			}
			else{
				//find from two different remaining strings with i,j-1 and i-1,j
				//take max
				if(c[i-1][j]>=c[i][j-1]){
					c[i][j]=c[i-1][j];
					b[i][j]=1;
				}
				else{
					c[i][j]=c[i][j-1];
					b[i][j]=0;
				}
			}
		}
	}
	print_opt(b,x,m,n);
	return c[m][n];
}

void print_opt(int b[8][7],char *x,int i,int j){
	if (i==0 || j==0)
	{
		return;
	}
	else if(b[i][j]==2){
		print_opt(b,x,i-1,j-1);
		printf("%c\n",x[i-1]);
	}
	else if(b[i][j]==1){
		print_opt(b,x,i-1,j);
	}
	else{
		print_opt(b,x,i,j-1);
	}
}


