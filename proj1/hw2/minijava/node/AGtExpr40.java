/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AGtExpr40 extends PExpr40
{
    private PExpr40 _left_;
    private TGt _gt_;
    private PExpr50 _right_;

    public AGtExpr40()
    {
        // Constructor
    }

    public AGtExpr40(
        @SuppressWarnings("hiding") PExpr40 _left_,
        @SuppressWarnings("hiding") TGt _gt_,
        @SuppressWarnings("hiding") PExpr50 _right_)
    {
        // Constructor
        setLeft(_left_);

        setGt(_gt_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AGtExpr40(
            cloneNode(this._left_),
            cloneNode(this._gt_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGtExpr40(this);
    }

    public PExpr40 getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpr40 node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TGt getGt()
    {
        return this._gt_;
    }

    public void setGt(TGt node)
    {
        if(this._gt_ != null)
        {
            this._gt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gt_ = node;
    }

    public PExpr50 getRight()
    {
        return this._right_;
    }

    public void setRight(PExpr50 node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._gt_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._gt_ == child)
        {
            this._gt_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpr40) newChild);
            return;
        }

        if(this._gt_ == oldChild)
        {
            setGt((TGt) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpr50) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}