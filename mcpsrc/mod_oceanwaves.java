package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.BaseMod;
import net.minecraft.src.World;

public class mod_oceanwaves extends BaseMod {

	private float[] heights = new float[]{0.2F, 0.3F, 0.5F, 0.8F, 1.0F, 1.1F, 0.9F, 0.3F};


	public String getVersion() {
		return "Minecraft 1.0.0 mod v0.2";
	}

	public void load() {}

	public static float getHeight(World world, int posx, int posy, int posz, Random var5) 
	{
		int tempid = world.getBlockId(posx,posy+1,posz);
		if(tempid == Block.waterMoving.blockID || tempid == Block.waterStill.blockID)
		{
			return 1f; //don't want water in the middle of ponds changing
		}
		return this.heights[((int)(world.getWorldTime() % 8L) + posx) % 8];
	}
}
