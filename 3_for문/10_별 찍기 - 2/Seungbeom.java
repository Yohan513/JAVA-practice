import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int i;
        
        for(i=1; i<T+1; i++) {
        	for(int A=T; A>i; A--) {
        		bw.write(" ");
        	}
        	
        	for(int B=0; B<i; B++) {
        		bw.write("*");
        	}
        	
        	bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
