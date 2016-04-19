module Stude

sig Disciplina{}

one sig Cronometro{} 

one sig Cronograma{
			estudar: set Disciplina
}

one sig Desempenho{
			horasEstudadas: Disciplina,
			meta : MetodoDeEstudo
}

one abstract sig MetodoDeEstudo{
	defineTempoDeEstudo: Cronometro
}

sig Regular extends MetodoDeEstudo{}
sig Avancado extends MetodoDeEstudo{}

one sig Usuario{
	cronogramaDeEstudo:Cronograma,
	tempoDeEstudo: Cronometro,
	metodoDeEstudo: MetodoDeEstudo,
	evolucao: Desempenho
}



fact{
	all d: Disciplina, u: Usuario| d in u.cronogramaDeEstudo.estudar
//	all d: Disciplina, des: Desempenho, u: Usuario |  d in u.cronogramaDeEstudo.estudar =>  d in des.horasEstudadas
	
}

//check teste
pred show[]{}
run show for 5 //but 15 Times
