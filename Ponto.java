public class Ponto{
	private double x,y;
	public void setX (double x){
		this.x=x;
	}
	public double getX (){
                return x;
        }
	public void setY (double y){
		this.y=y;
	}
	public double getY (){
		return y;
	}









	public  static void main(String[]args){
		Ponto p1 =new  Ponto();
			p1.setX(100);
			p1.setY(200);
		Ponto p2 = new Ponto();
			p2.setX(150);
			p2.setY(200);
		Ponto p3= new Ponto();
                        p3.setX(50);
                        p3.setY(70);
		p3=p1;
		System.out.println(p1.getX());
		System.out.println(p2.getY());
		System.out.println(p3.getX());
		System.out.println(p3.getY());
	}
}
