import java.io.*;
class SampleP4{
    public static void main(String[] args)throws IOException{
            System.out.println("三角形の高さと底辺を入力してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = br.readLine();
            String str2 = br.readLine();
            double i1 = Double.parseDouble(str1);
            double i2 = Double.parseDouble(str2);
            System.out.println("三角形の面積は"+ i1*i2/2 +"です。");
    }
}