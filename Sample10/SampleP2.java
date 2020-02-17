import java.io.*;
import java.lang.StringBuffer;

class SampleP2{
    public static void main(String[] args) throws IOException{
        System.out.println("文字列を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rs = sb.reverse();

        System.out.println(str +"を逆順にすると"+ rs +"です。");
    }
}