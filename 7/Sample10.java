class Sample10{
		public static void main(String[] args){
				int[][] test;
				test = new int[2][2];
				test[0][0] = 80;
				test[0][1] = 60;
				test[1][0] = 22;
				test[1][1] = 50;
				
				for(int i=0; i<2; i++){
						System.out.println((i+1) +"番目の人の国語の点数は"+ test[0][i] +"です。");
						System.out.println((i+1) +"番目の人の算数の点数は"+ test[1][i] +"です。");
				}
		}
}
