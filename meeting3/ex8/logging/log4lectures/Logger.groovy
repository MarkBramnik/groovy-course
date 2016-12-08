package meeting3.ex8.logging.log4lectures

/**
 * @author Mark Bramnik
 * Date: 13/12/2015
 * Time: 07:56
 */
class Logger {
    public void info(String msg) {
        log(Level.INFO, msg)
    }
    public void warn(String msg) {
        log(Level.WARN, msg)
    }
    public void error(String msg) {
        log(Level.ERROR, msg)
    }

    public void log(Level lvl, String msg) {
        println "$lvl.name :  $msg"
    }

}
