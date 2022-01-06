package br.com.pmnewsmusico.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class NewsController {
		
		@SuppressWarnings("deprecation")
		@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public ResponseEntity list(){
			return ResponseEntity.ok("Fernando");
		}	
		
		
}
