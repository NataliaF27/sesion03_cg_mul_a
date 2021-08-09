
public class Esferica {
    float x; // distancia desde el origen a un punto p
    float y; // angulo con respecto al eje x de la proyeccion de punto sobre el plano x-y
    float z; //angulo del vector formado por el punto y el origen con respecto al eje z

    public Cilindrica esferica_cilindrica(float x,float y,float z){
        float radio=(float) (x*Math.sin(y)); 
        float angulo=z; 
        float zeta=(float)(x*Math.cos(y)); 
        return new Cilindrica(radio,angulo,zeta); 
       
    }
    
     public Cilindrica esferica_cilindrica (Cilindrica c){
       
        return esferica_cilindrica (c.getRadio(),c.getAngulo(),c.zeta); 
       
    }
    public Esferica cilindrica_esferica(float angulo,float radio, float zeta){
        float x=(float)(Math.sqrt((Math.pow(radio,2)+(Math.pow(zeta,2))))); 
        float y=(float)(Math.atan(radio/zeta)); 
        float z=zeta; 
        return new Esferica (x,y,z); 
    }
     public  Esferica cilindrica_esferica (Esferica e){
       
        return cilindrica_esferica (e.getX(),e.getY(),e.getZ()); 
       
    }
    public Esferica() {
    }

    public Esferica(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    
    
}
