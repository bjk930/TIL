package org.zerock;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.domain.WebBoard;
import org.zerock.persistence.WebBoardRepository;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Log
@Commit
public class WebBoardRepositoryTests {
	
	@Autowired
	WebBoardRepository webBoardRepository;
	
//	@Test
//	public void insertBoardDummies() {
//		IntStream.range(0, 300).forEach(i->{
//			WebBoard board = new WebBoard();
//			board.setTitle("Sample Board Title "+i);
//			board.setContent("Content Sample ..."+i+" of Board");
//			board.setWriter("user0"+i%10);
//			
//			this.webBoardRepository.save(board);
//		});
//	}
//	@Test
//	public void testList() {
//		Pageable pageable = PageRequest.of(0, 20, Direction.DESC, "bno");
//		
//		Page<WebBoard> result = this.webBoardRepository
//						.findAll(this.webBoardRepository.makePredicate(null, null), pageable);
//		
//		log.info("PAGE : "+result.getPageable());
//		log.info("----------------");
//		result.getContent().forEach(board->log.info(""+board));
//	}
	@Test
	public void testList2() {
		Pageable pageable = PageRequest.of(0, 20, Direction.DESC, "bno");
		
		Page<WebBoard> result = this.webBoardRepository.findAll(this.webBoardRepository.makePredicate("t", "10"), pageable);
		log.info("PAGE : "+result.getPageable());
		log.info("----------------");
		result.getContent().forEach(board->log.info(""+board));
	}
}
