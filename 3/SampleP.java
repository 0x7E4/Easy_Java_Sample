import java.io.*;
class SampleP{
		public static void main(String[] args) throws IOException{
				System.out.println("身長と体重を入力してください。");

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				String str1 = br.readLine();
				String str2 = br.readLine();

				float tall = Float.parseFloat(str1);
				float weight = Float.parseFloat(str2);

				System.out.println("身長は"+ tall +"センチです。");
				System.out.println("体重は"+ weight +"キロです。");
		}
}
