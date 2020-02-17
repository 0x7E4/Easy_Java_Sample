class MyPoint{
    private int x;
    private int y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(int px, int py){
        if(0 <= px && px <= 100 && 0 <= py && py <= 100){
            x = px;
            y = py;
        }else{
            System.out.println("値が正しくありません。");
        }
    }

    public void setX(int px){
        if(0 <= x && x <= 100){
            x = px;
        }else{
            System.out.println("値が正しくありません。");
        }
    }

    public void setY(int py){
        if(0 <= y && y <= 100){
            y = py;
        }else{
            System.out.println("値が正しくありません。");
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

class SampleP5{
    public static void main(String[] args){
        MyPoint my = new MyPoint(1,1);
        int a = my.getX();
        int b = my.getY();
        System.out.println(a+","+b);
    }
}