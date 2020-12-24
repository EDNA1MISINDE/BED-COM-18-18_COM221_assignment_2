 class MaxFeed {
 private double maize;
 private double soya;
 private double groundnut;
 private double salt;
 private double sum;

 MaxFeed() {
    
}
 MaxFeed(double maize, double soya, double groundnut,double salt) {
    this.maize = maize;
    this.soya = soya;
    this.groundnut = groundnut;
    this.salt = salt;
}
public void setMaize(double maize) {
this.maize = maize;
}

public double getMaize() {
    double total1 = 0.6 * maize;
 return total1;
}

public void setSoya(double soya) {
 this.soya = soya;
}

public double getSoya() {
    double total2 = 0.2 * soya;
 return total2;
}

public void setGroundnut(double groundnut) {
 this.groundnut = groundnut;
 }

public double getGroundnut() {
    double total3 = 1.5 / 10 * groundnut;
 return total3;
}

public void setSalt(double salt) {
 this.salt = salt;
}

public double getSalt() {
    double total4 = 0.5 /10 *salt;
 return total4;
}

/*public double getMaxFeed() {
 double maxFeed = weight * KILOGRAMS_PER_POUND /
 ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
 return Math.round(bmi * 100) / 100.0;*/

public double getSum(){
    double totalSum = maize + soya + groundnut + salt;
    return totalSum;

} 
}