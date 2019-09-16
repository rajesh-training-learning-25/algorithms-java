
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IterativeBinarySearch_Test {
	
		@Test
		void testcase1() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 0);
			 assertTrue(atIndex==0);
		}
		@Test
		void testcase2() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 1);
			 assertTrue(atIndex==1);
		}
		@Test
		void testcase3() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 5);
			 assertTrue(atIndex==5);
		}
		@Test
		void testcase4() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 10);
			 assertTrue(atIndex==9);
		}
		@Test
		void testcase5() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 8);
			 assertTrue(atIndex==8);
		}
		@Test
		void testcase6() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, 11);
			 assertTrue(atIndex==-1);
		}
		@Test
		void testcase7() {
			Integer[] arr = {0,1,2,3,4,5,6,7,8,10};
			IterativeBinarySearch search = new IterativeBinarySearch();
			 int atIndex = search.find(arr, -1);
			 assertTrue(atIndex==-1);
		}
	}
		