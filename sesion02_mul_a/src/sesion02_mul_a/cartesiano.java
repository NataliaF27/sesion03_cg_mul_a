package sesion02_mul_a;

public class cartesiano {
	private float x; 
	private float y;
	
	public cartesiano (float x, float y) {
		this.x=x; 
		this.y=y; 
	}
	public cartesiano() {
	
	}
	public cartesiano polar_cartesiano (float radio, float angulo) {
		float x=radio*(float)Math.cos(angulo); 
		float y=radio*(float)Math.sin(angulo); 

		return new cartesiano(x,y); 
		
	}
	public cartesiano polar_cartesiano(polar p) {
		float x=p.getRadio()*(float)Math.cos(p.getAngulo()); 
		float y=p.getRadio()*(float)Math.sin(p.getAngulo()); 
		
		return new cartesiano(); 
	}
	public  polar cartesiano_polar (float x, float y) {
		float radio=(float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));  
		float angulo=(float)Math.atan(y/x); 

		return new polar (radio,angulo); 
		
	}
	public polar cartesiano_polar(cartesiano c) {
		float radio=(float)Math.sqrt(Math.pow(c.getX(), 2)+Math.pow(c.getY(), 2)); 
		float angulo=(float)Math.atan(c.getY()/c.getX());
		
		return new polar(); 
	}
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	} 
	
	

}
