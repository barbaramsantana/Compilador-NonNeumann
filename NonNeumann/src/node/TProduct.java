/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TProduct extends Token
{
    public TProduct()
    {
        super.setText("*");
    }

    public TProduct(int line, int pos)
    {
        super.setText("*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProduct(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProduct(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProduct text.");
    }
}