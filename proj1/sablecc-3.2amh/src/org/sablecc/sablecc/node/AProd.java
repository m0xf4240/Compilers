/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

public final class AProd extends PProd
{
  private TId _id_;
  private TArrow _arrow_;
  private final LinkedList _prodTransform_ = new TypedLinkedList(new ProdTransform_Cast());
  private final LinkedList _alts_ = new TypedLinkedList(new Alts_Cast());

  public AProd()
  {}

  public AProd(
    TId _id_,
    TArrow _arrow_,
    List _prodTransform_,
    List _alts_)
  {
    setId(_id_);

    setArrow(_arrow_);

    {
      this._prodTransform_.clear();
      this._prodTransform_.addAll(_prodTransform_);
    }

    {
      this._alts_.clear();
      this._alts_.addAll(_alts_);
    }

  }
  public Object clone()
  {
    return new AProd(
             (TId) cloneNode(_id_),
             (TArrow) cloneNode(_arrow_),
             cloneList(_prodTransform_),
             cloneList(_alts_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAProd(this);
  }

  public TId getId()
  {
    return _id_;
  }

  public void setId(TId node)
  {
    if(_id_ != null)
    {
      _id_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _id_ = node;
  }

  public TArrow getArrow()
  {
    return _arrow_;
  }

  public void setArrow(TArrow node)
  {
    if(_arrow_ != null)
    {
      _arrow_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _arrow_ = node;
  }

  public LinkedList getProdTransform()
  {
    return _prodTransform_;
  }

  public void setProdTransform(List list)
  {
    _prodTransform_.clear();
    _prodTransform_.addAll(list);
  }

  public LinkedList getAlts()
  {
    return _alts_;
  }

  public void setAlts(List list)
  {
    _alts_.clear();
    _alts_.addAll(list);
  }

  public String toString()
  {
    return ""
           + toString(_id_)
           + toString(_arrow_)
           + toString(_prodTransform_)
           + toString(_alts_);
  }

  void removeChild(Node child)
  {
    if(_id_ == child)
    {
      _id_ = null;
      return;
    }

    if(_arrow_ == child)
    {
      _arrow_ = null;
      return;
    }

    if(_prodTransform_.remove(child))
    {
      return;
    }

    if(_alts_.remove(child))
    {
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    if(_id_ == oldChild)
    {
      setId((TId) newChild);
      return;
    }

    if(_arrow_ == oldChild)
    {
      setArrow((TArrow) newChild);
      return;
    }

    for(ListIterator i = _prodTransform_.listIterator(); i.hasNext();)
    {
      if(i.next() == oldChild)
      {
        if(newChild != null)
        {
          i.set(newChild);
          oldChild.parent(null);
          return;
        }

        i.remove();
        oldChild.parent(null);
        return;
      }
    }

    for(ListIterator i = _alts_.listIterator(); i.hasNext();)
    {
      if(i.next() == oldChild)
      {
        if(newChild != null)
        {
          i.set(newChild);
          oldChild.parent(null);
          return;
        }

        i.remove();
        oldChild.parent(null);
        return;
      }
    }

  }

  private class ProdTransform_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PElem node = (PElem) o;

      if((node.parent() != null) &&
          (node.parent() != AProd.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != AProd.this))
      {
        node.parent(AProd.this);
      }

      return node;
    }
  }

  private class Alts_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PAlt node = (PAlt) o;

      if((node.parent() != null) &&
          (node.parent() != AProd.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != AProd.this))
      {
        node.parent(AProd.this);
      }

      return node;
    }
  }
}
