public class KMP {
  public static void main(String [] args){
		String s="abaabaabababbaa";
		String p="abab";
		KMP kmp=new KMP();
		int [] h=kmp.preprocessPattern(p);
		int count=0;
		//find the occurrences of the substrings
		int len=s.length();
		int j=0;
		for(int i=0;i<len;){
			
			for(;j<p.length() && i<len;j++,i++){
				if(s.charAt(i)==p.charAt(j)){
					continue;
				}
				break;
			}
			//if all the characters are matched
			if(j==p.length()){
				count++;
			}
			//if we hit the end of string
			if(i==len) break;
			//if we found a mismatch between pattern and the string at the place other than p.charAt(0)
			if(j>=1)
				j=h[j-1];
			//if the first character of the pattern is not matching with the character in the string, move forward in the string
			else
				i++;
		}
		System.out.println("Total occurrences of pattern : "+p+" in the string "+s+" is :"+count);
	}
	public int [] preprocessPattern(String p){
		int len=p.length();
		int []h=new int[len];
		h[0]=0;
		
		for(int i=1;i<len;i++){
			if(p.charAt(h[i-1])==p.charAt(i)){
				h[i]=h[i-1]+1;
			}else{
				h[i]=0;
			}
		}
		return h;
	}
	
}
