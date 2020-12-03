/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.ArrayList;

/**
 *
 * @author Rafael Luna
 */
public class QuestionNursing extends AllQuestion {
    // - Enfermagem
    // Lista para armazenar o gabarito
    // Instanciamento das listas para área de Enfermagem
    private ArrayList<AllQuestion> answerNursing = new ArrayList<AllQuestion>();
    // Lista para armazenar as questões e alternativas 
    private ArrayList<AllQuestion> questionNursing = new ArrayList<AllQuestion>();

    public QuestionNursing() {  
    }
    
    // get para retornar as questões
    // - enfermagem
    public ArrayList getQuestionNursing() {
        return questionNursing;
    }
    
    // get para retornar as alternativas
    // - enfermagem
    public ArrayList getAnswerNursing() {
        return answerNursing;
    }
    
     /* Método para inserir na lista as Strings se ele acertou, errou, limpar e 
    gabarito 
    - enfermagem */
    public void answerNursing() {
        
        /* Apois adicionar um elemento na lista, deve-se limpar a mesma
        utilizando (variável do tipo da classe = new Classe();
        Dessa forma ele não irá sobreescrever o elemento */
        // Exemplo: this.x = new AllQuestion();
        // Utiliza a variável do tipo da classe como objeto para setar e adicionar.
        this.x = new AllQuestion();
        x.setResult("RESPOSTA CORRETA!!");
        answerNursing.add(x);
        
        this.x = new AllQuestion();
        x.setResult("RESPOSTA INCORRETA!!");
        answerNursing.add(x);
        
        this.x = new AllQuestion();
        x.setResult(" ");
        answerNursing.add(x);
        
        // Questão 1
        this.x = new AllQuestion();
        x.setResult("Gabarito: Agulha em ângulo de 90° graus");
        answerNursing.add(x);
        
        // Questão 2
        this.x = new AllQuestion();
        x.setResult("Gabarito: Deltóide");
        answerNursing.add(x);
        
        // Questão 3
        this.x = new AllQuestion();
        x.setResult("Gabarito: Lei nº 7498 de 25 do 6 de 1986");
        answerNursing.add(x);
        
        // Questão 4
        this.x = new AllQuestion();
        x.setResult("Gabarito: Carlos Chagas");
        answerNursing.add(x);
        
        // Questão 5
        this.x = new AllQuestion();
        x.setResult("Gabarito: 4500");
        answerNursing.add(x);
        
        // Questão 6
        this.x = new AllQuestion();
        x.setResult("Gabarito: Observar proeminências ósseas");
        answerNursing.add(x);
        
        // Questão 7
        this.x = new AllQuestion();
        x.setResult("Gabarito: BCG e Hepatite B");
        answerNursing.add(x);
        
        // Questão 8
        this.x = new AllQuestion();
        x.setResult("Gabarito: Realizar banho frio e conter no leito");
        answerNursing.add(x);
        
        // Questão 9
        this.x = new AllQuestion();
        x.setResult("Gabarito: Icterícia é um sintoma comum");
        answerNursing.add(x);
        
        // Questão 10
        this.x = new AllQuestion();
        x.setResult("Gabarito: Cirurgia");
        answerNursing.add(x);
    }
    
    // Perguntas e Alternativas
    // - Enfermagem.
    public void qNursing() {
        
        /* Apois adicionar um elemento na lista, deve-se limpar a mesma
        utilizando (variável do tipo da classe = new Classe();
        Dessa forma ele não irá sobreescrever o elemento */
        // Exemplo: this.x = new AllQuestion();
        // Utiliza a variável do tipo da classe como objeto para setar e adicionar.
        
        // Questão 1
        this.x = new AllQuestion();
        x.setQuestion("1. Qual a forma correta de se aplicar uma injeção intramuscular:");
        x.setOp1("Agulha em ângulo de 35° graus");
        x.setOp2("Agulha em ângulo de 90° graus"); // correta
        x.setOp3("Agulha completa");
        questionNursing.add(x);
        
        // Questão 2
        this.x = new AllQuestion();
        x.setQuestion("2. Qual o local indicado para a aplicação de vacina:");
        x.setOp1("Dorso-glútea");
        x.setOp2("Ventro-glútea");
        x.setOp3("Deltóide"); // correta
        questionNursing.add(x);
        
        // Questão 3
        this.x = new AllQuestion();
        x.setQuestion("3. Qual a lei que regulamentou o exercício da enfermagem no Brasil: ");
        x.setOp1("Lei nº 3897 de 10 do 7 de 1973");
        x.setOp2("Lei nº 7498 de 25 do 6 de 1986"); // correta
        x.setOp3("Lei nº 5562 de 29 do 11 de 1978");
        questionNursing.add(x);
        
        // Questão 4
        this.x = new AllQuestion();
        x.setQuestion("<html>" + "4. Em termos históricos, a enfermagem em saúde pública no Brasil "
                        + "<br/>"
                        + "tem sua origem particularmente associada à figura de:" + ".</html>");
        x.setOp1("Osvaldo Cruz");
        x.setOp2("Florence Nightingale");
        x.setOp3("Carlos Chagas"); // correta
        questionNursing.add(x);
        
        // Questão 5
        this.x = new AllQuestion();
        x.setQuestion("<html>" + "5. Qual o número máximo de pessoas a serem servidas pelos cuidados "
                        + "<br/>"
                        + "de uma equipe de saúde da família (ESF):" + ".</html>");
        x.setOp1("1500");
        x.setOp2("3500");
        x.setOp3("4500"); // correta
        questionNursing.add(x);
        
        // Questão 6
        this.x = new AllQuestion();
        x.setQuestion("<html>" + "6. A diretriz do banho tem o objetivo de tornar a hora do banho "
                        + "<br/>"
                        + "mais confortável científica e menos constrangedora sobre o banho no leito. "
                        + "<br/>"
                        + "Todas são diretrizes, EXCETO: " + ".</html>");
        x.setOp1("Manter a segurança ");
        x.setOp2("Observar proeminências ósseas"); // correta
        x.setOp3("Incentivar o autocuidado");
        questionNursing.add(x);
        
        // Questão 7
        this.x = new AllQuestion();
        x.setQuestion("7. Ao nascer, quais vacinas o recém nascido deve receber:");
        x.setOp1("BCG e Hepatite B"); // correta
        x.setOp2("Sarampo e Hepatite B");
        x.setOp3("BCG e Rota vírus");
        questionNursing.add(x);
        
        // Questão 8
        this.x = new AllQuestion();
        x.setQuestion("<html>" + "8. Dentre as emergências relacionadas ao álcool, a intoxicação aguda "
                        + "<br/>"
                        + "é a causa mais frequente de atendimento no pronto-socorro. "
                        + "<br/>"
                        + "Uma das intervenções no caso de intoxicação alcoólica é:" + ".</html>");
        x.setOp1("Realizar banho frio e conter no leito"); // correta
        x.setOp2("Proceder à lavagem gástrica com carvão ativado");
        x.setOp3("Observar e monitorar a febre, hipotensão ou hipertensão");
        questionNursing.add(x);
        
        // Questão 9
        this.x = new AllQuestion();
        x.setQuestion("9. Qual dessas informações é ERRADA sobre os sinais e sintomas do hepatoblastoma?");
        x.setOp1("Aumento de peso pode ser observado");
        x.setOp2("Icterícia é um sintoma comum"); // correta
        x.setOp3("Costuma ser assintomático");
        questionNursing.add(x);
        
        // Questão 10
        this.x = new AllQuestion();
        x.setQuestion("10. Para o tratamento da calosidade no pé diabético, orienta-se a intervenção ou uso de:");
        x.setOp1("Remoção mecânica por podóloga");
        x.setOp2("Uso de órteses");
        x.setOp3("Cirurgia"); // correta
        questionNursing.add(x);
    }
     
}
