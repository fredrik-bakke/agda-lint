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


    # Enter a parse tree produced by AgdaParser#functionDef.
    def enterFunctionDef(self, ctx:AgdaParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by AgdaParser#functionDef.
    def exitFunctionDef(self, ctx:AgdaParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by AgdaParser#pattern.
    def enterPattern(self, ctx:AgdaParser.PatternContext):
        pass

    # Exit a parse tree produced by AgdaParser#pattern.
    def exitPattern(self, ctx:AgdaParser.PatternContext):
        pass


    # Enter a parse tree produced by AgdaParser#namedArg.
    def enterNamedArg(self, ctx:AgdaParser.NamedArgContext):
        pass

    # Exit a parse tree produced by AgdaParser#namedArg.
    def exitNamedArg(self, ctx:AgdaParser.NamedArgContext):
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


    # Enter a parse tree produced by AgdaParser#inductivity.
    def enterInductivity(self, ctx:AgdaParser.InductivityContext):
        pass

    # Exit a parse tree produced by AgdaParser#inductivity.
    def exitInductivity(self, ctx:AgdaParser.InductivityContext):
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


    # Enter a parse tree produced by AgdaParser#abstractDecl.
    def enterAbstractDecl(self, ctx:AgdaParser.AbstractDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#abstractDecl.
    def exitAbstractDecl(self, ctx:AgdaParser.AbstractDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#instanceDecl.
    def enterInstanceDecl(self, ctx:AgdaParser.InstanceDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#instanceDecl.
    def exitInstanceDecl(self, ctx:AgdaParser.InstanceDeclContext):
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


    # Enter a parse tree produced by AgdaParser#openSpec.
    def enterOpenSpec(self, ctx:AgdaParser.OpenSpecContext):
        pass

    # Exit a parse tree produced by AgdaParser#openSpec.
    def exitOpenSpec(self, ctx:AgdaParser.OpenSpecContext):
        pass


    # Enter a parse tree produced by AgdaParser#nameList.
    def enterNameList(self, ctx:AgdaParser.NameListContext):
        pass

    # Exit a parse tree produced by AgdaParser#nameList.
    def exitNameList(self, ctx:AgdaParser.NameListContext):
        pass


    # Enter a parse tree produced by AgdaParser#renamingList.
    def enterRenamingList(self, ctx:AgdaParser.RenamingListContext):
        pass

    # Exit a parse tree produced by AgdaParser#renamingList.
    def exitRenamingList(self, ctx:AgdaParser.RenamingListContext):
        pass


    # Enter a parse tree produced by AgdaParser#renaming.
    def enterRenaming(self, ctx:AgdaParser.RenamingContext):
        pass

    # Exit a parse tree produced by AgdaParser#renaming.
    def exitRenaming(self, ctx:AgdaParser.RenamingContext):
        pass


    # Enter a parse tree produced by AgdaParser#pragmaDecl.
    def enterPragmaDecl(self, ctx:AgdaParser.PragmaDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#pragmaDecl.
    def exitPragmaDecl(self, ctx:AgdaParser.PragmaDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#pragmaName.
    def enterPragmaName(self, ctx:AgdaParser.PragmaNameContext):
        pass

    # Exit a parse tree produced by AgdaParser#pragmaName.
    def exitPragmaName(self, ctx:AgdaParser.PragmaNameContext):
        pass


    # Enter a parse tree produced by AgdaParser#pragmaArgs.
    def enterPragmaArgs(self, ctx:AgdaParser.PragmaArgsContext):
        pass

    # Exit a parse tree produced by AgdaParser#pragmaArgs.
    def exitPragmaArgs(self, ctx:AgdaParser.PragmaArgsContext):
        pass


    # Enter a parse tree produced by AgdaParser#optionDecl.
    def enterOptionDecl(self, ctx:AgdaParser.OptionDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#optionDecl.
    def exitOptionDecl(self, ctx:AgdaParser.OptionDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#optionArgs.
    def enterOptionArgs(self, ctx:AgdaParser.OptionArgsContext):
        pass

    # Exit a parse tree produced by AgdaParser#optionArgs.
    def exitOptionArgs(self, ctx:AgdaParser.OptionArgsContext):
        pass


    # Enter a parse tree produced by AgdaParser#fixityDecl.
    def enterFixityDecl(self, ctx:AgdaParser.FixityDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#fixityDecl.
    def exitFixityDecl(self, ctx:AgdaParser.FixityDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#fixityKeyword.
    def enterFixityKeyword(self, ctx:AgdaParser.FixityKeywordContext):
        pass

    # Exit a parse tree produced by AgdaParser#fixityKeyword.
    def exitFixityKeyword(self, ctx:AgdaParser.FixityKeywordContext):
        pass


    # Enter a parse tree produced by AgdaParser#fixityLevel.
    def enterFixityLevel(self, ctx:AgdaParser.FixityLevelContext):
        pass

    # Exit a parse tree produced by AgdaParser#fixityLevel.
    def exitFixityLevel(self, ctx:AgdaParser.FixityLevelContext):
        pass


    # Enter a parse tree produced by AgdaParser#syntaxDecl.
    def enterSyntaxDecl(self, ctx:AgdaParser.SyntaxDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#syntaxDecl.
    def exitSyntaxDecl(self, ctx:AgdaParser.SyntaxDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#syntaxPattern.
    def enterSyntaxPattern(self, ctx:AgdaParser.SyntaxPatternContext):
        pass

    # Exit a parse tree produced by AgdaParser#syntaxPattern.
    def exitSyntaxPattern(self, ctx:AgdaParser.SyntaxPatternContext):
        pass


    # Enter a parse tree produced by AgdaParser#syntaxAtom.
    def enterSyntaxAtom(self, ctx:AgdaParser.SyntaxAtomContext):
        pass

    # Exit a parse tree produced by AgdaParser#syntaxAtom.
    def exitSyntaxAtom(self, ctx:AgdaParser.SyntaxAtomContext):
        pass


    # Enter a parse tree produced by AgdaParser#variableDecl.
    def enterVariableDecl(self, ctx:AgdaParser.VariableDeclContext):
        pass

    # Exit a parse tree produced by AgdaParser#variableDecl.
    def exitVariableDecl(self, ctx:AgdaParser.VariableDeclContext):
        pass


    # Enter a parse tree produced by AgdaParser#visibility.
    def enterVisibility(self, ctx:AgdaParser.VisibilityContext):
        pass

    # Exit a parse tree produced by AgdaParser#visibility.
    def exitVisibility(self, ctx:AgdaParser.VisibilityContext):
        pass


    # Enter a parse tree produced by AgdaParser#expr.
    def enterExpr(self, ctx:AgdaParser.ExprContext):
        pass

    # Exit a parse tree produced by AgdaParser#expr.
    def exitExpr(self, ctx:AgdaParser.ExprContext):
        pass


    # Enter a parse tree produced by AgdaParser#letBinding.
    def enterLetBinding(self, ctx:AgdaParser.LetBindingContext):
        pass

    # Exit a parse tree produced by AgdaParser#letBinding.
    def exitLetBinding(self, ctx:AgdaParser.LetBindingContext):
        pass


    # Enter a parse tree produced by AgdaParser#whereBlock.
    def enterWhereBlock(self, ctx:AgdaParser.WhereBlockContext):
        pass

    # Exit a parse tree produced by AgdaParser#whereBlock.
    def exitWhereBlock(self, ctx:AgdaParser.WhereBlockContext):
        pass


    # Enter a parse tree produced by AgdaParser#withClause.
    def enterWithClause(self, ctx:AgdaParser.WithClauseContext):
        pass

    # Exit a parse tree produced by AgdaParser#withClause.
    def exitWithClause(self, ctx:AgdaParser.WithClauseContext):
        pass


    # Enter a parse tree produced by AgdaParser#name.
    def enterName(self, ctx:AgdaParser.NameContext):
        pass

    # Exit a parse tree produced by AgdaParser#name.
    def exitName(self, ctx:AgdaParser.NameContext):
        pass



del AgdaParser