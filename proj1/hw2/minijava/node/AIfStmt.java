/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AIfStmt extends PStmt
{
    private TIf _if_;
    private TLparen _lparen_;
    private PExpr _expr_;
    private TRparen _rparen_;
    private PStmt _thenclause_;
    private TElse _else_;
    private PStmt _elseclause_;

    public AIfStmt()
    {
        // Constructor
    }

    public AIfStmt(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") PStmt _thenclause_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PStmt _elseclause_)
    {
        // Constructor
        setIf(_if_);

        setLparen(_lparen_);

        setExpr(_expr_);

        setRparen(_rparen_);

        setThenclause(_thenclause_);

        setElse(_else_);

        setElseclause(_elseclause_);

    }

    @Override
    public Object clone()
    {
        return new AIfStmt(
            cloneNode(this._if_),
            cloneNode(this._lparen_),
            cloneNode(this._expr_),
            cloneNode(this._rparen_),
            cloneNode(this._thenclause_),
            cloneNode(this._else_),
            cloneNode(this._elseclause_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStmt(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    public PStmt getThenclause()
    {
        return this._thenclause_;
    }

    public void setThenclause(PStmt node)
    {
        if(this._thenclause_ != null)
        {
            this._thenclause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._thenclause_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public PStmt getElseclause()
    {
        return this._elseclause_;
    }

    public void setElseclause(PStmt node)
    {
        if(this._elseclause_ != null)
        {
            this._elseclause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseclause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._lparen_)
            + toString(this._expr_)
            + toString(this._rparen_)
            + toString(this._thenclause_)
            + toString(this._else_)
            + toString(this._elseclause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        if(this._thenclause_ == child)
        {
            this._thenclause_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._elseclause_ == child)
        {
            this._elseclause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(this._thenclause_ == oldChild)
        {
            setThenclause((PStmt) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._elseclause_ == oldChild)
        {
            setElseclause((PStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}