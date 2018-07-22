import java.io.*;

class SampleP4{
		public static void main(String[] args) throws IOException{
				System.out.println("5人のテストの点数を入力してください。");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int[] test = new int[5];

				//点数を入力して配列に代入
				for(int i=0; i<test.length; i++){
						String str = br.readLine();
						test[i] = Integer.parseInt(str);
				}

				//入力された点数を降順にソート
				for(int s=0; s<test.length-1; s++){
						for(int t=s+1; t<test.length; t++){
								if(test[t] > test[s]){
										int tmp = test[t];
										test[t] = test[s];
										test[s] = tmp;
								}
						}
				}

				//ソート結果を出力
				for(int j=0; j<test.length; j++){
						System.out.println((j+1) +"番目の人の点数は"+ test[j] +"です。");
				}
				System.out.println("最高点は"+ test[0] +"です。");
		}
}


