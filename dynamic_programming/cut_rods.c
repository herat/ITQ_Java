#include<stdio.h>


int cut_rods(int *a,int *cache,int n);
int max(int a,int b);
int main(){
	int n=4;
	int a[]={1,5,8,9};
	int cache[]={0,0,0,0};
	int revenue=0;
	revenue=cut_rods(a,cache,n);
	printf("Max revenue : %d\n",revenue );
	return 0;
}

int cut_rods(int *a,int *cache,int n){
	int revenue=0;
	int i;
	if (n>0){
		//if cahce contains value return that value
		if (cache[n-1]>0)
		{
			return cache[n-1];
		}

		/* find max revenue for cutting rods as 1,2,3,4 and revenue with remaining rods*/
		for (i = 0; i < n; ++i)
		{
			revenue=max(revenue,a[i]+cut_rods(a,cache,n-i-1));
		}
		//doing cache
		cache[n-1]=revenue;
		return revenue;
		
	}
	else{
		return 0;
	}
	
}

int max(int a,int b){
	if(a>b){
		return a;
	}
	else{
		return b;
	}
}