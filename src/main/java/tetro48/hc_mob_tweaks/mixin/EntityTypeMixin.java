package tetro48.hc_mob_tweaks.mixin;

import net.minecraft.entity.EntityType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityType.class)
public abstract class EntityTypeMixin {
	@Mutable
	@Shadow @Final private boolean spawnableFarFromPlayer;

	@Inject(method = "<init>", at = @At("RETURN"))
	private void farAwaySpawns(CallbackInfo ci) {
		this.spawnableFarFromPlayer = true;
	}
}
