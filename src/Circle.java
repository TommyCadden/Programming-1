public class Circle {

    private double radius=1.8;
    private String color="red";
    private double area;

    public Circle(double radius){
        this.radius=radius;
        setColor(radius);
    }

    double getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }

    private double getArea(){
        return area;
    }

    private void setColor(double r){
        for (int i = 1; 1<= r; i++){
            if (i>=0 && i<6){
                color="red";
            }
            else if (i>=6 && i<11){
                color="amber";
            }
            else if(i>10&&i<16){
                color="blue";
            }
            else if(i>15&&i<21){
                color="purple";
            }
            else if(i>20&&i<25){
                color="black";
            }
            else{
                color="white";
            }
        }
    }
}
