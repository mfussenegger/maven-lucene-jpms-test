package foo;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * DummyTest
 */
public class DummyTest {

  @Test
  public void test_dummy() throws Exception {
      assertThat(10).isEqualTo(10);
  }
}
