package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int i = 0;
        logger.log("Запускаем фильтрацию");
        for (Integer s:source) {
            if(s <= threshold ){
                result.add(s);
                i++;
            }
            logger.log("Элемент " + s + ((s <= threshold )?"":" не") + " проходит");
        }
        logger.log("Прошло фильтр " + i + " элемнтов из " + source.size());
        return  result;
    }

}
