import org.example.StateMachine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StateMachineTest
{
    private String input;
    private String expectedResult;
    private StateMachine stateMachine = new StateMachine();

    public StateMachineTest(String input, String expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"t", "Start One "},
                {"te", "Start One Two "},
                {"tes", "Start One Two Three "},
                {"test", "Start One Two Three Final"},
                {"tA", "Start One Start "},
                {"teA", "Start One Two Start "},
                {"tesA", "Start One Two Three Start "},
                {"testA", "Start One Two Three Final"},
                {"At", "Start Start One "},
                {"Ate", "Start Start One Two "},
                {"Ates", "Start Start One Two Three "},
                {"Atest", "Start Start One Two Three Final"},
                {"AtestA", "Start Start One Two Three Final"},
                {"", "Start "},
                {"a", "Start Start "}
        });

    }
    @Test
    public void testStateMachine() {
        String result = stateMachine.findLetter(input);
        assertEquals(expectedResult, result);
    }
}

//import org.example.StateMachine;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//import static org.junit.Assert.assertEquals;
//
//@RunWith(Parameterized.class)
//public class StateMachineTest {
//    private String input;
//    private StateMachine.ProcessState expectedResult;
//    private StateMachine stateMachine = new StateMachine();
//
//    public StateMachineTest(String input, StateMachine.ProcessState expectedResult) {
//        this.input = input;
//        this.expectedResult = expectedResult;
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][]{
//                {"t", StateMachine.ProcessState.One},
//                {"te", StateMachine.ProcessState.Two},
//                {"tes", StateMachine.ProcessState.Three},
//                {"test", StateMachine.ProcessState.Final},
//                {"tA", StateMachine.ProcessState.Start},
//                {"teA", StateMachine.ProcessState.Start},
//                {"tesA", StateMachine.ProcessState.Start},
//                {"testA", StateMachine.ProcessState.Final},
//                {"At", StateMachine.ProcessState.One},
//                {"Ate", StateMachine.ProcessState.Two},
//                {"Ates", StateMachine.ProcessState.Three},
//                {"Atest", StateMachine.ProcessState.Final},
//                {"AtestA", StateMachine.ProcessState.Final},
//                {"", StateMachine.ProcessState.Start},
//                {"a", StateMachine.ProcessState.Start}
//        });
//    }
//
//    @Test
//    public void testStateMachine() {
//        StateMachine.ProcessState result = stateMachine.findLetter(input);
//        assertEquals(expectedResult, result);
//    }
//}

