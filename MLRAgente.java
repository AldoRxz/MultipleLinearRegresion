package com.company;
import jade.core.Agent;
import jade.core.behaviours.*;

import java.util.Scanner;

public class MLRAgente extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agent " + this.getLocalName() + " started.");
        DataSet datos = new DataSet();
        datos.DataS();
        ventana g = new ventana(this);
        g.showGui();
    }

    public void ObtenerYhat(double x1, double x2){
        System.out.println("-Agente activado-");
        addBehaviour(new Behaviour(){
            boolean end=false;
            @Override
            public void action(){

                MLR Yhat = new MLR();
                System.out.printf("El resultado es: %.4f\n",Yhat.yhat(x1,x2));
                end =true;
            }

            public boolean done() {
                if (end==true){
                    return true;
                }
                else{
                    return false;
                }
            }

            public int onEnd(){
                System.out.println("-Agente muriendo-");
                myAgent.doDelete();
                return super.onEnd();
            }
        });
    }
}