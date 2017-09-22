package annotation;

public @interface Comment {
	public String name() default "";
	public String value() default "";
}
