public class RoadJunction {

    private final Lamp one;
    private final Lamp two;
    private final Lamp three;


    RoadJunction(){ // constructor method for road junctions

        this.one = new Lamp();
        this.one.switchLights();
        this.two = new Lamp();
        this.two.switchLights();
        this.three = new Lamp();

    }

    public void whichColor(){

        System.out.println("One green " + Boolean.toString(one.isGreenOn()) + " One yellow " + Boolean.toString(one.isYellowOn()) + " One red " + Boolean.toString(one.isRedOn()) + " Two green " + Boolean.toString(two.isGreenOn()) + " Two yellow " + Boolean.toString(two.isYellowOn()) + " Two Red " + Boolean.toString(two.isRedOn()) + " Three green " + Boolean.toString(three.isGreenOn()) + " Three yellow " + Boolean.toString(three.isYellowOn()) + " Three red " + Boolean.toString(three.isRedOn()));


    }

    /**
     * Switches lamps in the road junction.
     *
     */

    public void switchLamps(){

        if (one.isGreenOn() || two.isGreenOn() || three.isGreenOn()){

            if (one.isGreenOn() || one.isYellowOn()){

                one.switchLights();
            }
            if (two.isGreenOn() || two.isYellowOn()){

                two.switchLights();
            }
            if (three.isGreenOn() || three.isYellowOn()){

                three.switchLights();
            }

        }
        else {

            one.switchLights();
            two.switchLights();
            three.switchLights();



        }


    }

    /**
     * Checks if a lamp in a road junction is safe to cross. 1, 2 or 3 must be written as parameter.
     *
     * @param streetNumber Number of street to check
     * @return Is the street safe to cross
     */

    public boolean isCrossingSafe(int streetNumber){

        boolean returnValue;

        switch (streetNumber) {
            case 1:
                returnValue = one.isGreenOn();
                break;
            case 2:
                returnValue = two.isGreenOn();
                break;
            case 3:
                returnValue = three.isGreenOn();
                break;
            default:
                throw new IllegalArgumentException("Invalid street number");

        }


        return returnValue;
    }
}







