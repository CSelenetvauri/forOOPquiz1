package elene_tvauri_1.quiz1.t2.oven.sub;

import elene_tvauri_1.quiz1.t2.beef.scene.A22;
import elene_tvauri_1.quiz1.t2.oven.A21;

public class R21 {

    public static void main(String[] args) {
        A21 a21 = new A21();

        int width = a21.getWidth();
        int height = a21.getHeight();

        int area = width * height;

        System.out.println("Area of the rectangle: " + area);


        A22 a22 = new A22();
        int monthNumber = a22.month;

        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month: " + months[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number");
        }
    }

}