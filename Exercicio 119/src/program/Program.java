package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment ("have  nice trip");
		Comment c2 = new Comment ("Wow, that is awesome!");
		Comment c3 = new Comment ("have  nice trip");
		Comment c4 = new Comment ("Wow, that is awesome!");
		Comment c5 = new Comment ("have  nice trip");
		Comment c6 = new Comment ("Wow, that is awesome!");
		
		Post post = new Post(sdf.parse("21/02/2020 12:25:02"),"viajem", "oi eu sou o goku", 12);
		
		post.addComment(c1);
		post.addComment(c2);
		post.addComment(c3);
		post.addComment(c4);
		post.addComment(c5);
		post.addComment(c6);
		
		System.out.println(post);		
		sc.close();
	}

}
