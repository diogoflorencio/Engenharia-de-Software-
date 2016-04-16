module SistemaDePermissão

abstract sig disciplina{}
sig portugues, matematica, ingles, fisica, quimica extends disciplina{}

one sig cronometro, cronograma, desempenho{} 

one sig usuario{
	estuda: disciplina,
	cronometro: cronometro,
	metodoDeEstudo: metodoDeEstudo 
}

one abstract sig metodoDeEstudo{}
sig regular extends metodoDeEstudo{}
sig avancado extends metodoDeEstudo{}

fact{
	all d: disciplina, u: usuario| d in u.estuda
}

//check teste
pred show[]{}
run show for 5 //but 15 Times
