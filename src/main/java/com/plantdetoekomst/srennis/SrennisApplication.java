package com.plantdetoekomst.srennis;

import com.sun.source.tree.TreeVisitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@CrossOrigin
public class SrennisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrennisApplication.class, args);
	}

	//	define tree
	Tree Acacia = new Tree("Acacia", 13);
	Tree Oak = new Tree("Oak", 7);
	Tree Pine = new Tree("Pine", 23);

	//  define footprint
	Footprint footprint = new Footprint(0.0);

	//  define badges
	Badge treeHugger = new Badge("Tree Hugger", "You planted 10 trees!", "https://www.flaticon.com/svg/static/icons/svg/2922/2922520.svg");
	Badge treeLover = new Badge("Tree Lover", "You planted 25 trees!", "https://www.flaticon.com/svg/static/icons/svg/2922/2922520.svg");

	@GetMapping
	public Map generic() {
		Map map = new HashMap();
		map.put("message", "Hello? Can you hear me?");
		return map;
	}
	@GetMapping("/profile")
	public Map profile() {
		Map map = new HashMap();
		map.put(Acacia.getTreeType(), Acacia.getAmount());
		map.put(Oak.getTreeType(), Oak.getAmount());
		map.put(Pine.getTreeType(), Pine.getAmount());
		if (Acacia.getAmount() + Oak.getAmount() + Pine.getAmount() >= 10) {
			map.put(treeHugger.getName(), treeHugger.getDescription());
		}
		if (Acacia.getAmount() + Oak.getAmount() + Pine.getAmount() >= 25) {
			map.put(treeLover.getName(), treeLover.getDescription());
		}
		map.put("footprint", footprint.getSize());
		map.put("yourtip", footprint.getYourtip());
		return map;
	}
}
