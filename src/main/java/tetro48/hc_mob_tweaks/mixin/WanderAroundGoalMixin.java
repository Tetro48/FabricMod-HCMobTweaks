package tetro48.hc_mob_tweaks.mixin;

import net.minecraft.entity.ai.goal.WanderAroundGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(WanderAroundGoal.class)
public abstract class WanderAroundGoalMixin {
	@ModifyArg(method = "<init>(Lnet/minecraft/entity/mob/PathAwareEntity;DI)V", index = 3, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/ai/goal/WanderAroundGoal;<init>(Lnet/minecraft/entity/mob/PathAwareEntity;DIZ)V"))
	private static boolean tryDisableDespawnCondition(boolean canDespawn) {
		return false;
	}
//	@ModifyConstant(method = "canStart", constant = @Constant(intValue = 100))
//	private int disregardDespawnTimer(int constant) {
//		return 2147483647;
//	}
}