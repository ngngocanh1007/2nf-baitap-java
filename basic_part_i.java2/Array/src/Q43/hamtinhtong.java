package Q43;

public class hamtinhtong {
	void hamtinhtong(int A[],int n,int X) {
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				for(int k=j+1;k<n-1;k++) {
					for(int l=k+1;l<n;l++) {
						if(A[i]+A[j]+A[k]+A[l]==X) {
							System.out.println("tong: "+X+" la "+A[i]+","+A[j]+","+A[k]+","+A[l]);
						}
					}
				}
			}
		}
		
	}

}
