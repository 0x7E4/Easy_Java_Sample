class Car{
    int num;
    double gas;

    int getNum(){
        System.out.println("ナンバーを調べました。");
        return num;
    }

    double getGas(){
        System.out.println("ガソリン量を調べました。");
        return gas;
    }

    void setNumGas(int n, double g){
        num = n;
        gas = g;
        System.out.println("車のナンバーを"+ num +"にガソリン量を"+ gas +"にしました。");
    }

    void setNum(int n){
        num = n;
        System.out.println("ナンバーを"+ num +"にしました。");
    }

    void setGas(double g){
        gas = g;
        System.out.println("ガソリン量を"+ gas +"にしました。");
    }

    void show(){
        System.out.println("車のナンバー"+ num +"です。");
        System.out.println("ガソリン量は"+ gas +"です。");
    }

    void showCar(){
        System.out.println("これから車の情報を表示します。");
        show();
    }
}

class Sample6{
    public static void main(String[] args){
        Car car1 = new Car();

        car1.setNumGas(1234, 20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("サンプルから車を調べたところ");
        System.out.println("ナンバーは"+ number +"ガソリン量は"+ gasoline +"でした。");
    }
}