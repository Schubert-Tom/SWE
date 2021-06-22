package Model;
import java.util.ArrayList;


public class Transponder {
    private String pol;
    private String sat;
    private String orbital;
    private String freq;
    private String sym;
    private ArrayList<Channel> channels;

    public void setPol(String pol) {
        this.pol = pol;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public void setOrbital(String orbital) {
        this.orbital = orbital;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }
}
