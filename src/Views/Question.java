/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Application.AllQuestion;
import Application.QuestionNursing;
import Application.QuestionNutrition;
import Application.QuestionViruse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Question extends javax.swing.JFrame {
    
    // Variáveis estáticas que guardam, respectivamente:
    /* - Quantidade de acertos 
       - Quantidade de erros
       - Quantidade de pontos (enfermagem)
       - Quantidade de pontos (nutrição)
       - Quantidade de pontos (virologia) */
    private static int correct = 0;
    private static int incorrect = 0;
    private static int scoreNursing = 0;
    private static int scoreNutrition = 0;
    private static int scoreViruses = 0;
    /**
     * Creates new form Question
     */
    
    // Método construtor
    public Question() {
    }
    
    /* Método construtor recebendo como parâmetro uma String que vai determinar
       qual das 3 opções o usuário escolheu e determinar qual método deve ser 
       chamado */
    public Question(String op) {
       initComponents();
       
       // Chama método de enfermagem
       if (op.contains("nursing")) Nursing();
       
       // Chama método de nutrição
       else if (op.contains("nutrition")) Nutrition();
       
       // Chama método de virologia
       else Viruses();
    }

    /* OBS.: Os sets "static" devem ser codificados dessa forma pelo fato das 
             variáveis serem "static", utilizando "Question" como objeto 
    */
    public String getCorrect() {
        return Integer.toString(correct);
    }
    
    public static void setCorrect(int correct) {
        Question.correct = correct;
    }

    public String getIncorrect() {
        return Integer.toString(incorrect);
    }
    
    public static void setIncorrect(int incorrect) {
        Question.incorrect = incorrect;
    }
    
    public String getScoreNursing() {
        return Integer.toString(scoreNursing);
    }
    
    public String getScoreNutrition() {
        return Integer.toString(scoreNutrition);
    }
    
    public String getScoreViruses() {
        return Integer.toString(scoreViruses);
    }
    
    // Método para o quiz de enfermagem
    private void Nursing() {
        
        // Instancia "n" para se tornar um objeto
        // Acessa as questões e alternativas de enfermagem passando "n" como argumento
        QuestionNursing n = new QuestionNursing();
        n.qNursing();
        
        // Array do tipo "AllQuestion" para armazenar toda a lista com as questões de enfermagem
        // n.getQuestionNursing(;) retorna a lista com as informações de enfermagem
        ArrayList<AllQuestion> list = n.getQuestionNursing();
        
        // Instancia "a" para se tornar um objeto
        // Acessa o gabarito de enfermagem passando "a" como argumento
        QuestionNursing a = new QuestionNursing();
        a.answerNursing();
        
        // Array do tipo "AllQuestion" para armazenar toda a lista com o gabarito de enfermagem
        // a.getAnswerNursing(); retorna a lista com as informações de enfermagem
        ArrayList<AllQuestion> result = a.getAnswerNursing();
        
        /* Seta no Label e RadioButton usando a "list" para retornar a questão 1
           e suas opções de enfermagem, a primeira questão deve sempre começar
           fora do laço */
        jLabel2.setText(list.get(0).getQuestion());
        jRadioButton1.setText(list.get(0).getOp1());
        jRadioButton2.setText(list.get(0).getOp2());
        jRadioButton3.setText(list.get(0).getOp3());
        
        // Armazena o clique no jButton1 e a partir disso gera uma ação
        jButton1.addActionListener(new ActionListener(){
            int i = 0, marcador = 3;
            
            // Método abstrato chamado de Override, que vai gerar a ação
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                /* Verifica qual dos RadioButton o usuário selecionou e verifica
                   se foi a resposta correta, o marcador serve para controlar
                   esse if, ou seja, só entra aqui após ele selecionar um 
                   RadioButton */
                if (marcador % 2 == 1) {
                    switch(i) {
                        // Verifica em qual questão o usuário está
                        case 0: {
                            /* Verifica qual RadioButton ele selecionou e se foi
                               o que contém a resposta correta, caso seja,
                               incrementa +1 na variável de acerto e +15 na 
                               variável score*/
                            // Usa "result" para acessar as informações da lista
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(3).getResult());
                                // Posição 0 contém "RESPOSTA CORRETA"""
                                jLabel3.setText(result.get(0).getResult());
                            // Do contrário incrementa +1 na variável de erro
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(3).getResult());
                                // Posição 1 contém "RESPOSTA INCORRETA!!"
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 1: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 2: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 3: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 4: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 5: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 6: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 7: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 8: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 9: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNursing += 15;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        default :{
                            break;
                        }
                    }
                }
                
                // Condição que serve para avançar para a próxima questão
                // Só termina quando chegar no final da lista
                if (marcador % 2 == 0 && i < list.size() - 1) {
                    i++;
                    // Seta a questão
                    jLabel2.setText(list.get(i).getQuestion());
                    
                    // Seta as alternativas
                    jRadioButton1.setText(list.get(i).getOp1());
                    jRadioButton2.setText(list.get(i).getOp2());
                    jRadioButton3.setText(list.get(i).getOp3());
                    
                    /* Limpa o jLabel4 e jLabel3 que contém o gabarito e se ele
                       acertou ou errou, antes de avançar para a próxima questão
                    */
                    // Posição zero contém " ", limpando o jLabel4 e jLabel3
                    jLabel4.setText(result.get(2).getResult());
                    jLabel3.setText(result.get(2).getResult());
                }
                
                /* Ao chegar na última questão e apresentar o resultado
                   ele avança para a próxima tela */
                if (marcador % 3 == 1 && i == list.size() - 1) {
                    setVisible(false);
                    // Chama tela "End" e passa como argumento "nursing"
                    new End("nursing").setVisible(true);          
                }
                
                // Incrementa +1 no marcador
                marcador++;
            }
        });
    }
   
    /* OBS.: Todos os comentários anteriores servem para os próximos métodos,
             pois todos seguem a mesma lógica, mudando apenas o tema
    */
    
    private void Nutrition() {
        QuestionNutrition n = new QuestionNutrition();
        n.qNutrition();
        
        ArrayList<AllQuestion> list = n.getQuestionNutrition();
        
        QuestionNutrition a = new QuestionNutrition();
        a.answerNutrition();
        
        ArrayList<AllQuestion> result = a.getAnswer();
        
        jLabel2.setText(list.get(0).getQuestion());
        jRadioButton1.setText(list.get(0).getOp1());
        jRadioButton2.setText(list.get(0).getOp2());
        jRadioButton3.setText(list.get(0).getOp3());
        
        jButton1.addActionListener(new ActionListener(){
            int i = 0, marcador = 3;
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (marcador % 2 == 1) {                    
                    switch (i) {
                        case 0: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(3).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(3).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }   
                            break;
                        }
                        case 1: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 2: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 3: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 4: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 5: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 6: {
                            if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 7: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 8: {
                            if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 9: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreNutrition += 15;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        default : {
                            break;
                        }
                    }
                }
            
                if (marcador % 2 == 0 && i < list.size() - 1) {
                    i++;
                    jLabel2.setText(list.get(i).getQuestion());
                    
                    jRadioButton1.setText(list.get(i).getOp1());
                    jRadioButton2.setText(list.get(i).getOp2());
                    jRadioButton3.setText(list.get(i).getOp3());
                    
                    jLabel4.setText(result.get(2).getResult());
                    jLabel3.setText(result.get(2).getResult());
                }
                
                if (marcador % 3 == 1 && i == list.size() - 1) {
                    setVisible(false);
                    new End("nutrition").setVisible(true);
                }
                
                marcador++;
            }
        });
    }

    private void Viruses() {
        QuestionViruse n = new QuestionViruse();
        n.qViruses();
        
        ArrayList<AllQuestion> list = n.getQuestionViruses();
        
        QuestionViruse a = new QuestionViruse();
        a.answerViruses();
        
        ArrayList<AllQuestion> result = a.getAnswerViruses();
        
        jLabel2.setText(list.get(0).getQuestion());
        jRadioButton1.setText(list.get(0).getOp1());
        jRadioButton2.setText(list.get(0).getOp2());
        jRadioButton3.setText(list.get(0).getOp3());
        
        jButton1.addActionListener(new ActionListener(){
            int i = 0, marcador = 3;
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                if (marcador % 2 == 1) {
                    switch (i) {
                        case 0: {
                            if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(3).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(3).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 1: {
                             if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                 incorrect++;
                                jLabel4.setText(result.get(4).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 2: {
                             if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(5).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 3: {
                             if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(6).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 4: {
                             if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(7).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 5: {
                             if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(8).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 6: {
                             if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(9).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 7: {
                             if (jRadioButton3.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(10).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 8: {
                             if (jRadioButton1.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(11).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        case 9: {
                             if (jRadioButton2.isSelected()) {
                                correct++;
                                scoreViruses += 15;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(0).getResult());
                            } else {
                                incorrect++;
                                jLabel4.setText(result.get(12).getResult());
                                jLabel3.setText(result.get(1).getResult());
                            }
                            break;
                        }
                        default : {
                            break;
                        }
                    }
                }
                
                if (marcador % 2 == 0 && i < list.size() - 1) {
                    i++;
                    jLabel2.setText(list.get(i).getQuestion());
                    
                    jRadioButton1.setText(list.get(i).getOp1());
                    jRadioButton2.setText(list.get(i).getOp2());
                    jRadioButton3.setText(list.get(i).getOp3());
                    
                    jLabel4.setText(result.get(2).getResult());
                    jLabel3.setText(result.get(2).getResult());
                }
                
                if (marcador % 3 == 1 && i == list.size() - 1) {
                    setVisible(false);
                    new End("viruses").setVisible(true);
                }
                marcador++;
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUIZ");

        buttonGroup1.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        jButton1.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 270, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question("nutrition").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}