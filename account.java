/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author viki
 */
class account {
    private Float withdrawCashDeposit;
    private int accNo;
    private String name;
    private float cashDeposit;
    private float balance;
    private String address;
    private String city;
    private int Accno;
    private int pincode;
    private String state;
 public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCashDeposit() {
		return cashDeposit;
	}

	public void setCashDeposit(float cashDeposit) {
		this.cashDeposit = cashDeposit;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getAddrees() {
		return address;
	}


    void setAddress(String address) {
       this.address=address;
    }

	public String getcity() {
		return city;
	}

    void setcashDespositAccNo(int Accno) {
        this.Accno=Accno;
    }
    	public int getcashDespositAccNo() {
		return Accno;
	}

    void setcashWithdrawAccNo(int AccNo) {
        this.Accno=AccNo;
    }
    public int getcashWithdrawAccNo() {
		return Accno;
	}
       void setcashWithdraw(Float withdrawCashDeposit) {
        this.withdrawCashDeposit=withdrawCashDeposit;
    }
    public Float gettcashWithdraw() {
		return withdrawCashDeposit;
	}
    void setcity(String city) {
        this.city=city;

    }
public int getpincode() {
		return pincode;
	}

    void setpinCode(int pincode) {
        this.pincode=pincode;
    }
	public String getstate() {
		return state;
	}
    void setstate(String state) {
        this.state=state;
    }



}
