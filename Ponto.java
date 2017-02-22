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
		double catop,catad,resultado;
		Ponto p1 =new  Ponto();
			p1.setX(10);
			p1.setY(20);
		Ponto p2 = new Ponto();
			p2.setX(15);
			p2.setY(20);
		catop=p1.getY()-p2.getY();
		catad=p1.getX()-p2.getX();
		catop=catop*catop;
		catad=catad*catad;
		resultado=Math.sqrt(catop+catad);
		System.out.println(resultado);
	}
}
