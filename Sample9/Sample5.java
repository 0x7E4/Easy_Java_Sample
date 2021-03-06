class Car{
    private int num;
    private double gas;

    //コンストラクタ
    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public Car(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバー"+ num +"ガソリン量"+ gas +"の車を作成しました。");
    }

    public void setNumGas(int n,double g){
        if(g>0 && g<1000){
            num = n;
            gas = g;
            System.out.println("ナンバーを"+ num +"にガソリン量を"+ gas +"にしました。");
        }else{
            System.out.println(g +"は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }

    public void setCar(int n){
        num = n;
        System.out.println("ナンバーを"+ num +"にしました。");
    }

    public void setCar(double g){
        gas = g;
        System.out.println("ガソリン量を"+ gas +"にしました。");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバーを"+ num +"にガソリン量を"+ gas +"にしました。");
    }

    public void show(){
        System.out.println("車のナンバーは"+ num +"です。");
        System.out.println("ガソリン量は"+ gas +"です。");
    }
}

class Sample5{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}