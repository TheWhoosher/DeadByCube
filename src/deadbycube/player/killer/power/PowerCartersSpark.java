package deadbycube.player.killer.power;

import deadbycube.player.killer.Killer;

public class PowerCartersSpark extends Power {

    protected PowerCartersSpark(Killer killer) {
        super(killer);
    }

    @Override
    public void reset() {
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    protected void onUse() {
    }

    @Override
    protected void onUpdate() {
    }

    @Override
    protected void onStopUse() {
    }

}