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
public class QuestionViruse extends AllQuestion {
    // - Virologia
    // Lista para armazenar o gabarito
    // Instanciamento das listas para área de Virologia
    private ArrayList<AllQuestion> answerViruses = new ArrayList<AllQuestion>(); 
    // Lista para armazenar as questões e alternativas
    private ArrayList<AllQuestion> questionViruses = new ArrayList<AllQuestion>();

    public QuestionViruse() {  
    }
    
    // get para retornar as questões
    // - virologia
    public ArrayList getQuestionViruses() {
        return questionViruses;
    }
    
    // get para retornar as alternativas
    // - virologia
    public ArrayList getAnswerViruses() {
        return answerViruses;
    }
    
    
    /* Método para inserir na lista as Strings se ele acertou, errou, limpar e 
    gabarito */
    // - Virologia
    public void answerViruses() {
        this.x = new AllQuestion();
        x.setResult("RESPOSTA CORRETA!!");
        answerViruses.add(x);
        
        x = new AllQuestion();
        x.setResult("RESPOSTA INCORRETA!!");
        answerViruses.add(x);
        
        x = new AllQuestion();
        x.setResult(" ");
        answerViruses.add(x);
        
        // Questão 1
        x = new AllQuestion();
        x.setResult("Gabarito: O vírus não possui os componentes necessários para a auto-replicação");
        answerViruses.add(x);
        
        // Questão 2
        x = new AllQuestion();
        x.setResult("Gabarito: As proteínas virais são adquiridas");
        answerViruses.add(x);
        
        // Questão 3
        x = new AllQuestion();
        x.setResult("Gabarito: Alguns dos capsômeros");
        answerViruses.add(x);
        
        // Questão 4
        x = new AllQuestion();
        x.setResult("Gabarito: Poderia ajudar a virulência e a transmissão do vírus");
        answerViruses.add(x);
        
        // Questão 5
        x = new AllQuestion();
        x.setResult("Gabarito: Poderia prevenir o vírus de atacar a célula hospedeira");
        answerViruses.add(x);
        
        // Questão 6
        x = new AllQuestion();
        x.setResult("Gabarito: Desafia o dogma principal da biologia");
        answerViruses.add(x);
        
        // Questão 7
        x = new AllQuestion();
        x.setResult("Gabarito: DNA faz RNA que faz proteínas");
        answerViruses.add(x);
        
        // Questão 8
        x = new AllQuestion();
        x.setResult("Gabarito: Um vírus lítico, porque pode causar uma rápida destruição da cápsula articular");
        answerViruses.add(x);
        
        // Questão 9
        x = new AllQuestion();
        x.setResult("Gabarito: Falta de um material genético");
        answerViruses.add(x);
        
        // Questão 10
        x = new AllQuestion();
        x.setResult("Gabarito: Vírus lisogênicos");
        answerViruses.add(x);
        
    }
    
    // Perguntas e Alternativas
    // - Virologia.
    public void qViruses() {
        
        // Questão 1
        this.x = new AllQuestion();
        x.setQuestion("<html>" + "1. Quais das seguintes afirmações explica o porquê dos vírus conseguirem se" 
                        + "<br/>" 
                        + "  multiplicar somente em células vivas?" + ".</html>");
        x.setOp1("Sua fissão binária é controlada pelos genes das células hospedeiras");
        x.setOp2("O vírus não possui os componentes necessários para a auto-replicação"); // correta
        x.setOp3("O DNA só é capaz de se replicar dentro das células vivas"); 
        questionViruses.add(x);
        
        // Questão 2
        x = new AllQuestion();
        x.setQuestion("<html>" + "2. Qual das seguintes afirmações descreve corretamente como a membrana da célula" 
                        + "<br/>" 
                        + "  hospedeira é alterada pela replicação viral?" + ".</hmlt>");
        x.setOp1("Os poros se desenvolvem");
        x.setOp2("Uma camada de glicocálice é formada");
        x.setOp3("As proteínas virais são adquiridas"); // correta
        questionViruses.add(x);
        
        // Questão 3
        x = new AllQuestion();
        x.setQuestion("3. Qual fator pode ajudar a determinar a antigenicidade de um vírus?");
        x.setOp1("Alguns dos capsômeros"); // correta
        x.setOp2("O tamanho do vírus");
        x.setOp3("Todo o capsídeo");
        questionViruses.add(x);
        
        // Questão 4
        x = new AllQuestion();
        x.setQuestion("<html>" + "4. A transcriptase reversa é conhecida por apresentar pouca atividade de revisão." 
                        + "<br/>" 
                        + "  O que seria uma consequência disso?" + ".</html>");
        x.setOp1("Poderia ter erros de revisão na célula do hospedeiro");
        x.setOp2("Estabeleceria uma infecção duradoura com o hospedeiro");
        x.setOp3("Poderia ajudar a virulência e a transmissão do vírus"); // correta
        questionViruses.add(x);
        
        // Questão 5
        x = new AllQuestion();
        x.setQuestion("<html>" + "5. Um medicamento antiviral modifica especificamente receptores virais em uma célula" 
                        + "<br/>" 
                        + "  hospedeira eucariótica. Como isso pode afetar o ciclo reprodutivo do vírus?" + ".</html>");
        x.setOp1("Poderia resultar na degeneração do capsídeo do vírus");
        x.setOp2("Poderia prevenir o vírus de atacar a célula hospedeira"); // correta
        x.setOp3("Poderia aprimorar o processo de apoptose do vírus");
        questionViruses.add(x);
        
        // Questão 6
        x = new AllQuestion();
        x.setQuestion("6. Qual é a característica marcante da transcriptase reversa?");
        x.setOp1("É codificado no genoma da célula do hospedeiro");
        x.setOp2("Desafia o dogma principal da biologia"); // correta
        x.setOp3("Consegue ler o material genético de trás para frente");
        questionViruses.add(x);
        
        // Questão 7
        x = new AllQuestion();
        x.setQuestion("7. Qual dogma da genética teria de ser revisitado depois da descoberta de um retrovirus?");
        x.setOp1("Assistência de transcriptase na formação das proteínas");
        x.setOp2("DNA faz RNA que faz proteínas"); // correta
        x.setOp3("Replicação de RNA não pode ocorrer antes da tradução");
        questionViruses.add(x);
        
        // Questão 8
        x = new AllQuestion();
        x.setQuestion("<html>" + "8. Certos tipos de artrite ou inflamação das articulações podem ser causados por vírus." 
                        + "<br/>"
                        + "  Em alguns casos, os indivíduos infectados sofrem uma degradação aguda " 
                        + "<br/>"
                        + "  e rápida dos condrócitos que compõem a cápsula articular após a infecção."
                        + "<br/>"   
                        + "  Que tipo de vírus é mais provável de causar esses sintomas agudos?" + ".</html>");
        x.setOp1("Um vírus lisogênico, pois ataca especificamente e  destrói o condrócitos");
        x.setOp2("Um vírus lisogênico, pois sua virulência tende a ser expressada imediatamente");
        x.setOp3("Um vírus lítico, porque pode causar uma rápida destruição da cápsula articular"); // correta
        questionViruses.add(x);
        
        // Questão 9
        x = new AllQuestion();
        x.setQuestion("9. O que distingue um príon de um vírus?");
        x.setOp1("Falta de um material genético"); // correta
        x.setOp2("Presença de cápsula");
        x.setOp3("Tipo de organização de proteína");
        questionViruses.add(x);
        
        // Questão 10
        x = new AllQuestion();
        x.setQuestion("<html>" + "10. Os oncovírus são um tipo de vírus animal que podem causar uma neoplasia"
                        + "<br/>"
                        + " - um crescimento anormal, geralmente excessivo, de tecido. "
                        + "<br/>"
                        + "  Que tipo de vírus é mais provável de ser um oncovírus?" + ".<hmlt>");
        x.setOp1("Vírus líticos");
        x.setOp2("Vírus lisogênicos"); // correta
        x.setOp3("Vírus encapsulados ");
        questionViruses.add(x);  
    }
}
