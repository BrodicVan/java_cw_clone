/**
 * 
 * @param symbol
 * @param exchange
 * @param vendor
 * @param currency
 * @param securityType
 * @param expiry
 * @param strike
 * @param contractRight
 * @param decorations
 */
public InstrumentSpecification(Symbol symbol, String exchange,
		String vendor, String currency, String securityType, Expiry expiry,
		double strike, String contractRight, DecorationsMap decorations){
	this.symbol = symbol;
	this.exchange = exchange;
	this.vendor = vendor;
	this.currency = currency;
	this.securityType = securityType;
	this.expiry = expiry;
	this.strike = strike;
	this.contractRight = contractRight;
	this.decorations = decorations;
}