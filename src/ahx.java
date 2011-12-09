import java.util.Random;

public class ahx extends agw
{
	int a = 0;

	boolean[] cb = new boolean[4];
	int[] cc = new int[4];
	private p matInstance = new p(aav.b);
		//for compiler confusion

	protected ahx(int paramInt, p paramp)
	{
		super(paramInt, paramp);
	}

	private void j(ry paramry, int paramInt1, int paramInt2, int paramInt3)
	{
		int i = paramry.d(paramInt1, paramInt2, paramInt3);

		paramry.b(paramInt1, paramInt2, paramInt3, this.bM + 1, i);
		paramry.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
		paramry.j(paramInt1, paramInt2, paramInt3);
	}

	public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
	{
		int i = g(paramry, paramInt1, paramInt2, paramInt3);

		int j = 1;
		if ((this.bZ == matInstance.h) && (!paramry.y.d))
		{
			j = 2;
		}
		int k = 1;
		int n;
		if (i > 0)
		{
			int m = -100;
			this.a = 0;
			m = f(paramry, paramInt1 - 1, paramInt2, paramInt3, m);
			m = f(paramry, paramInt1 + 1, paramInt2, paramInt3, m);
			m = f(paramry, paramInt1, paramInt2, paramInt3 - 1, m);
			m = f(paramry, paramInt1, paramInt2, paramInt3 + 1, m);

			n = m + j;
			if ((n >= 8) || (m < 0))
			{
				n = -1;
			}
			if (g(paramry, paramInt1, paramInt2 + 1, paramInt3) >= 0)
			{
				int i1 = g(paramry, paramInt1, paramInt2 + 1, paramInt3);
				if (i1 >= 8)
				{
					n = i1;				
				}
				else
				{
					n = i1 + 8;
				}
			}
			if ((this.a >= 2) && (this.bZ == matInstance.g))
			{
				if (paramry.e(paramInt1, paramInt2 - 1, paramInt3).b())
				{
					n = 0;
				} 
				else if ((paramry.e(paramInt1, paramInt2 - 1, paramInt3) == this.bZ) && (paramry.d(paramInt1, paramInt2, paramInt3) == 0))
				{
					n = 0;
				}
			}
			if ((this.bZ == matInstance.h) && 
			 (i < 8) && (n < 8) && (n > i) && 
			 (paramRandom.nextInt(4) != 0))
			{
				n = i;
				k = 0;
			}

			if (n != i) {
				i = n;
				if (i < 0)
				{
					paramry.g(paramInt1, paramInt2, paramInt3, 0);
				}
				else
				{
					paramry.f(paramInt1, paramInt2, paramInt3, i);
					paramry.a(paramInt1, paramInt2, paramInt3, this.bM, d());
					paramry.j(paramInt1, paramInt2, paramInt3, this.bM);
				}
			}
			else if (k != 0)
			{
				j(paramry, paramInt1, paramInt2, paramInt3);
			}
		}
		else
		{
			j(paramry, paramInt1, paramInt2, paramInt3);
		}
		if (m(paramry, paramInt1, paramInt2 - 1, paramInt3))
		{
			if ((this.bZ == matInstance.h) && 
			 (paramry.e(paramInt1, paramInt2 - 1, paramInt3) == matInstance.g))
			{
				paramry.g(paramInt1, paramInt2 - 1, paramInt3, yy.t.bM);
				h(paramry, paramInt1, paramInt2 - 1, paramInt3);
				return;
			}

			if (i >= 8)
			{
				paramry.d(paramInt1, paramInt2 - 1, paramInt3, this.bM, i);
			}
			else
			{
				paramry.d(paramInt1, paramInt2 - 1, paramInt3, this.bM, i + 8);
			}
		}
		else if ((i >= 0) && ((i == 0) || (l(paramry, paramInt1, paramInt2 - 1, paramInt3))))
		{
			boolean[] arrayOfBoolean = k(paramry, paramInt1, paramInt2, paramInt3);
			n = i + j;
			if (i >= 8)
			{
				n = 1;
			}
			if (n >= 8) return;
			if (arrayOfBoolean[0]) g(paramry, paramInt1 - 1, paramInt2, paramInt3, n);
			if (arrayOfBoolean[1]) g(paramry, paramInt1 + 1, paramInt2, paramInt3, n);
			if (arrayOfBoolean[2]) g(paramry, paramInt1, paramInt2, paramInt3 - 1, n);
			if (arrayOfBoolean[3]) g(paramry, paramInt1, paramInt2, paramInt3 + 1, n);
		}
	}

	private void g(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
	{
		if (m(paramry, paramInt1, paramInt2, paramInt3))
		{
			int i = paramry.a(paramInt1, paramInt2, paramInt3);
			if (i > 0)
			{
				if (this.bZ == matInstance.h)
				{
					h(paramry, paramInt1, paramInt2, paramInt3);
				} else {
					yy.k[i].b(paramry, paramInt1, paramInt2, paramInt3, paramry.d(paramInt1, paramInt2, paramInt3), 0);
				}
			}
			paramry.d(paramInt1, paramInt2, paramInt3, this.bM, paramInt4);
		}
	}

	private int c(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
	{
		int i = 1000;
		for (int j = 0; j < 4; j++)
		{
			if (((j == 0) && (paramInt5 == 1)) || 
			 ((j == 1) && (paramInt5 == 0)) || 
			 ((j == 2) && (paramInt5 == 3)) ||
			 ((j == 3) && (paramInt5 == 2)))
			{
				continue;
			}
			int k = paramInt1;
			int m = paramInt2;
			int n = paramInt3;

			if (j == 0) k--;
			if (j == 1) k++;
			if (j == 2) n--;
			if (j == 3) n++;

			if (l(paramry, k, m, n))
				continue;
			if ((paramry.e(k, m, n) == this.bZ) && (paramry.d(k, m, n) == 0))
				continue;
			if (!l(paramry, k, m - 1, n))
			{
				return paramInt4;
			}
			if (paramInt4 < 4)
			{
				int i1 = c(paramry, k, m, n, paramInt4 + 1, j);
				if (i1 >= i) continue;
				i = i1;
			}

		}

		return i;
	}

	private boolean[] k(ry paramry, int paramInt1, int paramInt2, int paramInt3)
	{
		int i,j,k,m;
		for (i = 0; i < 4; i++) {
			this.cc[i] = 1000;
			j = paramInt1;
			k = paramInt2;
			m = paramInt3;

			if (i == 0) j--;
			if (i == 1) j++;
			if (i == 2) m--;
			if (i == 3) m++;
			if (l(paramry, j, k, m))
				continue;
			if ((paramry.e(j, k, m) == this.bZ) && (paramry.d(j, k, m) == 0))
				continue;
			if (!l(paramry, j, k - 1, m))
			{
				this.cc[i] = 0;
			}
			else
			{
				this.cc[i] = c(paramry, j, k, m, 1, i);
			}

		}

		i = this.cc[0];
		for (j = 1; j < 4; j++)
		{
			if (this.cc[j] >= i) continue;
			i = this.cc[j];
		}

		for (j = 0; j < 4; j++)
		{
			this.cb[j] = (this.cc[j] == i ? true : false);
		}
		return this.cb;
	}

	private boolean l(ry paramry, int paramInt1, int paramInt2, int paramInt3)
	{
		int i = paramry.a(paramInt1, paramInt2, paramInt3);
		if ((i == yy.aE.bM) || (i == yy.aL.bM) || (i == yy.aD.bM) || (i == yy.aF.bM) || (i == yy.aX.bM))
		{
			return true;
		}
		if (i == 0) return false;
		p localp = yy.k[i].bZ;
		if (localp == matInstance.A) return true;
		return localp.d();
	}

	protected int f(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
	{
		int i = g(paramry, paramInt1, paramInt2, paramInt3);
		if (i < 0) return paramInt4;
		if (i == 0) this.a += 1;
		if (i >= 8) i = 0;
		return (paramInt4 < 0) || (i < paramInt4) ? i : paramInt4;
	}

	private boolean m(ry paramry, int paramInt1, int paramInt2, int paramInt3)
	{
		p localp = paramry.e(paramInt1, paramInt2, paramInt3);
		if (localp == this.bZ) return false;
		if (localp == matInstance.h) return false;
		return !l(paramry, paramInt1, paramInt2, paramInt3);
	}

	public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3)
	{
		super.a(paramry, paramInt1, paramInt2, paramInt3);
		if (paramry.a(paramInt1, paramInt2, paramInt3) == this.bM)
		{
			paramry.a(paramInt1, paramInt2, paramInt3, this.bM, d());
		}
	}
}
