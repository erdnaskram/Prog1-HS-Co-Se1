package kap2;

public class ProgU2_09 {
    public static void main(String[] args) {

        /*___a)
        {//A
            int x = 5;
            int y = 5;
            {//B
                float f = 10;
                float g = 10;
                {//C
                    int z = 42;
                    float h = 45;
                }
                y = 3000;
            }
            h = 5.0f;
            z = 4.0f
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            System.out.println("h = " + h);
        }
        */



        //___b)
        int z;
        float h;

        {//A
            int x = 5;
            int y = 5;
            {//B
                float f = 10;
                float g = 10;
                {//C
                    z = 42;
                    h = 45;
                }
                y = 3000;
            }
            h = 5.0f;
            z = (int) 4.0f;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            System.out.println("h = " + h);
        }

    }
}
