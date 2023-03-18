# Generated from Agda.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .AgdaParser import AgdaParser
else:
    from AgdaParser import AgdaParser

# This class defines a complete listener for a parse tree produced by AgdaParser.
class AgdaListener(ParseTreeListener):

    # Enter a parse tree produced by AgdaParser#prog.
    def enterProg(self, ctx:AgdaParser.ProgContext):
        pass

    # Exit a parse tree produced by AgdaParser#prog.
    def exitProg(self, ctx:AgdaParser.ProgContext):
        pass


    # Enter a parse tree produced by AgdaParser#declaration.
    def enterDeclaration(self, ctx:AgdaParser.DeclarationContext):
        pass

    # Exit a parse tree produced by AgdaParser#declaration.
    def exitDeclaration(self, ctx:AgdaParser.DeclarationContext):
        pass


    # Enter a parse tree produced by AgdaParser#datatypeDecl.
    def enterDatatypeDecl(self, ctx:AgdaParser.DatatypeDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#datatypeDecl.
    def exitDatatypeDecl(self, ctx:AgdaParser.DatatypeDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#constructorList.
    def enterConstructorList(self, ctx:AgdaParser.ConstructorListContext):
        pass

    # Exit a parse tree produced by AgdaParser#constructorList.
    def exitConstructorList(self, ctx:AgdaParser.ConstructorListContext):
        pass


    # Enter a parse tree produced by AgdaParser#constructorDecl.
    def enterConstructorDecl(self, ctx:AgdaParser.ConstructorDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#constructorDecl.
    def exitConstructorDecl(self, ctx:AgdaParser.ConstructorDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#functionDef.
    def enterFunctionDef(self, ctx:AgdaParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by AgdaParser#functionDef.
    def exitFunctionDef(self, ctx:AgdaParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by AgdaParser#recordDecl.
    def enterRecordDecl(self, ctx:AgdaParser.RecordDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#recordDecl.
    def exitRecordDecl(self, ctx:AgdaParser.RecordDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#recordBody.
    def enterRecordBody(self, ctx:AgdaParser.RecordBodyContext):
        pass

    # Exit a parse tree produced by AgdaParser#recordBody.
    def exitRecordBody(self, ctx:AgdaParser.RecordBodyContext):
        pass


    # Enter a parse tree produced by AgdaParser#fieldDecl.
    def enterFieldDecl(self, ctx:AgdaParser.FieldDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#fieldDecl.
    def exitFieldDecl(self, ctx:AgdaParser.FieldDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#moduleDecl.
    def enterModuleDecl(self, ctx:AgdaParser.ModuleDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#moduleDecl.
    def exitModuleDecl(self, ctx:AgdaParser.ModuleDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#postulateDecl.
    def enterPostulateDecl(self, ctx:AgdaParser.PostulateDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#postulateDecl.
    def exitPostulateDecl(self, ctx:AgdaParser.PostulateDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#openDecl.
    def enterOpenDecl(self, ctx:AgdaParser.OpenDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#openDecl.
    def exitOpenDecl(self, ctx:AgdaParser.OpenDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#importDecl.
    def enterImportDecl(self, ctx:AgdaParser.ImportDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#importDecl.
    def exitImportDecl(self, ctx:AgdaParser.ImportDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#pragmaDecl.
    def enterPragmaDecl(self, ctx:AgdaParser.PragmaDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#pragmaDecl.
    def exitPragmaDecl(self, ctx:AgdaParser.PragmaDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#optionDecl.
    def enterOptionDecl(self, ctx:AgdaParser.OptionDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#optionDecl.
    def exitOptionDecl(self, ctx:AgdaParser.OptionDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#expr.
    def enterExpr(self, ctx:AgdaParser.ExprContext):
        pass

    # Exit a parse tree produced by AgdaParser#expr.
    def exitExpr(self, ctx:AgdaParser.ExprContext):
        pass


    # Enter a parse tree produced by AgdaParser#sort.
    def enterSort(self, ctx:AgdaParser.SortContext):
        pass

    # Exit a parse tree produced by AgdaParser#sort.
    def exitSort(self, ctx:AgdaParser.SortContext):
        pass


    # Enter a parse tree produced by AgdaParser#name.
    def enterName(self, ctx:AgdaParser.NameContext):
        pass

    # Exit a parse tree produced by AgdaParser#name.
    def exitName(self, ctx:AgdaParser.NameContext):
        pass



del AgdaParser