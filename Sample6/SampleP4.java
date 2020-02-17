import java.io.*;
class SampleP4{
    public static void main(String[] args) throws IOException{
        for(int i=0; i<5; i++){
            switch(i){
                case 0:
                    System.out.println("*");
                    break;
                case 1:
                    System.out.println("**");
                    break;
                case 2:
                    System.out.println("***");
                    break;
                case 3:
                    System.out.println("****");
                    break;
                case 4:
                    System.out.println("*****");
                    break;
                default:
                    break;
            }
        }
    }
}