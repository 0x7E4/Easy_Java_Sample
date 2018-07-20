import java.io.*;

class Sample5{
		public static void main(String[] args) throws IOException{
				System.out.println("整数を入力してください。");
				//標準入力を受け付ける
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//オブジェクトを文字列に代入
				String str = br.readLine();
				//文字列を数値に変換
				int num = Integer.parseInt(str);

				System.out.println(num + "が入力されました。");
		}
}
				
