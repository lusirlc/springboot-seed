package cn.ulegal.seed.dao;

import cn.ulegal.seed.entity.DicAdministrativeAct;
import cn.ulegal.seed.entity.JudgesBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.imageio.plugins.common.I18N;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created By Chuan Lu On 2019/2/27 10:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DicAdministrativeActMapperTest {
	@Autowired
	DicAdministrativeActMapper mapper;
	@Autowired
	JudgesBeanMapper judgesBeanMapper;
	
	@Test
	public void testSelectAll() {
		PageHelper.startPage(1, 10);
		List<DicAdministrativeAct> list = mapper.selectAll();
		log.info("测试对象-{}",list);
		System.out.println(list.size());
		System.out.println(list);
	}
	
	@Test
	public void testSelectPage() {
		Page<DicAdministrativeAct> page = PageHelper.startPage(1, 10).doSelectPage(() -> mapper.selectAll());
		System.out.println(page.getResult());
		System.out.println(page.getPageNum());
		System.out.println(page.getPageSize());
		System.out.println(page.getPages());
		System.out.println(page.getTotal());
	}
	
	@Test
	public void testSelectPageInfo() {
		PageInfo<DicAdministrativeAct> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> mapper.selectAll());
		System.out.println(pageInfo.getList());
		System.out.println(pageInfo.getPageNum());
		System.out.println(pageInfo.getPageSize());
		System.out.println(pageInfo.getPages());
		System.out.println(pageInfo.getTotal());
	}
	
	@Test
	public void testSelectByExample() {
		Example example = new Example(DicAdministrativeAct.class);
		example.createCriteria().andEqualTo("mcNr", "行政征用");
		List<DicAdministrativeAct> list = mapper.selectByExample(example);
		int count = mapper.selectCountByExample(example);
		System.out.println(count);
		System.out.println(list);
		
	}
	
	@Test
	public void testSelect() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		act.setDm("18");
		List<DicAdministrativeAct> list = mapper.select(act);
		DicAdministrativeAct dicAdministrativeAct = mapper.selectOne(act);
		DicAdministrativeAct dicAdministrativeAct1 = mapper.selectByPrimaryKey(act);
		DicAdministrativeAct dicAdministrativeAct2 = mapper.selectByPrimaryKey(act.getDm());
		int count = mapper.selectCount(act);
		System.out.println(dicAdministrativeAct);
		System.out.println(dicAdministrativeAct1);
		System.out.println(dicAdministrativeAct2);
		System.out.println(count);
		System.out.println(list);
	}
	
	@Test
	public void testInsert() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		act.setDm("257");
		mapper.insert(act);
	}
	
	@Test
	public void testInsertSelective() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		act.setDm("258");
		mapper.insertSelective(act);
	}
	
	@Test
	public void testInsertList() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		DicAdministrativeAct act1 = new DicAdministrativeAct();
		act.setDm("259");
		act1.setDm("260");
		List<DicAdministrativeAct> list = Arrays.asList(act, act1);
		mapper.insertList(list); // 不行, 主键必须为自增主键,因为执行插入时不会将id字段插入
	}
	
	@Test
	public void testInsertList2() {
		JudgesBean j1 = new JudgesBean();
		JudgesBean j2 = new JudgesBean();
		j1.setIdentityId("111");
		j2.setIdentityId("222");
		List<JudgesBean> list = Arrays.asList(j1, j2);
		int i = judgesBeanMapper.insertList(list);
		System.out.println(i); // 成功插入几条就返回几
	}
	
	@Test
	public void testUpdateByPrimaryKey() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		act.setDm("258");
		act.setMcNr("666");
		mapper.updateByPrimaryKey(act);
	}
	
	@Test
	public void testUpdateByPrimaryKeySelective() {
		DicAdministrativeAct act = new DicAdministrativeAct();
		act.setDm("258");
		act.setMcNr("666");
//		act.setMcNr("");
		act.setSm("222");
		mapper.updateByPrimaryKeySelective(act);
	}
	
	@Test
	public void test() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list2.add(2);
		list2.add(3);
		List<Integer> diff = getDiff(list1, list2);
		System.out.println(diff);
	}
	
	public static <T> List<T> getDiff(Collection<T> local, Collection<T> remote) {
		ArrayList<T> diff = new ArrayList<T>();
		for (T r : remote) {
			boolean flag = true;
			for (T l : local) {
				if (r.equals(l)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				diff.add(r);
			}
		}
		return diff;
	}
}