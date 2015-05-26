/*
 * generated by Xtext
 */
package br.poli.ecomp.compiladores.generator

import br.poli.ecomp.compiladores.notC.Block
import br.poli.ecomp.compiladores.notC.Code
import br.poli.ecomp.compiladores.notC.Declaration

import br.poli.ecomp.compiladores.notC.Expression
import br.poli.ecomp.compiladores.notC.FuncParam
import br.poli.ecomp.compiladores.notC.Function
import br.poli.ecomp.compiladores.notC.IDDeclaration
import br.poli.ecomp.compiladores.notC.IfCommand
import br.poli.ecomp.compiladores.notC.RDeclaration
import br.poli.ecomp.compiladores.notC.Statement
import br.poli.ecomp.compiladores.notC.Type
import br.poli.ecomp.compiladores.notC.WhileCommand
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.EcoreUtil2.*
import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class NotCGenerator implements IGenerator {
	static class Variable
	{
		public String name;
		public Integer value = null;
	
		new(String n) 
		{
			name = n;
		}
		new(String n, Integer i) 
		{
			name = n;
			value = i;
		}
		
	}
	//Guarda em que parte do código estamos, serve para trabalhar com variáveis
	private Integer currentCodeScope;
	//Variáveis definidas neste escopo
	private Map<Integer, List<Variable>> variablesByScope;
	
	def compileCode(Code code)
	'''«IF variablesByScope.put(currentCodeScope, new ArrayList<Variable>()) == null»«ENDIF»«IF code.declarations != null»«FOR declaration : code.declarations»«declaration.compile»
«ENDFOR»«ENDIF»«IF code.functions != null»«FOR function : code.functions»«function.compile»«ENDFOR»«ENDIF»
	'''
	def dispatch compile(Declaration declaration)
	'''«declaration.type.compile» «declaration.value.compile»;'''
	def dispatch compile(RDeclaration rDeclaration)
	'''«IF rDeclaration.id != null»«rDeclaration.id.compile»«ENDIF»«IF rDeclaration.left != null»«rDeclaration.left.compile»«ENDIF»«IF rDeclaration.next != null», «rDeclaration.next.compile»«ENDIF»'''
	
	def dispatch compile(IDDeclaration idDeclaration)
	'''«IF variablesByScope.get(currentCodeScope).add(new Variable(idDeclaration.id.toString(), solve(idDeclaration.value)))»«ENDIF»«idDeclaration.id»«IF idDeclaration.value != null» = «idDeclaration.value.compile»«ENDIF»'''
	
	Integer leftValue;
	Integer rightValue;
	
	def Integer solve(Expression expression) 
	{
		if (expression == null)
			return null;
		if(expression.result != null)
		{
			try
			{
				//Se for um inteiro retornamos ele mesmo.
				return Integer.parseInt(expression.result);
			}
			catch(Exception e)
			{
				//Senão, tentamos capturar o valor do mesmo pelo mapa
				for(Variable variable : variablesByScope.get(currentCodeScope))
				{
					//Se a variável existir retorne o seu valor.
					if(variable.name.equals(expression.result))
					{
						return variable.value;
					}
				}
			}
			return null;
		}
		if(expression.value != null)
		{
			return solve(expression.value);
		}
		if(expression.operator != null)
		{
			leftValue = solve(expression.left);
			rightValue = solve(expression.right);
			if(leftValue == null || rightValue == null)
			{
				return null;
			}
			switch(expression.operator)
			{
				case "+":
				{
					return leftValue + rightValue;
				}
				case "-":
				{
					return leftValue - rightValue;
				}
				case "*":
				{
					return leftValue * rightValue;
				}
				case "/":
				{
					return leftValue / rightValue;
				}
				case "^":
				{
					return Math.pow(leftValue.doubleValue, rightValue.doubleValue).intValue;
				}
				default:
				{
					return leftValue;
				}
			}
		}
		else
		{
			return leftValue;	
		}
	}
	
	def dispatch compile(Expression expr)
	'''«IF expr.value != null»( «expr.value.compile» )«ENDIF»«IF expr.left != null»«expr.left.compile»«ENDIF»«IF expr.operator != null» «expr.operator» «ENDIF»«IF expr.right != null»«expr.right.compile»«ENDIF»'''
	
		
		
//Function: type=Type id=ID '(' (param=FuncParam)? ')' block=Block ;
//FuncParam: type=Type id=ID (',' next=FuncParam)? ;
//

	def dispatch compile(Function function)
	'''«function.type.compile» «function.id» ( «IF function.param != null»«function.param.compile»«ENDIF»)
«function.block.compile»'''
	
	def dispatch compile(FuncParam funcParam)
	'''«funcParam.type.compile» «funcParam.id»«IF funcParam.next != null», «funcParam.next.compile»«ENDIF»'''
	
//Block: '{' statement=Statement '}';
//Statement: (declarations+=IDDeclaration)* (commands+=Command)*;
	def dispatch compile(Block block)
	'''
{
«IF block.statement != null»«block.statement.compile»«ENDIF»
}'''
	
	def dispatch compile(Statement statement)
	'''«IF statement.declarations != null»«FOR declaration : statement.declarations»	«declaration.compile»
«ENDFOR»«ENDIF»«IF statement.commands != null»«FOR command : statement.commands»	«command.compile»
«ENDFOR»«ENDIF»'''

//Command: IfCommand | WhileCommand;
//IfCommand: 'if' '(' expr=Expr ')' ifBlock = Block ('else' elseBlock=Block)?;
//WhileCommand: 'while' '(' expr=Expr ')' whileBlock=Block;
//«»
	def dispatch compile(IfCommand ifcommand)
	'''«IF solve(ifcommand.expr) == null»if ( «ifcommand.expr.compile» ) 
	«ifcommand.ifBlock.compile»«IF ifcommand.elseBlock != null»
	else 
	«ifcommand.elseBlock.compile»«ENDIF»
	«ELSE»«IF solve(ifcommand.expr).intValue != 0»«ifcommand.ifBlock.compile»«ELSE»«IF ifcommand.elseBlock != null»«ifcommand.elseBlock.compile»«ENDIF»«ENDIF»«ENDIF»'''
	
	def dispatch compile(WhileCommand whileCommand)
	'''while ( «whileCommand.expr.compile» )
	«whileCommand.whileBlock.compile»«IF whileCommand.whileBlock != null»«ENDIF»'''
	
	def dispatch compile(Type type)
	'''«type.value»'''
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		currentCodeScope = 0;
		variablesByScope = new HashMap<Integer, List<Variable>>();
		for(e: resource.allContents.toIterable.filter(Code)) 
		{ 
			fsa.generateFile(resource.normalizedURI.lastSegment+"_", e.compileCode);
		}
	}
}