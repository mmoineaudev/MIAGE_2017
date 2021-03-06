package logiciel_ascenseur.mock.cabin;

public class EngineMock {

    boolean isStopped;
    boolean isGoingUp;
    boolean isGoingDown;


    /**getters for cabin**/

    public boolean isStopped() {
        return isStopped;
    }

    public boolean isGoingUp() {
        return isGoingUp;
    }

    public boolean isGoingDown() {
        return isGoingDown;
    }


    public EngineMock() {
        setStopped();
    }

    private void setStopped() {
        isGoingDown=false;
        isGoingUp=false;
        isStopped=true;
    }
    private void setUp() {
        isGoingDown=false;
        isGoingUp=true;
        isStopped=false;
    }
    private void setDown() {
        isGoingDown=true;
        isGoingUp=false;
        isStopped=false;
    }

    public void goUp() {
        setUp();
    }
    public void goDown(){
        setDown();
    }
    public void stop(){
        setStopped();
    }

    public CabinState getState() {
        if(isStopped) return CabinState.ARRET_FERME;
        if(isGoingUp) return CabinState.EN_MONTEE;
        if(isGoingDown) return CabinState.EN_DESCENTE;
        return CabinState.ARRET_OUVERT;//should never happen but make the compiler happy
    }
}
