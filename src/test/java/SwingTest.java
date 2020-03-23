import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.swing.launcher.ApplicationLauncher.application;

class SwingTest {

    private static FrameFixture frame;

    @BeforeAll
    static void setUp() throws AWTException {
        application(TestApp.class).start();

        org.assertj.swing.core.Robot robot = BasicRobot.robotWithCurrentAwtHierarchy();

//        frame = findFrame(new GenericTypeMatcher<ActionFrame>(ActionFrame.class) {
//            protected boolean isMatching(ActionFrame frame) {
//                return "Your application title".equals(frame.getTitle()) && frame.isShowing();
//            }
//        }).using(robot);
    }

    @Test
    void testBackgroundHasColor(){
        //assertThat(frame.background()).isInstanceOf(Color.class);
    }

}
