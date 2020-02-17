class MyPoint{
    int x;
    int y;

    void setX(int px){
        x = px;
    }

    void setY(int py){
        y = py;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
}

class SampleP5{
    public static void main(String[] args){
        MyPoint my = new MyPoint();
        my.setX(10);
        my.setY(20);
        int x = my.getX();
        int y = my.getY();
        System.out.println(x+","+y);
    }
}