public class Lamp {

   private final Light red;
    private final Light yellow;
    private final Light green;


    public Lamp(){  // constructor method for lamps

      this.red = new Light(true);
      this.yellow = new Light(false);
      this.green = new Light(false);

    }

        public void switchLights(){  // method for switch lights in a lamp

        if (red.getIsLightOn()) {

            red.pressButton();
            green.pressButton();
        }
        else if (green.getIsLightOn()){

            green.pressButton();
            yellow.pressButton();
        }
        else if (yellow.getIsLightOn()){

            yellow.pressButton();
            red.pressButton();
        }

    }

        public boolean isGreenOn(){  // method to get if the green light in a lamp is on

        return green.getIsLightOn();
        }

    public boolean isYellowOn(){  // method to get if the yellow light in a lamp is on

        return yellow.getIsLightOn();
    }

    public boolean isRedOn(){

        return red.getIsLightOn();
    }


}
