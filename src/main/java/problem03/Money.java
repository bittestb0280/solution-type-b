package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	public int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money m = new Money(this.amount+money.amount);
		
		return m;
	}

	public Money minus(Money money) {
	
		Money m = new Money(this.amount-money.amount);
		
		return m;
	}

	public Money multiply(Money money) {
		Money m = new Money(this.amount*money.amount);
		
		return m;
	}

	public Money devide(Money money) {
	Money m = new Money(this.amount/money.amount);
		
		return m;
	}
	
	
	
	 @Override 
	 public boolean equals(Object obj) {
		 if(obj instanceof Money) 
		   { 
			 Money m = (Money)obj;
			if(this.amount==m.amount)
			{
				return true;
			}	
		   }
		
		return false;
	}
}