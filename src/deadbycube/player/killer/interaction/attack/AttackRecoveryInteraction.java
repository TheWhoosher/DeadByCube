package deadbycube.player.killer.interaction.attack;

import deadbycube.interaction.Interaction;
import deadbycube.util.MagicalValue;

public class AttackRecoveryInteraction extends Interaction {

    private static final String RECOVERY_SPEED_MODIFIER = "attack.recovery";
    private final MagicalValue duration;

    public AttackRecoveryInteraction(MagicalValue duration) {
        super("successful_hit_recovery");
        this.duration = duration;
    }

    @Override
    protected void onInteract() {
        interactor.getWalkSpeed().addModifier(RECOVERY_SPEED_MODIFIER, -85, MagicalValue.Operation.PERCENTAGE);
    }

    @Override
    protected void onUpdate(int tick) {
        if (tick >= duration.getValue())
            this.stopInteract();
    }

    @Override
    protected void onStopInteract(int tick) {
        interactor.getWalkSpeed().removeModifier(RECOVERY_SPEED_MODIFIER);
    }

}
