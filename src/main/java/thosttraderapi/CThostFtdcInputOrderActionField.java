package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ubc68\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1401</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcInputOrderActionField extends StructObject {

    public void setBrokerID( String brokerID )
    {
        this.io.getPointerField( this , 0 ).setCString( brokerID ) ;
    }

    public void setInvestorID( String investorID )
    {
        this.io.getPointerField( this , 1 ).setCString( investorID ) ;
    }

    public void setOrderActionRef( int orderActionRef )
    {
        this.io.setIntField( this , 2 , orderActionRef ) ;
    }

    public void setOrderRef( String orderRef )
    {
        this.io.getPointerField( this , 3 ).setCString( orderRef ) ;
    }

    public void setRequestID( int requestID )
    {
        this.io.setIntField( this , 4 , requestID ) ;
    }

    public void setFrontID( int frontID )
    {
        this.io.setIntField( this , 5 , frontID ) ;
    }

    public void setSessionID( int sessionID )
    {
        this.io.setIntField( this , 6 , sessionID ) ;
    }

    public void setExchangeID( String exchangeID )
    {
        this.io.getPointerField( this , 7 ).setCString( exchangeID ) ;
    }

    public void setOrderSysID( String orderSysID )
    {
        this.io.getPointerField( this , 8 ).setCString( orderSysID ) ;
    }

    public void setActionFlag( byte actionFlag )
    {
        this.io.setByteField( this , 9 , actionFlag ) ;
    }

    public void setLimitPrice( double limitPrice )
    {
        this.io.setDoubleField( this , 10 , limitPrice ) ;
    }

    public void setVolumeChange( int volumeChange )
    {
        this.io.setIntField( this , 11 , volumeChange ) ;
    }


    public void setUserID( String userID )
    {
        this.io.getPointerField( this , 12 ).setCString( userID ) ;
    }


    public void setInstrumentID( String instrumentID )
    {
        this.io.getPointerField( this , 13 ).setCString( instrumentID ) ;
    }

	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public int OrderActionRef() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public CThostFtdcInputOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public CThostFtdcInputOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public CThostFtdcInputOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public CThostFtdcInputOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public CThostFtdcInputOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CThostFtdcInputOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int VolumeChange() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CThostFtdcInputOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 11, VolumeChange);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(12) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(13) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 13);
	}
	public CThostFtdcInputOrderActionField() {
		super();
	}
	public CThostFtdcInputOrderActionField(Pointer pointer) {
		super(pointer);
	}
}