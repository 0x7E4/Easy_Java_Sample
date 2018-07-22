import java.io.*;

class SampleP5{
		public static void main(String[] args) throws IOException{
				System.out.println("2以上の整数を入力してください。");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String str = br.readLine();
				int num = Integer.parseInt(str);
				boolean prime = true;
				if(num < 2){
						prime = false;
				}else if(num == 2){
						prime = true;
				}else if(num % 2 == 0){
						prime = false;
				}else{
	
						for(int i=3; i<=num/i; i+=2){
							if(num % i == 0){
									prime = false;
							}
						}
				}

				if(prime){
						System.out.println(num +"は素数です。");
				}else{
						System.out.println(num +"は素数ではありません。");
				}
		}
}
