package application;
public class TemperatureSensor implements Sensor{

    private boolean isOn;

    public TemperatureSensor(){
        this.isOn = false;
    }

    @Override
    public boolean isOn(){
        return this.isOn;
    }

    @Override
    public void setOn(){
        this.isOn = true;
    }

    @Override
    public void setOff(){
        this.isOn = false;
    }

    @Override
    public int read(){
        if(this.isOn){
            return (int) (Math.random() * 60 - 30);
        }
        throw new IllegalStateException("Sensor is off");
    }
        
    
}
