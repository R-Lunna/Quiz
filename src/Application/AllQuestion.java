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
    protected AllQuestion x;
    
    // Método construtor 
    public AllQuestion() {  
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
}
