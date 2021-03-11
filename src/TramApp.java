public class TramApp {
    public static void main(String[] args) {
        System.out.println("Hello! DON'T MISS YOUR STATION");

      //  int station = 1;

        int[] stationArray = new int[] {1,2,3,4,5,6,8};
        int[] stationProblemArray = new int[] {2,3,4,5,6,8,9};
        int[] durationArray = new int[] {12,23,14,15,26,18,19};

        for (int i = 0; i < stationArray.length; i++) {

            durationToDestination(stationArray[i], stationProblemArray[i], durationArray[i]);
        }

    }

    public static void durationToDestination(int station, int stationProblem, int duration) {
        switch (station) {
            case 1:
                System.out.println("At station 1 - There are still 20 mins. But, there are problems in station " +
                        stationProblem + ". Expect additional " + duration + " minutes of delay.");
                break;

            case 2:
                System.out.println("At station 2 - There are still 16 mins. But, there are problems in station " +
                        stationProblem + ". Expect additional " + duration + " minutes of delay.");
                break;

            case 3:
                System.out.println("At station 3 - There are still 15 mins. But, there are problems in station " +
                        stationProblem + ". Expect additional " + duration + " minutes of delay.");
                break;

            case 4:
                System.out.println("At station 4 - There are still 10 mins. But, there are problems in station " +
                        stationProblem + ". Expect additional " + duration + " minutes of delay.");
                break;

            case 5:
                System.out.println("At station 5 - There are still 3 mins. But, there are problems in station " +
                        stationProblem + ". Expect additional " + duration + " minutes of delay.");
                break;

            case 6:
                System.out.println("At station 6 - THIS IS YOUR STATION!!! DON'T MISS IT!!");
                break;

            default:
                System.out.println("Station unknown");
                break;
        }


    }
}
