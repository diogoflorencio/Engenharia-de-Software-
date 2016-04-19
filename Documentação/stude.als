module Stude

sig Disciplina{}

one sig Usuario{}

one sig Cronometro{} 

one sig Cronograma{
			estudar: set Disciplina
}

one sig Desempenho{
			horasDeEstudo: set Disciplina
}

one abstract sig MetodoDeEstudo{
	defineTempoDeEstudo: Cronometro
}

sig Regular extends MetodoDeEstudo{}
sig Avancado extends MetodoDeEstudo{}

one sig Stude{
	usuario: Usuario,
	cronogramaDeEstudo:Cronograma,
	tempoDeEstudo: Cronometro,
	metodoDeEstudo: MetodoDeEstudo,
	horasEstudadas/disciplina: Desempenho
}

fact{
	all d: Disciplina, c: Cronograma| d in c.estudar
	all d: Disciplina, des: Desempenho|  d in des.horasDeEstudo
	
}

assert teste{
  	all d: Disciplina, c: Cronograma | d in c.estudar
	all d: Disciplina, des: Desempenho | d in des.horasDeEstudo
	all u: Usuario, s: Stude | u in s.usuario
	all d: Desempenho, c: Cronograma | d.horasDeEstudo = c.estudar
}

check teste
pred show[]{}
run show for 8 //but 15 Times
