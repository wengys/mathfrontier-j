package cn.teleware.cp3.mathfrontier.exceptions

class SyntaxErrorException(val phase: String, message: String) : Exception("(${phase}) ${message}")