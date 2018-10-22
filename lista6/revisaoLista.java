package lista6;

import java.util.Scanner;

public class revisaoLista{
	public void main(String [] args) {
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    lista.inserir(5);
    lista.inserir(6);
    lista.inserir(7);
    in.close();
	}
}

class Lista{
    private int number;
    private Lista proximo;

    public Lista(){
        this.number=0;
        this.proximo=null;
    }
    public void inserir(int numero){
        if (this.number==0){
            this.number=numero;
            this.proximo=new Lista();
        }else{
            this.proximo.inserir(numero);
        }
    }
    public void remover(int numero){
        if(this.number!=0){
            if(this.number==numero){
                this.number=this.proximo.number;
                this.proximo=this.proximo.proximo;
            }else{
                this.proximo.remover(numero);
            }
        }else{
            throw new RuntimeException("Erro");
        }

    }
    public boolean tem(int numero){
        if(this.number==numero){
            return true;
        }else if(this.proximo != null){
            return this.proximo.tem(numero);
        }else{
            return false;
        }


    }



}