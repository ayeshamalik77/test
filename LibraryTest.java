

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testDeleteBooks() {
		int result = Library.deleteBooks();
		if(result > 0 ) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	final void testAddBooks() {
		int result = Library.addBooks();
		if(result > 0 ) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	final void testDeleteBookByBarcode() {
		int result = Library.deleteBookByBarcode();
		if(result > 0 ) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	final void testCheckOutBookByTitleNumber() {
		int result = Library.checkOutBookByTitleNumber();
		if(result > 0 ) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	final void testCheckInBook() {
		int result = Library.checkInBookByTitleNumber();
		if(result > 0 ) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
