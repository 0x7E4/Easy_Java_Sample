import java.io.*;
class SampleP3{
    public static void main(String[] args)throws IOException{
        System.out.println("整数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int res1 = Integer.parseInt(str1);
        int res2 = Integer.parseInt(str2);

        System.out.println((res1==res2)?"2つの数は同じ値です。":res1+"より"+res2+"のほうが大きい値です。");
    }
}