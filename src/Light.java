public class Light {


   private boolean isLightOn;


   public Light(boolean isLightOn){  // Constructor method for lights

        this.isLightOn = isLightOn;
    }

    public void pressButton(){  // method to switch light

        isLightOn = !isLightOn;
    }

    public boolean getIsLightOn(){  // method to get if the light is on

        return isLightOn;
    }

}
