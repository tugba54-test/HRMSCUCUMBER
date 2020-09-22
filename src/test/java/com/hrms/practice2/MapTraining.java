package com.hrms.practice2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// key---> value
        Map<String, String> map = new LinkedHashMap<>();
        map.put("isim1", "Yunus");
        map.put("isim2","tugba");
        map.put("isim3","ahmet");
//
//        for(String key :map.keySet()){
//            System.out.println("keys = "+key);
//        }
//        for(String value:map.values()){
//            System.out.println("value = "+ value);
//        }
        //3.yol
//        for(Iterator<String> values = map.values().iterator();values.hasNext();){
//            System.out.println(values.next());
//        }
//        map.forEach((k,v) -> {
//            System.out.println(v);
//        });
        //4.
//        for(Map.Entry<String,String> mape:map.entrySet()){
//            System.out.println(mape.getKey()+" "+mape.getValue());
//        }
        Map<String,String> map2 = new LinkedHashMap<>();
        map.put("isim4", "emre");
        map.put("isim5","akca");
        map.put("isim6","ali");
        List<Map<String , String>> lm = new LinkedList<>();
        lm.add(map);
        lm.add(map2);
        List<String> stringlist = new LinkedList<>();
        for(int x= 1;x<lm.size(); x++){
            String values = lm.get(x).values().toString();
           // System.out.println(values);
            stringlist.add(values);
        }
        System.out.println(stringlist);
    }}
