import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer T = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(T.nextToken());
    	int X = Integer.parseInt(T.nextToken());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++) {
        	int A = Integer.parseInt(st.nextToken());
        	
        	if(A<X) {
        		bw.write(A + " ");
        	}
        }
        bw.flush();
        bw.close();
    }
}
