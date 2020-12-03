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
public class QuestionNutrition extends AllQuestion {
    // - Nutrição
    // Lista para armazenar o gabarito 
// Instanciamento das listas para área de Nutrição
    private ArrayList<AllQuestion> answer = new ArrayList<AllQuestion>();
    // Lista para armazenar as questões e alternativas
    private ArrayList<AllQuestion> questionNutrition = new ArrayList<AllQuestion>();
    
    
    public QuestionNutrition() {  
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
    
      /* Método para inserir na lista as Strings se ele acertou, errou, limpar e 
    gabarito 
    - Nutrição */
    public void answerNutrition() {
        this.x = new AllQuestion();
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
    public void qNutrition() {
        
        // Questão 1
        this.x = new AllQuestion();
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
}
