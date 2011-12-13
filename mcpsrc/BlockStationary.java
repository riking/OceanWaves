package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.MapColor;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockStationary extends BlockFluid {

	private Material matInstance;


	protected BlockStationary(int world, Material var2) {
		super(world, var2);
		this.matInstance = new Material(MapColor.airColor);
		this.setTickOnLoad(true);
		//Material world0001 = this.matInstance;
		//if(var2 == Material.lava) {
		//	this.setTickOnLoad(true);
		//}

	}

	public void onNeighborBlockChange(World world, int var2, int var3, int var4, int var5) {
		super.onNeighborBlockChange(world, var2, var3, var4, var5);
		if(world.getBlockId(var2, var3, var4) == this.blockID) {
			this.func_30004_j(world, var2, var3, var4);
		}

	}

	private void func_30004_j(World world, int var2, int var3, int var4)
	{ //makeFlowing
		int var5 = world.getBlockMetadata(var2, var3, var4);
		world.editingBlocks = true;
		world.setBlockAndMetadata(var2, var3, var4, this.blockID - 1, var5);
		world.markBlocksDirty(var2, var3, var4, var2, var3, var4);
		world.scheduleBlockUpdate(var2, var3, var4, this.blockID - 1, this.tickRate());
		world.editingBlocks = false;
	}

	public void updateTick(World world, int var2, int var3, int var4, Random var5) {
		Material world0001 = this.matInstance;
		if(this.blockMaterial == Material.lava) {
			int var6 = var5.nextInt(3);

			for(int var7 = 0; var7 < var6; ++var7) {
				var2 += var5.nextInt(3) - 1;
				++var3;
				var4 += var5.nextInt(3) - 1;
				int var8 = world.getBlockId(var2, var3, var4);
				if(var8 == 0) {
					if(this.func_301_k(world, var2 - 1, var3, var4) || this.func_301_k(world, var2 + 1, var3, var4) || this.func_301_k(world, var2, var3, var4 - 1) || this.func_301_k(world, var2, var3, var4 + 1) || this.func_301_k(world, var2, var3 - 1, var4) || this.func_301_k(world, var2, var3 + 1, var4)) {
						world.setBlockWithNotify(var2, var3, var4, Block.fire.blockID);
						return;
					}
				} else if(Block.blocksList[var8].blockMaterial.getIsSolid()) {
					return;
				}
			}
		}
		else
		{
			setBlockBounds(0f,0f,0f,0f,mod_oceanwaves.getheight(world, posx, paramInt2, paramInt3, paramRandom), 0f);
		}

	}

	private boolean func_301_k(World world, int var2, int var3, int var4) {
		return world.getBlockMaterial(var2, var3, var4).getCanBurn();
	}
}
