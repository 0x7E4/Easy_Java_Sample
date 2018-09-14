//Pointクラス
class Point{
		private int x;
		private int y;

		public Point(){
				x = 0;
				y = 0;
				System.out.println("初期座標を("+ x +","+ y +")としました。");
		}
		public Point(int px, int py){
				if((x >= 0 && x <= 100) && (y >= 0 && y <= 100)){
						x = px;
						y = py;
						System.out.println("初期座標を("+ x +","+ y +")と指定しました。");
				}else{
						System.out.println("座標は0~100の範囲で入力してください。");
				}
					
		}
		public void setX(int px){
				if(x >= 0 && x <= 100){
						x = px;
						System.out.println("x座標を設定しました。");
				}else{
						System.out.println("座標は0~100の範囲で入力してください。");
				}
		}
		public void setY(int py){
				if(y >= 0 && y <= 100){
						y = py;
						System.out.println("y座標を設定しました。");
				}else{
						System.out.println("座標は0~100の範囲で入力してください。");
				}
		}
		public int getX(){
				return x;
		}
		public int getY(){
				return y;
		}
}

class MyPoint{
		public static void main(String[] args){
				Point point1 = new Point();
				Point point2 = new Point(100,0);
				
				point2.setX(50);
				point2.setY(50);

				int numx = point2.getX();
				int numy = point2.getY();

				System.out.println("x座標は"+ numx +"\ny座標は"+ numy +"です。");
		}
}


