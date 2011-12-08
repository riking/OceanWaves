import java.util.Random;

public class add extends agw
{
  protected add(int paramInt, p paramp)
  {
    super(paramInt, paramp);

    b(false);
    if (paramp == p.h) b(true);
  }

  public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramry, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramry.a(paramInt1, paramInt2, paramInt3) == this.bM)
      j(paramry, paramInt1, paramInt2, paramInt3);
  }

  private void j(ry paramry, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    paramry.t = true;
    paramry.b(paramInt1, paramInt2, paramInt3, this.bM - 1, i);
    paramry.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    paramry.a(paramInt1, paramInt2, paramInt3, this.bM - 1, d());
    paramry.t = false;
  }

  public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.bZ == p.h) {
      int i = paramRandom.nextInt(3);
      for (int j = 0; j < i; j++) {
        paramInt1 += paramRandom.nextInt(3) - 1;
        paramInt2++;
        paramInt3 += paramRandom.nextInt(3) - 1;
        int k = paramry.a(paramInt1, paramInt2, paramInt3);
        if (k == 0) {
          if ((!k(paramry, paramInt1 - 1, paramInt2, paramInt3)) && (!k(paramry, paramInt1 + 1, paramInt2, paramInt3)) && (!k(paramry, paramInt1, paramInt2, paramInt3 - 1)) && (!k(paramry, paramInt1, paramInt2, paramInt3 + 1)) && (!k(paramry, paramInt1, paramInt2 - 1, paramInt3)) && (!k(paramry, paramInt1, paramInt2 + 1, paramInt3)))
            continue;
          paramry.g(paramInt1, paramInt2, paramInt3, yy.ar.bM);
          return;
        }
        if (yy.k[k].bZ.d())
          return;
      }
    }
  }

  private boolean k(ry paramry, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramry.e(paramInt1, paramInt2, paramInt3).g();
  }
}
