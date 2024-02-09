/**
 *
 * @param volume 成交量
 * @param open 开盘价
 * @param high 最高
 * @param close 收盘价
 * @param low 最低
 * @param chg 涨跌额
 * @param percent 涨跌幅
 * @param turnrate 换手率
 * @param ma5 5日线
 * @param ma10 10日线
 * @param ma20 20日线
 * @param ma30 30日线
 * @param dif DIF
 * @param dea DEA
 * @param macd MACD
 * @param time 时间节点
 */
public TrendBlock(String volume,
                  String open,
                  String high,
                  String close,
                  String low,
                  String chg,
                  String percent,
                  String turnrate,
                  String ma5,
                  String ma10,
                  String ma20,
                  String ma30,
                  String dif,
                  String dea,
                  String macd,
                  String time){
    this.volume = volume;
    this.open = open;
    this.high = high;
    this.close = close;
    this.low = low;
    this.chg = chg;
    this.percent = percent;
    this.turnrate = turnrate;
    this.ma5 = ma5;
    this.ma10 = ma10;
    this.ma20 = ma20;
    this.ma30 = ma30;
    this.dif = dif;
    this.dea = dea;
    this.macd = macd;
    this.time = time;
}