// a first lambda function example, lambda functions are available in Java 8.x
interface LambdaFunction {
	void call();
}

public class FirstLambda {
	public static void main(String[] args)
	{
		LambdaFunction lambdaFunction = () -> System.out.println("Hello, Multiverse!");
		lambdaFunction.call();
	}
}
