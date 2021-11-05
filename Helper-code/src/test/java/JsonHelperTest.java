import com.cn.source.utils.JsonHelper;
import lombok.Data;
import org.junit.Test;

public class JsonHelperTest {

    @Test
    public void test() {
        TestEntity testEntity = new TestEntity();
        testEntity.setCode(111);
        testEntity.setName("aaa");
        testEntity.setStatus(true);
        System.out.println(testEntity.toString());

        String s = JsonHelper.obj2StringPretty(testEntity);
        System.out.println(s);
    }

    @Data
    public class TestEntity {
        private int code;
        private String name;
        private Boolean status;
    }
}
