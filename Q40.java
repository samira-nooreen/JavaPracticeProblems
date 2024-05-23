/*Study the Human class carefully.

Correct the class so that only one initialize method initializes all the Human class's instance variables.

Requirements:
The Human class must have 5 variables.
The class must have one initialize method.
The initialize method must have five parameters. */
/* 
Initializing objects
*/

public class Human {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int money, char sex,int weight,double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
