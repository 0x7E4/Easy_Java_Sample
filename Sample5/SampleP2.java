import java.io.*;
class SampleP2{
    public static void main(String[] args)throws IOException{
        System.out.println("整数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        System.out.println((res%2==0)?res+"は偶数です。":res+"は奇数です。");
    }
}