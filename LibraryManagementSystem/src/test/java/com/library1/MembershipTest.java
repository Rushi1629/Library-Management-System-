package com.library1;

import com.library.Library;
import com.library.models.Book;
import com.library.models.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MembershipTest  {
   

	@Test
    public void testGetMemberId() {
        Membership member = new Membership(1, "Alice");
        assertEquals(1, member.getMemberId());
    }
	
	@Test
    public void testGetMemberName() {
        Membership member = new Membership(1, "Alice");
        assertEquals("Alice", member.getMemberName());
    }

	@Test
    public void testSetMemberName() {
        Membership member = new Membership(1, "Alice");
        member.setMemberName("Alicia");
        assertEquals("Alicia", member.getMemberName());
    }

}


