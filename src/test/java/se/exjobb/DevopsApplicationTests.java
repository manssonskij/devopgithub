package se.exjobb;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsApplicationTests {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
	Controller controller;

	@Test
	public void contextLoads() {
	}

	@Test
	public void controllerTest() throws Exception {
		assertThat(controller).isNotNull();
	}

    @Test
    public void strings() throws Exception {
        StringObject t = new StringObject();
        t.TestableStringObject("one","two");

        logger.info("TEST strings");
        assertThat(t.getStrings().compareTo("onetwo"));


    }

    @Test
    public void stringReverse() throws Exception{
        StringObject t = new StringObject();
        t.TestableStringObject("abc", "123");

        logger.info("TEST stringReverse");
        assertThat(t.getReversedStrings().equals("321cba"));
    }

    @Test
    public void integer() throws Exception{
        IntegerObject t = new IntegerObject();

        t.InitializeTestableObject(1,2);


    logger.info("TEST integer");

        assertThat(t).isNotNull();

        assertThat(t.getInteger1()).isEqualTo(1);
        assertThat(t.getInteger2()).isEqualTo(2);
    }



}
