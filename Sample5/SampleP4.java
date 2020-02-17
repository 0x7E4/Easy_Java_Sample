import java.io.*;
class SampleP4{
    public static void main(String[] args)throws IOException{
        System.out.println("0から10までの整数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int res1 = Integer.parseInt(str1);

        System.out.println((res1<=10)?"正解です。":"間違いです。");
    }
}