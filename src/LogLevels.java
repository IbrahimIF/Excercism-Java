public class LogLevels {

    public static void main(String[] args) {

        String logLine = "[ERROR]: Stack overflow";


        System.out.println("Message from a log line: " + LogLevels.message(logLine));
        System.out.println("the log line's log level: " + LogLevels.logLevel(logLine));
        System.out.println("reformatted log line: " + LogLevels.reformat(logLine));
    }

    public static String message(String logLine) {

        String[] arrOflogLine = logLine.split(":", 2);
        return arrOflogLine[1].trim();

    }

    public static String logLevel(String logLine) {
        String[] arrOflogLine = logLine.split("]", 2);
        String log = arrOflogLine[0].replace("[", "");
        return log.toLowerCase();

    }

    public static String reformat(String logLine) {
        String[] arrOflogLine = logLine.split(" ", 2);

        String logLineLevel = arrOflogLine[0];

        String Level = logLineLevel.replace("]:", ")");
        String log = Level.replace("[", "(");


        return message(logLine) + " " + log.toLowerCase();
    }
}
