import java.io.*;
class SampleP5{
    public static void main(String[] args)throws IOException{
            System.out.println("科目1~5の点数を入力してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = br.readLine();
            String str2 = br.readLine();
            String str3 = br.readLine();
            String str4 = br.readLine();
            String str5 = br.readLine();
            double i1 = Double.parseDouble(str1);
            double i2 = Double.parseDouble(str2);
            double i3 = Double.parseDouble(str3);
            double i4 = Double.parseDouble(str4);
            double i5 = Double.parseDouble(str5);
            int sum = (int)(i1+i2+i3+i4+i5);
            System.out.println("5科目の合計点は"+ sum +"点です。");
            System.out.println("5科目の平均点は"+ sum/5.0 +"点です。");
    }
}