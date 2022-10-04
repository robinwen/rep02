package fcss.webapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import fcss.domain.fcss.dao.SsmCfgDao;
import fcss.domain.fcss.dao.SsmCodemapDao;
import fcss.domain.fcss.entity.SsmCfgEntity;
import fcss.domain.fcss.entity.SsmCodemapEntity;
import fcss.domain.mybatisone.condition.QueryWrapper;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SsmCfgDao ssmCfgDao;

    @Autowired
    private SsmCodemapDao ssmCodemapDao;

    @GetMapping("/insert")
    public ResponseEntity<?> insert() {
        var m = new ArrayList<Object>();
        {
            var ent = new SsmCfgEntity();
            ent.ap_code = "aa";
            ent.cfg_val = "a中文堃123";
            ent.cfg_key = "aa" + new Random().nextInt();
            ent.ssm_cfg_ssn = "22";

            var rtn = ssmCfgDao.insert(ent);

            System.out.println("insert SsmCfgEntity=" + rtn);
            System.out.println("insert ssm_cfg_ssn=" + ent.ssm_cfg_ssn);

            m.add(rtn);
        }

        {
            var ent = new SsmCodemapEntity();
            ent.ap_code = "aa";
            ent.code_val = "a中文堃123";
            ent.ssm_codemap_ssn = "22";

            int rtn = 0;
            try {
                rtn = ssmCodemapDao.insert(ent);
            } catch (Exception e) {
                // e.printStackTrace();
            }
            System.out.println("insert SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/deleteById")
    public ResponseEntity<?> deleteById() {
        var m = new ArrayList<Object>();
        {
            var rtn = ssmCfgDao.deleteById("a");
            System.out.println("deleteById SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var rtn = ssmCodemapDao.deleteById("a");
            System.out.println("deleteById SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/deleteBatchIds")
    public ResponseEntity<?> deleteBatchIds() {
        var m = new ArrayList<Object>();
        {
            var rtn = ssmCfgDao.deleteBatchIds(Arrays.asList("23", "25"));
            System.out.println("deleteBatchIds SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var rtn = ssmCodemapDao.deleteBatchIds(Arrays.asList("23"));
            System.out.println("deleteBatchIds SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/delete")
    public ResponseEntity<?> delete() {
        var m = new ArrayList<Object>();
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.eq("SORT_NO", 999);
            qw.eq("IS_ENABLED", "1");

            var rtn = ssmCfgDao.delete(qw);
            System.out.println("delete SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.eq("SORT_NO", 999);
            qw.eq("IS_ENABLED", "1");

            var rtn = ssmCodemapDao.delete(qw);
            System.out.println("delete SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/updateById")
    public ResponseEntity<?> updateById() {
        var m = new ArrayList<Object>();
        {
            var ent = new SsmCfgEntity();
            ent.ap_code = "aa";
            ent.cfg_val = "a中文堃123";
            ent.ssm_cfg_ssn = "22";
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.eq("SORT_NO", 999);
            var rtn = ssmCfgDao.updateById(ent);
            System.out.println("updateById SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var ent = new SsmCodemapEntity();
            ent.ap_code = "aa";
            ent.code_val = "a中文堃123";
            ent.ssm_codemap_ssn = "22";
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.eq("SORT_NO", 999);
            var rtn = ssmCodemapDao.updateById(ent);
            System.out.println("updateById SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/update")
    public ResponseEntity<?> update() {
        var m = new ArrayList<Object>();
        {
            var ent = new SsmCfgEntity();
            ent.ap_code = "aa2";
            ent.cfg_val = "b中文堃123";
            ent.ssm_cfg_ssn = "23";

            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.eq("SORT_NO", 999);

            var rtn = ssmCfgDao.update(ent, qw);
            System.out.println("update SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var ent = new SsmCodemapEntity();
            ent.ap_code = "aa2";
            ent.code_val = "b中文堃123";
            ent.ssm_codemap_ssn = "23";

            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.eq("SORT_NO", 999);

            var rtn = ssmCodemapDao.update(ent, qw);
            System.out.println("update SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectById")
    public ResponseEntity<?> selectById() {
        var m = new ArrayList<Object>();
        {
            var qw = new QueryWrapper<SsmCfgEntity>();

            qw.select("AP_CODE, CFG_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCfgDao.selectById("a");
            System.out.println("selectById SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.select("AP_CODE, CODE_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCodemapDao.selectById("844bfe3f-90ff-49fa-a520-934d0dee57d6");
            System.out.println("selectById SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectBatchIds")
    public ResponseEntity<?> selectBatchIds() {
        var m = new ArrayList<Object>();
        {
            var qw = new QueryWrapper<SsmCfgEntity>();

            qw.select("AP_CODE, CFG_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCfgDao.selectBatchIds(Arrays.asList("a", "bb"));
            System.out.println("selectBatchIds SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.select("AP_CODE, CODE_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCodemapDao.selectBatchIds(Arrays.asList("844bfe3f-90ff-49fa-a520-934d0dee57d6"));
            System.out.println("selectBatchIds SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectCount")
    public ResponseEntity<?> selectCount() {
        var m = new ArrayList<Object>();
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(
                    new String[] {"1a60488e-1b3d-4f1a-9236-a74c05dd295e", "3eff188b-d0a0-4f24-b9de-566d36b36c71"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCfgDao.selectCount(qw);
            System.out.println("selectCount SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.in("SSM_CODEMAP_SSN", Arrays.asList(
                    new String[] {"844bfe3f-90ff-49fa-a520-934d0dee57d_", "9b1c9c42-ef92-446c-af60-3c9c05580a6_"}));
            qw.select("AP_CODE, CODE_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCodemapDao.selectCount(qw);
            System.out.println("selectCount SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectOne")
    public ResponseEntity<?> selectOne() {
        var m = new ArrayList<Object>();
        try {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(
                    new String[] {"1a60488e-1b3d-4f1a-9236-a74c05dd295e", "3eff188b-d0a0-4f24-b9de-566d36b36c71"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCfgDao.selectOne(qw);
            System.out.println("selectOne SsmCfgEntity=" + rtn);
            m.add(rtn);
        } catch (Exception e) {
            System.out.println("CATCH");
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.in("SSM_CODEMAP_SSNAA", Arrays.asList(
                    new String[] {"844bfe3f-90ff-49fa-a520-934d0dee57d_", "9b1c9c42-ef92-446c-af60-3c9c05580a6_"}));
            qw.select("AP_CODE, CODE_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCodemapDao.selectOne(qw);
            System.out.println("selectOne SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectList")
    public ResponseEntity<?> selectList() {
        var m = new ArrayList<Object>();
        {
            var qw = new QueryWrapper<SsmCfgEntity>();
            qw.in("SSM_CFG_SSN", Arrays.asList(
                    new String[] {"1a60488e-1b3d-4f1a-9236-a74c05dd295e", "3eff188b-d0a0-4f24-b9de-566d36b36c71"}));
            qw.select("AP_CODE, CFG_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCfgDao.selectList(qw);
            System.out.println("selectList SsmCfgEntity=" + rtn);
            m.add(rtn);
        }

        {
            var qw = new QueryWrapper<SsmCodemapEntity>();
            qw.in("SSM_CODEMAP_SSN", Arrays.asList(
                    new String[] {"844bfe3f-90ff-49fa-a520-934d0dee57d_", "9b1c9c42-ef92-446c-af60-3c9c05580a6_"}));
            qw.select("AP_CODE, CODE_VAL, SORT_NO, CREATED_AT");
            var rtn = ssmCodemapDao.selectList(qw);
            System.out.println("selectList SsmCodemapEntity=" + rtn);
            m.add(rtn);
        }

        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/selectPage")
    public ResponseEntity<?> selectPage() {
        var m = new ArrayList<Object>();
        {
            Map<String, Object> where = new HashMap<>();
            where.put("AA", 111);

            PageHelper.s.startPage(2, 4);
            var rtn = ssmCfgDao.selectPage1(where);

            // var pager = new RowBounds(2, 3);
            // var rtn = ssmCfgDao.selectPage1(pager, where);
            PageInfo page = new PageInfo(rtn);
            System.out.println("selectList SsmCfgEntity=" + rtn);
            m.add(page);
        }

        return ResponseEntity.ok().body(m);
    }

}
