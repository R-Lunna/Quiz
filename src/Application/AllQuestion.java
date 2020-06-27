/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class AllQuestion {
   
    // Variáveis gerais, são utilizadas para todas as questões, opções e etc.
    private String question;
    private String op1;
    private String op2;
    private String op3;
    private String result;
    private AllQuestion x;
    
    // - Enfermagem
    // Lista para armazenar o gabarito 
    private ArrayList<AllQuestion> answerNursing;
    // Lista para armazenar as questões e alternativas 
    private ArrayList<AllQuestion> questionNursing;
    
    // - Nutrição
    // Lista para armazenar o gabarito
    private ArrayList<AllQuestion> answer;
    // Lista para armazenar as questões e alternativas
    private ArrayList<AllQuestion> questionNutrition;
    
    // - Virologia
    // Lista para armazenar o gabarito 
    private ArrayList<AllQuestion> answerViruses;
    // Lista para armazenar as questões e alternativas
    private ArrayList<AllQuestion> questionViruses;
    
    // Método construtor 
    public AllQuestion() {
        // Instanciamento das listas para área de Enfermagem
        questionNursing = new ArrayList<AllQuestion>();
        answerNursing = new ArrayList<AllQuestion>();
        
        // Instanciamento das listas para área de Nutrição
        questionNutrition = new ArrayList<AllQuestion>();
        answer = new ArrayList<AllQuestion>();
        
        // Instanciamento das listas para área de Virologia
        questionViruses = new ArrayList<AllQuestion>();
        answerViruses = new ArrayList<AllQuestion>();   
    }

    // gets e sets 
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }
    
    public String getResult() {
        return result;
    }
    
    // set para inserir a resposta se ele acertou, errou, limpar e gabarito
    public void setResult(String result) {
        this.result = result;
    }
    
    // get para retornar a lista de questões
    // - nutrição
    public ArrayList getQuestionNutrition() {
        return questionNutrition;
    }
    
    // get para retornar as alternativas
    // - nutrição
    public ArrayList getAnswer() {
        return answer;
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
    public void answerNursing(AllQuestion a) {
        
        /* Apois adicionar um elemento na lista, deve-se limpar a mesma
        utilizando (variável do tipo da classe = new Classe();
        Dessa forma ele não irá sobreescrever o elemento */
        // Exemplo: this.x = new AllQuestion();
        // Utiliza a variável do tipo da classe como objeto para setar e adicionar.
        this.x = a;
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
    public void qNursing(AllQuestion n) {
        
        /* Apois adicionar um elemento na lista, deve-se limpar a mesma
        utilizando (variável do tipo da classe = new Classe();
        Dessa forma ele não irá sobreescrever o elemento */
        // Exemplo: this.x = new AllQuestion();
        // Utiliza a variável do tipo da classe como objeto para setar e adicionar.
        
        // Questão 1
        this.x = n;
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
    
    /* Método para inserir na lista as Strings se ele acertou, errou, limpar e 
    gabarito 
    - Nutrição */
    public void answerNutrition(AllQuestion a) {
        this.x = a;
        x.setResult("RESPOSTA CORRETA!!");
        answer.add(x);
        
        this.x = new AllQuestion();
        x.setResult("RESPOSTA INCORRETA!!!");
        answer.add(x);
        
        this.x = new AllQuestion();
        x.setResult(" ");
        answer.add(x);
        
        // Questão 1
        this.x = new AllQuestion();
        x.setResult("Gabarito: Frutas, verduras e legumes");
        answer.add(x);
        
        // Questão 2
        this.x = new AllQuestion();
        x.setResult("Gabarito: Amaranto");
        answer.add(x);
        
        // Questão 3
        this.x = new AllQuestion();
        x.setResult("Gabarito: Batata doce, aipim, arroz, milho");
        answer.add(x);
        
        // Questão 4
        this.x = new AllQuestion();
        x.setResult("Gabarito: Laranja e Acerola");
        answer.add(x);
        
        // Questão 5
        this.x = new AllQuestion();
        x.setResult("Gabarito: Queijos, carne e peixe");
        answer.add(x);
        
        // Questão 6
        this.x = new AllQuestion();
        x.setResult("Gabarito: Diabetes, hipertensão e doenças cardíacas");
        answer.add(x);
        
        // Questão 7
        this.x = new AllQuestion();
        x.setResult("Gabarito: Acelga, couve e alho poró");
        answer.add(x);
        
        // Questão 8
        this.x = new AllQuestion();
        x.setResult("Gabarito: Físicos, químicos e biológicos");
        answer.add(x);
        
        // Questão 9
        this.x = new AllQuestion();
        x.setResult("Gabarito: Nutricionais, econômicos, higiênicos e sensoriais");
        answer.add(x);
        
        // Questão 10
        this.x = new AllQuestion();
        x.setResult("Gabarito: Hipertensão arterial");
        answer.add(x);
    }
    
    // Perguntas e Alternativas
    // - Nutrição.
    public void qNutrition(AllQuestion n) {
        
        // Questão 1
        this.x = n;
        x.setQuestion("1. Quais alimentos são fontes de vitaminas, minerais e fibras?");
        x.setOp1("Frutas, verduras e legumes"); // Correta
        x.setOp2("Carne, peixe e frango");
        x.setOp3("Leite, queijo e iogurtes");
        questionNutrition.add(x);
        
        // Questão 2
        this.x = new AllQuestion();
        x.setQuestion("2. Qual desses cereais não contém glúten?");
        x.setOp1("Trigo");
        x.setOp2("Amaranto"); // Correta
        x.setOp3("Cevada");
        questionNutrition.add(x);
        
        // Questão 3
        x = new AllQuestion();
        x.setQuestion("3. Quais são os alimentos mais ricos carboidratos?");
        x.setOp1("Batata doce, aipim, arroz, milho"); // Correta
        x.setOp2("Queijo, iogurte, requeijão, brigadeiro");
        x.setOp3("Chuchu, alface, couve, batatinha");
        questionNutrition.add(x);
        
        // Questão 4
        x = new AllQuestion();
        x.setQuestion("4. Quais frutas são mais ricas em vitamina C?");
        x.setOp1("Pera e Maçã");
        x.setOp2("Banana e mamão");
        x.setOp3("Laranja e Acerola"); // Correta
        questionNutrition.add(x);
        
        // Questão 5
        x = new AllQuestion();
        x.setQuestion("5. Qual desses alimentos é mais rico em proteínas?");
        x.setOp1("Massas, arroz e batatas");
        x.setOp2("Pão integral, frutas e carne");
        x.setOp3("Queijos, carne e peixe"); // Correta
        questionNutrition.add(x);
        
        // Questão 6
        x = new AllQuestion();
        x.setQuestion("6. Obesidade é causadora de diversas doenças, como");
        x.setOp1("Prisão de ventre e gripe");
        x.setOp2("Diabetes, hipertensão e doenças cardíacas"); // Correta
        x.setOp3("Apenas diabetes e hipertensão");
        questionNutrition.add(x);
        
        // Questão 7
        x = new AllQuestion();
        x.setQuestion("7. Qual das alternativas abaixo são consideradas hortaliças folhosas?");
        x.setOp1("Fava, feijão e vagem");
        x.setOp2("Alcachofra, brócolis e couve-flor");
        x.setOp3("Acelga, couve e alho poró"); // correta
        questionNutrition.add(x);
        
        // Questão 8
        x = new AllQuestion();
        x.setQuestion("8. Quais fatores que modificam os alimentos?");
        x.setOp1("Físicos, químicos e biológicos"); // correta
        x.setOp2("Físicos e biológicos");
        x.setOp3("Apenas físicos");
        questionNutrition.add(x);
        
        // Questão 9
        x = new AllQuestion();
        x.setQuestion("9. Os principais objetivos da preparação técnica dos alimentos são:");
        x.setOp1("Nutricionais, digestivos e econômicos");
        x.setOp2("Nutricionais, econômicos, higiênicos e sensoriais"); // correta
        x.setOp3("Apenas nutricionais, higiênicos e sensoriais");
        questionNutrition.add(x);
        
        // Questão 10
        x = new AllQuestion();
        x.setQuestion("10. O excesso de sódio, principalmente do sal, pode desenvolver diversas doenças, inclusive a:");
        x.setOp1("Hipertensão arterial"); // correta
        x.setOp2("Prisão de ventre");
        x.setOp3("Diabetes");
        questionNutrition.add(x); 
    }
    
    /* Método para inserir na lista as Strings se ele acertou, errou, limpar e 
    gabarito */
    // - Virologia
    public void answerViruses(AllQuestion a) {
        this.x = a;
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
    public void qViruses(AllQuestion n) {
        
        // Questão 1
        this.x = n;
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
