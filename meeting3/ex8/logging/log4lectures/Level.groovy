package meeting3.ex8.logging.log4lectures

/**
 * @author Mark Bramnik
 * Date: 13/12/2015
 * Time: 07:56
 */
class Level {
    int value
    String name

    public static Level INFO  = new Level(100, "INFO")
    public static Level WARN  = new Level(200, "WARN")
    public static Level ERROR = new Level(300, "ERROR")

    protected Level(int value, String name) {
        this.value = value
        this.name = name
    }
}
