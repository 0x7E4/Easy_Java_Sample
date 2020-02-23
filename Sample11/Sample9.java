class Car{
    protected int num;
    protected double gas;

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

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバーを"+ num +"にガソリン量を"+ gas +"にしました。");
    }

    public void show(){
        System.out.println("車のナンバーは"+ num +"です。");
        System.out.println("ガソリン量は"+ gas +"です。");
    }

    public String toString(){
        String str = "ナンバー:"+ num +"ガソリン量："+ gas;
        return str;
    }
}

class RacingCar extends Car{
    private int course;

    public RacingCar(){
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }

    public RacingCar(int n, double g, int c){
        super(n, g);
        course = c;
        System.out.println("コース番号"+ course +"のレーシングカーを作成しました。");
    }

    public void setCourse(int c){
        course = c;
        System.out.println("コース番号を"+ course +"にしました。");
    }

    public void show(){
        System.out.println("レーシングカーのナンバーは"+ num +"です。");
        System.out.println("ガソリン量は"+ gas +"です。");
        System.out.println("コース番号は"+ course +"です。");
    }

    public String toString(){
        String str = "ナンバー:"+ num +"ガソリン量："+ gas;
        return str;
    }
}

class Sample9{
    public static void main(String[] args){
        
       Car[] cars;
       cars = new Car[2];

       cars[0] = new Car();
       cars[1] = new RacingCar();

       for(int i=0; i<cars.length; i++){
           Class cl = cars[i].getClass();
           System.out.println((i+1) + "番目のオブジェクトのクラスは" + cl +"です。");
       }
    }
}