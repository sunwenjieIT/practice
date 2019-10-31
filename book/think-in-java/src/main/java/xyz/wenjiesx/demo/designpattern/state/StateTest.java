package xyz.wenjiesx.demo.designpattern.state;

/**
 * @author wenji
 * @date 2019/10/31
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();

    }
}