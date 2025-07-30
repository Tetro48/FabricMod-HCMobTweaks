package tetro48.hc_mob_tweaks.mixin;

import net.minecraft.entity.SpawnGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnGroup.class)
public abstract class SpawnGroupMixin {
	@Inject(method = "getImmediateDespawnRange", at = @At("RETURN"), cancellable = true)
	private void increaseImmediateDespawnRangeSeverely(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(46_340);
	}
}
