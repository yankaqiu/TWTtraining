package homework;

import java.util.*;

public class HomeworkThree {
    public List<String> startwithA(List<String> list) {
        //遍历并判断是否为A开头
        Iterator<String> it=list.iterator();
        while (it.hasNext()) {
            String s=it.next();
            if(!(s.startsWith("A"))){
                it.remove();
            }
        }
        return list;
    }


    public <T> List <T>  mapToList(T... ts) {
        List list=new ArrayList();
        for(int i=0;i<ts.length;i++){
            list.add(ts);
        }
        return list;
    }

    public List<String> dataprocessing(List<String> list){
        //调用compare方法
        ComparatorbyLength c=new ComparatorbyLength();
        Collections.sort(list,c);

        return list;
    }

    public <T> List<T> deduplicate(List<T> list) {
        //使用set集合来去重
        HashSet<T> hashSet = new HashSet<>();
        List newList =new ArrayList();
        for(Iterator it=list.iterator();it.hasNext();) {
            Object o = it.next();
            if (hashSet.add((T) o)) {
                newList.add(o);
            }
        }
        list.clear();
        list.addAll(newList);
        return list;
    }
}