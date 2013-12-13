#include<stdio.h>
#define length(a) (sizeof(a) / sizeof(a[0]))

int merge(int *a,int start,int mid, int end);
int mergesort(int *a,int start,int end);
int main(){

	int a[]={1, 20, 6, 4, 5};
	int size=length(a);
	int min=0;
	int j=0;
	int i=0;
	int inversions=0;
	inversions=mergesort(a,0,size-1);
	printf("Inversions : %d\n",inversions);
	return 0;
}

int merge(int *a,int start,int mid,int end){
	int left[mid-start+1],right[end-mid];
	int i,j=0;
	int leftsize=mid-start+1;
	int rightsize=end-mid;
	int mainindex=start;
	int inversions=0;
	/* create left array */
	for (i = start; i <= mid; ++i)
	{
		left[j++]=a[i];
	}
	j=0;
	/* create right array */
	for (i = mid+1; i <= end; ++i)
	{
		right[j++]=a[i];
	}
	j=0;
	i=0;
	/* merge two array and count inversions*/
	while(i<leftsize && j<rightsize){
		if(left[i]<right[j]){
			a[mainindex++]=left[i++];
		}
		else{
			a[mainindex++]=right[j++];
			inversions+=mid-i-start+1;
		}
	}
	/* right in place and copy left array to main array */
	if(i<leftsize){
		while(i<leftsize){
			a[mainindex++]=left[i++];
		}
	}
	return inversions;
}

int mergesort(int *a,int start,int end){
	int mid=0;
	int inversions=0;
	if(start<end){
		int mid=(start+end)/2;
		/* merge sort on left part */
		inversions=mergesort(a,start,mid);
		/*merge sort on right part */
		inversions+=mergesort(a,mid+1,end);
		/* merge both parts */
		inversions+=merge(a,start,mid,end);
	}
	return inversions;
}
