import java.io.*;

class SampleP{
		public static void main(String[] args) throws IOException{
				System.out.println("科目1~5の点数を入力してください。");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String one = br.readLine();
				String two = br.readLine();
				String three = br.readLine();
				String four = br.readLine();
				String five = br.readLine();

				double num1 = Double.parseDouble(one);
				double num2 = Double.parseDouble(two);
				double num3 = Double.parseDouble(three);
				double num4 = Double.parseDouble(four);
				double num5 = Double.parseDouble(five);

				double sum = num1 + num2 + num3 + num4 + num5;
				double ave = sum / 5.0;

				System.out.println("5科目の合計点は"+ (int)sum +"点です。");
				System.out.println("5科目の平均点は"+ ave +"点です。");
		}
}
				
