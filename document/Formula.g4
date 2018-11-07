grammar Formula;

@header {
package cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen;
}

    formula: //公式（整个语句）
        expression EOF;

    expression //表达式
        :   variableReference #Variable                 // 引用变量 ${表达式名}
        |   numeral #NumeralValue                       // 数字
        |   methodInvocation #MethodInvok               // 方法调用
        |   whenExpression   #ExpressionWhen            // when
        |   '(' expression ')' #BracketsExpression      // 括号
        |   expression '*' expression  #ExpressionMult  // *
        |   expression '/' expression  #ExpressionDiv   // /
        |   expression '+' expression  #ExpressionPlus  //  +
        |   expression '-' expression  #ExpressionMinus //  -
        ;

    whenExpression
        :   'when' '(' expression ')' '{' whenBranches ';' elseBranch '}'
        ;

    whenBranches
        :   whenBranch (';' whenBranch)*
        ;

    whenBranch
        :   whenCondition '=>' expression
        ;

    whenCondition
        :   logicExpression
        |   leftOmittedLogicExpression
        ;

    logicExpression
        :   expression cmpSymbol expression
        |   logicExpression logicSymbol logicExpression
        |   '(' logicExpression ')'
        ;

    leftOmittedLogicExpression
        :   ':'range
        |   ':'cmpSymbol expression
        |   '(' leftOmittedLogicExpression ')'
        |   leftOmittedLogicExpression logicSymbol leftOmittedLogicExpression
        |   leftOmittedLogicExpression logicSymbol logicExpression
        |   logicExpression logicSymbol leftOmittedLogicExpression
        ;

    elseBranch
        :   'else' '=>' expression
        ;

    logicSymbol
        :   LogicSymbol
        ;

    cmpSymbol
        :   CmpSymbol
        ;

    methodInvocation
        :   methodName methodParameterPart
        ;

    methodName
        :   MethodOrPropertyIdentity
        ;

    methodParameterPart
        :   '(' methodParameterList? ')'
        ;

    methodParameterList
        :   methodParameter (',' methodParameter)*
        ;

    methodParameter
        :   expression
        ;


    variableReference
        :   variableReferenceStart variableIndex variableReferenceEnd
        ;

    variableReferenceStart
        :   '${'
        ;

    variableReferenceEnd
        :   '}'
        ;

    variableIndex
        :   Identifier
        ;

    numeral
        :   '-'?NumeralLiteral'%'?
        ;

    range
        :   RangeStart rangeParameter ',' rangeParameter RangeEnd
        ;

    rangeParameter
        :   expression
        |   infinitySymbol
        ;

    infinitySymbol
        :   'infinity'
        ;

    LogicSymbol
        :   '&&'
        |   '||'
        ;

    CmpSymbol
        :   '>'
        |   '>='
        |   '<'
        |   '<='
        |   '=='
        ;

    RangeStart
        :   '`('
        |   '`['
        ;

    RangeEnd
        :   ')`'
        |   ']`'
        ;

    NumeralLiteral
        :   DecimalNumeral
        |   FloatingPointNumeral
        ;


    Identifier
        :   Letter LetterOrDigit*
        ;

    MethodOrPropertyIdentity
        :   Identifier'.'Identifier
        ;

    fragment
    Letter
        :   [a-zA-Z$_]
        |   ~[\u0000-\u007F\uD800-\uDBFF]
        ;

    fragment
    LetterOrDigit
        :   [a-zA-Z0-9$_]
        |   ~[\u0000-\u007F\uD800-\uDBFF]
        ;

    fragment
    DecimalNumeral
        :   '0'
        |   NonZeroDigit Digits?
        ;

    fragment
    FloatingPointNumeral
        :   Digits '.' Digits
        ;

    fragment
    Digits
        :   Digit+
        ;

    fragment
    Digit
        :   '0'
        |   NonZeroDigit
        ;

    fragment
    NonZeroDigit
        :   [1-9]
        ;

    fragment
    Sign
        :   [+-]
        ;

    WS  :  [ \t\r\n\u000C]+ -> skip
        ;