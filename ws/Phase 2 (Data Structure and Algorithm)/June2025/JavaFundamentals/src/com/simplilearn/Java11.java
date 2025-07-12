package com.simplilearn;

import java.io.IOException;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java11 {

	public static void main(String[] args) throws IOException {
		
		List<String> list  = List.of("A","B","C");
		Set.of(1,2,3);
		Map<String,Integer> map = Map.of("A",1,"B",2);
		
		//list.add("D");
		
		list.forEach( (var s) -> System.out.println(s));
		
		//list.forEach( (@Nonnull var s) -> System.out.println(s));
		
		System.out.println(" ".isBlank());
		
		String s = "a\nb\nc";
		System.out.println(s.lines().count());
		
		System.out.println("abc".repeat(3));
		
		Path path = Files.writeString(Path.of("test.txt"), "Hello Java11");
		String content = Files.readString(path);
		System.out.println(content);
		
		HttpClient client=  HttpClient.newHttpClient();
		//client.send(null, null)
		
		
		

	}

}
