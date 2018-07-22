import java.io.*;

class SampleP5{
		public static void main(String[] args) throws IOException{
				System.out.println("2以上の整数を入力してください。");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String str = br.readLine();
				int num = Integer.parseInt(str);
				if(num < 2){
						System.out.println(num + "は素数ではありません。");
				}else if(num == 2){
						System.out.println(num + "は素数です。");
				}else if(num % 2 == 0){
						System.out.println(num + "は素数ではありません。");
				}

				for(i=3; i<=num/i; i+=2){
						if(num % i == 0){
								System.out.println(num +"は素数ではありません。");
						}
						System.out.println(num +"は素数です。");
				}
		}
}
