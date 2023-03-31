import java.util.ArrayList;

public class FindVandVpct{
    public static void main(String[] args) {
       ArrayList<data> s21 = new ArrayList<>();
       s21.add(new data("Tea", 100));
       s21.add(new data("Coffee", 100));
       s21.add(new data("Green Tea", 75));

       ArrayList<data> s22 = new ArrayList<>();
       s22.add(new data("Tea", 120));
       s22.add(new data("Coffee", 110));
       s22.add(new data("Green Tea", 100));
    
    

       ArrayList<data> variance = new ArrayList<>();
       ArrayList<data> varpt = new ArrayList<>();
       for(int i = 0; i<s22.size(); i ++){
        int var = s22.get(i).getPrice()- s21.get(i).getPrice();
        variance.add(new data(s21.get(i).getName(),var));
        double vpt = (double)var/s22.get(i).getPrice()*100;
        varpt.add(new data(s22.get(i).getName(), vpt, var));
       }
       System.out.println(varpt);
    }
}

import java.util.ArrayList;

public class FindVandVpct{
    public static void main(String[] args) {
       ArrayList<data> s21 = new ArrayList<>();
       s21.add(new data("Tea", 100));
       s21.add(new data("Coffee", 100));
       s21.add(new data("Green Tea", 75));

       ArrayList<data> s22 = new ArrayList<>();
       s22.add(new data("Tea", 120));
       s22.add(new data("Coffee", 110));
       s22.add(new data("Green Tea", 100));
    
    

       ArrayList<data> variance = new ArrayList<>();
       ArrayList<data> varpt = new ArrayList<>();
       for(int i = 0; i<s22.size(); i ++){
        int var = s22.get(i).getPrice()- s21.get(i).getPrice();
        variance.add(new data(s21.get(i).getName(),var));
        double vpt = (double)var/s22.get(i).getPrice()*100;
        varpt.add(new data(s22.get(i).getName(), vpt, var));
       }
       System.out.println(varpt);
    }
}

