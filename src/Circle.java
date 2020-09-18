public class Circle {

    private double radius=1.8;
    private String color="red";
    private double area;

    public Circle(double radius){
        this.radius=radius;
    }

    private double getRadius(){
        return radius;
    }

    private double getArea(){
        return area;
    }

    private void setColor(double r){
        for (int i = 1; 1<= r; i++){
            if (i<10){
                color="red";
            }
            if (i>=10 && i<50){
                color="amber";
            }
            else if(i>50){
                color="green";
            }
        }
    }
}
