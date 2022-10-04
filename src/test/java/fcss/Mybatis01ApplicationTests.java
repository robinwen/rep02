package fcss;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import fcss.domain.fcss.dao.SsmCfgDao;
import fcss.domain.fcss.dao.SsmCodemapDao;
import fcss.domain.fcss.entity.SsmCfgEntity;
import fcss.domain.fcss.entity.SsmCodemapEntity;
import fcss.domain.mybatisone.condition.QueryWrapper;

@ActiveProfiles("local")
@SpringBootTest
public class Mybatis01ApplicationTests {
    @Autowired
    SsmCfgDao ssmCfgDao;
    @Autowired
    SsmCodemapDao ssmCodemapDao;

    // @Test
    void selectCount() {
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(new String[] {"00000183-682f-4898-0000-0183682f4898", "2", "f3"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO");
            long count = ssmCfgDao.selectCount(qw);

            System.out.println("selectCount SsmCfgEntity=" + count);
        }
        {
            var qw2 = new QueryWrapper<SsmCodemapEntity>();
            qw2.in("SSM_CODEMAP_SSN", Arrays.asList(new String[] {"4a94313c-c5be-4b81-99c8-d745a23b5dbd", "2",
                    "9b1c9c42-ef92-446c-af60-3c9c05580a68"}));
            qw2.select("AP_CODE, CFG_VAL, SORT_NO");
            long count2 = ssmCodemapDao.selectCount(qw2);

            System.out.println("selectCount SsmCodemapEntity=" + count2);
        }
    }

    @Test
    void selectOne() {
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(new String[] {"a00000183-682f-4898-0000-0183682f4898"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO");
            var count = ssmCfgDao.selectOne(qw);

            System.out.println("selectOne SsmCfgEntity=" + count);
        }
        {
            var qw2 = new QueryWrapper<SsmCodemapEntity>();
            qw2.in("SSM_CODEMAP_SSN", Arrays.asList(new String[] {"4a94313c-c5be-4b81-99c8-d745a23b5dbd", "2",
                    "9b1c9c42-ef92-446c-af60-3c9c05580a68"}));
            qw2.select("AP_CODE, CODE_KEY, SORT_NO");
            var count2 = ssmCodemapDao.selectOne(qw2);

            System.out.println("selectOne SsmCodemapEntity=" + count2);
        }
    }

    // @Test
    void selectList() {
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(new String[] {"00000183-682f-4898-0000-0183682f4898", "2", "f3"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO");
            var count = ssmCfgDao.selectList(qw);

            System.out.println("selectList SsmCfgEntity=" + count);
        }
        {
            var qw2 = new QueryWrapper<SsmCodemapEntity>();
            qw2.in("SSM_CODEMAP_SSN", Arrays.asList(new String[] {"4a94313c-c5be-4b81-99c8-d745a23b5dbd", "2",
                    "9b1c9c42-ef92-446c-af60-3c9c05580a68"}));
            qw2.select("AP_CODE, CODE_KEY, SORT_NO");
            var count2 = ssmCodemapDao.selectList(qw2);

            System.out.println("selectList SsmCodemapEntity=" + count2);
        }
    }
}
