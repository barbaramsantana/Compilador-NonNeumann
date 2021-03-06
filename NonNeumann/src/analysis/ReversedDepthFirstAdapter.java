/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPAProgram().apply(this);
        outStart(node);
    }

    public void inAAProgram(AAProgram node)
    {
        defaultIn(node);
    }

    public void outAAProgram(AAProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAProgram(AAProgram node)
    {
        inAAProgram(node);
        {
            List<PAFunctionDescription> copy = new ArrayList<PAFunctionDescription>(node.getAFunctionDescription());
            Collections.reverse(copy);
            for(PAFunctionDescription e : copy)
            {
                e.apply(this);
            }
        }
        outAAProgram(node);
    }

    public void inAAFunctionDescription(AAFunctionDescription node)
    {
        defaultIn(node);
    }

    public void outAAFunctionDescription(AAFunctionDescription node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAFunctionDescription(AAFunctionDescription node)
    {
        inAAFunctionDescription(node);
        if(node.getAFunctionExpression() != null)
        {
            node.getAFunctionExpression().apply(this);
        }
        if(node.getAFunctionParameters() != null)
        {
            node.getAFunctionParameters().apply(this);
        }
        if(node.getAType() != null)
        {
            node.getAType().apply(this);
        }
        outAAFunctionDescription(node);
    }

    public void inAAFunctionParameters(AAFunctionParameters node)
    {
        defaultIn(node);
    }

    public void outAAFunctionParameters(AAFunctionParameters node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAFunctionParameters(AAFunctionParameters node)
    {
        inAAFunctionParameters(node);
        {
            List<PAParameters> copy = new ArrayList<PAParameters>(node.getAParameters());
            Collections.reverse(copy);
            for(PAParameters e : copy)
            {
                e.apply(this);
            }
        }
        outAAFunctionParameters(node);
    }

    public void inAAFunctionExpression(AAFunctionExpression node)
    {
        defaultIn(node);
    }

    public void outAAFunctionExpression(AAFunctionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAFunctionExpression(AAFunctionExpression node)
    {
        inAAFunctionExpression(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        outAAFunctionExpression(node);
    }

    public void inAAIntAType(AAIntAType node)
    {
        defaultIn(node);
    }

    public void outAAIntAType(AAIntAType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIntAType(AAIntAType node)
    {
        inAAIntAType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAAIntAType(node);
    }

    public void inAARealAType(AARealAType node)
    {
        defaultIn(node);
    }

    public void outAARealAType(AARealAType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAARealAType(AARealAType node)
    {
        inAARealAType(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAARealAType(node);
    }

    public void inAABoolAType(AABoolAType node)
    {
        defaultIn(node);
    }

    public void outAABoolAType(AABoolAType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAABoolAType(AABoolAType node)
    {
        inAABoolAType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outAABoolAType(node);
    }

    public void inAAParameters(AAParameters node)
    {
        defaultIn(node);
    }

    public void outAAParameters(AAParameters node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParameters(AAParameters node)
    {
        inAAParameters(node);
        {
            List<PAParametersSequence> copy = new ArrayList<PAParametersSequence>(node.getAParametersSequence());
            Collections.reverse(copy);
            for(PAParametersSequence e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAParameter() != null)
        {
            node.getAParameter().apply(this);
        }
        outAAParameters(node);
    }

    public void inAAParametersSequence(AAParametersSequence node)
    {
        defaultIn(node);
    }

    public void outAAParametersSequence(AAParametersSequence node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParametersSequence(AAParametersSequence node)
    {
        inAAParametersSequence(node);
        if(node.getAParameter() != null)
        {
            node.getAParameter().apply(this);
        }
        outAAParametersSequence(node);
    }

    public void inAAParameterAParameter(AAParameterAParameter node)
    {
        defaultIn(node);
    }

    public void outAAParameterAParameter(AAParameterAParameter node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParameterAParameter(AAParameterAParameter node)
    {
        inAAParameterAParameter(node);
        if(node.getAType() != null)
        {
            node.getAType().apply(this);
        }
        outAAParameterAParameter(node);
    }

    public void inAAAssignFunctionAParameter(AAAssignFunctionAParameter node)
    {
        defaultIn(node);
    }

    public void outAAAssignFunctionAParameter(AAAssignFunctionAParameter node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAssignFunctionAParameter(AAAssignFunctionAParameter node)
    {
        inAAAssignFunctionAParameter(node);
        if(node.getAAssignFunction() != null)
        {
            node.getAAssignFunction().apply(this);
        }
        outAAAssignFunctionAParameter(node);
    }

    public void inAAAssignFunction(AAAssignFunction node)
    {
        defaultIn(node);
    }

    public void outAAAssignFunction(AAAssignFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAssignFunction(AAAssignFunction node)
    {
        inAAAssignFunction(node);
        if(node.getAParametersAssign() != null)
        {
            node.getAParametersAssign().apply(this);
        }
        if(node.getAType() != null)
        {
            node.getAType().apply(this);
        }
        outAAAssignFunction(node);
    }

    public void inAAParametersAssign(AAParametersAssign node)
    {
        defaultIn(node);
    }

    public void outAAParametersAssign(AAParametersAssign node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParametersAssign(AAParametersAssign node)
    {
        inAAParametersAssign(node);
        {
            List<PAParametersAssignSequence> copy = new ArrayList<PAParametersAssignSequence>(node.getAParametersAssignSequence());
            Collections.reverse(copy);
            for(PAParametersAssignSequence e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAParameterAssign() != null)
        {
            node.getAParameterAssign().apply(this);
        }
        outAAParametersAssign(node);
    }

    public void inAAParametersAssignSequence(AAParametersAssignSequence node)
    {
        defaultIn(node);
    }

    public void outAAParametersAssignSequence(AAParametersAssignSequence node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParametersAssignSequence(AAParametersAssignSequence node)
    {
        inAAParametersAssignSequence(node);
        if(node.getAParameterAssign() != null)
        {
            node.getAParameterAssign().apply(this);
        }
        outAAParametersAssignSequence(node);
    }

    public void inAAParameterAssignAParameterAssign(AAParameterAssignAParameterAssign node)
    {
        defaultIn(node);
    }

    public void outAAParameterAssignAParameterAssign(AAParameterAssignAParameterAssign node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAParameterAssignAParameterAssign(AAParameterAssignAParameterAssign node)
    {
        inAAParameterAssignAParameterAssign(node);
        if(node.getAType() != null)
        {
            node.getAType().apply(this);
        }
        outAAParameterAssignAParameterAssign(node);
    }

    public void inAAAssignFunctionAParameterAssign(AAAssignFunctionAParameterAssign node)
    {
        defaultIn(node);
    }

    public void outAAAssignFunctionAParameterAssign(AAAssignFunctionAParameterAssign node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAssignFunctionAParameterAssign(AAAssignFunctionAParameterAssign node)
    {
        inAAAssignFunctionAParameterAssign(node);
        if(node.getAAssignFunction() != null)
        {
            node.getAAssignFunction().apply(this);
        }
        outAAAssignFunctionAParameterAssign(node);
    }

    public void inAAIfThenElseStatementAExpression(AAIfThenElseStatementAExpression node)
    {
        defaultIn(node);
    }

    public void outAAIfThenElseStatementAExpression(AAIfThenElseStatementAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIfThenElseStatementAExpression(AAIfThenElseStatementAExpression node)
    {
        inAAIfThenElseStatementAExpression(node);
        if(node.getAIfThenElseStatement() != null)
        {
            node.getAIfThenElseStatement().apply(this);
        }
        outAAIfThenElseStatementAExpression(node);
    }

    public void inAACallFunctionAExpression(AACallFunctionAExpression node)
    {
        defaultIn(node);
    }

    public void outAACallFunctionAExpression(AACallFunctionAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAACallFunctionAExpression(AACallFunctionAExpression node)
    {
        inAACallFunctionAExpression(node);
        if(node.getACallFunction() != null)
        {
            node.getACallFunction().apply(this);
        }
        outAACallFunctionAExpression(node);
    }

    public void inAABlockExpressionAExpression(AABlockExpressionAExpression node)
    {
        defaultIn(node);
    }

    public void outAABlockExpressionAExpression(AABlockExpressionAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAABlockExpressionAExpression(AABlockExpressionAExpression node)
    {
        inAABlockExpressionAExpression(node);
        if(node.getABlockExpression() != null)
        {
            node.getABlockExpression().apply(this);
        }
        outAABlockExpressionAExpression(node);
    }

    public void inAALambdaAExpression(AALambdaAExpression node)
    {
        defaultIn(node);
    }

    public void outAALambdaAExpression(AALambdaAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAALambdaAExpression(AALambdaAExpression node)
    {
        inAALambdaAExpression(node);
        if(node.getALambda() != null)
        {
            node.getALambda().apply(this);
        }
        outAALambdaAExpression(node);
    }

    public void inAABiggerAExpression(AABiggerAExpression node)
    {
        defaultIn(node);
    }

    public void outAABiggerAExpression(AABiggerAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAABiggerAExpression(AABiggerAExpression node)
    {
        inAABiggerAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAABiggerAExpression(node);
    }

    public void inAAMinorAExpression(AAMinorAExpression node)
    {
        defaultIn(node);
    }

    public void outAAMinorAExpression(AAMinorAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMinorAExpression(AAMinorAExpression node)
    {
        inAAMinorAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAMinorAExpression(node);
    }

    public void inAAEqualAExpression(AAEqualAExpression node)
    {
        defaultIn(node);
    }

    public void outAAEqualAExpression(AAEqualAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAEqualAExpression(AAEqualAExpression node)
    {
        inAAEqualAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAEqualAExpression(node);
    }

    public void inAANegationAExpression(AANegationAExpression node)
    {
        defaultIn(node);
    }

    public void outAANegationAExpression(AANegationAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANegationAExpression(AANegationAExpression node)
    {
        inAANegationAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAANegationAExpression(node);
    }

    public void inAAOrAExpression(AAOrAExpression node)
    {
        defaultIn(node);
    }

    public void outAAOrAExpression(AAOrAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAOrAExpression(AAOrAExpression node)
    {
        inAAOrAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAOrAExpression(node);
    }

    public void inAAAndAExpression(AAAndAExpression node)
    {
        defaultIn(node);
    }

    public void outAAAndAExpression(AAAndAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAndAExpression(AAAndAExpression node)
    {
        inAAAndAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAAndAExpression(node);
    }

    public void inAAPlusAExpression(AAPlusAExpression node)
    {
        defaultIn(node);
    }

    public void outAAPlusAExpression(AAPlusAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAPlusAExpression(AAPlusAExpression node)
    {
        inAAPlusAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAPlusAExpression(node);
    }

    public void inAAMinusAExpression(AAMinusAExpression node)
    {
        defaultIn(node);
    }

    public void outAAMinusAExpression(AAMinusAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMinusAExpression(AAMinusAExpression node)
    {
        inAAMinusAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAMinusAExpression(node);
    }

    public void inAAMultAExpression(AAMultAExpression node)
    {
        defaultIn(node);
    }

    public void outAAMultAExpression(AAMultAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMultAExpression(AAMultAExpression node)
    {
        inAAMultAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAMultAExpression(node);
    }

    public void inAADivAExpression(AADivAExpression node)
    {
        defaultIn(node);
    }

    public void outAADivAExpression(AADivAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAADivAExpression(AADivAExpression node)
    {
        inAADivAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAADivAExpression(node);
    }

    public void inAAModAExpression(AAModAExpression node)
    {
        defaultIn(node);
    }

    public void outAAModAExpression(AAModAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAModAExpression(AAModAExpression node)
    {
        inAAModAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAModAExpression(node);
    }

    public void inAANegativeNumberAExpression(AANegativeNumberAExpression node)
    {
        defaultIn(node);
    }

    public void outAANegativeNumberAExpression(AANegativeNumberAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANegativeNumberAExpression(AANegativeNumberAExpression node)
    {
        inAANegativeNumberAExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAANegativeNumberAExpression(node);
    }

    public void inAATrueAExpression(AATrueAExpression node)
    {
        defaultIn(node);
    }

    public void outAATrueAExpression(AATrueAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAATrueAExpression(AATrueAExpression node)
    {
        inAATrueAExpression(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outAATrueAExpression(node);
    }

    public void inAAFalseAExpression(AAFalseAExpression node)
    {
        defaultIn(node);
    }

    public void outAAFalseAExpression(AAFalseAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAFalseAExpression(AAFalseAExpression node)
    {
        inAAFalseAExpression(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAAFalseAExpression(node);
    }

    public void inAAIntDecimalAExpression(AAIntDecimalAExpression node)
    {
        defaultIn(node);
    }

    public void outAAIntDecimalAExpression(AAIntDecimalAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIntDecimalAExpression(AAIntDecimalAExpression node)
    {
        inAAIntDecimalAExpression(node);
        if(node.getIntDecimal() != null)
        {
            node.getIntDecimal().apply(this);
        }
        outAAIntDecimalAExpression(node);
    }

    public void inAAIntHexadecimalAExpression(AAIntHexadecimalAExpression node)
    {
        defaultIn(node);
    }

    public void outAAIntHexadecimalAExpression(AAIntHexadecimalAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIntHexadecimalAExpression(AAIntHexadecimalAExpression node)
    {
        inAAIntHexadecimalAExpression(node);
        if(node.getIntHexadecimal() != null)
        {
            node.getIntHexadecimal().apply(this);
        }
        outAAIntHexadecimalAExpression(node);
    }

    public void inAAFloatAExpression(AAFloatAExpression node)
    {
        defaultIn(node);
    }

    public void outAAFloatAExpression(AAFloatAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAFloatAExpression(AAFloatAExpression node)
    {
        inAAFloatAExpression(node);
        if(node.getFloat() != null)
        {
            node.getFloat().apply(this);
        }
        outAAFloatAExpression(node);
    }

    public void inAACientificNotationAExpression(AACientificNotationAExpression node)
    {
        defaultIn(node);
    }

    public void outAACientificNotationAExpression(AACientificNotationAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAACientificNotationAExpression(AACientificNotationAExpression node)
    {
        inAACientificNotationAExpression(node);
        if(node.getCientificNotation() != null)
        {
            node.getCientificNotation().apply(this);
        }
        outAACientificNotationAExpression(node);
    }

    public void inAAIdentifierAExpression(AAIdentifierAExpression node)
    {
        defaultIn(node);
    }

    public void outAAIdentifierAExpression(AAIdentifierAExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIdentifierAExpression(AAIdentifierAExpression node)
    {
        inAAIdentifierAExpression(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAAIdentifierAExpression(node);
    }

    public void inAABlockExpression(AABlockExpression node)
    {
        defaultIn(node);
    }

    public void outAABlockExpression(AABlockExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAABlockExpression(AABlockExpression node)
    {
        inAABlockExpression(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        {
            List<PADeclarationConstant> copy = new ArrayList<PADeclarationConstant>(node.getADeclarationConstant());
            Collections.reverse(copy);
            for(PADeclarationConstant e : copy)
            {
                e.apply(this);
            }
        }
        outAABlockExpression(node);
    }

    public void inAADeclarationConstant(AADeclarationConstant node)
    {
        defaultIn(node);
    }

    public void outAADeclarationConstant(AADeclarationConstant node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAADeclarationConstant(AADeclarationConstant node)
    {
        inAADeclarationConstant(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        if(node.getAType() != null)
        {
            node.getAType().apply(this);
        }
        outAADeclarationConstant(node);
    }

    public void inAACallFunction(AACallFunction node)
    {
        defaultIn(node);
    }

    public void outAACallFunction(AACallFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAACallFunction(AACallFunction node)
    {
        inAACallFunction(node);
        if(node.getAListExpressions() != null)
        {
            node.getAListExpressions().apply(this);
        }
        outAACallFunction(node);
    }

    public void inAALambda(AALambda node)
    {
        defaultIn(node);
    }

    public void outAALambda(AALambda node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAALambda(AALambda node)
    {
        inAALambda(node);
        if(node.getAListExpressions() != null)
        {
            node.getAListExpressions().apply(this);
        }
        if(node.getAListIdentifiers() != null)
        {
            node.getAListIdentifiers().apply(this);
        }
        outAALambda(node);
    }

    public void inAAListIdentifiers(AAListIdentifiers node)
    {
        defaultIn(node);
    }

    public void outAAListIdentifiers(AAListIdentifiers node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAListIdentifiers(AAListIdentifiers node)
    {
        inAAListIdentifiers(node);
        {
            List<PAListIdentifiersSequence> copy = new ArrayList<PAListIdentifiersSequence>(node.getAListIdentifiersSequence());
            Collections.reverse(copy);
            for(PAListIdentifiersSequence e : copy)
            {
                e.apply(this);
            }
        }
        outAAListIdentifiers(node);
    }

    public void inAAIdentifierAListIdentifiersSequence(AAIdentifierAListIdentifiersSequence node)
    {
        defaultIn(node);
    }

    public void outAAIdentifierAListIdentifiersSequence(AAIdentifierAListIdentifiersSequence node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIdentifierAListIdentifiersSequence(AAIdentifierAListIdentifiersSequence node)
    {
        inAAIdentifierAListIdentifiersSequence(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outAAIdentifierAListIdentifiersSequence(node);
    }

    public void inAAListExpressions(AAListExpressions node)
    {
        defaultIn(node);
    }

    public void outAAListExpressions(AAListExpressions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAListExpressions(AAListExpressions node)
    {
        inAAListExpressions(node);
        {
            List<PAListExpressionsSequence> copy = new ArrayList<PAListExpressionsSequence>(node.getAListExpressionsSequence());
            Collections.reverse(copy);
            for(PAListExpressionsSequence e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        outAAListExpressions(node);
    }

    public void inAAListExpressionsSequence(AAListExpressionsSequence node)
    {
        defaultIn(node);
    }

    public void outAAListExpressionsSequence(AAListExpressionsSequence node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAListExpressionsSequence(AAListExpressionsSequence node)
    {
        inAAListExpressionsSequence(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        outAAListExpressionsSequence(node);
    }

    public void inAAIfThenElseStatement(AAIfThenElseStatement node)
    {
        defaultIn(node);
    }

    public void outAAIfThenElseStatement(AAIfThenElseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIfThenElseStatement(AAIfThenElseStatement node)
    {
        inAAIfThenElseStatement(node);
        if(node.getAElseStatement() != null)
        {
            node.getAElseStatement().apply(this);
        }
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        if(node.getAIfStatement() != null)
        {
            node.getAIfStatement().apply(this);
        }
        outAAIfThenElseStatement(node);
    }

    public void inAAIfStatement(AAIfStatement node)
    {
        defaultIn(node);
    }

    public void outAAIfStatement(AAIfStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIfStatement(AAIfStatement node)
    {
        inAAIfStatement(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        outAAIfStatement(node);
    }

    public void inAAElseStatement(AAElseStatement node)
    {
        defaultIn(node);
    }

    public void outAAElseStatement(AAElseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAElseStatement(AAElseStatement node)
    {
        inAAElseStatement(node);
        if(node.getAExpression() != null)
        {
            node.getAExpression().apply(this);
        }
        outAAElseStatement(node);
    }
}
