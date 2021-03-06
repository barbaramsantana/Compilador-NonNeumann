/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAFunctionDescription extends PAFunctionDescription
{
    private PAType _aType_;
    private PAFunctionParameters _aFunctionParameters_;
    private PAFunctionExpression _aFunctionExpression_;

    public AAFunctionDescription()
    {
        // Constructor
    }

    public AAFunctionDescription(
        @SuppressWarnings("hiding") PAType _aType_,
        @SuppressWarnings("hiding") PAFunctionParameters _aFunctionParameters_,
        @SuppressWarnings("hiding") PAFunctionExpression _aFunctionExpression_)
    {
        // Constructor
        setAType(_aType_);

        setAFunctionParameters(_aFunctionParameters_);

        setAFunctionExpression(_aFunctionExpression_);

    }

    @Override
    public Object clone()
    {
        return new AAFunctionDescription(
            cloneNode(this._aType_),
            cloneNode(this._aFunctionParameters_),
            cloneNode(this._aFunctionExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAFunctionDescription(this);
    }

    public PAType getAType()
    {
        return this._aType_;
    }

    public void setAType(PAType node)
    {
        if(this._aType_ != null)
        {
            this._aType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aType_ = node;
    }

    public PAFunctionParameters getAFunctionParameters()
    {
        return this._aFunctionParameters_;
    }

    public void setAFunctionParameters(PAFunctionParameters node)
    {
        if(this._aFunctionParameters_ != null)
        {
            this._aFunctionParameters_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aFunctionParameters_ = node;
    }

    public PAFunctionExpression getAFunctionExpression()
    {
        return this._aFunctionExpression_;
    }

    public void setAFunctionExpression(PAFunctionExpression node)
    {
        if(this._aFunctionExpression_ != null)
        {
            this._aFunctionExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aFunctionExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aType_)
            + toString(this._aFunctionParameters_)
            + toString(this._aFunctionExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aType_ == child)
        {
            this._aType_ = null;
            return;
        }

        if(this._aFunctionParameters_ == child)
        {
            this._aFunctionParameters_ = null;
            return;
        }

        if(this._aFunctionExpression_ == child)
        {
            this._aFunctionExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aType_ == oldChild)
        {
            setAType((PAType) newChild);
            return;
        }

        if(this._aFunctionParameters_ == oldChild)
        {
            setAFunctionParameters((PAFunctionParameters) newChild);
            return;
        }

        if(this._aFunctionExpression_ == oldChild)
        {
            setAFunctionExpression((PAFunctionExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
