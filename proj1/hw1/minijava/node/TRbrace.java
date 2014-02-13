/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class TRbrace extends Token
{
    public TRbrace()
    {
        super.setText("}");
    }

    public TRbrace(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRbrace(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRbrace(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRbrace text.");
    }
}
