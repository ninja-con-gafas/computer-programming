package constructors;
public class EquitySecurity
{
  int shares;
  float faceValue;
  char currency;
  float avgPrice, lastTradingPrice;
  String name;
  EquitySecurity(String name, int shares, char currency, float faceValue, float avgPrice, float lastTradingPrice)
  {
    this.name=name;
    this.shares=shares;
    this.currency=currency;
    this.faceValue=faceValue;
    this.avgPrice=avgPrice;
    this.lastTradingPrice=lastTradingPrice;
  }
  public static void main(String args[])
  {
    EquitySecurity irctc=new EquitySecurity("Indian Railway Catering & Tourism Co. Ltd.",50,'₹',10.00f,1938.04f,2649.60f);
    EquitySecurity coalindia=new EquitySecurity("Coal India Ltd.",1400,'₹',10.00f,149.88f,135.60f);
    EquitySecurity aapl=new EquitySecurity("Apple Inc.",15,'$',0.000015f,127.00f,148.19f);
    EquitySecurity amzn=new EquitySecurity("Amazon Inc.",1,'$',0.01f,3231.90f,3199.95f);
    System.out.printf("%-50s %-10s %-15s %-15s %-18s %s\n","Name","Shares","Currency","Face Value","Average Price","Last Trading Price");
    System.out.printf("%-50s %-10d %-15c %-15f %-18f %f\n",irctc.name,irctc.shares,irctc.currency,irctc.faceValue,irctc.avgPrice,irctc.lastTradingPrice);
    System.out.printf("%-50s %-10d %-15c %-15f %-18f %f\n",coalindia.name,coalindia.shares,coalindia.currency,coalindia.faceValue,coalindia.avgPrice,coalindia.lastTradingPrice);
    System.out.printf("%-50s %-10d %-15c %-15f %-18f %f\n",aapl.name,aapl.shares,aapl.currency,aapl.faceValue,aapl.avgPrice,aapl.lastTradingPrice);
    System.out.printf("%-50s %-10d %-15c %-15f %-18f %f\n",amzn.name,amzn.shares,amzn.currency,amzn.faceValue,amzn.avgPrice,amzn.lastTradingPrice);
  }
}
