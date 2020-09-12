/**
 * 
 */
package devoir;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;

import org.apache.commons.collections4.ListUtils;

/**
 * @author mehdi
 *
 */
public class Partition {

	
	/**
	 * 
	 * @param aPartionner
	 * @param taille
	 * @return
	 */
	public List<List<Integer>> partionner(List<Integer> aPartionner, int taille) {
		List<List<Integer>> listDiviserAretourner = new ArrayList<List<Integer>>();

		listDiviserAretourner = Lists.partition(aPartionner, 2);

		return listDiviserAretourner;

	}

}
