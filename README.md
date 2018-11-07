# MathFrontier - 一个简单的公式引擎

## 背景

本库用于满足项目中数值公式计算需求

## Hello World
```java
FormulaEvaluator formulaEvaluator = new FormulaEvaluatorImpl(
    formulaMethods, // 设置可以在公式中使用的方法
    new DefaultValueStrategy() // 设置变量值null时策略
);
FormulaEvaluatingContext context = new FormulaEvaluatingContext() {
    variableProvider = new MyVariableProvider() // 设置变量值来源
};
FormulaEvaluateResult result = formulaEvaluator.eval("1+${Foo}", context);
```

## 公式示例

* 支持数字字面量
```
1     // 整形
1.234 // 浮点数
100%  // 百分数
```

* 支持变量
```
${变量}
```

* 支持加减乘除以及任意层次的括号
```
(1+(2-3))*4/5
```

* 支持方法调用
```
Math.Abs(${变量})
```

* 支持方法调用
```
Math.Abs(${变量})
```

* 支持范围处理
```
when(${变量}) {
    :`[1, 2)` || :`[2, 3)` => 100;
    :`[6, infinity)` => 200;
    else => 0
}
```
```
when(${变量}) {
    :> 0 && :< 1 =>2;
    else => 0
}
```

具体语法参见[ANTLR文件](document/Formula.g4)或[单元测试](src/test/kotlin/cn/teleware/cp3/mathfrontier/impl/interpreter/FormulaExpInterpreterInterpretTests.kt)

## 线程安全

`FormulaEvaluatorImpl`线程安全，可以在多个线程中使用