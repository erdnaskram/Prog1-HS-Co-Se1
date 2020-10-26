package kapitel1;

public class ProgU1_06 {
    public static void main(String[] args)  {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int z1 = Integer.parseInt(args[2]);
        int x2 = Integer.parseInt(args[3]);
        int y2 = Integer.parseInt(args[4]);
        int z2 = Integer.parseInt(args[5]);
        int x;
        int y;
        int z;

        int volume = 0;

        /** nicht gefordert - mir war langweilig  */
        int surface = 0;
        int edgeLength = 0;
        /** nicht gefordert - mir war langweilig  */

        if (x1 > x2) {
            x = x1-x2;
        } else {
            x = x2-x1;
        }

        if (y1 > y2) {
            y = y1-y2;
        } else {
            y = y2-y1;
        }

        if (z1 > z2) {
            z = z1-y2;
        } else {
            z = z2-z1;
        }

        volume = (x*y*z);

        /** nicht gefordert - mir war langweilig  */
        surface = (x*y*2+x*z*2+y*z*2);
        edgeLength = (x*4+y*4+z*4);

        System.out.println("X1: (" + x1 + ";" + y1 + ";" + z1 + ")");
        System.out.println("X2: (" + x2 + ";" + y2 + ";" + z2 + ")");
        /** nicht gefordert - mir war langweilig  */


        System.out.println("Das Objekt hat :" + volume + " VE");


        /** nicht gefordert - mir war langweilig  */
        System.out.println("Das Objekt hat :" + surface + " FE");
        System.out.println("Das Objekt hat :" + edgeLength + " LE");
        /** nicht gefordert - mir war langweilig  */


    }
}
