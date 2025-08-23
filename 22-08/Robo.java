class Robo {
    String nomeRobo;
    int cargaBateria;
    int velocidadeRobo = 2;



    String getNomeRobo() {
        return this.nomeRobo;
    }
    
    public void setNomeRobo(String nomeRobo) {
        if (nomeRobo == "") {
            System.out.println("Nome do robô não informado!");
        } else {
            this.nomeRobo = nomeRobo;
        } 
    }
    
    int getCargaBateria() {
            return this.cargaBateria;
    }
    
    
    public void setCargaBateria(int cargaBateria) {
        if (cargaBateria < 0) {
            System.out.println("Valor inválido para este campo!");
        } else {
            this.cargaBateria = cargaBateria; 
        }
    }
    
    
    int getVelocidadeRobo() {
        return this.velocidadeRobo;
    }
    
    public void setVelocidadeRobo(int velocidadeRobo) {
        this.velocidadeRobo = velocidadeRobo;
    }
    

    public void cmdAndar() {
       System.out.println("Velocidade atual do robô: " + this.getVelocidadeRobo());    
    }
    
    
    public void cmdAumentaVelocidade(int velocidade) {
        if (velocidade < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.setVelocidadeRobo(this.getVelocidadeRobo() + velocidade);       
        }
    
        
    }
    
    public void cmdDiminuiVelocidade(int velocidade) {
        if (velocidade < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.setVelocidadeRobo(this.getVelocidadeRobo() - velocidade);
        }
    }
}

    
class Main {
    	public static void main(String[] args) {
    		Robo r1 = new Robo();
    		
    		r1.setNomeRobo("wall-e");
    		r1.setCargaBateria(87);
    		r1.setVelocidadeRobo(2);
    		
    		
    		System.out.println(r1.getNomeRobo());
    		System.out.println(r1.getCargaBateria());
    		System.out.println(r1.getVelocidadeRobo());
    	
    	    r1.cmdAndar();
    	    
    	    r1.cmdAumentaVelocidade(10);
    	    System.out.println(r1.getVelocidadeRobo());
    	    
    	    r1.cmdDiminuiVelocidade(5);
    	    System.out.println(r1.getVelocidadeRobo());
    	    
    	}
    }
