
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.mul.init;

import net.pedro.mul.block.BlackBlock;
import net.pedro.mul.MulMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MulModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MulMod.MODID);
	public static final RegistryObject<Block> BLACK = REGISTRY.register("black", () -> new BlackBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
