import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "HelloApp", mixinStandardHelpOptions = true, description = "Prints hello message.")
public class HelloApp implements Runnable {

    @Option(names = {"-n", "--name"}, description = "The person to greet.")
    private String name = "World";

    public static void main(String[] args) {
        CommandLine.run(new HelloApp(), args);
    }

    @Override
    public void run() {
        System.out.println("Hello, " + name);
    }
}