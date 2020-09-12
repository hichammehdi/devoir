package devoir;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDevoir {

	@Test
	public void test() {

		List<Integer> aPartionner = new ArrayList<Integer>();
		aPartionner.add(1);

		aPartionner.add(1);

		aPartionner.add(1);

		aPartionner.add(1);

		aPartionner.add(1);

		Partition partition = new Partition();
		List<List<Integer>> listDiviserAretourner = partition.partionner(aPartionner, 2);
		
		assertEquals(listDiviserAretourner.get(0).size(),2);

	}

}
