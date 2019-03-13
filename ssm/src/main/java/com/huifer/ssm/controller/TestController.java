package com.huifer.ssm.controller;

import com.huifer.ssm.pojo.Item;
import com.huifer.ssm.pojo.QueryModel;
import com.huifer.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 描述:
 *
 * @author huifer
 * @date 2019-03-11
 */
@RestController
//@RequestMapping(value = "item", produces = "application/json;charset=utf8")// 这个地方直接修改了编码格式
@RequestMapping(value = "item")
public class TestController {
    @Autowired
    private ItemService service;

    @GetMapping("queryItem")
    public ResponseEntity<List<Item>> queryItem() {
        List<Item> items = service.queryItemList();

        return ResponseEntity.ok().body(items);
    }

    @GetMapping("query")
    public ResponseEntity query(Integer id, @RequestParam(value = "name", required = false, defaultValue = "awsl") String name) {
        //http://localhost:8082/item/query?id=1&name=%E7%8E%8B
        HashMap<Integer, String> has = new HashMap<>();
        has.put(id, name);
        return ResponseEntity.ok(has);

    }

    @GetMapping("pojo")
    public ResponseEntity queryPojo(Integer id, String name, Item item) {
        //http://localhost:8082/item/pojo?id=3&name=lkjl
        return ResponseEntity.ok(item);

    }

    @GetMapping("tm")
    public ResponseEntity tm(QueryModel queryModel) {
        //http://localhost:8082/item/tm?item.id=1&item.name=abc&user.id=3&user.name=lkjljljlk
        return ResponseEntity.ok(queryModel);
    }


    @GetMapping("double")
    public ResponseEntity array(String[] id) {
    //http://localhost:8082/item/double?id=1&id=2
        return ResponseEntity.ok(id);
    }

    @GetMapping("date")
    public ResponseEntity date(String d) {
//        http://localhost:8082/item/date?d=2019-1-1
        return ResponseEntity.ok(d);
    }
    @GetMapping("/str")
    public String s() {
        return "中文";
    }

}
