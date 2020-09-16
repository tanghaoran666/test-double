package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter securityCenter;
    DoorPanel mockDoorPanel;

    @BeforeEach
    public void setUp() {
        mockDoorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(mockDoorPanel,times(1)).close();
    }
}
