package day_51.Tasks;

public class Travel {


//    public static void travelToOcean() {
//
//    }



    public static void travelToOcean(Weather weather) {

        if (weather.equals(Weather.HOT)) {
            System.out.println("It is good weather to go to the ocean");
        } else {
            throw new RuntimeException("It is not good time");
        }


        }

    public static void travelToMountain(Weather weather) throws Exception {
        if (weather.equals(Weather.WARM)) {
            throw new Exception("Perfect time to go to the hiking");
        } else if (weather.equals(Weather.HOT)) {
            throw new Exception("It is too hot");

        }else if(weather.equals(Weather.COLD)){
            throw new Exception("Get warm jacket");
        }else {
           throw new  Exception();
        }

    }

    public static void main(String[] args) throws Exception {

      //  travelToMountain(Weather.COLD);

                try {
                    travelToMountain(Weather.COLD);
                    System.out.println("Try block");
        } catch (Exception e) {
                    System.out.println("Catch block");
            System.out.println("e = " + e);
        }

        travelToOcean(Weather.HOT);
        try {
            travelToOcean(Weather.COLD);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }



    }

    }
