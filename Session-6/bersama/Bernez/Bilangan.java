package Bernez;
public class Bilangan{
	private int desimal;
	public void setDesimal(int desimal){
		if(desimal>=0){
			this.desimal = desimal;
		}
		else{
			this.desimal = -desimal;
		}
	}
	public int getDesimal(){
		return this.desimal;
	}
	public String biner(){
		String hasil="";
		int sisa = this.desimal;
		do{
			hasil=sisa%2==1?"1"+hasil : "0" + hasil;
			sisa /= 2;
		}
		while(sisa>0);
		return hasil;
	}
}
