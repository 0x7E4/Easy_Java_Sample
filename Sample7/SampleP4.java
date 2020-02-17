import java.io.*;
class SampleP4{
    public static void main(String[] args) throws IOException{
        System.out.println("5人のテストの点数を入力してください。");
        int test[] = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            String str = br.readLine();
            int num = Integer.parseInt(str);
            test[i] = num;
        }

        for(int s=0; s<test.length-1; s++){
            for(int t=s+1; t<test.length; t++){
                if(test[t]>test[s]){
                    int tmp = test[s];
                    test[s] = test[t];
                    test[t] = tmp;
                }
            }
        }
        
        for(int i=0; i<5; i++){
            System.out.println(i+1 +"番目の人の点数は"+ test[i] +"です。");
        }
        System.out.println("最高点は"+ test[0] +"です。");
    
    }
}