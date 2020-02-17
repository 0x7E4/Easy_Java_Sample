import java.io.*;
import java.lang.StringBuffer;

class SampleP3{
    public static void main(String[] args) throws IOException{
        System.out.println("文字列を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("aの挿入位置を整数で入力してください。");
        String a = br.readLine();
        int num = Integer.parseInt(a);
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rs = sb.insert(num, "a");

        System.out.println(rs +"になりました。");
    }
}