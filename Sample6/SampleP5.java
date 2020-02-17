import java.io.*;
class SampleP5{
    public static void main(String[] args) throws IOException{
        System.out.println("2以上の整数を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        boolean bl = true;

        for(int i=2; i<num; i++){
            if(num%i == 0){
                System.out.println(num +"は素数ではありません。");
                bl = false;
                break;
            }
        }
        if(bl){
            System.out.println(num +"は素数です。");
        }
    }
}