package br.estacio.pri.robot;

public class Robot {
	private String name;
	private float speed, maxSpeed;
	private float temperature;
	private byte status; //1=StandBy, 2=Moving, 3=Exploring, 4=Stopped,5-ReturningHome
	private int power;

	//Construtores:
	public Robot(){
		this.speed = 0;
		this.status = (byte) 1;
		this.temperature = 0;
		this.power = 0;
	}
	
	public Robot(String nome){
		this();	
	}
	

	public Robot(String nome, float speed, float temperature, byte status, int power){
		this(nome);
		this.setPower(power);
		this.setTemperature(temperature);
		this.setStatus(status);
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	//Getters e setters:
	public String getNome(){
		return this.name;
	}	
	public void setNome(String name) {
		this.name = name;
	}
	
	
	public float getSpeed(){
		return this.speed;
	}
	public void setSpeed(float speed){
		this.speed = speed;
	}
	
	
	public float getTemperature(){
		return this.temperature;
	}
	public void setTemperature(float temperature){
		this.temperature = temperature;
	}
	
	
	public byte getStatus(){
		return this.status;
	}
	
	public void setStatus(int status){
		this.setStatus((byte) status);
	}
	
	private void setStatus(byte status){
		if( (status <=5) && (status >= 1) )
			this.status = status;
	}
	
	
	
	public int getPower(){
		return this.power;
	}
	public void setPower(int power){
		if ( (power <=100) && (power >= 0))	
			this.power = power;
	}
        
        
        
        public void setMaxSpeed(float velocidadeMaxima){
            this.maxSpeed = velocidadeMaxima;
        }
        public float getMaxSpeed(){
            return this.maxSpeed;
        }
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
    //Metodos:
        /*O atributo de velocidade atual terá sua atualização exclusivamente realizada
        pelos seguintes comportamentos do Objeto:*/
        public void stop(){
            float novaTemp = this.getTemperature() - (this.getTemperature() * 0.1f);
            
            this.setSpeed(0);   
            this.setStatus(4);//Stopped
            this.setTemperature(novaTemp);
        }
        
        public void speedUp(int incremento){
            if( getMaxSpeed() >= (this.getSpeed() + incremento) ){
                this.setSpeed(this.getSpeed() + incremento);
            }
        }
        public void speedUp(){
            float novaVelocidade = this.getSpeed() + (this.getSpeed() * 0.1f);
            if( getMaxSpeed() >= novaVelocidade){
                this.setSpeed(novaVelocidade);
            }
        }
              
           
	
}	