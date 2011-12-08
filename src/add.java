import java.util.Random;

public class add extends agw // extends yy
{
	protected add(int paramInt, p/*Material*/ paramp)
	{
		super(paramInt, paramp);

		b(false);//setTickOnLoad
		if (paramp == p.h)
		{ // if lava
			b(true);//setTickOnLoad
		}
	}

	public void a(ry world, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
	{ // onNeighborBlockChange
		super.a(world, paramInt1, paramInt2, paramInt3, paramInt4);
		if (world.a(paramInt1, paramInt2, paramInt3) == this.bM/*blockID*/)
			j(world, paramInt1, paramInt2, paramInt3);
	}

	private void j(ry world, int paramInt1, int paramInt2, int paramInt3)
	{ // checkForHarden (?)
		int i = world.d(paramInt1, paramInt2, paramInt3);
		world.t = true;
		world.b(paramInt1, paramInt2, paramInt3, this.bM - 1 /*block id - 1*/, i);
		world.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
		world.a(paramInt1, paramInt2, paramInt3, this.bM - 1, d()/*Block.tickRate*/);
		world.t = false;
	}

	public void a(ry world, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
	{ // updateTick
		if (this.bZ == p.h)
		{ // if lava
			int i = paramRandom.nextInt(3);
			for (int j = 0; j < i; j++)
			{
				paramInt1 += paramRandom.nextInt(3) - 1;
				paramInt2++;
				paramInt3 += paramRandom.nextInt(3) - 1;
				int k = world.a(paramInt1, paramInt2, paramInt3);
				if (k == 0)
				{
					if ((!k(world, paramInt1 - 1, paramInt2, paramInt3)) && (!k(world, paramInt1 + 1, paramInt2, paramInt3)) && (!k(world, paramInt1, paramInt2, paramInt3 - 1)) && (!k(world, paramInt1, paramInt2, paramInt3 + 1)) && (!k(world, paramInt1, paramInt2 - 1, paramInt3)) && (!k(world, paramInt1, paramInt2 + 1, paramInt3)))
							continue;
					world.g(paramInt1, paramInt2, paramInt3, yy.ar.bM);
					return;
				}
				if (yy.k[k].bZ.d())
					return;
			}
		}
	}

	private boolean k(ry world, int paramInt1, int paramInt2, int paramInt3)
	{
		return world.e(paramInt1, paramInt2, paramInt3).g();
	}
}
