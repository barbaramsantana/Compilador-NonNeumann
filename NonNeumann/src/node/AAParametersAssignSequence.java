/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAParametersAssignSequence extends PAParametersAssignSequence
{
    private PAParameterAssign _aParameterAssign_;

    public AAParametersAssignSequence()
    {
        // Constructor
    }

    public AAParametersAssignSequence(
        @SuppressWarnings("hiding") PAParameterAssign _aParameterAssign_)
    {
        // Constructor
        setAParameterAssign(_aParameterAssign_);

    }

    @Override
    public Object clone()
    {
        return new AAParametersAssignSequence(
            cloneNode(this._aParameterAssign_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParametersAssignSequence(this);
    }

    public PAParameterAssign getAParameterAssign()
    {
        return this._aParameterAssign_;
    }

    public void setAParameterAssign(PAParameterAssign node)
    {
        if(this._aParameterAssign_ != null)
        {
            this._aParameterAssign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParameterAssign_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParameterAssign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aParameterAssign_ == child)
        {
            this._aParameterAssign_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aParameterAssign_ == oldChild)
        {
            setAParameterAssign((PAParameterAssign) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}