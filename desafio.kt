// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       // Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
        inscritos.add(usuario)
    }

    fun imprimirFormacao(){
        println("Formação: $nome \n")
        println("Conteudo Educanional: ")
        for (conteudo in conteudos){
            println("${conteudo.nome}")
        }
        println()
        println("Os Alunos Matriculados: ")
        for (aluno in inscritos){
            println("${aluno.nome}")
        }
        println()
        println("Fim das informações!")
    }
}

fun main() {
   // Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
    // Criando uma lista de conteudos educacionais
    var conteudosFront : List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Html", 90),
        ConteudoEducacional("Css", 50),
        ConteudoEducacional("Javascript")
    )

    // Criando a formação Front-End
    var front = Formacao("Front-End", conteudosFront)

    // Criando alguns alunos
    var leo = Usuario("Leo Silva")
    var milena = Usuario("Milena Sena")
    var rilene = Usuario("Rilene Padilha")

    // Fazendo as matriculas
    front.matricular(leo)
    front.matricular(milena)
    front.matricular(rilene)

  // Simule alguns cenários de teste.
    front.imprimirFormacao()

}
