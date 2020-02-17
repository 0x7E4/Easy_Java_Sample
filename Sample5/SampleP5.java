import java.io.*;
class SampleP5{
    public static void main(String[] args)throws IOException{
        System.out.println("0から10までの整数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int res1 = Integer.parseInt(str1);

        switch(res1){
            case 1:
                System.out.println("もっとがんばりましょう");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう。");
                break;
            case 3:
                System.out.println("さらに上を目指しましょう。");
                break;
            case 4:
                System.out.println("たいへんよくできました。");
                break;
            case 5:
                System.out.println("たいへん優秀です。");
                break;
            default:
                break;
        }
    }
}