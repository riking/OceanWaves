package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.BaseMod;
import net.minecraft.src.World;

public class mod_oceanwaves extends BaseMod {

   private float[] heights = new float[]{0.2F, 0.3F, 0.5F, 0.8F, 1.0F, 1.1F, 0.9F, 0.3F};


   public String getVersion() {
      return "Minecraft 1.0.0 mod v0";
   }

   public void load() {}

   public float getHeight(World var1, int var2, int var3, int var4, Random var5) {
      return this.heights[((int)(var1.getWorldTime() % 8L) + var2) % 8];
   }
}
